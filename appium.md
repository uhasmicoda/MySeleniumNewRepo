## 1 What is Appium.

Appium is an open-source mobile automation testing tool that is used to test mobile applications (Native, Hybrid, and Mobile Web apps) on both Android and iOS platforms.
It works on the principle of "Write once, run anywhere", which means the same test script can be executed on different devices and platforms without changing the code.


## 2 Appium architecture.

In my experience, Appium follows a client-server architecture that allows us to automate mobile applications across different platforms. At the top, we have the test scripts, which are written using Appium client libraries in languages like Java, Python, or JavaScript. These client libraries act as a bridge, converting our test commands into JSON requests over HTTP, following the WebDriver protocol.

Once the request is created, it is sent to the Appium Server, which is a Node.js application. The server acts like a middle layer — it doesn’t execute commands directly but instead translates them into platform-specific instructions. Based on the target device, Appium chooses the correct automation engine: for example, UIAutomator2 or Espresso for Android, and XCUITest for iOS. These automation engines are provided by Google and Apple themselves, and they have direct access to the operating system and mobile apps.

Finally, the automation engine communicates with the real device or emulator/simulator to perform actions such as clicking a button, typing into a text box, or swiping on the screen. Once the action is executed, the response is passed back from the device → to the automation engine → through the Appium Server → and finally returned to the test script.

This layered structure makes Appium highly flexible and platform-independent. Just like Selenium for browsers, Appium provides the same “write once, run anywhere” benefit for mobile apps, meaning the same test script can be reused across Android and iOS with minimal changes.

| Layer / Component       | Description                                                                                                 | Example / Role                                      |
| ----------------------- | ----------------------------------------------------------------------------------------------------------- | --------------------------------------------------- |
| Test Script (Client)    | Test cases written by QA using Appium client libraries in Java, Python, JavaScript, etc.                    | `driver.findElement(By.id("login")).click();`       |
| Appium Client Libraries | Converts test commands into JSON over HTTP requests following the WebDriver protocol.                       | Acts as a bridge between script and server.         |
| Appium Server (Node.js) | Receives JSON requests from client, translates them into platform-specific commands.                        | Runs on Node.js, works like a middle layer.         |
| Automation Engines      | Platform-specific automation frameworks that interact directly with the OS and app.                         | Android → UIAutomator2, Espresso; iOS → XCUITest    |
| Mobile Device (Target)  | Real device, emulator, or simulator where the app is installed. Executes the commands and returns response. | Android phone, iPhone, or emulator/simulator        |
| Response Backflow       | Result of action is passed back → Device → Engine → Appium Server → Client script.                          | Example: Button click success, text retrieved, etc. |


```java
Test Script (Client) 
       ⬇ JSON over HTTP
Appium Client Libraries
       ⬇
Appium Server (Node.js)
       ⬇
Automation Engines (UIAutomator2 / XCUITest)
       ⬇
Mobile Device (Android / iOS)

```

## 3 Appium prerequisites.

To set up Appium for Android automation, a few prerequisites are required. First, we need the Java Development Kit (JDK), since Appium scripts are often written in Java and Android SDK tools depend on it. An IDE such as Eclipse, IntelliJ, or VS Code is required to write and manage automation scripts. Since Appium is built on top of Node.js, we must install Node.js to run the Appium server. The Appium server (Appium Desktop) acts as a middleware that translates our client commands into mobile actions. Along with this, we need the Appium drivers, such as UiAutomator2 (default for Android), which actually interacts with the Android device. For running tests, we need either a real Android device or an emulator created from Android Studio. To inspect app elements and get locators, we use Appium Inspector. Finally, Android Studio is essential because it provides the Android SDK, emulator, and ADB tools, which are mandatory for device communication and automation.

| Tool / Component                       | Purpose                                                                            |
| -------------------------------------- | ---------------------------------------------------------------------------------- |
| **JDK (Java Development Kit)**         | Needed to run Appium scripts written in Java and for Android SDK tools.            |
| **IDE (Eclipse / IntelliJ / VS Code)** | Where you write and manage your automation scripts.                                |
| **Node.js**                            | Required because **Appium server** is built on Node.js.                            |
| **Appium Server / Appium Desktop**     | The middleware that translates client commands to mobile actions.                  |
| **Appium Drivers**                     | Platform-specific drivers: <br>👉 Android → **UiAutomator2 Driver** / Espresso     |
| **Device (Real / Emulator)**           | The target where tests are executed (real Android phone or Android emulator).      |
| **Appium Inspector**                   | GUI tool to inspect elements and get locators for automation.                      |
| **Android Studio (with SDK & ADB)**    | Provides **SDK tools, Emulator, ADB commands** (mandatory for Android automation). |


## 4 What are Desired Capabilities in Appium.

In Appium, Desired Capabilities are basically a set of key–value pairs that act like instructions for the Appium server, telling it what kind of automation session we want to start. Whenever we write a test script, before executing any action, our client script sends these capabilities to the Appium server in the form of a JSON object. The server then uses this information to launch the right platform, the right device, and the right application. 



For example, in Android automation, we usually define capabilities such as the platform name, platform version, device name, automation engine (like UiAutomator2), and the details of the application under test such as app package and app activity. Similarly, for iOS we provide capabilities like platform name, platform version, device UDID, automation engine (like XCUITest), and the bundle ID of the app. Desired Capabilities make the framework flexible because by changing these values we can run the same test scripts on different devices, OS versions, or even on real devices and emulators without changing the core logic of our test. In short, they act as the bridge between our test scripts and the mobile environment by defining all the necessary configurations for a successful session.


```java
DesiredCapabilities caps = new DesiredCapabilities();

// Platform & Device details
caps.setCapability("platformName", "Android");          // Mobile OS
caps.setCapability("platformVersion", "13.0");          // Android version
caps.setCapability("deviceName", "Pixel_5");            // Emulator/Real device name
caps.setCapability("automationName", "UiAutomator2");   // Automation engine

// Application details
caps.setCapability("appPackage", "com.example.myapp");               // App package name
caps.setCapability("appActivity", "com.example.myapp.MainActivity"); // App launch activity
caps.setCapability("app", "C:\\apps\\myapp.apk");                    // Path to the APK file

// App behavior settings
caps.setCapability("noReset", true);         // Don’t reset app data between sessions
caps.setCapability("fullReset", false);      // Don’t uninstall app between sessions
caps.setCapability("autoGrantPermissions", true); // Grant all runtime permissions automatically

// Keyboard settings
caps.setCapability("unicodeKeyboard", true); // Support Unicode input (e.g., Hindi, emojis, etc.)
caps.setCapability("resetKeyboard", true);   // Reset to normal keyboard after test

// Device unlock settings
caps.setCapability("unlockType", "pin");     // Unlock method (pin, pattern, password)
caps.setCapability("unlockKey", "1234");     // Unlock key (your actual PIN/pattern/password)

// Extra configs
caps.setCapability("ignoreHiddenApiPolicyError", true); // Ignore hidden API policy errors
caps.setCapability("newCommandTimeout", 60);            // Timeout (in seconds) for new commands
```

## 5 UiAutomator2Options.
UiAutomator2Options is a special class introduced in Appium 2.x under the package io.appium.java_client.android.options. Its main purpose is to define the capabilities of an Android device or emulator in a more structured and type-safe way. Earlier, in Appium 1.x, testers used DesiredCapabilities to pass these values, but the problem was that everything was written as key–value strings (for example, "platformName", "deviceName"). If you made a small spelling mistake in the capability name, the script would fail, and debugging was difficult.

With Appium 2.x, the Appium team introduced the concept of Options classes, such as UiAutomator2Options for Android and XCUITestOptions for iOS. These classes provide dedicated setter methods like setDeviceName(), setAppPackage(), or setAppActivity(). This not only makes the code cleaner and easier to read, but also gives autocomplete suggestions in the IDE, which helps avoid mistakes. For example, instead of writing caps.setCapability("deviceName", "Pixel_5"), now you can simply write options.setDeviceName("Pixel_5").

In simple words, UiAutomator2Options acts like an organized container for all Android-related capabilities. It improves code readability, reduces errors, and aligns with modern Appium standards. That’s why it is the recommended way to define capabilities in Appium 2.x instead of using the older DesiredCapabilities class.

```java 
import io.appium.java_client.android.options.UiAutomator2Options;

UiAutomator2Options options = new UiAutomator2Options();

// Platform & Device details
options.setPlatformName("Android");           // Mobile OS
options.setPlatformVersion("13.0");           // Android version
options.setDeviceName("Pixel_5");             // Emulator/Real device name
options.setAutomationName("UiAutomator2");    // Automation engine

// Application details
options.setAppPackage("com.example.myapp");                // App package name
options.setAppActivity("com.example.myapp.MainActivity");  // App launch activity
options.setApp("C:\\apps\\myapp.apk");                     // Path to the APK file

// App behavior settings
options.setNoReset(true);                   // Don’t reset app data between sessions
options.setFullReset(false);                // Don’t uninstall app between sessions
options.setAutoGrantPermissions(true);      // Grant all runtime permissions automatically

// Keyboard settings
options.setUnicodeKeyboard(true);           // Support Unicode input (e.g., Hindi, emojis, etc.)
options.setResetKeyboard(true);             // Reset to normal keyboard after test

// Device unlock settings
options.setCapability("unlockType", "pin");  // Unlock method (pin, pattern, password)
options.setCapability("unlockKey", "1234");  // Unlock key (your actual PIN/pattern/password)

// Extra configs
options.setCapability("ignoreHiddenApiPolicyError", true); // Ignore hidden API policy errors
options.setNewCommandTimeout(Duration.ofSeconds(60));       // Timeout for new commands


```

| Capability                   | Example Value                      | Usage / Purpose                                                               |
| ---------------------------- | ---------------------------------- | ----------------------------------------------------------------------------- |
| `platformName`               | `"Android"`                        | Specifies the mobile OS to automate.                                          |
| `platformVersion`            | `"13.0"`                           | Defines the Android OS version on the device/emulator.                        |
| `deviceName`                 | `"Pixel_5"`                        | Identifies the device/emulator name where tests will run.                     |
| `automationName`             | `"UiAutomator2"`                   | Sets the automation engine (UiAutomator2 is recommended for Android).         |
| `appPackage`                 | `"com.example.myapp"`              | Unique package name of the target Android app.                                |
| `appActivity`                | `"com.example.myapp.MainActivity"` | Entry-point activity of the app to be launched.                               |
| `app`                        | `"C:\\apps\\myapp.apk"`            | Path to the APK file to install/run.                                          |
| `noReset`                    | `true`                             | Prevents clearing app data between test runs.                                 |
| `fullReset`                  | `false`                            | Prevents uninstalling the app before/after test session.                      |
| `autoGrantPermissions`       | `true`                             | Grants all app permissions automatically at install/launch.                   |
| `unicodeKeyboard`            | `true`                             | Enables Unicode keyboard (supports emojis, non-English languages like Hindi). |
| `resetKeyboard`              | `true`                             | Resets the keyboard back to default after test execution.                     |
| `unlockType`                 | `"pin"`                            | Defines unlock method (e.g., `pin`, `password`, `pattern`).                   |
| `unlockKey`                  | `"1234"`                           | Actual unlock key (e.g., PIN = 1234, password = abcd).                        |
| `ignoreHiddenApiPolicyError` | `true`                             | Avoids failures caused by hidden API restrictions in newer Android versions.  |
| `newCommandTimeout`          | `60`                               | Time (in seconds) Appium waits for new commands before ending the session.    |

## 6 AndroidDriver.

AndroidDriver is a specialized class provided by Appium (in the Appium Java Client library) that is used to automate Android devices and applications. It extends the RemoteWebDriver class from Selenium, which means it inherits all the basic browser automation commands (like findElement, click, sendKeys) and then adds Android-specific features on top of it, this makes it a powerful driver because it doesn’t just automate browsers, but also real Android apps and even device-level operations.

When you create an AndroidDriver object in your test script, you provide two important things: the Appium server URL and a set of desired capabilities (like deviceName, platformName, appPackage, and appActivity). The AndroidDriver uses this information to establish a session with the Appium server.

With AndroidDriver, you can perform actions such as launching and closing apps, installing and uninstalling apps, rotating the device screen, opening the notification panel, toggling airplane mode, checking whether an app is installed, and retrieving the current app’s package and activity. These capabilities go beyond traditional web automation and give you full control over the Android environment.

While Selenium WebDriver is mainly built for automating browsers, AndroidDriver is built for mobile automation. It not only allows you to automate mobile web browsers but also native and hybrid mobile apps. The unique advantage of AndroidDriver is that it can perform both app-level operations and device-level operations, which Selenium alone cannot handle.







