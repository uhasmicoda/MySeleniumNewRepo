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
