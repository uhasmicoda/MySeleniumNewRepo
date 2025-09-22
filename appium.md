## 1 What is Appium explain

Appium is an open-source mobile automation testing tool that is used to test mobile applications (Native, Hybrid, and Mobile Web apps) on both Android and iOS platforms.
It works on the principle of "Write once, run anywhere", which means the same test script can be executed on different devices and platforms without changing the code.


## 2 Appium architecture

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

## 3 Appium prerequisites

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


## 4 What are Desired Capabilities in Appium?

In Appium, Desired Capabilities are basically a set of key–value pairs that act like instructions for the Appium server, telling it what kind of automation session we want to start. Whenever we write a test script, before executing any action, our client script sends these capabilities to the Appium server in the form of a JSON object. The server then uses this information to launch the right platform, the right device, and the right application. For example, in Android automation, we usually define capabilities such as the platform name, platform version, device name, automation engine (like UiAutomator2), and the details of the application under test such as app package and app activity. Similarly, for iOS we provide capabilities like platform name, platform version, device UDID, automation engine (like XCUITest), and the bundle ID of the app. Desired Capabilities make the framework flexible because by changing these values we can run the same test scripts on different devices, OS versions, or even on real devices and emulators without changing the core logic of our test. In short, they act as the bridge between our test scripts and the mobile environment by defining all the necessary configurations for a successful session.


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

## 5 UiAutomator2Options
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

## 6 AndroidDriver

AndroidDriver is a specialized class provided by Appium (in the Appium Java Client library) that is used to automate Android devices and applications. It extends the RemoteWebDriver class from Selenium, which means it inherits all the basic browser automation commands (like findElement, click, sendKeys) and then adds Android-specific features on top of it.


It acts as a bridge between your test script and the Android device. Since it extends Selenium’s RemoteWebDriver, it can perform all the standard Selenium actions (like click(), sendKeys(), getText()) and also provides Android-specific capabilities (like accessing device settings, notifications, or app activities), this makes it a powerful driver because it doesn’t just automate browsers, but also real Android apps and even device-level operations.

While Selenium WebDriver is mainly built for automating browsers, AndroidDriver is built for mobile automation. It not only allows you to automate mobile web browsers but also native and hybrid mobile apps. The unique advantage of AndroidDriver is that it can perform both app-level operations and device-level operations, which Selenium alone cannot handle.

With AndroidDriver, you can perform actions such as launching and closing apps, installing and uninstalling apps, rotating the device screen, opening the notification panel, toggling airplane mode, checking whether an app is installed, and retrieving the current app’s package and activity. These capabilities go beyond traditional web automation and give you full control over the Android environment.

When you create an AndroidDriver object in your test script, you provide two important things: the Appium server URL and a set of desired capabilities (like deviceName, platformName, appPackage, and appActivity). The AndroidDriver uses this information to establish a session with the Appium server.

Once the session is established, the Appium server communicates with the Android automation engine, usually UiAutomator2 (or Espresso). This engine runs on the device and executes the commands sent from the AndroidDriver. For example, if your script calls driver.findElement().click(), the command travels from your code → AndroidDriver → Appium Server → UiAutomator2 → Android device. Finally, the result is sent back through the same path.

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