| **Category**                | **Method**                                                 | **Purpose**                                            | **Example**                                                         |
| --------------------------- | ---------------------------------------------------------- | ------------------------------------------------------ | ------------------------------------------------------------------- |
| **App Management**          | `installApp(String appPath)`                               | Installs an app on the device.                         | `driver.installApp("C:\\apps\\myApp.apk");`                         |
|                             | `isAppInstalled(String bundleId)`                          | Checks if an app is installed.                         | `driver.isAppInstalled("com.example.myapp");`                       |
|                             | `activateApp(String appPackage)`                           | Launches an already installed app.                     | `driver.activateApp("com.example.myapp");`                          |
|                             | `terminateApp(String appPackage)`                          | Closes the given app.                                  | `driver.terminateApp("com.example.myapp");`                         |
|                             | `removeApp(String appPackage)`                             | Uninstalls the given app.                              | `driver.removeApp("com.example.myapp");`                            |
|                             | `launchApp()`                                              | Launches the app defined in capabilities.              | `driver.launchApp();`                                               |
|                             | `closeApp()`                                               | Closes the current app.                                | `driver.closeApp();`                                                |
|                             | `resetApp()`                                               | Resets the app (clears data and restarts).             | `driver.resetApp();`                                                |
| **Device Interaction**      | `lockDevice()`                                             | Locks the device.                                      | `driver.lockDevice();`                                              |
|                             | `unlockDevice()`                                           | Unlocks the device.                                    | `driver.unlockDevice();`                                            |
|                             | `isDeviceLocked()`                                         | Checks if the device is locked.                        | `driver.isDeviceLocked();`                                          |
|                             | `toggleAirplaneMode()`                                     | Switch airplane mode on/off.                           | `driver.toggleAirplaneMode();`                                      |
|                             | `toggleData()`                                             | Enable/disable mobile data.                            | `driver.toggleData();`                                              |
|                             | `toggleWiFi()`                                             | Enable/disable Wi-Fi.                                  | `driver.toggleWiFi();`                                              |
|                             | `toggleLocationServices()`                                 | Enable/disable location services.                      | `driver.toggleLocationServices();`                                  |
|                             | `hideKeyboard()`                                           | Hides the software keyboard.                           | `driver.hideKeyboard();`                                            |
|                             | `openNotifications()`                                      | Opens the notification drawer.                         | `driver.openNotifications();`                                       |
|                             | `shake()`                                                  | Simulates device shake.                                | `driver.shake();`                                                   |
| **Screen & Orientation**    | `rotate(ScreenOrientation orientation)`                    | Rotates the screen (PORTRAIT / LANDSCAPE).             | `driver.rotate(ScreenOrientation.LANDSCAPE);`                       |
|                             | `getOrientation()`                                         | Gets current screen orientation.                       | `driver.getOrientation();`                                          |
|                             | `getRotation()`                                            | Gets exact rotation (0, 90, 180, 270).                 | `driver.getRotation();`                                             |
|                             | `setClipboardText(String text)`                            | Copies text to clipboard.                              | `driver.setClipboardText("Hello Appium");`                          |
|                             | `getClipboardText()`                                       | Gets text from clipboard.                              | `driver.getClipboardText();`                                        |
| **Context & Session**       | `getContext()`                                             | Returns current context (NATIVE\_APP / WEBVIEW).       | `driver.getContext();`                                              |
|                             | `getContextHandles()`                                      | Lists all available contexts.                          | `driver.getContextHandles();`                                       |
|                             | `context(String name)`                                     | Switches context to WEBVIEW or NATIVE.                 | `driver.context("WEBVIEW_com.example");`                            |
|                             | `quit()`                                                   | Ends session and closes connection with Appium server. | `driver.quit();`                                                    |
| **Activity & Package Info** | `currentActivity()`                                        | Returns the name of the current activity.              | `driver.currentActivity();`                                         |
|                             | `getCurrentPackage()`                                      | Returns the app package currently in use.              | `driver.getCurrentPackage();`                                       |
|                             | `startActivity(Activity activity)`                         | Starts a new activity inside the app.                  | `driver.startActivity(new Activity("com.example","MainActivity"));` |
| **Gestures & Touch**        | `performTouchAction(TouchAction action)`                   | Perform touch actions like tap, press, swipe.          | `action.tap(PointOption.point(100,200)).perform();`                 |
|                             | `multiTouchAction(MultiTouchAction action)`                | Perform multi-touch actions.                           | `multiAction.add(action1).add(action2).perform();`                  |
| **Other Utilities**         | `getDeviceTime()`                                          | Returns the device time.                               | `driver.getDeviceTime();`                                           |
|                             | `getBatteryInfo()`                                         | Returns battery status.                                | `driver.getBatteryInfo();`                                          |
|                             | `getPerformanceData(String pkg, String type, int timeout)` | Get CPU/memory/network performance data.               | `driver.getPerformanceData("com.example","cpuinfo",5);`             |
|                             | `isKeyboardShown()`                                        | Checks if the keyboard is visible.                     | `driver.isKeyboardShown();`                                         |





## 7 Appium Inspector.

Appium Inspector is a tool that allows testers and developers to inspect and interact with a mobile app’s UI while creating automation. It connects with the Appium server and the target device (real or emulator) to display the app’s UI hierarchy, element properties, and a live screenshot. This makes it easier to find and verify locators before writing test scripts.


Inspector also supports basic interactions like tap, send keys, swipe, or scroll directly from the tool. It can generate locator strings or code snippets to speed up script writing. For hybrid apps, Inspector allows switching between contexts (NATIVE_APP and WEBVIEW) and inspecting web elements, which simplifies debugging across native and web views.


How to configure Appium instpector

To configure Appium Inspector, first make sure you have the Appium server installed and running, either through the Appium Desktop app or Appium server on command line. Then open Appium Inspector, enter the same desired capabilities you use in your automation framework, such as platformName (Android/iOS), deviceName, automationName (like UiAutomator2 or XCUITest), and app details (for Android: appPackage and appActivity, for iOS: bundleId). Next, provide the Remote Host and Port where your Appium server is running (by default 0.0.0.0 and 4723). Once these details are filled, you can click the “Start Session” button, which launches a live session with the connected device or emulator. From there, Appium Inspector shows you the app’s screen, UI hierarchy, and all element attributes, which you can use for identifying locators and validating them before writing automation code.


| **Step** | **Action**                  | **Details**                                                                                                                                                                        |
| -------- | --------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| 1        | Install & Run Appium Server | Install Appium Desktop or run Appium server via command line.                                                                                                                      |
| 2        | Open Appium Inspector       | Launch the Appium Inspector application.                                                                                                                                           |
| 3        | Enter Desired Capabilities  | Provide values like: <br>• platformName (Android/iOS) <br>• deviceName <br>• automationName (UiAutomator2/XCUITest) <br>• appPackage & appActivity (Android) <br>• bundleId (iOS). |
| 4        | Configure Server Details    | Enter Remote Host (default: 0.0.0.0) and Port (default: 4723).                                                                                                                     |
| 5        | Start Session               | Click **“Start Session”** to connect Inspector with the device/emulator.                                                                                                           |
| 6        | Inspect App                 | Inspector displays app screen, UI hierarchy, and element attributes for locator identification and validation.                                                                     |


## 8 AndroidUtility class

The AndroidUtility class is a reusable helper built on top of Appium’s AndroidDriver to make mobile automation easier and cleaner. Instead of writing driver method calls repeatedly in test scripts, we group all commonly used Android operations like app management, device interactions, screen orientation handling, and utility functions into this single class.

It helps us install/uninstall apps, launch or close them, toggle device states (like airplane mode, notifications, or keyboard), rotate the screen, and fetch app or device details when needed. By centralizing these methods, the utility class improves reusability, readability, and maintainability of automation scripts, making testing faster and more efficient.


```java
package Utilities;

import org.openqa.selenium.ScreenOrientation;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;

public class AndroidUtility {
    AndroidDriver driver;

    public AndroidUtility(AndroidDriver driver) {
        this.driver = driver;
    }

    // ----------- App Management -----------
    public void installApp(String path) {
        driver.installApp(path);
    }

    public void activateApp(String appPackage) {
        driver.activateApp(appPackage);
    }

    public void terminateApp(String appPackage) {
        driver.terminateApp(appPackage);
    }

    public void deleteApp(String appPackage) {
        driver.removeApp(appPackage);
    }

    public boolean isAppInstalled(String appPackage) {
        return driver.isAppInstalled(appPackage);
    }

    public void launchApp() {
        driver.launchApp();
    }

    public void closeApp() {
        driver.closeApp();
    }

    public void resetApp() {
        driver.resetApp();
    }

    // ----------- Device Interaction -----------
    public void hideKeyboard() {
        driver.hideKeyboard();
    }

    public void airplaneMode() {
        driver.toggleAirplaneMode();
    }

    public void openNotifications() {
        driver.openNotifications();
    }

    public void lockDevice(int seconds) {
        driver.lockDevice(seconds);
    }

    public void unlockDevice() {
        driver.unlockDevice();
    }

    public boolean isDeviceLocked() {
        return driver.isDeviceLocked();
    }

    // ----------- Screen & Orientation -----------
    public void portraitOrientation() {
        driver.rotate(ScreenOrientation.PORTRAIT);
    }

    public void landscapeOrientation() {
        driver.rotate(ScreenOrientation.LANDSCAPE);
    }

    public ScreenOrientation getOrientation() {
        return driver.getOrientation();
    }

    // ----------- App Info -----------
    public String getCurrentPackage() {
        return driver.getCurrentPackage();
    }

    public String getCurrentActivity() {
        return driver.currentActivity();
    }

    public void startActivity(String appPackage, String appActivity) {
        driver.startActivity(new Activity(appPackage, appActivity));
    }

    // ----------- Clipboard -----------
    public void setClipboardText(String text) {
        driver.setClipboardText(text);
    }

    public String getClipboardText() {
        return driver.getClipboardText();
    }

    // ----------- Keyboard Info -----------
    public boolean isKeyboardShown() {
        return driver.isKeyboardShown();
    }

    // ----------- Other Useful Utilities -----------
    public String getDeviceTime() {
        return driver.getDeviceTime();
    }

    public String getBatteryInfo() {
        return driver.getBatteryInfo().toString();
    }
}
```

How to implement 

To implement AndroidUtility, first I create the class and pass the AndroidDriver object through its constructor so that all methods can use the same driver instance. Inside this class, I define reusable methods like installApp, activateApp, hideKeyboard, openNotifications, rotate screen, etc.

In my test scripts, instead of calling driver methods directly, I just create an object of AndroidUtility and call these helper methods. For example:

```java
AndroidUtility util = new AndroidUtility(driver);
util.openNotifications();
util.portraitOrientation();

```
## 9 Context Handling in Appium (Native App ↔ WebView)

In Appium, context handling refers to switching between different execution environments of a mobile application, mainly NATIVE_APP and WEBVIEW. By default, when a mobile app is launched, Appium starts in the NATIVE_APP context, which means it interacts with native UI elements such as buttons, text fields, and menus. However, many modern mobile apps are hybrid, containing embedded web content (like login pages, payment gateways, or in-app browsers). In such cases, we need to switch to the WEBVIEW context to interact with HTML elements like input fields, links, or buttons inside the web page.

To achieve this, Appium provides methods such as getContextHandles() to list all available contexts, getContext() to check the current context, and context(name) to switch to the desired one. For example, we first capture all contexts, then switch from NATIVE_APP to WEBVIEW_com.example to perform web-based automation, and finally switch back to NATIVE_APP after completing the task.

```java

package androidDriverMethods;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.Duration;
import java.util.Set;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class ContextDemo {

	public static void main(String[] args) throws MalformedURLException, URISyntaxException, InterruptedException {
		
		// Setup capabilities
		UiAutomator2Options options = new UiAutomator2Options();
		options.setPlatformName("Android");
		options.setAutomationName("UiAutomator2");
		options.setDeviceName("Galaxy M15 5G");
		options.setUdid("RZCX41G7WHD");
		options.setNoReset(true);

		// Connect with Appium server
		URL serverUrl = new URI("http://localhost:4723").toURL();
		AndroidDriver driver = new AndroidDriver(serverUrl, options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Launch app
		driver.activateApp("com.androidsample.generalstore");
		driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/spinnerCountry")).click();
		
	    driver.findElement(AppiumBy.xpath("//android.widget.TextView//android.widget.TextView[@text='ADD TO CART']")).click();
	    driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/counterText")).click();
        driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/btnProceed")).click();
        Thread.sleep(2000);

        // Get all contexts
        Set<String> contexts = driver.getContextHandles();
        System.out.println("Available contexts: " + contexts);

        // Switch to WebView
        for (String context : contexts) {
        	if (context.contains("WEBVIEW")) {
        		driver.context(context);
        		System.out.println("Switched to: " + context);
        		break;
        	}
        }

        // Example action in WebView
        System.out.println("Page Title: " + driver.getTitle());

        // Switch back to Native
        driver.context("NATIVE_APP");
        System.out.println("Switched back to Native App");

        driver.quit();
	}
}

```

In Appium, when we launch a mobile application, it starts in the NATIVE_APP context by default, which allows interaction with native elements like buttons, text fields, and menus. Many modern apps are hybrid, containing embedded web pages (WebViews), so to interact with web elements, we need to switch the context. First, we retrieve all available contexts using driver.getContextHandles(), which usually returns something like [NATIVE_APP, WEBVIEW_com.example.myapp]. Then we switch to the WebView context using driver.context("WEBVIEW_com.example.myapp") and perform Selenium-like actions on the web elements. Once the web actions are complete, we switch back to the native context using driver.context("NATIVE_APP"). This context handling feature in Appium allows seamless automation of hybrid apps, enabling testers to work with both native and web components within a single test script.


## 10 ADB and its command

ADB (Android Debug Bridge) is a versatile command-line tool that comes with the Android SDK. It acts as a bridge between your computer and an Android device—either a real device or an emulator—allowing you to send instructions, retrieve information, and control the device remotely. This is extremely useful for developers and testers because it provides capabilities that are otherwise not easily available through the device’s touchscreen or settings.


| **ADB Command**                                                         | **Usage / Description**               | **Notes / Corrected Version**              |                               |
| ----------------------------------------------------------------------- | ------------------------------------- | ------------------------------------------ | ----------------------------- |
| `adb devices`                                                           | Check connected devices/emulators     | Lists device ID and status                 |                               |
| `adb install <path_to_apk>`                                             | Install an APK on the device          | Full path required                         |                               |
| `adb uninstall <package_name>`                                          | Uninstall an app                      | e.g., `adb uninstall com.example.app`      |                               |
| `adb shell pm list packages`                                            | List all installed packages           | Add \`                                     | findstr <keyword>\` to filter |
| `adb shell dumpsys battery set level <value>`                           | Set battery level                     | Value between 0-100                        |                               |
| `adb shell dumpsys battery reset`                                       | Reset battery level to device default | -                                          |                               |
| `adb shell am start -a android.intent.action.CALL -d tel:<phoneNumber>` | Make a call                           | Replace `<phoneNumber>` with actual number |                               |
| `adb shell input keyevent KEYCODE_ENDCALL`                              | End an ongoing call                   | -                                          |                               |
| `adb shell input keyevent KEYCODE_HOME`                                 | Go back to Home screen                | -                                          |                               |
| `adb shell input keyevent KEYCODE_BACK`                                 | Navigate back                         | -                                          |                               |
| `adb shell charger set usb 0`                                           | Disconnect USB charger                | 0 = disconnect, 1 = connect                |                               |
| `adb shell svc wifi enable/disable`                                     | Turn Wi-Fi on/off                     | Use `enable` or `disable`                  |                               |
| `adb shell svc data enable/disable`                                     | Turn mobile data on/off               | Use `enable` or `disable`                  |                               |
| `adb shell input text "text"`                                           | Enter text on device                  | Quotes needed for spaces                   |                               |
| `adb shell input swipe x1 y1 x2 y2 [duration(ms)]`                      | Perform swipe                         | Optional duration in ms                    |                               |
| `adb shell input tap x y`                                               | Perform tap at coordinates            | -                                          |                               |
| \`adb shell dumpsys window                                              | findstr "mCurrentFocus"\`             | Check current foreground app               | -                             |
| `adb logcat`                                                            | Capture device logs                   | Shows live logs                            |                               |
| `adb logcat -d > logs.txt`                                              | Save logs to file                     | `-d` dumps current logs and exits          |                               |
| \`adb logcat \*:E                                                       | findstr \<package\_name>\`            | Capture error logs only for app            | `*:E` filters error logs      |
| `adb -s <device_id> <command>`                                          | Perform action on a specific device   | Device ID from `adb devices`               |                               |
| `adb -s <device_id> shell screencap -p /sdcard/screenshot.png`          | Take screenshot on specific device    | -                                          |                               |
| `adb shell screencap -p /sdcard/screenshot.png`                         | Take screenshot on default device     | -                                          |                               |
| `adb pull /sdcard/screenshot.png <local_path>`                          | Pull screenshot from device to PC     | Replace `<local_path>`                     |                               |
| `adb push <local_file_path> <device_path>`                              | Push file from PC to device           | Replace paths accordingly                  |                               |
| `adb pull <device_file_path> <local_path>`                              | Pull file from device to PC           | Replace paths accordingly                  |                               |
| `adb bugreport`                                                         | Generate full bug report              | Can take time, outputs device logs         |                               |
| `adb bugreport > report.txt`                                            | Save bug report to file               | -                                          |                               |



## 11 Advantages of Appium

| **Feature**                                             | **Description**                                                                                                                |
| ------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------ |
| **Cross-Platform Compatibility (Android, iOS)**         | Automates both Android and iOS apps with a single tool, reducing effort and maintenance.                                       |
| **Open Source**                                         | Free to use, has strong community support, and can be customized as per project needs.                                         |
| **Supports Multiple Programming Languages**             | Test scripts can be written in Java, Python, JavaScript, C#, Ruby, PHP, etc., giving flexibility to teams.                     |
| **No App Modification Required**                        | Works with the original app (APK/IPA) without needing source code or changes to the app.                                       |
| **Integration with CI/CD**                              | Can be integrated with Jenkins, GitHub Actions, or other CI/CD tools for continuous testing.                                   |
| **Supports Native, Hybrid, and Mobile Web Apps**        | Covers all types of apps: Native (platform-specific), Hybrid (native + web), and Mobile web (browser-based).                   |
| **Supports Real Device and Simulator/Emulator Testing** | Enables testing on both physical devices and virtual devices like Android Emulator or iOS Simulator.                           |
| **Built-in Inspector**                                  | Helps in locating UI elements easily for script writing. Supports **parallel execution** across multiple devices to save time. |


## 12 Locators in Appium

Locators in Appium are used to uniquely identify and interact with elements in a mobile application, such as buttons, text fields, images, links, and dropdowns. They are the backbone of mobile automation, because without identifying elements, we cannot perform actions like tapping, typing, swiping, or retrieving text. Appium provides different locator strategies for both Android and iOS, such as ID, Accessibility ID, Class Name, XPath, Android UIAutomator, iOS Predicate String, and iOS Class Chain.

Among these, ID and Accessibility ID are the most reliable and fastest, as they are usually unique and stable across app versions. XPath is more flexible but can be slower and brittle if the app structure changes frequently. Platform-specific locators like UIAutomator (Android) and Predicate String / Class Chain (iOS) are powerful for handling complex element hierarchies.

Choosing the right locator is very important for writing stable and maintainable Appium scripts. In real-time projects, testers usually combine different locator strategies depending on the app’s design, ensuring that the test cases are reusable, efficient, and less prone to breakage when the UI changes.


| **Locator Name**         | **Definition**                                                                | **Example Code**                                                                              |
| ------------------------ | ----------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| **id**                   | Finds element using the **resource-id attribute** (must be unique).           | `driver.findElement(AppiumBy.id("com.example:id/username")).sendKeys("Admin");`               |
| **accessibilityId**      | Finds element using the **Accessibility ID / content-desc** (cross-platform). | `driver.findElement(AppiumBy.accessibilityId("loginButton")).click();`                        |
| **className**            | Finds element using the **class attribute** of UI element.                    | `driver.findElement(AppiumBy.className("android.widget.Button")).click();`                    |
| **xpath**                | Finds element using **XPath expression** (flexible but slower).               | `driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Login']")).click();`     |
| **androidUIAutomator**   | Android-specific locator using **UIAutomator framework**.                     | `driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"India\")"));`        |
| **iOS Predicate String** | iOS-specific locator using **NSPredicate query syntax**.                      | `driver.findElement(AppiumBy.iOSNsPredicateString("label == 'Login'"));`                      |
| **iOS Class Chain**      | iOS-specific locator to find elements via **hierarchical queries**.           | `driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`label == 'Login'`]"));` |

## 13 EXCEPTION IN APPIUM

In Appium, an exception is an error that occurs while running automation scripts when something unexpected happens. These exceptions usually come from issues like device connectivity, Appium server problems, wrong locators, version mismatches, or application behavior. For example, if an element is not found on the screen, Appium throws a NoSuchElementException; if the server fails to create a session, it throws a SessionNotCreatedException. Exceptions are a natural part of automation because mobile environments involve many external factors such as network, device, and app states. Handling exceptions properly with correct waits, accurate locators, updated dependencies, and stable setup ensures smooth test execution. In real-time projects, understanding these exceptions helps testers quickly identify the root cause of failures and fix them without wasting time.

| **Exception Name**                 | **Cause**                                                                                                                            | **Solution**                                                                                                                 | **Simple Description**                                        |
| ---------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------ | ---------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------- |
| **SessionNotCreatedException**     | - Appium server not connected <br> - Device not detected <br> - Wrong DesiredCapabilities <br> - SDK path issue <br> - Socket hangup | - Restart phone <br> - Start server manually <br> - Run `adb devices` <br> - Fix DesiredCapabilities <br> - Correct SDK path | Appium was not able to start the session with the device/app. |
| **NoSuchMethodError**              | Version mismatch between Appium client and dependencies                                                                              | Update dependency versions (like Appium client in `pom.xml`)                                                                 | Some function is missing because of wrong version setup.      |
| **WebDriverException**             | - Internet issues <br> - Driver not initialized <br> - Emulator-specific code on real device                                         | - Check internet <br> - Verify driver setup <br> - Use correct driver                                                        | Driver setup failed or code doesn’t match device type.        |
| **InvalidSelectorException**       | Wrong XPath/CSS locator                                                                                                              | Fix locator syntax                                                                                                           | Locator is written wrongly, Appium can’t find element.        |
| **NoSuchElementException**         | - Element not present <br> - Element not visible <br> - Wrong locator                                                                | - Use waits <br> - Verify locator                                                                                            | Appium can’t find the element on screen.                      |
| **UnsupportedCommandException**    | Invalid/mistyped Appium command                                                                                                      | Double-check command                                                                                                         | You gave Appium a wrong or unsupported command.               |
| **SocketException**                | Connection lost between server and device                                                                                            | Restart phone / reconnect device                                                                                             | Device connection got broken.                                 |
| **TimeoutException**               | Element not found within given wait time                                                                                             | Increase wait time or use better waits                                                                                       | Waited too long but element didn’t appear.                    |
| **StaleElementReferenceException** | Page refreshed and element reference changed                                                                                         | Use POM or re-locate element                                                                                                 | Element was found before, but is no longer valid.             |
| **IllegalStateException**          | Wrong driver setup or WebDriver state                                                                                                | Verify driver and server setup                                                                                               | Driver is not ready or setup is wrong.                        |
| **InvalidServerInstanceException** | Wrong Appium server file/path                                                                                                        | Correct server path and restart server                                                                                       | Appium server path is invalid.                                |
| **AbstractMethodError**            | Incompatible Appium client with TestNG/JUnit version                                                                                 | Update/downgrade versions                                                                                                    | Method is missing because of version mismatch.                |
| **FatalException**                 | Critical failure in Appium or environment                                                                                            | Restart server/device, check logs                                                                                            | Serious error – Appium crashed unexpectedly.                  |


## 14 Page Object Model (POM) in Appium


Page Object Model, or POM, is a design pattern used in Appium where we create separate classes for each screen of the mobile application. Each class stores the locators of the elements on that screen and the methods to interact with them. Instead of writing locators directly inside test cases, we keep them in one place, which makes the code cleaner, reusable, and easier to maintain. If anything changes in the app’s UI, we just update the locator in the page class without touching the test logic. In short, POM helps reduce code duplication and makes the mobile automation framework more scalable.

To implement POM in Appium, we declare an AndroidDriver (for Android) or IOSDriver (for iOS) variable in the page class to hold the mobile driver instance. Then, we create a constructor that takes this driver as a parameter and assigns it to the class variable using this.driver = driver;. Inside the constructor, we call

``` java
PageFactory.initElements(new AppiumFieldDecorator(driver), this);

```

This initializes all the mobile elements defined in the class.

For locating elements, instead of Selenium’s @FindBy, we use Appium’s annotations like @AndroidFindBy, @AndroidFindAll, @AndroidFindBys for Android, and @iOSXFindBy for iOS. With these, we can define single elements, OR conditions, AND conditions, or even lists of elements like multiple checkboxes or links.

After defining elements, we create getter methods if we need direct access to them. Then, we write action methods that perform operations on these elements, such as login(), selectAllCheckboxes(), or printAllLinks().

Finally, in the test class, we simply create an object of this page class and call its methods. This approach separates locators and actions from test logic, makes the code reusable, easier to maintain, and allows us to handle app UI changes by updating only the page class without rewriting test cases.


| **Locator / Method**                   | **Description (Easy Words)**                               | **Example**                                                                                                                                                                           |
| -------------------------------------- | ---------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **@AndroidFindBy / @iOSXFindBy**       | Used for a **single locator** (finds one element).         | `@AndroidFindBy(id = "com.app:id/loginBtn") private WebElement loginBtn;`                                                                                                             |
| **@AndroidFindBys**                    | Works as **AND condition** → all locators must match.      | `@AndroidFindBys({ @AndroidFindBy(className = "android.widget.EditText"), @AndroidFindBy(xpath = "//android.widget.EditText[@password='true']") }) private WebElement passwordField;` |
| **@AndroidFindAll**                    | Works as **OR condition** → any locator can match.         | `@AndroidFindAll({ @AndroidFindBy(id = "com.app:id/email"), @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc='userEmail']") }) private WebElement emailField;`         |
| **driver.findElement(AppiumBy / By)**  | Finds the **first matching element**.                      | `driver.findElement(AppiumBy.id("com.app:id/loginBtn")).click();`                                                                                                                     |
| **driver.findElements(AppiumBy / By)** | Finds **all matching elements** and stores them in a list. | `List<WebElement> checkboxes = driver.findElements(AppiumBy.className("android.widget.CheckBox"));`                                                                                   |




```java

import java.util.List;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindAll;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AndroidFindBys;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 {

    AndroidDriver driver;

    public LoginPage2(AndroidDriver driver) {
        this.driver = driver;
        // Appium uses AppiumFieldDecorator instead of initElements
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    // Single element
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Login']")
    private WebElement loginBtn;

    // OR condition using AndroidFindAll
    @AndroidFindAll({
        @AndroidFindBy(id = "com.example:id/email"),
        @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc='userEmail']")
    })
    private WebElement emailField;

    // AND condition using AndroidFindBys (all conditions must match)
    @AndroidFindBys({
        @AndroidFindBy(className = "android.widget.EditText"),
        @AndroidFindBy(xpath = "//android.widget.EditText[@password='true']")
    })
    private WebElement passwordField;

    @AndroidFindBy(className = "android.widget.CheckBox")
    private List<WebElement> checkboxes;

    @AndroidFindBy(className = "android.widget.TextView")
    private List<WebElement> allLinks;

    // Getters
    public AndroidDriver getDriver() {
        return driver;
    }

    public WebElement getLoginBtn() {
        return loginBtn;
    }

    public WebElement getEmailField() {
        return emailField;
    }

    public WebElement getPasswordField() {
        return passwordField;
    }

    public List<WebElement> getCheckboxes() {
        return checkboxes;
    }

    public List<WebElement> getAllLinks() {
        return allLinks;
    }

    // Example Action: login
    public void login(String email, String password) {
        emailField.sendKeys(email);
        passwordField.sendKeys(password);
        loginBtn.click();
    }

    // Example Action: check all checkboxes
    public void selectAllCheckboxes() {
        for (WebElement checkbox : checkboxes) {
            if (!checkbox.isSelected()) {
                checkbox.click();
            }
        }
    }

    // Example Action: print all link texts
    public void printAllLinks() {
        for (WebElement link : allLinks) {
            System.out.println(link.getText());
        }
    }
}

```

| **Component / Feature**                                            | **Type / Annotation** | **Purpose / Usefulness**                                                                    |
| ------------------------------------------------------------------ | --------------------- | ------------------------------------------------------------------------------------------- |
| `AndroidDriver driver;` / `IOSDriver driver;`                      | Class Variable        | Holds the mobile driver instance (Android or iOS) for the screen; used across page methods. |
| `public LoginPage2(AndroidDriver driver)`                          | Constructor           | Initializes the screen class; `this.driver = driver;` assigns local driver to class.        |
| `PageFactory.initElements(new AppiumFieldDecorator(driver), this)` | Method Call           | Initializes all MobileElements (with Appium locators) defined in the class.                 |
| `@AndroidFindBy` / `@iOSXFindBy`                                   | Annotation            | Single element locator (specific to Android/iOS).                                           |
| `@AndroidFindAll`                                                  | Annotation            | Multiple locators (**OR condition**) for Android.                                           |
| `@AndroidFindBys`                                                  | Annotation            | Multiple locators (**AND condition**) for Android.                                          |
| `MobileElement / List<MobileElement>`                              | Variable Type         | Stores screen elements (single or multiple) for actions like tap, sendKeys, etc.            |
| `login(String email, String password)`                             | Method / Action       | Example action method using mobile elements to perform login.                               |
| `selectAllCheckboxes()`                                            | Method / Action       | Example method to perform action on a list of checkboxes.                                   |
| `printAllLinks()`                                                  | Method / Action       | Example method to iterate and read all text views / links on the screen.                    |


## 15 Gesture in Appium


In Appium, gestures are actions that simulate how a real user interacts with a mobile device. Instead of just doing simple clicks or typing, gestures allow us to perform touch-based interactions like swipe, scroll, drag-and-drop, pinch, zoom, tap, double tap, and long press.

These gestures are very important because in real mobile apps, users don’t only click buttons — they swipe through lists, scroll to find elements, zoom into maps or images, and drag items. By automating gestures, Appium makes our test scripts behave closer to real user behavior.


In Appium, gestures are very important because they replicate how a real user interacts with the mobile device. It’s not just about clicking or typing, but about handling actions like swiping, scrolling, pinch and zoom, drag and drop, long press, and tapping.

For example, in my project, I had scenarios where I had to scroll down in a long list until a specific element was visible. I implemented scroll gestures using Appium’s mobile: scrollGesture command. Similarly, for swiping through product images, I used swipeGesture.

I also worked on long press gestures, like when we had to test the context menu that opens on pressing and holding an element. In some cases, I used drag-and-drop gestures to rearrange items in the app.

So overall, gestures in Appium helped me test real-world user interactions on touchscreens, and I made use of both JavascriptExecutor with mobile commands and sometimes TouchAction when needed


```java
package Utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class GestureUtility {
    AndroidDriver driver;

    public GestureUtility(AndroidDriver driver) {
        this.driver = driver;
    }

    // Long Click on Element
    public void longClickByElement(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("mobile: longClickGesture",
                ImmutableMap.of("elementId", ((RemoteWebElement) element).getId()));
    }

    // Click on Element
    public void clickByElement(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("mobile: clickGesture",
                ImmutableMap.of("elementId", ((RemoteWebElement) element).getId()));
    }

    // Double Click on Element
    public void doubleClickByElement(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("mobile: doubleClickGesture",
                ImmutableMap.of("elementId", ((RemoteWebElement) element).getId()));
    }

    // Long Click on Coordinates
    public void longClickByCoordinates(int x, int y, int time) {
        ((JavascriptExecutor) driver).executeScript("mobile: longClickGesture",
                ImmutableMap.of("x", x, "y", y, "duration", time));
    }

    // Click on Coordinates
    public void clickByCoordinates(int x, int y) {
        ((JavascriptExecutor) driver).executeScript("mobile: clickGesture",
                ImmutableMap.of("x", x, "y", y));
    }

    // Double Click on Coordinates
    public void doubleClickByCoordinates(int x, int y) {
        ((JavascriptExecutor) driver).executeScript("mobile: doubleClickGesture",
                ImmutableMap.of("x", x, "y", y));
    }

    // Drag and Drop
    public void dragAndDrop(WebElement element, int endX, int endY) {
        ((JavascriptExecutor) driver).executeScript("mobile: dragGesture",
                ImmutableMap.of("elementId", ((RemoteWebElement) element).getId(),
                        "endX", endX, "endY", endY));
    }

    // Zoom In (Pinch Open)
    public void zoomIn(WebElement element, double percent) {
        ((JavascriptExecutor) driver).executeScript("mobile: pinchOpenGesture",
                ImmutableMap.of("elementId", ((RemoteWebElement) element).getId(),
                        "percent", percent, "speed", 500));
    }

    // Zoom Out (Pinch Close)
    public void zoomOut(WebElement element, double percent) {
        ((JavascriptExecutor) driver).executeScript("mobile: pinchCloseGesture",
                ImmutableMap.of("elementId", ((RemoteWebElement) element).getId(),
                        "percent", percent, "speed", 500));
    }

    // Swipe by Coordinates
    public void swipeByCoordinates(int left, int top, int width, int height, String direction, double percent) {
        ((JavascriptExecutor) driver).executeScript("mobile: swipeGesture",
                ImmutableMap.of("left", left, "top", top, "width", width, "height", height,
                        "direction", direction, "percent", percent));
    }

    // Swipe by Element
    public void swipeByElement(WebElement element, String direction, double percent) {
        ((JavascriptExecutor) driver).executeScript("mobile: swipeGesture",
                ImmutableMap.of("elementId", ((RemoteWebElement) element).getId(),
                        "direction", direction, "percent", percent));
    }

    // Scroll by Visible Text
    public WebElement scrollByText(String text) {
        WebElement elementText = driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))"
                        + ".scrollIntoView(new UiSelector().text(\"" + text + "\"))"));
        return elementText;
    }

    // Scroll by XPath (manual find + use swipe if needed)
    public WebElement scrollByPath(String xpath) {
        WebElement elementXpath = driver.findElement(AppiumBy.xpath(xpath));
        return elementXpath;
    }
}

```
In my framework, I created a separate utility class called GestureUtility to handle all mobile gestures in one place. Inside this class, I declared an AndroidDriver reference at the class level, so that it can be used across all gesture methods. I then created a constructor GestureUtility(AndroidDriver driver) where I pass the driver instance from my test or page classes. Inside the constructor, I assign it using this.driver = driver; which means the driver coming from the test will now be accessible in this utility class.

After this setup, I wrote different reusable methods for gestures like longClickByElement, clickByCoordinates, swipeByElement, dragAndDrop, zoomIn, zoomOut, and scrollByText. For implementing these, I used JavascriptExecutor with Appium’s mobile commands such as mobile: swipeGesture, mobile: longClickGesture, and mobile: pinchOpenGesture.

The main advantage of this approach is reusability and cleaner code. Instead of writing gesture logic again and again inside test cases, I just call methods from GestureUtility. For example, if I want to swipe on an element, I simply call gesture.swipeByElement(element, "left", 0.75);. This makes my framework modular, easy to maintain, and scalable.


| Step / Component       | Explanation                                                                                                                                                   |
| ---------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **Class Creation**     | Created a separate utility class `GestureUtility` to handle all mobile gestures in one place.                                                                 |
| **Driver Declaration** | Declared `AndroidDriver driver;` at the class level to use it across all gesture methods.                                                                     |
| **Constructor**        | Defined `GestureUtility(AndroidDriver driver)` and assigned driver using `this.driver = driver;` so the driver instance from test/page classes can be reused. |
| **Reusable Methods**   | Wrote methods like `longClickByElement`, `clickByCoordinates`, `swipeByElement`, `dragAndDrop`, `zoomIn`, `zoomOut`, and `scrollByText`.                      |
| **Implementation**     | Used `JavascriptExecutor` with Appium mobile commands (`mobile: swipeGesture`, `mobile: longClickGesture`, `mobile: pinchOpenGesture`, etc.).                 |
| **Usage in Tests**     | Instead of writing gesture code again in test cases, directly call utility methods, e.g., `gesture.swipeByElement(element, "left", 0.75);`.                   |
| **Advantage**          | Improves **reusability, modularity, maintainability, and scalability** of the framework.                                                                      |


## 16 Starting Appium Server Programmatically in Java

Instead of manually starting Appium from the command line, I implemented a utility in my framework that starts and stops the Appium server programmatically using AppiumServiceBuilder and AppiumDriverLocalService. This makes the framework independent and fully automated

I created a class called StartAppiumServer to handle the starting and stopping of the Appium server programmatically. Inside the main method, I first gave the path of the main.js file, which is responsible for launching the Appium server. Then I used AppiumServiceBuilder to configure the server by providing the JavaScript file path, the port number, the IP address, and a timeout value. After building the service, I started the Appium server, and once it was up, I could run my automation code. At the end of execution, I stopped the server to release resources. This approach helps me avoid starting the server manually and makes the setup more reliable, reusable, and suitable for CI/CD pipelines.

```java
import java.io.File;
import java.time.Duration;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class StartAppiumServer {

    public static void main(String[] args) {
        // Path of main.js inside Appium installation
        File f = new File("C:\\Users\\YourUserName\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js");

        AppiumDriverLocalService service = new AppiumServiceBuilder()
                .withAppiumJS(f)
                .usingPort(4723)
                .withIPAddress("127.0.0.1")
                .withTimeout(Duration.ofSeconds(300))
                .build();

        service.start();
        System.out.println("Appium server started successfully!");

        // --- your automation code will run here ---

        service.stop();
        System.out.println("Appium server stopped successfully!");
    }
}

```
## Interview Questions

1 What is Appium?

Appium is an open-source mobile automation testing tool used to automate native, hybrid, and mobile web applications on Android and iOS platforms.
In my project, I used Appium with Java and TestNG to automate Android applications. Appium follows the WebDriver protocol, so it is easy to integrate with Selenium-based frameworks. It does not require any app code changes and allows us to run tests on real devices, emulators, and cloud platforms.

2 Why is Appium used for mobile application testing?

Appium is used for mobile application testing because it allows us to automate native, hybrid, and mobile web applications on both Android and iOS using a single tool.
In my project, we used Appium to reduce manual testing effort, improve test coverage, and ensure the app works correctly across different devices, screen sizes, and OS versions. Appium supports multiple programming languages, does not require any modification to the application, and can be easily integrated with TestNG, Maven, Jenkins, and cloud platforms.

3 What is the difference between native, hybrid, and web applications in Appium?

Native applications are built specifically for a particular platform like Android or iOS using platform-specific languages. They are installed from the Play Store or App Store and have full access to device features. In Appium, native apps are automated using the NATIVE_APP context.

Hybrid applications are a combination of native and web applications. They are installed like native apps but internally contain WebView. In Appium, we automate hybrid apps by switching between native context and web context.

Mobile web applications run inside the mobile browser like Chrome or Safari and are not installed on the device. In Appium, mobile web apps are automated using browser capabilities and the WEBVIEW or browser context.

4 Which programming languages are supported by Appium?

Appium supports multiple programming languages because it follows the WebDriver protocol. Commonly supported languages include Java, Python, JavaScript, C#, Ruby, and PHP.

In my project, I used Java with TestNG and Maven to write and manage Appium automation scripts. This flexibility allows teams to choose a language based on their skill set and easily integrate Appium with existing automation frameworks.


5 What is the role of the Appium server in automation testing?

The Appium server acts as a bridge between the test script and the mobile device, In my project, the test scripts send commands to the Appium server using the WebDriver protocol. The Appium server interprets these commands and communicates with the mobile device (Android or iOS) using platform-specific automation tools like UIAutomator2 for Android and XCUITest for iOS.


6 What are Desired Capabilities in Appium?

In Appium, Desired Capabilities are basically a set of key–value pairs that act like instructions for the Appium server, telling it what kind of automation session we want to start. Whenever we write a test script, before executing any action, our client script sends these capabilities to the Appium server in the form of a JSON object. The server then uses this information to launch the right platform, the right device, and the right application.

For example, in Android automation, we usually define capabilities such as the platform name, platform version, device name, automation engine (like UiAutomator2), and the details of the application under test such as app package and app activity. Similarly, for iOS we provide capabilities like platform name, platform version, device UDID, automation engine (like XCUITest), and the bundle ID of the app. Desired Capabilities make the framework flexible because by changing these values we can run the same test scripts on different devices, OS versions, or even on real devices and emulators without changing the core logic of our test. In short, they act as the bridge between our test scripts and the mobile environment by defining all the necessary configurations for a successful session.


7 What is an Appium session?

An Appium session is a connection between the Appium server and your test script, established when the client sends desired capabilities like platform, device, and app details. Appium creates a session with a unique session ID, and during this session, all automation commands—such as click, swipe, or send keys—are sent from the client to the server and executed on the device or emulator. Once the test is complete, the session is terminated, releasing the device or emulator for future use.

8 What is the difference between Appium and TestNG?

Appium is a mobile automation tool used to automate both Android and iOS applications. It allows us to perform actions on the app like clicks, swipes, scrolling, entering text, and gestures. TestNG, on the other hand, is a Java-based testing framework that helps organize test cases, manage their execution order, handle dependencies, and generate detailed reports. In practice, we often use TestNG together with Appium so that we can run multiple tests efficiently, handle different scenarios with annotations, and get structured reports of the test execution

9 What is the difference between iOS automation and Android automation?

The main difference between Android and iOS automation lies in the platform architecture, drivers, and setup. For Android, we typically use the UiAutomator2 driver with Appium, and automation can run on real devices or emulators. APK files are installed directly, and permissions can often be granted automatically. Locators like resource-id, content-desc, and text are commonly used for finding elements.

For iOS, automation is done using the XCUITest driver with Appium, and tests run on real devices or simulators. Setting up iOS automation requires additional steps, such as provisioning profiles, signing certificates, and an Apple Developer account. Locators like accessibility ID, label, and name are used, and some gestures may behave slightly differently than on Android.

Overall, Android automation is generally easier to set up and more flexible, while iOS automation has more restrictions but is stable once configured properly. In my experience, handling provisioning and certificates carefully is key to running iOS tests successfully."*


10 How do you install and use Appium on Windows?

To install Appium on Windows, first we install the Java JDK and set the JAVA_HOME environment variable. Then we install Node.js, and using NPM we can install Appium globally, or use Appium Desktop for the GUI version. For Android automation, we install Android Studio for SDK, ADB, and emulator setup. After connecting a real device or creating an emulator, we start the Appium server and use Appium Inspector to inspect elements. Finally, we write and run automation scripts in an IDE like Eclipse or IntelliJ."

11 How do you install and use Appium on Mac?

On Mac, the steps are similar. We install Java JDK, Node.js, and Appium. For Android, we use Android Studio as usual. For iOS automation, we also need Xcode, a simulator or real device, and provisioning profiles for signing. After setting up the environment, we start the Appium server, inspect elements using Appium Inspector, and write tests in an IDE.

12 What is the difference between Implicit Wait and Explicit Wait in Appium?

In Appium, Implicit Wait and Explicit Wait are both used for synchronization, but they work differently. Implicit Wait is a global wait that tells Appium to wait for a specified time before throwing an exception if an element is not found, and it applies to all elements throughout the test. It is simple to use but less flexible. Explicit Wait, on the other hand, waits for a specific condition to occur for a particular element, such as visibility or clickability. It is more precise, reliable, and preferred in real projects because it reduces flaky tests and handles dynamic elements better.


13 How is Appium used for cross-platform testing?

Appium is a cross-platform mobile automation tool, which means we can automate both Android and iOS apps using the same API. This allows us to write a single set of test scripts that can run on multiple platforms, which reduces duplicate work.

Under the hood, Appium uses different drivers: UiAutomator2 for Android and XCUITest for iOS. By setting desired capabilities like platform, device, and app details, the same script can run on either platform. It supports native apps, hybrid apps, and mobile web apps, so it’s very flexible. In practice, we can maintain one test framework and just change platform-specific capabilities to run tests on both Android and iOS."


14 How is Appium used for cloud testing?

Appium can be used for cloud testing by running automation tests on real devices hosted on cloud platforms instead of local devices or emulators. Platforms like BrowserStack, Sauce Labs, Kobiton, or LambdaTest provide access to multiple Android and iOS devices with different OS versions and screen sizes.

The test scripts remain the same; we just update the desired capabilities to specify the cloud device and app. The Appium server communicates with the cloud platform, which executes the commands on the selected device. Cloud testing also allows running tests in parallel on multiple devices, which improves coverage and saves time, and it removes the need to maintain a large number of physical devices locally.


15 What are the different types of locators in Appium?

In Appium, we have several types of locators to find elements in mobile applications. The commonly used ones are ID or resource-id, Accessibility ID, XPath, Class Name, and Name or visible text. For Android, we can also use UIAutomator for more advanced element searches, while on iOS, Predicate and Class Chain locators are used for faster and more reliable element identification. Using these locators, we can interact with elements effectively in both Android and iOS ap

16. How do you launch an application in Appium?

To launch an application in Appium, first we set the desired capabilities or options, where we specify the platform, device, and app details. For Android, we provide the app package and activity, and for iOS, the bundle ID. Then we create a driver instance – AndroidDriver for Android or IOSDriver for iOS. As soon as the driver is created with these capabilities, Appium starts a session and automatically launches the app on the connected device or emulator.

17. What is Appium Inspector?

Appium Inspector is a tool that allows testers and developers to inspect and interact with a mobile app’s UI while creating automation. It connects with the Appium server and the target device (real or emulator) to display the app’s UI hierarchy, element properties, and a live screenshot. This makes it easier to find and verify locators before writing test scripts.

Inspector also supports basic interactions like tap, send keys, swipe, or scroll directly from the tool. It can generate locator strings or code snippets to speed up script writing. For hybrid apps, Inspector allows switching between contexts (NATIVE_APP and WEBVIEW) and inspecting web elements, which simplifies debugging across native and web views.


18. What is the difference between a real device and a virtual device (emulator/simulator) in Appium?

A real device is an actual physical Android or iOS device, which gives accurate results because it uses real hardware, sensors, and network conditions. A virtual device, like an emulator or simulator, is software-based and mimics a real device on a computer. While emulators are useful for early testing and development because they’re easy to set up and free, they may not always behave exactly like a real device. So, real devices are preferred for final validation before production


19. What is Appium client–server architecture?

Appium follows a client-server architecture. The client is your test script written in Java, Python, or another supported language, which sends commands to the Appium server using HTTP requests. The server receives these commands and translates them into device-specific actions using drivers like UiAutomator2 for Android or XCUITest for iOS. When a test starts, the server creates a session with a unique ID, executes all commands within that session, and sends the results back to the client. This architecture allows us to automate mobile apps across different platforms efficiently.


20. How do you set up Appium on a remote server?

A remote server simply means a computer or machine that is located somewhere else, To set up Appium on a remote server, first we install Java, Node.js, and the necessary SDKs like Android SDK or Xcode, and set the environment variables. Then we install Appium globally using NPM. We make sure the server is accessible over the network by opening the Appium port and connecting devices or emulators to the server. Finally, we start the Appium server on the server IP instead of localhost, and in our test scripts, we provide the remote server URL so that our automation scripts can run on devices connected to that server.


21. How do you perform parallel testing in Appium?

In Appium, we can perform parallel testing by running multiple tests at the same time on different devices or emulators. Locally, we usually use TestNG where we set the parallel attribute in the XML file, and each test creates its own driver instance. We can also use Appium Grid by starting multiple server instances on different ports and connecting them to different devices. Alternatively, cloud platforms like BrowserStack or Sauce Labs let us run tests on multiple real devices in parallel without managing the hardware ourselves.


22. What is Appium’s approach to parallel testing?

Appium itself doesn’t provide built-in parallel execution, but we can run tests in parallel by using multiple Appium server instances, test frameworks like TestNG, or cloud platforms. Locally, we can start multiple Appium servers on different ports, and each server connects to a separate device or emulator. Each test script creates its own driver instance that points to a specific server, so multiple tests can run simultaneously. On cloud platforms like BrowserStack or Sauce Labs, we can run the same or different test scripts on multiple real devices at the same time, which helps save execution time, increases test coverage, and eliminates the need to manage many physical devices ourselves. This approach is very helpful in large-scale mobile automation projects where we want faster feedback and efficient testing

23. How to interact with dropdowns in Appium?

In Appium, interacting with dropdowns depends on whether the app is native, hybrid, or mobile web. For native Android dropdowns, like spinners, we first click on the dropdown to open it and then locate the desired option using text, ID, or accessibility ID, and click to select it. For iOS picker wheels, we can directly use sendKeys() to select the value we want. For hybrid apps or mobile web, if the dropdown is a standard HTML <select> element, we can use Selenium’s Select class to choose an option by visible text, value, or index. Essentially, the approach is to first access the dropdown, ensure the options are visible, and then select the appropriate value, depending on the platform and type of dropdown


25. What is the difference between native context and web context in Appium?

In Appium, a context is basically the environment in which the automation script is working. The native context, called NATIVE_APP, is used to interact with the app’s native UI elements like buttons, text fields, switches, or any view created using the platform’s SDK. The web context, called WEBVIEW, is used to interact with web content inside hybrid apps, such as HTML pages, forms, or payment screens. In hybrid apps, we often need to switch between these contexts using driver.context(), depending on whether we want to automate native elements or web elements. This flexibility allows us to handle both parts of a hybrid app within a single test script, making automation more efficient and reducing the need for separate tests for native and web portions


26. How to locate an element in Appium?

In Appium, we locate elements using different locator strategies based on the application type and stability of the element. Commonly, we use accessibility ID, ID, XPath, class name, and UIAutomator for Android or predicate and class chain for iOS. I usually prefer accessibility ID or ID because they are faster and more reliable. XPath is used only when other locators are not available. To identify elements, we use tools like Appium Inspector or Android UIAutomator Viewer, and then apply the appropriate locator in the script

27. What is the use of Appium client libraries?

Appium client libraries are used to write automation test scripts in different programming languages like Java, Python, JavaScript, or C#. They act as a bridge between our test code and the Appium server. Using these libraries, we can send commands like click, send keys, swipe, or get text to the Appium server in a language-friendly way. The Appium server then executes these commands on the mobile device. Without client libraries, it would be difficult to communicate with the Appium server directly 


28. What is the difference between Appium Server and Appium Client?

Appium Client and Appium Server work together in mobile automation.
The Appium Client is the library we use in our test scripts, like Java or Python, to write automation code and send commands such as click, swipe, or enter text, The Appium Server is a Node.js–based server that receives these commands from the client, converts them into mobile automation actions, and executes them on the real device or emulator using platform-specific drivers like UiAutomator2 for Android or XCUITest for iOS, In short, the client sends commands, and the server executes them on the device


29 What are Appium server logs and why are they important?

Appium server logs are detailed logs that record all communication between the Appium client (our test script) and the mobile device.
They include information like session creation, desired capabilities, commands such as click, sendKeys, swipe, responses from the device, and any errors or warnings.

These logs are very important for debugging because when a test fails, they help us identify whether the issue is from the script, the Appium server, the driver, or the device itself, We can check if a command was sent correctly, how the device responded, and why a particular action failed, In real projects, whenever automation fails unexpectedly, the first thing we analyze is the Appium server log to find the root cause.


30 How do you start the Appium server? What are the commonly used Appium server flags?

We can start the Appium server in three ways. First, using Appium Desktop, where we simply open the tool and click on Start Server. This method is mainly used for learning, debugging, and quick test execution. Second, by using the command line or terminal, where we start the server using the appium command along with required flags. This approach is widely used in real-time projects, especially in CI/CD pipelines and for parallel execution. Third, we can start and stop the Appium server programmatically using Java code with AppiumDriverLocalService. This method gives us full control over the server lifecycle and is commonly used in automation frameworks to make execution more flexible and reliable.


Appium server flags are used to control the behavior of the Appium server while starting it. Using flags, we can define settings such as the port number, IP address, logging level, and session handling. For example, the -p flag is used to start the server on a specific port, which is especially useful for parallel execution. The -a flag is used to specify the IP address, usually 127.0.0.1. In Appium 2, the --base-path flag is important to define the endpoint, commonly /wd/hub. The --log-level flag helps in debugging by controlling the level of logs, while --session-override automatically closes any existing sessions before starting a new one. The --allow-insecure flag is used to enable certain restricted features like chromedriver auto-download. Overall, Appium server flags help us customize and manage the server efficiently based on project needs.


31 How do you handle orientation changes in Appium?

In Appium, we handle orientation changes by using driver methods to switch between portrait and landscape modes. Appium provides built-in support to change the device orientation during test execution, which helps us validate whether the app behaves correctly when the screen rotates. After changing the orientation, we usually re-validate the UI elements because their positions or layouts may change. It’s also important to handle synchronization properly, as orientation change can cause the screen to reload. In real projects, we include orientation testing to ensure the app is responsive and stable in both portrait and landscape modes.

32 How to handle alerts in Appium?

In Appium, alerts are handled using the same approach as Selenium. When a system or app alert appears, we first switch the driver’s focus to the alert and then perform actions like accept, dismiss, or get the alert text. This is commonly used for permission pop-ups, confirmation dialogs, or warning messages. In real projects, we also add waits before handling alerts because they may not appear immediately. Proper alert handling ensures the test flow does not break due to unexpected pop-ups


33 How do you handle multiple windows in Appium?

In Appium, multiple window handling is mainly used for mobile web or hybrid apps. First, we get the current window using getWindowHandle(). Then, we fetch all open windows using getWindowHandles(). After that, we switch to the required window using driver.switchTo().window(windowHandle) and perform actions on it. Once the work is done, we switch back to the original window. Since window handles are not returned in a fixed order, we usually iterate through them and use waits to make sure the window is fully loaded before interacting.

34 How to handle network errors in Appium?

In Appium, handling network errors is important to ensure app stability under different conditions. We can simulate network scenarios using desired capabilities like networkSpeed and networkType to test slow connectivity, delays, or network loss. Along with this, we use explicit waits, retry logic, and proper logging to handle temporary network failures gracefully. Tools like Charles Proxy can also be used to monitor API requests and debug network issues effectively. This approach helps validate that the app behaves correctly and recovers well under different network conditions.

35 What is the use of appPackage and appActivity in Appium?

In Appium, appPackage and appActivity are important desired capabilities used to launch an Android application on a device or emulator. The appPackage represents the unique package name of the app installed on the device, while the appActivity specifies the main activity or screen that should open when the app starts. Both of these values are defined in the app’s AndroidManifest.xml file. Together, they ensure that Appium launches the correct application and begins the test from the intended screen, providing a reliable starting point for automation.


36 How do you use XPath in Appium?

XPath is a way to locate elements in mobile or web applications, and Appium uses it to interact with UI elements during automation. It works by navigating the app’s XML or HTML structure and finding elements based on attributes, text, or hierarchy. In Appium, you first identify elements using Appium Inspector, which can also generate XPath expressions. Then, in your code, you use findElement() to get a single element or findElements() to get multiple elements as a list. XPath also supports axes like parent, ancestor, preceding-sibling, and following-sibling, which help locate elements relative to others. By understanding XPath syntax and using Inspector, you can reliably interact with app elements and write effective automation scripts.

37 How do you handle timeouts in Appium?

In Appium, timeouts are used to control how long the server waits for commands, elements, or pages, ensuring that tests do not hang or get stuck. Implicit Wait instructs Appium to wait for a certain time for elements to appear before throwing an exception, and it applies to the entire test. Explicit Wait allows waiting for a specific condition, such as an element becoming visible or clickable, before proceeding. Page Load Timeout sets the maximum time Appium waits for a page to load completely, while Script Timeout defines how long the server waits for an asynchronous script to finish execution. Properly setting these timeouts ensures that tests run smoothly, are responsive, and do not fail due to temporary delays in element loading or page rendering.

38 What is the difference between findElement() and findElements() in Appium?

findElement() and findElements() are two methods in Appium used to locate elements, but they behave differently. findElement() returns the first matching element it finds, and if no element is found, it throws a NoSuchElementException. On the other hand, findElements() returns a list of all matching elements. If no elements are found, it returns an empty list instead of throwing an exception.

Key point: Use findElement() when you expect only one element and findElements() when multiple elements may match or when you want to safely handle zero matches.


39 What is the difference between Appium's startRecordingScreen and stopRecordingScreen methods?

In Appium, startRecordingScreen() and stopRecordingScreen() are used to record the screen of a mobile device during test execution. startRecordingScreen() begins capturing the device screen, while stopRecordingScreen() stops the recording and returns the recorded video, usually in a Base64-encoded format that can be saved as a video file. We use these methods mainly for debugging, reporting, and analysis, as they allow us to visually see what happened in the app during the test. This is especially helpful when a test fails or behaves unexpectedly, because instead of relying on logs alone, we can watch the actual actions, gestures, or errors that occurred. It is also useful for sharing evidence of test execution with teammates or clients.

Use startRecordingScreen() at the point you want to begin capturing actions, and stopRecordingScreen() at the point you want to end and retrieve the video for debugging or reporting purposes.

40 Can you explain the concept of context switching in Appium?

In mobile automation, context switching in Appium refers to switching between the native context and the web context of a mobile application. Native context, called NATIVE_APP, is used for interacting with the app’s native UI elements like buttons and text fields, while the web context, called WEBVIEW, is used for automating web content inside hybrid apps, like HTML pages or embedded payment screens. Appium provides the driver.context() method to switch between these contexts. For example, driver.context("NATIVE_APP") switches to the native context, and driver.context("WEBVIEW_1") switches to the web context. Context switching is crucial because it allows the automation script to interact with both native and web elements during the same test, making hybrid app testing more efficient and effective.


41 How do you handle animation and transitions in Appium?


Animations and transitions in mobile apps can make elements appear slowly or not immediately interactable. In Appium, we handle this using explicit waits or WebDriverWait to wait for elements to be visible or clickable. We can also use the TouchAction class to simulate gestures during animations. Additionally, animations can be disabled on the device through Developer Options, and tools like Appium Inspector or visual validation tools like Applitools help ensure that the UI remains stable and consistent during testing.

42. How to handle application crashes in Appium?


In Appium, handling application crashes is crucial to keep tests robust and avoid interruptions. One way to handle crashes is by monitoring driver logs, which capture device logs, crash information, exceptions, and stack traces, helping us understand what went wrong during execution. Another approach is using try-catch blocks in test scripts to catch exceptions when the app crashes, allowing the test to log the error and continue or fail gracefully. It’s also important to check the app state before interacting with it using methods like driver.isAppInstalled(), driver.launchApp(), or driver.resetApp() to ensure the app is in a valid state. If a crash occurs, we can restart the app using driver.launchApp() or reinstall it with driver.installApp() to resume testing. Additionally, integrating with TestNG or JUnit allows us to define hooks like @AfterMethod or @AfterTest to capture screenshots, logs, and automatically relaunch the app after a crash, ensuring smooth test execution.

43. What is the difference between driver.quit() and driver.close() methods in Appium?

driver.quit() ends the entire Appium session and closes all windows or app instances, releasing the device and resources completely. In contrast, driver.close() only closes the currently active window or app, while keeping the session alive so we can continue interacting with other windows, tabs, or app activities. We usually use quit() at the end of a test suite to clean up everything, whereas close() is used when multiple windows or activities are open and we want to close only one without stopping the session

44. How do you handle alerts and pop-ups in Appium?

In Appium, we handle alerts and pop-ups by switching to them using driver.switchTo().alert(). For native alerts, we can accept, dismiss, get the text, or enter input. We use explicit waits to ensure the alert is present before interacting. For system pop-ups, we can enable autoGrantPermissions or locate the elements using XPath or ID. For custom in-app pop-ups, we find the elements and perform actions accordingly.

44. What is the difference between XPath and CSS Selectors?

In Appium, XPath and CSS selectors are used to locate elements, but they work differently. XPath is very flexible and powerful, allowing selection based on attributes, hierarchy, or text, which makes it ideal for complex or dynamic elements. However, it’s slower on mobile devices because it traverses the full XML structure. CSS selectors, on the other hand, work with attributes, classes, and IDs in the HTML structure, making them faster and less resource-intensive, though they are limited in navigating hierarchies. For native Android or iOS apps, XPath is mostly used since CSS selectors don’t apply, while for mobile web automation, CSS selectors are preferred for speed, but XPath is used when elements are complex.

45. How to launch the Appium Inspector?

To launch Appium Inspector, I first start the Appium server either through the command line or programmatically using Java code. Then, I open Appium Inspector and provide the required desired capabilities, such as platformName, platformVersion, deviceName, and appPackage and appActivity for Android, or bundleId for iOS. After starting the session, the Inspector connects to the device or emulator, allowing me to inspect the app’s UI, view elements, and get locators for automation.

46. What mobile device settings can be automated using Appium?

In Appium, we can automate several mobile device settings to simulate real user interactions or prepare the device for testing. These include network settings, such as enabling or disabling Wi-Fi, mobile data, or airplane mode. Battery and power settings can also be controlled, allowing us to check battery status or simulate low battery conditions. Screen settings like rotation, locking/unlocking the device, and adjusting brightness can be automated as well. Additionally, Appium can handle notifications, allowing us to manage system notifications and permissions. App settings, including installing, uninstalling, resetting, or launching apps automatically, can be controlled. Device location can be mocked by setting GPS coordinates or enabling/disabling location services. Finally, keyboard input can be managed by enabling or disabling the Unicode keyboard and resetting the keyboard when needed.

47. How do you debug Appium scripts?

To debug Appium scripts, first I check the Appium server logs because they show detailed information about each command and any errors. I also use breakpoints in my IDE to step through the code and see if the driver is interacting with elements correctly. Appium Inspector helps me verify element locators, and I make sure elements are visible and enabled before interacting. I add explicit waits to handle timing issues, and I also check device or emulator logs, like adb logcat for Android or Xcode logs for iOS. Finally, I always validate my desired capabilities to ensure the session starts correctly. This combination helps me quickly identify and fix issues in my automation scripts

25. How do you run Appium tests on a real device?
31. How do you automate native applications using Appium?
32. How do you automate hybrid applications using Appium? 
33. How do you automate mobile web applications using Appium?
34. How do you perform cross-platform testing
36. What are the common tools used for debugging in Appium?
45. How do you run Appium tests in parallel on multiple devices?
48. How do you integrate Appium with Jenkins?
72. How do you use Appium with Jenkins?
75. How do you handle dynamic locators in Appium?
80. How to scroll in Appium?
71. How do you handle orientation changes in Appium?
51. What screen orientations are supported in Appium?
28. What are the best practices for writing maintainable Appium tests?
39. Explain Appium server architecture.
85. How to handle SSL certificate errors in Appium?
61. How to start and stop the Appium server?
100. How do you integrate Appium with Appium Studio?
5 What are the steps involved in setting up Appium?




23. How do you set up Appium on Windows?
24. What is the difference between mobile web automation and native app automation in Appium?
27. What is the difference between AndroidDriver and iOSDriver in Appium?
29. What is the difference between automationName for Android and iOS in Appium?
37. How do you use Appium to automate testing on the cloud (LambdaTest / BrowserStack)?
38. What is Appium Grid?
40. What is the difference between Appium and Espresso?
46. What are the different types of Appium frameworks?
47. What are the best practices to follow while designing Appium tests?
49. How do you integrate Appium with Selenium Grid?
50. What are the common challenges in Appium, and how do you overcome them?
52. What is WebDriver API?
53. What is the difference between Appium and Robot Framework?
57. What is the difference between a single and multiple-touch action?
59. How to automate login in Appium?
65. How to automate location-based testing in Appium?
70. How do you automate hybrid apps in Appium?
73. How do you set up Appium with Docker?
74. How do you set up Appium with AWS Device Farm?
83. What is the use of mobile gestures in Appium?
87. What are the different types of mobile gestures that can be performed using Appium?
90. How do you use Appium with Robot Framework?
91. How do you use Appium with JUnit?
92. How do you use Appium with Pytest?
95. What is Appium's approach to handling multiple languages in mobile automation?
97. What is the role of Appium's server-side hooks in mobile automation?
101. How do you use Appium to automate the testing of mobile games?
103. How do you integrate Appium with TestNG or JUnit for test automation?
77  What is the difference between Appium Desktop and Appium Server?
96. What is the difference between Appium's UIAutomator2 and UIAutomator?
77. What is the difference between Appium and Selendroid?
24. What is the difference between mobile web automation and native app automation in Appium?
68. What is the difference between XCUITest and UIAutomation in Appium?
42. What is the difference between Appium and Calabash?
62. What is the difference between UiAutomator2 and Espresso?












5. 

To set up Appium for Android automation, first we need to install the Java Development Kit, because Appium scripts are usually written in Java and Android SDK depends on it. We also set the JAVA_HOME environment variable. Next, we need an IDE like Eclipse or IntelliJ to write and manage our scripts. Since Appium runs on Node.js, we install Node.js and NPM, and then install the Appium server either via Appium Desktop or NPM.

For Android automation, we use the UiAutomator2 driver, which interacts with real devices or emulators. Android Studio is required to provide the Android SDK, ADB tools, and emulators. We can then connect a real device via USB with developer options enabled or use an emulator.

To inspect elements in the app, we use Appium Inspector to get locators. Finally, we write our automation scripts in the IDE and run them on the Appium server on either real devices or emulators.


Install Java and set JAVA_HOME environment variable.
Install Android Studio and set ANDROID_HOME with required SDKs.
Install Node.js, which is required to run the Appium server.
Install Appium Server using Appium Desktop or npm.
Install Appium Inspector to identify mobile elements.
Connect a real device or start an emulator, and enable USB debugging for real devices.
Create Desired Capabilities like deviceName, platformName, appPackage, and appActivity.
Integrate Appium with a framework using Java, TestNG, and Maven, and then run the test scripts.
In my project, we used Appium Desktop, Android Studio, and real devices for execution.

6. 















12. How do you install and use Appium on Mac?

On Mac, the steps are similar. We install Java JDK, Node.js, and Appium. For Android, we use Android Studio as usual. For iOS automation, we also need Xcode, a simulator or real device, and provisioning profiles for signing. After setting up the environment, we start the Appium server, inspect elements using Appium Inspector, and write tests in an IDE.


13. What is the difference between Appium and Robot Framework?


14. How is Appium used for cross-platform testing?

Appium is a cross-platform mobile automation tool, which means we can automate both Android and iOS apps using the same API. This allows us to write a single set of test scripts that can run on multiple platforms, which reduces duplicate work.

Under the hood, Appium uses different drivers: UiAutomator2 for Android and XCUITest for iOS. By setting desired capabilities like platform, device, and app details, the same script can run on either platform. It supports native apps, hybrid apps, and mobile web apps, so it’s very flexible. In practice, we can maintain one test framework and just change platform-specific capabilities to run tests on both Android and iOS."


15. How is Appium used for cloud testing?

Appium can be used for cloud testing by running automation tests on real devices hosted on cloud platforms instead of local devices or emulators. Platforms like BrowserStack, Sauce Labs, Kobiton, or LambdaTest provide access to multiple Android and iOS devices with different OS versions and screen sizes.

The test scripts remain the same; we just update the desired capabilities to specify the cloud device and app. The Appium server communicates with the cloud platform, which executes the commands on the selected device. Cloud testing also allows running tests in parallel on multiple devices, which improves coverage and saves time, and it removes the need to maintain a large number of physical devices locally.


16. What are the different types of locators in Appium?

n Appium, we have several types of locators to find elements in mobile applications. The commonly used ones are ID or resource-id, Accessibility ID, XPath, Class Name, and Name or visible text. For Android, we can also use UIAutomator for more advanced element searches, while on iOS, Predicate and Class Chain locators are used for faster and more reliable element identification. Using these locators, we can interact with elements effectively in both Android and iOS ap

17. How do you launch an application in Appium?

To launch an application in Appium, first we set the desired capabilities or options, where we specify the platform, device, and app details. For Android, we provide the app package and activity, and for iOS, the bundle ID. Then we create a driver instance – AndroidDriver for Android or IOSDriver for iOS. As soon as the driver is created with these capabilities, Appium starts a session and automatically launches the app on the connected device or emulator.

18. What is Appium Inspector?

Appium Inspector is a tool that allows testers and developers to inspect and interact with a mobile app’s UI while creating automation. It connects with the Appium server and the target device (real or emulator) to display the app’s UI hierarchy, element properties, and a live screenshot. This makes it easier to find and verify locators before writing test scripts.

Inspector also supports basic interactions like tap, send keys, swipe, or scroll directly from the tool. It can generate locator strings or code snippets to speed up script writing. For hybrid apps, Inspector allows switching between contexts (NATIVE_APP and WEBVIEW) and inspecting web elements, which simplifies debugging across native and web views.


19. What is the difference between a real device and a virtual device (emulator/simulator) in Appium?

A real device is an actual physical Android or iOS device, which gives accurate results because it uses real hardware, sensors, and network conditions. A virtual device, like an emulator or simulator, is software-based and mimics a real device on a computer. While emulators are useful for early testing and development because they’re easy to set up and free, they may not always behave exactly like a real device. So, real devices are preferred for final validation before production


20. What is Appium client–server architecture?

ppium follows a client-server architecture. The client is your test script written in Java, Python, or another supported language, which sends commands to the Appium server using HTTP requests. The server receives these commands and translates them into device-specific actions using drivers like UiAutomator2 for Android or XCUITest for iOS. When a test starts, the server creates a session with a unique ID, executes all commands within that session, and sends the results back to the client. This architecture allows us to automate mobile apps across different platforms efficiently.


21. How do you set up Appium on a remote server?

A remote server simply means a computer or machine that is located somewhere else, To set up Appium on a remote server, first we install Java, Node.js, and the necessary SDKs like Android SDK or Xcode, and set the environment variables. Then we install Appium globally using NPM. We make sure the server is accessible over the network by opening the Appium port and connecting devices or emulators to the server. Finally, we start the Appium server on the server IP instead of localhost, and in our test scripts, we provide the remote server URL so that our automation scripts can run on devices connected to that server.


22. How do you perform parallel testing in Appium?

In Appium, we can perform parallel testing by running multiple tests at the same time on different devices or emulators. Locally, we usually use TestNG where we set the parallel attribute in the XML file, and each test creates its own driver instance. We can also use Appium Grid by starting multiple server instances on different ports and connecting them to different devices. Alternatively, cloud platforms like BrowserStack or Sauce Labs let us run tests on multiple real devices in parallel without managing the hardware ourselves.









27. What is the difference between AndroidDriver and iOSDriver in Appium?

Advanced Level Appium Interview Questions
78. How to interact with dropdowns in Appium?
Interacting with dropdowns or selecting an option from a dropdown is a common scenario in mobile automation testing. In Appium, we can interact with dropdowns by using the Select class provided by Selenium.

Here are the steps to interact with a dropdown in Appium:

Locate the dropdown element using any of the locator strategies supported by Appium, such as ID, Xpath, or CSS selector.
Create an object of the ‘Select’ class and pass the dropdown element as a parameter.
Use the ‘select_by_visible_text’, ‘select_by_index’, or ‘select_by_value’ method to select the desired option from the dropdown.
79. How to handle multiple windows in Appium?
Handling multiple windows in Appium is a crucial aspect of mobile app automation testing, as many mobile applications open new windows or pop-ups based on user interactions.

Here are the steps to handle multiple windows in Appium:

Identify the current window handle using the ‘getWindowHandle()’ method. This returns a unique identifier for the current window.
Use the ‘getWindowHandles()’ method to get a set of all open windows.
Switch to the new window using the ‘switchTo()’ method along with the window handle. For example, ‘driver.switchTo().window(windowHandle)’.
Perform the necessary actions on the new window.
Switch back to the original window using ‘driver.switchTo().defaultContent()’.
The 'getWindowHandles()' method does not guarantee the order in which the windows are returned; it simply returns a set of window handles. To find the desired window, it is best to iterate through a list or set of window handles that have been stored. It is also advised to use explicit waits to ensure the window has loaded completely before interacting with it.

80. How to scroll in Appium?
In Appium, scrolling can be done using the TouchAction class or the MobileElement class. The following steps can be followed to perform scrolling in Appium:

Identify the element that needs to be scrolled. This can be done using any of the element identification methods provided by Appium.
Create a TouchAction or MobileElement object for the identified element.
Use the press() method of the TouchAction class to press down on the identified element or use the scrollTo() method of the MobileElement class to scroll to the identified element.
Use the waitAction() method of the TouchAction class to wait for a few seconds.
Use the moveTo() method of the TouchAction class to move to the desired location or use the scroll() method of the MobileElement class to scroll to the desired location.
Use the release() method of the TouchAction class to release the finger from the screen.
The above steps can be modified based on the specific scrolling requirements. For example, to scroll horizontally, the swipe() method can be used instead of the scrollTo() method. Additionally, the duration of the waitAction() method can be changed to adjust the scrolling speed.
81. How to handle application crashes in Appium?
Application crashes are a common issue in mobile app testing, and Appium provides a way to handle these crashes during automation testing. Here are the steps to handle application crashes in Appium:

Use the setCapability() method to enable autoLaunch and noReset capabilities to ensure that the app is launched automatically and the previous session data is not cleared.
Set the newCommandTimeout capability to a high value to prevent the Appium server from timing out during app restarts.
Use the driver.currentActivity() method to capture the current activity of the app.
Check for the activity of the app using an if-else statement. If the app is not in the expected activity, restart the app by invoking the driver.resetApp() method.
Add a try-catch block to handle any exceptions during app restarts and handle them accordingly.
Use the ‘driver.closeApp()’ and ‘driver.launchApp()’ methods to close and relaunch the app if required.
By following these steps, you can handle application crashes during automation testing in Appium.

82. How to handle network errors in Appium?
Handling network errors is an important aspect of mobile app testing, and Appium provides several ways to handle network errors. One approach is to use network simulation, a feature available in Appium. Network simulation allows testers to simulate different network conditions like poor network connectivity, network delays, and network loss. This can be done by setting the network conditions using the "networkSpeed" and "networkType" desired capabilities.

83. What is the use of mobile gestures in Appium?
Appium uses mobile gestures to interact with mobile applications in a way that mimics touchscreen user behavior. Tap, swipe, pinch, zoom, and scroll are just a few mobile gestures supported natively by Appium. On mobile applications, these gestures can be used for a variety of tasks, including option selection, screen navigating, zooming in and out, and scrolling through lists.

84. What is the use of Appium client libraries?
Appium client libraries are programming language-specific implementations of the Appium server's API. These libraries provide methods and classes that allow the tester to interact with the Appium server and automate the mobile application testing process. The use of client libraries simplifies the test automation process, as they provide a higher level of abstraction than the Appium server's raw HTTP requests.

Appium client libraries can be used to write automation scripts in programming languages such as Java, Python, Ruby, C#, and JavaScript. Using client libraries, testers can write test scripts in their preferred programming language, making it easier to create, maintain and execute automated tests.

85. How to handle SSL certificate errors in Appium?
In some cases, when testing an application using Appium, SSL certificate errors may occur, which can cause the tests to fail. This can happen when the SSL certificate presented by the application does not match the one expected by the device or emulator. To handle SSL certificate errors in Appium, you can use the acceptInsecureCerts desired capability. Setting this capability to true will tell Appium to accept SSL certificates that are not trusted by the device or emulator.

86. What is the use of appPackage and appActivity in Appium?
In Appium, ‘appPackage’ and ‘appActivity’ are two important desired capabilities used to launch the application on the device or emulator.

‘appPackage’ represents the package name of the Android application that we want to automate. The package name can be found in the ‘AndroidManifest.xml’ file of the application. It uniquely identifies the application installed on the device. ‘appActivity’ represents the application's main activity that needs to be launched. This activity will be started by the Android operating system when the user launches the application. It is also defined in the ‘AndroidManifest.xml’ file of the application.

87. What are the different types of mobile gestures that can be performed using Appium?
Appium provides various methods for performing mobile gestures, including

Tap: A simple tap on the screen.
Long press: Pressing and holding down on an element for a specific time.
Swipe: Swiping from one point to another on the screen.
Scroll: Scrolling up or down on the screen.
Pinch: Pinching the screen to zoom out or spreading fingers to zoom in.
Multi-touch: Performing multiple touches on the screen simultaneously.
To perform these gestures, you can use the TouchAction class in Appium.

88. How do you use XPath in Appium?
XPath is a powerful and flexible way to locate elements on a web or mobile application, and it can be used in Appium to identify elements during test automation. XPath is a query language that allows you to navigate the HTML or XML structure of a page or application, and it is particularly useful for finding elements based on their attributes or hierarchical relationships.

Here is a step-by-step guide on how to use XPath in Appium:

Understand the basics of XPath syntax: XPath is a language that uses a set of syntax rules to navigate through the structure of a document or web page. XPath expressions are constructed using a combination of elements, attributes, and operators. Some common XPath syntax includes:
Selecting elements by tag name: ‘//tagname’
Selecting elements by attribute: ‘//*[@attribute='value']’
Selecting elements by class name: ‘//*[contains(@class,'classname')]’
Selecting elements by text: ‘//*[contains(text(),'text')]’
Use Appium Inspector to identify elements: Appium provides a graphical user interface tool called Appium Inspector to inspect and interact with elements of a mobile application. You can use the Appium inspector to identify elements on the app screen, and it will generate XPath expressions for you to use in your tests.
Use the findElement() method in your code: Once you have identified the element and obtained the XPath expression, you can use the findElement() method in your code to locate the element.
Use the findElements() method to find multiple elements: If you want to locate multiple elements using XPath, you can use the ‘findElements()’ method instead of ‘findElement()’. The ‘findElements()’ method returns a list of ‘WebElement’ objects, which you can interact with in your code.
Use XPath axes to traverse the element hierarchy: XPath axes allow you to traverse the hierarchy of elements in an application, and they can be used to locate elements relative to other elements. Some common XPath axes include:
‘ancestor’: Selects all ancestors of the current element.
‘parent’: Selects the parent of the current element.
‘preceding-sibling’: Selects all preceding siblings of the current element.
‘following-sibling’: Selects all following siblings of the current element.
XPath is a powerful tool for locating elements in a mobile application during test automation. By understanding the basics of XPath syntax and using tools like Appium Inspector to identify elements, you can quickly and efficiently write tests that interact with your application's user interface.

You can also use this free XPath Tester tool that is designed to allow users to test and evaluate XPath expressions or queries against an XML document. It helps ensure that the XPath queries are accurate and return the expected results.

89. How do you handle timeouts in Appium?
Timeouts in Appium are used to specify the maximum amount of time that the Appium server should hold idle while waiting for a specific command to be executed. Because they help keep the test from hanging or getting caught in an endless loop, these timeouts are crucial. Appium offers several timeout types, including:

Implicit Wait: Implicit Wait is a type of timeout that instructs the Appium server to wait for a certain amount of time before throwing an exception if an element is not found. This timeout is set at the beginning of a test and remains in effect for the duration of the test. To set an Implicit Wait timeout, you can use the ‘driver.manage().timeouts().implicitlyWait()’ method.
Explicit Wait: Explicit Wait is a type of timeout that allows you to wait for a specific condition to be met before proceeding with the test. This is useful for waiting for an element to become visible or clickable before interacting. To use Explicit Wait in Appium, you can create an instance of the WebDriverWait class and specify the timeout duration and the expected condition.
Page Load Timeout: Page Load Timeout is a type of timeout that specifies the maximum amount of time that the Appium server should wait for a page to load before throwing an exception. To set a Page Load Timeout, you can use the ‘driver.manage().timeouts().pageLoadTimeout()’ method.
Script Timeout: Script Timeout is a type of timeout that specifies the maximum amount of time that the Appium server should wait for an asynchronous script to finish executing before throwing an exception. To set a Script Timeout, you can use the ‘driver.manage().timeouts().setScriptTimeout()’ method.
Handling timeouts in Appium is important to ensure that the tests run smoothly and efficiently. By setting the appropriate timeouts, you can ensure that your tests are responsive and not stuck waiting indefinitely for an element to appear or for a page to load.

...
90. How do you use Appium with Robot Framework?
Appium can be integrated with Robot Framework to perform mobile application testing. Robot Framework is a generic test automation framework that provides support for various platforms and application types, including mobile apps. Here are the steps to use Appium with Robot Framework:

Install Python: Robot Framework requires Python to run. Download and install the latest version of Python from the official website.
Install Robot Framework: You can install Robot Framework using pip, a package installer for Python. Run the following command in the command prompt:
pip install robotframework
Install Appium Library: Appium Library is a Robot Framework library that provides keywords for testing mobile applications with Appium. Run the following command in the command prompt:
pip install robotframework-appiumlibrary
Set up Appium: Install and set up Appium on your local machine or a remote server. Make sure that the desired capabilities are set up correctly.
Write the test script: Write the test script in Robot Framework syntax using the keywords provided by Appium Library. The script should include the following steps:
Open the app using AppiumLibrary.Open Application keyword.
Perform the required actions using AppiumLibrary keywords such as Click Element, Input Text, Swipe, etc.
Verify the results using AppiumLibrary keywords such as Element Should Be Visible, Element Text Should Be, etc.
Run the test script: Run the test script using Robot Framework command-line interface. Use the following command to run the script:
robot <path-to-test-script>
This command generates a test report in HTML format that shows the test results and any errors or failures.

Appium Library provides a wide range of keywords for testing mobile applications on Android and iOS platforms. With Robot Framework, you can easily automate the testing of your mobile applications and ensure their quality and reliability.

Youtube thumbnail
91. How do you use Appium with JUnit?
JUnit is a widely used Java testing framework for writing and running tests, and it integrates well with Appium. This section will discuss how to use Appium with JUnit to automate mobile testing.

To use Appium with JUnit, you must set up a few things:

Install Java and set up the environment variables.
Install Android SDK and set up the environment variables.
Download and install the Appium server.
Set up the Appium client library for Java.
Set up the JUnit testing framework.
Once you have set up the above prerequisites, you can start writing your Appium tests using JUnit.

Youtube thumbnail
92. How do you use Appium with Pytest?
Appium can be used with Pytest to automate mobile app testing. Pytest is a popular testing framework for Python that offers several features such as fixtures, test parameterization, and test discovery. Using Pytest with Appium, you can write automated tests for mobile apps using Python.

Here are the steps to use Appium with Pytest:

Install Appium and the Appium Python client:
pip install Appium-Python-Client
Install Pytest:
pip install pytest
Set up the desired capabilities for the mobile device and the app you want to test. You can do this in a separate file or directly in the test file:
desired_capabilities = {
    "platformName": "Android",
    "deviceName": "device",
    "appPackage": "com.example.android.myapp",
    "appActivity": "com.example.android.myapp.MainActivity"
}
Write your test code using Pytest syntax
import pytest
from appium import webdriver

@pytest.fixture(scope="function")
def driver(request):
    driver = webdriver.Remote('http://localhost:4723/wd/hub', desired_capabilities)
    def fin():
        driver.quit()
    request.addfinalizer(fin)
    return driver

def test_login(driver):
    username = driver.find_element_by_id("username")
    password = driver.find_element_by_id("password")
    login_button = driver.find_element_by_id("login_button")
    username.send_keys("testuser")
    password.send_keys("password")
    login_button.click()
    assert driver.current_activity == ".HomeActivity"
Run your Pytest test file:
pytest my_app_test.py
In this example, we created a fixture to set up and tear down the Appium driver. The test_login function finds the elements for the username, password, and login button, fills in the credentials, and clicks the login button. Finally, it asserts that the current activity is the expected one. Using Pytest with Appium allows you to easily run and integrate your mobile app tests with your continuous integration workflow.

Watch our complete playlist on the PyTest tutorial and start executing your Pytest Testing scripts on an online cloud-based infrastructure in parallel, at scale.

Youtube thumbnail
93. What is the difference between XPATH and CSS locators? Which one is better in Appium?
Here is a comparison of XPath and CSS locators in table format:

XPath	CSS Locator
XPath is a powerful language for locating elements in XML/HTML documents.	CSS locators are simple patterns used to select elements based on their attributes.
XPath provides many options to locate elements, such as tag name, attribute, text, position, etc.	CSS locators have limited locators, primarily based on element attributes.
XPath can traverse the entire XML/HTML document tree, allowing more flexibility in locating elements.	CSS locators work in a top-down manner, starting from the root element or a specific context.
XPath expressions can be more complex and may require a deeper understanding of the document structure.	CSS locators are relatively simpler and easier to read and write.
XPath has better support for locating elements based on their text content or relationship with other elements.	CSS locators are more suitable for locating elements based on their attributes.
XPath can handle complex and nested structures are more effective.	CSS locators may have limitations when dealing with complex structures or dynamic content.
XPath has better browser compatibility, especially with older browsers.	CSS locators have better support in modern browsers and are widely used in web development.
When choosing between XPath and CSS locators in Appium, the selection depends on the specific requirements of the test scenario and the target application. Both locators have their strengths and weaknesses, and the choice should consider factors such as the structure of the application, the elements to be located, and the preference and familiarity of the tester.

94. What is the difference between findElement() and findElements() in Appium?
The findElement() and findElements() methods are used in Appium to locate elements on a mobile application. Here are the differences between the two methods:

Parameter	‘findElement()’	‘findElements()’
Return type	WebElement	List<WebElement>
Usage	Used to find a single element that matches the locator strategy	Used to find multiple elements that match the locator strategy
Exception	Throws NoSuchElementException if no matching element is found	Returns an empty list if no matching element is found
Example	driver.findElement(By.id("element-id"));	List<WebElement> elements = driver.findElements(By.className("element-class"));
95. What is Appium's approach to handling multiple languages in mobile automation?
Appium supports multiple languages in mobile automation through language-specific client libraries. Appium provides client libraries in multiple programming languages such as Java, Python, Ruby, JavaScript, PHP, and C#. By using these libraries, testers can write automation scripts in their preferred programming language.

To handle multiple languages in mobile automation using Appium, the following best practices can be followed:

Choose the appropriate programming language: The choice of programming language should be based on the team's expertise and the availability of libraries.
Use localization files: Localization files contain the text of an application in different languages. These files can be used to test the application's localization features.
Use data-driven testing: Data-driven testing is a technique that involves separating test data from the test scripts. Test data can be stored in formats like CSV, Excel, or XML files. This approach makes it easy to manage test data in multiple languages.
Use page object model: The Page Object Model (POM) is a design pattern that helps maintain the code structure of automation scripts. Implementing POM separates the code into different modules for easy maintenance and scalability.
Use automation frameworks: Automation frameworks like TestNG, JUnit, and Cucumber can be used to organize and manage Appium test scripts. These frameworks provide features like test execution, reporting, and debugging.
By following these best practices, testers can write maintainable and scalable automation scripts that can handle multiple languages in mobile automation using Appium.

96. What is the difference between Appium's UIAutomator2 and UIAutomator?
Here are the differences between Appium's UIAutomator2 and UI Automator:

Feature	UIAutomator	UIAutomator2
Target	Android 4.1+	Android 5.0+
Performance	Slow	Faster
Stability	Less stable	More stable
Support	Only for Android	Android and iOS
Locator Strategy	Only xpath	xpath, id, class, accessibility id, Android UIAutomator, iOS predicate
Scroll	Swipe and scroll commands	Scroll commands with more options
Permissions	Only basic permissions	Allows handling permissions dynamically
Multi-touch	Not supported	Supported
Custom Actions	Not supported	Supported
Timeout Handling	Not supported	Supported
Desktop-based Inspector	Not supported	Supported
97. What is the role of Appium's server-side hooks in mobile automation?
Appium's server-side hooks are pre-defined events or actions that can be executed before or after an Appium session or command. These hooks allow developers to customize and extend the behavior of Appium's server during test execution.

Several server-side hooks are available in Appium, including:

Before Session: This hook runs before a new session is started. It can be used to perform any necessary setup before the test execution begins.
After Session: This hook runs after a session has ended. It can perform any necessary cleanup after the test execution has been completed.
Before Command: This hook runs before every Appium command. It can be used to add custom behavior or validation to the Appium command being executed.
After Command: This hook runs after every Appium command. It can be used to add custom behavior or validation to the Appium command that has just been executed.
On Error: This hook runs whenever there is an error during the execution of a test case. It can be used to capture screenshots or other diagnostic information or perform any necessary cleanup after an error.
Server-side hooks can be implemented in several programming languages, including Java, Python, Ruby, and JavaScript. They are typically defined in a separate file or module and then loaded into the Appium server at runtime.

Using server-side hooks in Appium can help to improve the efficiency and reliability of test automation. By customizing the behavior of the Appium server, developers can ensure that their tests are executed in a consistent and repeatable manner, even in complex or dynamic testing environments.

98. What is the difference between Appium's startRecordingScreen and stopRecordingScreen methods?
The startRecordingScreen and stopRecordingScreen methods in Appium are used for screen recording during mobile automation. The startRecordingScreen method is used to start the recording of the screen, while the stopRecordingScreen method is used to stop the recording of the screen.

StartRecordingScreen	StopRecordingScreen
Starts the recording of the screen	Stops the recording of the screen
Requires a parameter, a dictionary containing options to customize the recording	Does not require any parameter
The dictionary can contain options such as videoQuality, timeLimit, and fps	Generates a Base64-encoded string that represents the recorded video
The method returns nothing	The method returns a string that represents the recorded video
The video recording can be saved to a file using the saveRecordingScreen method	The recorded video can be further processed, such as uploading to a cloud storage service or attaching to a test report
99. Can you explain the concept of context switching in Appium?
In mobile automation, context switching refers to switching between the native context and the web context of a mobile application. Appium provides support for automating both native and web applications, and as a result, it is necessary to switch between these two contexts during automation.

In Appium, the context method is used to switch between these two contexts. The context method returns a set of available contexts, and the one that must be switched to is identified and passed as an argument.

To switch to the native context, the following code can be used:

driver.context('NATIVE_APP')
To switch to the web context, the following code can be used:

driver.context('WEBVIEW_1')
The exact context name may vary depending on the mobile application being tested.

Context switching is important in mobile automation because it allows the automation script to interact with the various elements of the application that may be in different contexts. It allows testers to interact with both the native and web elements of a hybrid application during the same test run, thereby improving the efficiency and effectiveness of the testing process.

100. How do you integrate Appium with Appium Studio?
Appium Studio is a complete IDE for Appium automation that offers many advanced features such as object spy, visual recorder, in-built plugins, and many more. It is based on the open-source Appium framework and offers a streamlined approach to mobile app automation. To integrate Appium with Appium Studio, we can follow the below steps:

Download and install Appium Studio: The first step is to download and install Appium Studio from its official website.
Create a new project: After installing Appium Studio, we need to create a new project. To create a new project, go to the "File" menu and select "New Project". Then, select the type of project you want to create, such as Android or iOS.
Connect to a device or emulator: To automate tests on a device or emulator, we need to connect Appium Studio to the device or emulator. We can do this by clicking on the "Device Toolbar" button and selecting the device or emulator from the list.
Set desired capabilities: Appium Studio supports setting desired capabilities for the automation session. Desired capabilities are a set of key-value pairs that configure the automation session. We can set desired capabilities in the "Desired Capabilities" section of the "New Project" window.
Record and playback tests: Appium Studio offers a visual recorder that can be used to record and playback tests. To use the recorder, simply click on the "Record" button and perform the actions you want to automate. The actions will be recorded and can be played back later.
Inspect elements: Appium Studio also offers an object spy feature that can be used to inspect elements on the screen. To use the object spy, simply click on the "Object Spy" button and select the element you want to inspect.
Run tests: After creating and recording tests, we can run them by clicking on the "Run" button. Appium Studio will launch the app on the device or emulator and execute the tests.
Also, read about 'How to Inspecting Elements' – a key skill for modifying website layouts and debugging by manipulating CSS properties.

Integrating Appium with Appium Studio is a simple process that offers many benefits for mobile app automation. It provides a complete IDE with many advanced features that make mobile app automation faster and more efficient.

101. How do you use Appium to automate the testing of mobile games?
Mobile games are a popular form of mobile application, and like any other mobile application, testing is an essential part of their development. Appium can be used to automate the testing of mobile games.

Here are the steps to automate the testing of mobile games using Appium:

Install the game on the mobile device: The first step is to install the game on the mobile device or emulator where the testing will be performed.
Identify the game elements: Identify the game elements that need to be tested, such as buttons, scoreboards, and game screens.
Use Appium Inspector: Use Appium Inspector to identify the game elements. Appium Inspector is a tool that allows developers to inspect the elements of an application on a mobile device or emulator.
Write test scripts: Write test scripts to automate the testing of the game elements. Appium supports multiple programming languages like Java, Python, Ruby, etc.
Run the test scripts: Run the test scripts on the mobile device or emulator to automate the testing of the game elements.
Analyze test results: Analyze the test results to identify any issues that need to be fixed. Fix any issues identified during the testing process.
Repeat the process: Repeat the process for each game element that needs to be tested.
By following the steps outlined above and using the tips, developers can ensure their mobile game is thoroughly tested and ready for release.

102. How do you handle animation and transitions in Appium?
Animation and transitions can be an essential aspects of mobile application design, making the application more interactive and engaging for users. However, they can also make it challenging to automate testing using Appium.

Here are some ways to handle animation and transitions in Appium:

Wait for elements to become visible: Often, animations and transitions take some time to complete, making it difficult to locate elements on the screen. In such cases, Appium provides the 'WebDriverWait' method to wait for elements to become visible before attempting to interact with them. This method waits for a specific amount of time until the element is visible on the screen.
Use explicit waits: Explicit waits are another way to handle animation and transition in Appium. Explicit waits are set for a specific condition or action to occur before proceeding with the test. For example, you can set an explicit wait for an element to be clickable before interacting with it.
Use TouchAction class: The TouchAction class in Appium provides a way to simulate gestures like swiping, scrolling, and tapping. It can simulate the actions that occur during an animation or transition. Using the TouchAction class, you can wait for the animation to complete before interacting with the element.
Disable animations: Disabling animations can make it easier to automate testing in Appium. You can disable animations on the device under test by going to Developer options > Drawing > Window animation scale, Transition animation scale, and Animator duration scale, and setting them to "Off" or "Animation off."
Use Appium Inspector: Appium Inspector provides a graphical user interface to explore and interact with elements on the device. It can be used to identify the elements involved in animations or transitions, making it easier to write test scripts that handle these scenarios.
Use visual validation tools: Visual validation tools like Applitools can help identify changes in the application's UI caused by animations or transitions. By comparing screenshots of the application before and after an animation or transition, you can ensure that the application's UI remains consistent.
Handling animation and transitions can be challenging while automating testing in Appium. Still, you can effectively test your application and ensure its quality with explicit waits, TouchAction class, disabling animations, Appium Inspector, and visual validation tools.

103. How do you integrate Appium with TestNG or JUnit for test automation?





