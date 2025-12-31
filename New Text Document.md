## 1 Git



Git is a distributed version control system. It’s mainly used to track changes in code, manage different versions of a project, and allow multiple people to work on the same codebase at the same time without conflicts.



GitHub is a cloud-based platform built on top of Git. It provides a place where we can store our code repositories online, collaborate with team members, review code through pull requests, and manage issues or tasks. Basically, Git is the version control system, and GitHub is the platform that makes collaboration and project management easier



Git is a distributed version control system that we use to manage our code. In my projects, we used Git with platforms like GitHub. Whenever we worked on a new feature or bug fix, we created separate branches, and once the work was done, we merged them into the main branch through pull requests. During this process, I also handled conflicts when multiple people worked on the same files. Git helped us keep track of changes, roll back if something went wrong, and made collaboration between developers and testers much easier.

Git Branching and Merging Workflow


| Step | Command / Action                  | Description                            |
| ---- | --------------------------------- | -------------------------------------- |
| 1    | `git init`                        | Initialize empty Git repository        |
| 2    | `git checkout -b b1`              | Create and switch to branch `b1`       |
| 3    | Create `b1.txt` in Notepad        | Write one line in the file and save    |
| 4    | `git add b1.txt`                  | Stage the file for commit              |
| 5    | `git commit -m "Added b1.txt"`    | Commit the file to `b1` branch         |
| 6    | `git checkout -b b2`              | Create and switch to branch `b2`       |
| 7    | Create `b2.txt` in Notepad        | Write one line in the file and save    |
| 8    | `git add b2.txt`                  | Stage the file                         |
| 9    | `git commit -m "Added b2.txt"`    | Commit the file to `b2` branch         |
| 10   | `git checkout -b b3`              | Create and switch to branch `b3`       |
| 11   | Create `b3.txt` in Notepad        | Write one line in the file and save    |
| 12   | `git add b3.txt`                  | Stage the file                         |
| 13   | `git commit -m "Added b3.txt"`    | Commit the file to `b3` branch         |
| 14   | `git checkout -b master`          | Create and switch to master branch     |
| 15   | `git merge b1`                    | Merge `b1` into master                 |
| 16   | `git merge b2`                    | Merge `b2` into master                 |
| 17   | `git merge b3`                    | Merge `b3` into master                 |
| 18   | `git branch -d b1`                | Delete branch `b1`                     |
| 19   | `git branch -d b2`                | Delete branch `b2`                     |
| 20   | `git branch -d b3`                | Delete branch `b3`                     |
| 21   | `ls` / `cat b1.txt b2.txt b3.txt` | Verify all files are present in master |









| **Category**         | **Command**                              | **Description**                                                |
| -------------------- | ---------------------------------------- | -------------------------------------------------------------- |
| **Repo Setup**       | `git init`                               | Initialize a new Git repository.                               |
|                      | `git clone <repo_url>`                   | Clone an existing repository.                                  |
| **Configuration**    | `git config --global user.name "Name"`   | Set username for all repos.                                    |
|                      | `git config --global user.email "Email"` | Set email for all repos.                                       |
| **Status/Info**      | `git status`                             | Show working directory status.                                 |
|                      | `git log`                                | Show commit history.                                           |
|                      | `git log --oneline --graph --all`        | Compact history in tree format.                                |
|                      | `git diff`                               | Show unstaged changes.                                         |
| **Staging & Commit** | `git add <file>`                         | Add file(s) to staging area.                                   |
|                      | `git add .`                              | Stage all changes.                                             |
|                      | `git commit -m "message"`                | Commit staged changes with message.                            |
|                      | `git commit --amend`                     | Edit last commit message or add forgotten changes.             |
| **Branching**        | `git branch`                             | List all branches.                                             |
|                      | `git branch <name>`                      | Create a new branch.                                           |
|                      | `git checkout <branch>`                  | Switch to a branch.                                            |
|                      | `git checkout -b <branch>`               | Create and switch to new branch.                               |
|                      | `git switch <branch>`                    | Switch to a branch (newer syntax).                             |
|                      | `git switch -c <branch>`                 | Create and switch to a new branch.                             |
| **Merging**          | `git merge <branch>`                     | Merge a branch into current one.                               |
|                      | `git rebase <branch>`                    | Reapply commits on top of another branch.                      |
| **Remote**           | `git remote -v`                          | Show remote repositories.                                      |
|                      | `git remote add origin <url>`            | Add remote repository.                                         |
|                      | `git push origin <branch>`               | Push branch to remote.                                         |
|                      | `git push -u origin <branch>`            | Push branch & set upstream.                                    |
|                      | `git pull`                               | Fetch and merge changes from remote.                           |
|                      | `git fetch`                              | Download changes without merging.                              |
| **Undo/Reset**       | `git reset <file>`                       | Unstage a staged file.                                         |
|                      | `git reset --hard <commit>`              | Reset repo to a specific commit (dangerous, discards changes). |
|                      | `git restore <file>`                     | Restore file from last commit.                                 |
|                      | `git revert <commit>`                    | Create a new commit that undoes changes from a commit.         |
| **Tagging**          | `git tag <name>`                         | Create a tag.                                                  |
|                      | `git tag`                                | List tags.                                                     |
|                      | `git push origin <tag>`                  | Push a tag to remote.                                          |
| **Stash**            | `git stash`                              | Save changes temporarily.                                      |
|                      | `git stash pop`                          | Reapply stashed changes.                                       |
|                      | `git stash list`                         | Show stashed changes.                                          |
| **Clean Up**         | `git branch -d <branch>`                 | Delete branch (safe).                                          |
|                      | `git branch -D <branch>`                 | Force delete branch.                                           |





## 2 MAVEN



Maven is a build automation and project management tool mainly used for Java projects. It helps in compiling the source code, running the tests, packaging the application, and generating reports. The main advantage of Maven is dependency management — instead of manually adding jar files, we just declare them in the pom.xml and Maven automatically downloads them from the central repository. It also follows a standard project structure and uses plugins like the Compiler plugin and Surefire plugin to handle builds and test execution. In real-time projects, we use Maven not only to run tests but also to integrate with CI/CD pipelines like Jenkins.



**In Maven, we use different lifecycle commands. The most common ones are mvn clean to remove the target folder, mvn compile to compile the source code, mvn test to execute test cases, mvn package to build the project into a JAR or WAR, and mvn install to place the package into the local repository. We also use mvn deploy to send the build to a remote repository. Additionally, commands like mvn dependency:tree and mvn help:effective-pom are useful for debugging dependencies.**



**In my project, I run scripts from the command line using Maven. First, I install and configure Maven so it can be used in CMD. Then, I define all dependencies in the pom.xml and configure the Maven Surefire plugin to point to my TestNG suite file, for example Smoke.xml. After that, I go to the project root folder in CMD and execute mvn clean test -P STS, which cleans previous builds, compiles the code, and executes the suite. Once execution is done, I check the reports in the target\\\\surefire-reports and test-output folders. This approach is very useful in real-time because it allows us to run tests without opening Eclipse and also integrate easily with CI/CD tools like Jenkins.**

| Phase    | Command        | Easy Meaning                   | Technical Meaning                                                                 |
| -------- | -------------- | ------------------------------ | --------------------------------------------------------------------------------- |
| Clean    | `mvn clean`    | Delete old files, start fresh. | Removes previous build outputs (e.g., `target/` folder).                          |
| Validate | `mvn validate` | Check project setup.           | Ensures project structure & config are correct.                                   |
| Compile  | `mvn compile`  | Convert code to class files.   | Compiles Java source into `.class` bytecode files.                                |
| Test     | `mvn test`     | Run tests.                     | Executes unit/automation tests (JUnit, TestNG).                                   |
| Package  | `mvn package`  | Make JAR/WAR file.             | Bundles compiled code + resources into a distributable (`.jar`, `.war`).          |
| Verify   | `mvn verify`   | Double-check build.            | Runs integration checks to ensure the package is valid.                           |
| Install  | `mvn install`  | Save build locally.            | Installs package into local Maven repo (`~/.m2`) for use in other local projects. |
| Deploy   | `mvn deploy`   | Share with team.               | Uploads package to remote repo (Nexus, Artifactory) for sharing with others.      |








| Tag Name          | Meaning (Easy Words)                     | Technical Purpose                                                                    |
| ----------------- | ---------------------------------------- | ------------------------------------------------------------------------------------ |
| `<profiles>`      | Group of all profiles.                   | Container for one or more `<profile>` definitions.                                   |
| `<profile>`       | A single profile (like a setting group). | Defines a specific build configuration (e.g., STS, Prod, Dev).                       |
| `<id>`            | Profile name.                            | Uniquely identifies the profile (used with `-P <id>` to activate it).                |
| `<build>`         | Build instructions.                      | Contains build-specific configurations (plugins, resources, etc.).                   |
| `<plugins>`       | List of plugins used in the build.       | Groups multiple `<plugin>` definitions.                                              |
| `<plugin>`        | One specific tool/plugin used by Maven.  | Defines how Maven should use a plugin (compiler, surefire, etc.).                    |
| `<groupId>`       | Organization/group name of the plugin.   | Identifies the plugin’s publishing organization (e.g., `org.apache.maven.plugins`).  |
| `<artifactId>`    | Plugin’s name.                           | Identifies the actual plugin (e.g., `maven-compiler-plugin`).                        |
| `<version>`       | Version of the plugin.                   | Tells Maven which version of the plugin to use.                                      |
| `<configuration>` | Custom settings for the plugin.          | Defines options (e.g., `<release>21</release>` for compiler, test suite file, etc.). |
| `<release>`       | Java version to use.                     | Tells compiler which Java version features are allowed (e.g., 21).                   |
| `<suiteXmlFiles>` | TestNG XML file(s).                      | Used by Surefire to specify which test suite(s) to run.                              |
| `<suiteXmlFile>`  | Single TestNG suite file.                | Provides the exact XML file path (e.g., `Smoke.xml`).                                |





```xml
<build>

    <plugins>

        <!-- Compiler Plugin (common for all profiles) -->
        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-compiler-plugin</artifactId>
            <version>3.13.0</version>
            <configuration>
                <release>21</release>
            </configuration>
        </plugin>

    </plugins>

</build>

<profiles>

    <!-- Smoke Profile -->
    <profile>
        <id>smoke</id>
        <build>
            <plugins>
                <plugin>
                    <groupId>org.apache.maven.plugins</groupId>
                    <artifactId>maven-surefire-plugin</artifactId>
                    <version>3.2.5</version>
                    <configuration>
                        <suiteXmlFiles>
                            <suiteXmlFile>Smoke.xml</suiteXmlFile>
                        </suiteXmlFiles>
                    </configuration>
                </plugin>
            </plugins>
        </build>
    </profile>



    <!-- Integration Profile -->
    <profile>
        <id>integration</id>
        <build>
            <plugins>
                <plugin>
                    <groupId>org.apache.maven.plugins</groupId>
                    <artifactId>maven-surefire-plugin</artifactId>
                    <version>3.2.5</version>
                    <configuration>
                        <suiteXmlFiles>
                            <suiteXmlFile>Integration.xml</suiteXmlFile>
                        </suiteXmlFiles>
                    </configuration>
                </plugin>
            </plugins>
        </build>
    </profile>


    <!-- STS Profile -->
    <profile>
        <id>sts</id>
        <build>
            <plugins>
                <plugin>
                    <groupId>org.apache.maven.plugins</groupId>
                    <artifactId>maven-surefire-plugin</artifactId>
                    <version>3.2.5</version>
                    <configuration>
                        <suiteXmlFiles>
                            <suiteXmlFile>STS.xml</suiteXmlFile>
                        </suiteXmlFiles>
                    </configuration>
                </plugin>
            </plugins>
        </build>
    </profile>

</profiles>

</project>



```
  mvn test -Psmoke

  mvn test -Pintegration

  mvn test -Psts

```xml
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd" >

<suite name="SmokeSuite">
    <test name="SmokeTests">
        <classes>
            <class name="com.tests.LoginTest"/>
            <class name="com.tests.HomePageTest"/>
        </classes>
    </test>
</suite>

```
```xml
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd" >

<suite name="IntegrationSuite">
    <test name="IntegrationTests">
        <classes>
            <class name="com.tests.UserRegistrationTest"/>
            <class name="com.tests.PaymentTest"/>
            <class name="com.tests.OrderFlowTest"/>
        </classes>
    </test>
</suite>

```
```xml
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd" >

<suite name="STSSuite">
    <test name="STSTests">
        <classes>
            <class name="com.tests.RegressionTest"/>
            <class name="com.tests.PerformanceTest"/>
        </classes>
    </test>
</suite>

```


## 3 Jenkins



Jenkins is an open-source automation server that we used mainly for Continuous Integration and Continuous Delivery (CI/CD). In my project, we integrated Jenkins with Git and Maven. Whenever we pushed code to the repository, Jenkins automatically triggered builds, compiled the project using Maven, ran the automated test cases, and generated reports.


What is global configuration and how you implemented in your framework.

In Jenkins, Global Tool Configuration is where we define tools that can be used by all jobs across the Jenkins instance, ensuring consistency and avoiding repetitive setup for each job. To configure these tools, we first go to Manage Jenkins → Global Tool Configuration, where we can set up essential tools like JDK, Maven, Git, Gradle, and Ant. For JDK, we define a name and either provide the installation path or let Jenkins install it automatically; jobs can then select the desired JDK version during build. Similarly, for Maven, we provide the Maven version name and path, or allow automatic installation, so jobs can use the configured Maven to build Java projects. In the Git section, we specify the path to the Git executable, enabling Jenkins to clone repositories for all jobs. Optional tools like Gradle and Ant can also be configured with their paths or automatic installation if a project requires them. Once saved, these global configurations are available in all jobs’ build steps or build environments, allowing jobs to select the required tool versions without manual configuration every time. This setup simplifies project builds, maintains uniformity, and reduces configuration errors across Jenkins jobs.

| **Tool**                | **Purpose**                                                   | **How to Configure**                                                | **Usage in Jobs**                                                       |
| ----------------------- | ------------------------------------------------------------- | ------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| **JDK**                 | Java compiler required to run Jenkins and build Java projects | Add a name, set `JAVA_HOME` path, or select “Install automatically” | Jobs can select the JDK version under **Build Environment**             |
| **Maven**               | Java build and dependency management tool                     | Add Maven version name, set path, or install automatically          | Jobs select Maven version in **Build → Invoke top-level Maven targets** |
| **Git**                 | Version control system                                        | Add Git name and path to Git executable                             | Jenkins uses this Git to clone/fetch repositories for jobs              |
| **Gradle** *(optional)* | Alternative build tool to Maven                               | Add Gradle version name, set path, or install automatically         | Jobs select Gradle version if the project uses Gradle                   |
| **Ant** *(optional)*    | Older Java build tool                                         | Add Ant version name, set path, or install automatically            | Jobs select Ant version if the project uses Ant                         |


**How to create a job in Jenkins**

**To create a job in Jenkins, I go to Jenkins dashboard, click on New Item, give the job a name, select the project type (like Freestyle or Maven), configure the source code or POM file path, add the required build steps (like clean test), configure post-build actions such as email notifications or reports, save it, and then I can run the job by clicking Build Now.**

| **Step**                            | **Action**                                                                  | **Details / Notes**                                                                    |
| ----------------------------------- | --------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- |
| **1. Access Jenkins Dashboard**     | Open Jenkins URL and log in                                                 | Typically `http://localhost:8080`                                                      |
| **2. Click New Item**               | Click **New Item** on the left menu                                         | Starts the job creation process                                                        |
| **3. Enter Job Name**               | Provide a unique name for the job                                           | Example: `MyMavenProject`                                                              |
| **4. Select Project Type**          | Choose a type: **Freestyle Project**, **Maven Project**, **Pipeline**, etc. | Freestyle for simple jobs, Maven for Maven projects, Pipeline for scripted/CI-CD flows |
| **5. Configure Source Code / POM**  | Specify repository URL or POM file path                                     | For Git, provide repo URL and credentials; for Maven, provide `pom.xml` path           |
| **6. Add Build Steps**              | Define actions Jenkins will perform                                         | Example: `clean install` for Maven, `Execute shell` commands, or other build steps     |
| **7. Configure Post-Build Actions** | Set actions to perform after the build                                      | Example: email notifications, test reports, archive artifacts                          |
| **8. Save the Job**                 | Click **Save**                                                              | Job configuration is now stored in Jenkins                                             |
| **9. Run the Job**                  | Click **Build Now** on the job page                                         | Jenkins executes the build according to the defined steps                              |
| **10. View Build Results**          | Check **Build History** and **Console Output**                              | Helps verify success or troubleshoot errors                                            |




| **Step**                                   | **Action**                                        | **Windows Instructions / Jenkins Action**                                                                         | **Purpose / Notes**                                    |
| ------------------------------------------ | ------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------ |
| **1. Install JDK**                         | Download & Install                                | [Download JDK](https://www.oracle.com/java/technologies/downloads/), Example path: `C:\Program Files\Java\jdk-21` | Required to run Java, Maven, Jenkins, Selenium.        |
|                                            | Set Environment Variables                         | Add `JAVA_HOME` and update `Path` with `%JAVA_HOME%\bin`                                                          | Makes Java available system-wide.                      |
|                                            | Verify                                            | `java -version`                                                                                                   | Confirms JDK installation.                             |
| **2. Install Maven**                       | Download & Extract                                | [Maven 3.9.x](https://maven.apache.org/download.cgi), Example path: `C:\apache-maven-3.9.6`                       | Required to build Java projects.                       |
|                                            | Set Environment Variables                         | Add `MAVEN_HOME` and update `Path` with `%MAVEN_HOME%\bin`                                                        | Enables Maven commands globally.                       |
|                                            | Verify                                            | `mvn -v`                                                                                                          | Confirms Maven installation.                           |
| **3. Create Maven Project in Eclipse**     | New Project                                       | Eclipse → File → New → Maven Project → `maven-archetype-quickstart`                                               | Creates project structure with POM.                    |
|                                            | POM (Dependencies + Plugin)                       | Add Selenium, TestNG, Surefire plugin                                                                             | Adds required libraries and ensures TestNG runs.       |
|                                            | testng.xml                                        | Define suite with `<class name="com.example.MyTest"/>`                                                            | Decides which test classes to run.                     |
|                                            | Sample Test Class                                 | `Assert.assertTrue(true)`                                                                                         | Confirms TestNG + Maven setup works.                   |
|                                            | Run in Eclipse                                    | Right click `testng.xml` → Run As → TestNG Suite                                                                  | Verifies tests before Jenkins integration.             |
| **4. Install Jenkins (Windows)**           | Download & Install                                | [Jenkins Windows](https://www.jenkins.io/download/), Install as Windows Service                                   | CI/CD tool for automation, runs as background service. |
|                                            | Start Jenkins                                     | Open `http://localhost:8080/`                                                                                     | Launch Jenkins dashboard.                              |
|                                            | Unlock Jenkins                                    | Use key from `C:\Program Files\Jenkins\secrets\initialAdminPassword`                                              | First-time setup authentication.                       |
|                                            | Install Plugins                                   | Select **Install Suggested Plugins**                                                                              | Installs basic required plugins.                       |
| **5. Configure Tools in Jenkins**          | Add JDK & Maven                                   | Global Tool Configuration → Add JDK / Maven                                                                       | Lets Jenkins use system-installed JDK and Maven.       |
| **6. Create Jenkins Job**                  | New Item                                          | Freestyle Project → `MySeleniumJob`                                                                               | Creates automation job.                                |
|                                            | Build Step                                        | Add **Invoke top-level Maven targets** → `clean test`                                                             | Runs Maven build and TestNG tests.                     |
|                                            | Run Job                                           | Click **Build Now** → View Console Output                                                                         | Tests Jenkins + Maven integration.                     |
| **7. Configure Email (Windows / Jenkins)** | Install Plugin                                    | Install **Email Extension Plugin**                                                                                | Enables advanced email notifications.                  |
|                                            | Configure SMTP                                    | SMTP: `smtp.gmail.com`, Port: 465/587, Gmail App Password                                                         | Allows Jenkins to send emails.                         |
|                                            | Post-Build Action                                 | Add **Editable Email Notification**                                                                               | Configures email settings.                             |
|                                            | Recipients                                        | `shreenibassamal500@gmail.com, mdsaddamwwe611@gmail.com`                                                          | Who will receive reports.                              |
|                                            | Subject & Body                                    | `Build #${BUILD_NUMBER} - ${JOB_NAME} Test Report`, Body with `${BUILD_URL}` & `${BUILD_STATUS}`                  | Detailed email content.                                |
|                                            | Attachments                                       | `**/test-output/emailable-report.html`                                                                            | Sends TestNG HTML report.                              |
|                                            | Trigger                                           | Check **Always**                                                                                                  | Ensures email is sent on every build (pass/fail).      |
| **8. Schedule Build**                      | Cron                                              | `15 11 * * *` → Runs daily at 11:15 AM                                                                            | Automates test execution on schedule.                  |
| **9. Access Jenkins Dashboard**            | Open Jenkins URL & Log in                         | Typically `http://localhost:8080`                                                                                 | Access and manage jobs.                                |
| **10. Job Management**                     | Create Job / Configure Build / Post-Build Actions | See Steps 6–8                                                                                                     | End-to-end job setup and execution.                    |

Automates test execution on schedule.               |**



## 4 EXTENT REPORT



**Extent Reports is a popular reporting library used in automation testing, especially with Selenium and TestNG, to generate interactive and visually appealing HTML reports. Unlike the default TestNG reports, which are basic and plain, Extent Reports allows testers to log detailed test execution steps, including pass/fail status, informational messages, and even screenshots for failed steps. It provides a clear, structured, and easy-to-read report that helps both testers and stakeholders understand the test results quickly.**



**The advantages of Extent Reports over default TestNG reports are significant. First, it allows step-by-step logging, so you can see exactly which actions passed or failed during the test execution. Second, it supports attaching screenshots, which is very useful for debugging failed test cases. Third, it is highly customizable—you can add themes, set report names, authors, categories, and organize tests by modules or priority. Fourth, it supports multiple tests in a single report, giving a consolidated view of the entire test suite. Overall, Extent Reports makes test reporting more professional, interactive, and easier to analyze compared to standard TestNG reports.**


**In my projects, I have used Extent Reports to generate HTML reports of Selenium test execution. It shows test steps with pass/fail/skip status, environment details like OS and browser, and I can also attach screenshots for failed cases.**


How to implement extent reports.

**In my framework, I generate reports using Extent Reports library. First, I create an object of the ExtentSparkReporter class, which is used to define the report file path, title, name, and theme. Then I create an object of the ExtentReports class, which is the main class responsible for report generation, and attach the reporter to it.**



**For each test case, I use the ExtentTest interface (returned by the createTest() method of ExtentReports) to log execution steps. While logging, I use the Status enum (like Status.INFO, Status.PASS, Status.FAIL, Status.SKIP) to specify the test step result. At the end, I call the flush() method of ExtentReports to actually write all the logs into the HTML report.**






```java
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import java.util.Date;

public class ExtentReportEnhanced {

    public static void main(String[] args) {

        // Step 1: Setup Spark Reporter with timestamp in file name
        String timeStamp = new Date().toString().replace(" ", "_").replace(":", "_");
        String reportPath = "extentReport_" + timeStamp + ".html";

        ExtentSparkReporter spark = new ExtentSparkReporter(reportPath);
        spark.config().setDocumentTitle("CRM Test Report");
        spark.config().setReportName("Automation Execution Report");
        spark.config().setTheme(Theme.DARK);

        // Step 2: Create ExtentReports instance and attach reporter
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(spark);

        // Step 3: Add environment/system details
        extent.setSystemInfo("OS", "Windows 10");
        extent.setSystemInfo("Browser", "Chrome 122");
        extent.setSystemInfo("Tester", "Saddam");

        // Step 4: Create a test and add logs
        ExtentTest test = extent.createTest("Login Test");
        test.log(Status.INFO, "Browser launched successfully");
        test.log(Status.PASS, "User logged in successfully");

        // Step 5: Generate the report
        extent.flush();

        System.out.println("Report generated at: " + reportPath);
    }

}

```


## 5 Exceptions and Their Solutions



**In Selenium (and Java), an exception is an unexpected event or error that occurs while the program is running, which disrupts the normal flow of execution.**



**In Selenium automation, exceptions usually happen when the WebDriver is not able to perform the expected action on a web element—for example, if the element is not found, not clickable, or the browser/driver versions don’t match.**



**Java provides built-in exception handling (try–catch) to deal with these issues, and Selenium defines many specific exceptions (like NoSuchElementException, TimeoutException, StaleElementReferenceException, etc.) to help testers understand what went wrong during script execution.**


| **#** | **Exception**                        | **When it Occurs**                                                             | **Solution**                                                                       |
| ----- | ------------------------------------ | ------------------------------------------------------------------------------ | ---------------------------------------------------------------------------------- |
| 1     | **NoSuchElementException**           | Element not found in DOM (wrong locator, element not loaded yet).              | ✅ Check locator (XPath/CSS) and use explicit wait (`WebDriverWait`).               |
| 2     | **ElementNotInteractableException**  | Element is present but not visible or enabled (hidden input, disabled button). | ✅ Wait until element is visible, scroll into view, or ensure element is clickable. |
| 3     | **StaleElementReferenceException**   | Element is no longer attached to DOM (page refreshed/reloaded).                | ✅ Re-locate the element and use wait after page reload.                            |
| 4     | **TimeoutException**                 | Explicit wait cannot find the element within the given time.                   | ✅ Increase wait time or ensure correct condition in `WebDriverWait`.               |
| 5     | **NoSuchFrameException**             | Switching to a frame that doesn’t exist.                                       | ✅ Check frame name/index and use `driver.switchTo().frame()`.                      |
| 6     | **NoAlertPresentException**          | Switching to an alert that is not present.                                     | ✅ Ensure alert is triggered before switching and use wait.                         |
| 7     | **ElementClickInterceptedException** | Another element (popup/overlay) blocks the element you want to click.          | ✅ Wait until popup disappears, scroll, or use JavaScript click.                    |
| 8     | **SessionNotCreatedException**       | Driver version and browser version are incompatible.                           | ✅ Update WebDriver or browser version to match.                                    |
| 9     | **InvalidSelectorException**         | XPath or CSS selector syntax is invalid.                                       | ✅ Fix the locator syntax.                                                          |
| 10    | **WebDriverException**               | General error (browser not reachable).                                         | ✅ Check driver setup, browser installation, and session.                           |
| 11    | **FileNotFoundException**            | File path given (Excel, upload, properties) does not exist.                    | ✅ Provide correct file path and verify the file exists.                            |
| 12    | **InvalidArgumentException**         | Invalid input (URL without `http/https`, wrong file path).                     | ✅ Always use proper inputs, valid URLs, and existing file paths.                   |




## 6 LISTENERS



**🎧 What are Listeners in Selenium/TestNG?**



**Listeners in Selenium (especially with TestNG) are special interfaces that “listen” to the events that happen during test execution. They act like observers—whenever a specific event occurs (like a test starting, passing, failing, or skipping), the listener automatically executes the code you define for that event.**



**In TestNG, listeners are implemented to perform actions automatically when certain events occur during the test lifecycle, such as when a test starts, passes, fails, or gets skipped. To implement a listener, we first create a separate class that implements the ITestListener interface and override its methods like onTestStart, onTestSuccess, onTestFailure, and onTestSkipped. For example, in the onTestFailure method, we can add code to capture a screenshot whenever a test fails.**



**There are two ways to attach a listener to the test:**



**1. Using the @Listeners Annotation – This approach allows us to specify the listener class directly at the test class level using the @Listeners annotation. When the test runs, TestNG will automatically trigger the listener methods.**

**2. Using the testng.xml File – In this method, we configure the listener inside the testng.xml file by defining the fully qualified class name under the <listeners> tag. This is useful when we want to apply listeners globally across multiple test classes.**



**After attaching the listener through either of these two ways, when we run the tests, the listener methods will automatically get triggered, and we will see logs such as “Test Started,” “Test Passed,” “Test Failed,” or “Test Skipped” in the console. Apart from logging, listeners can also be enhanced to integrate with reporting tools like Extent Reports or to capture screenshots for failed cases, making them very useful for real-time reporting and debugging.**







**⚡ How to Implement Listeners in TestNG**

**🔹 Step 1: Create a Listener Class**



**Implement the ITestListener interface and override its methods.**





```java

import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyTestListener implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Test Started: " + result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test Passed: " + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Test Failed: " + result.getName());
        // ✅ Example: Here you can add screenshot code
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("Test Skipped: " + result.getName());
    }

}


```



**🔹 Step 2: Attach Listener to Your Test**







**✅ Approach 1:**

**#✅ TestNG XML with Listeners**



```xml

<suite name="Suite">

    <listeners>
        <listener class-name="com.listeners.MyTestListener"/>
    </listeners>

    <test name="Test">
        <classes>
            <class name="com.tests.LoginTest"/>
        </classes>
    </test>

</suite>

```

**✅ Approach 2: Using @Listeners Annotation**
```java
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(MyTestListener.class)
public class LoginTest {

    @Test
    public void testLoginPass() {
        System.out.println("Login test executed successfully.");
    }

    @Test
    public void testLoginFail() {
        throw new RuntimeException("Forcing a failure!");
    }

}

```


**Step 3: Run Your Tests**



**When you execute your TestNG tests, the listener methods (onTestStart, onTestSuccess, onTestFailure, etc.) will automatically be triggered.**



**You’ll see logs in the console, or you can enhance them (take screenshots, add Extent Report logs, etc.).**



## 7 TestNG Annotations


In TestNG, annotations are special instructions that we place above methods, starting with the @ symbol, to control the test execution flow. They tell TestNG when and how a particular method should run during the test lifecycle.**



For example, @BeforeMethod will always run before each test case, @AfterMethod will run after each test case, and @Test is used to mark a method as a test case. Using these annotations, we can easily manage setup, cleanup, grouping of tests, dependencies, and even data-driven testing without writing extra boilerplate code.**



In TestNG, annotations are special markers used to control the flow of test execution. They are written above methods with the @ symbol and help in organizing the setup, execution, and cleanup of test cases.

For example, @BeforeSuite and @AfterSuite run only once before and after the entire test suite, usually for tasks like starting and closing a database connection.
@BeforeTest and @AfterTest are executed before and after all tests defined under a <test> tag in the TestNG XML file, often used to launch and close the browser.

@BeforeClass and @AfterClass run before and after the first and last method in a test class, typically for login and logout actions.

@BeforeMethod and @AfterMethod run before and after each test method, commonly used to set preconditions like navigating to a page and postconditions like taking a screenshot or clearing cookies. Finally,

@Test is used to define actual test cases. With these annotations, TestNG provides a structured and flexible way to manage test execution.


| #  | Annotation                  | Description                                                               |
| -- | --------------------------- | ------------------------------------------------------------------------- |
| 1  | @BeforeSuite                | Runs before all tests in the suite.                                       |
| 2  | @AfterSuite                 | Runs after all tests in the suite.                                        |
| 3  | @BeforeTest                 | Runs before `<test>` tag in testng.xml.                                   |
| 4  | @AfterTest                  | Runs after `<test>` tag in testng.xml.                                    |
| 5  | @BeforeClass                | Runs once before the first method in the current class.                   |
| 6  | @AfterClass                 | Runs once after all test methods in the current class.                    |
| 7  | @BeforeMethod               | Runs before each test method.                                             |
| 8  | @AfterMethod                | Runs after each test method.                                              |
| 9  | @Test                       | Marks a method as a test case.                                            |
| 10 | @DataProvider               | Provides data to test methods (used for data-driven testing).             |
| 11 | @Parameters                 | Passes parameters from testng.xml to test methods.                        |
| 12 | @BeforeGroups               | Runs before the first method in a specified group.                        |
| 13 | @AfterGroups                | Runs after all methods in a specified group have run.                     |
| 14 | @Factory                    | Used to execute a set of test classes dynamically.                        |
| 15 | @Listeners                  | Used to define listener classes (like ITestListener, ISuiteListener).     |
| 16 | @Ignore                     | Ignores a test method or class (alternative is `enabled=false` in @Test). |
| 17 | @Test(invocationCount=…)    | Runs the same test multiple times.                                        |
| 18 | @Test(priority=…)           | Defines execution order of test methods.                                  |
| 19 | @Test(dependsOnMethods=…)   | Makes one test dependent on another test.                                 |
| 20 | @Test(expectedExceptions=…) | Defines exceptions a test method is expected to throw.                    |



## 8 UtilityClassObject

UtilityClassObject is designed to manage WebDriver and ExtentTest objects in a thread-safe manner, which is especially important during parallel test execution. When multiple tests run simultaneously, sharing the same WebDriver or ExtentTest instances can cause conflicts, such as overlapping commands, mixed logs, or inconsistent results. To prevent this, UtilityClassObject uses ThreadLocal, which ensures that each test thread gets its own independent copy of WebDriver and ExtentTest. Setter methods store these objects in the thread-local storage at the start of the test, and getter methods retrieve them during execution. This approach isolates each test, keeping reports, logs, and browser actions separate, making parallel execution reliable and maintaining clean, accurate test reports. Essentially, it provides each test thread with its own private workspace, avoiding interference between tests.


```java
public class UtilityClassObject {

    // ThreadLocal variables → each thread (test case) gets its own copy
    public static ThreadLocal<ExtentTest> test = new ThreadLocal<ExtentTest>();
    public static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();

    // ===== Getter & Setter for ExtentTest =====
    public static ExtentTest getTest() {
        return test.get(); // returns ExtentTest object for current thread
    }

    public static void setTest(ExtentTest actTest) {
        test.set(actTest); // assigns ExtentTest for current thread
    }

    // ===== Getter & Setter for WebDriver =====
    public static WebDriver getDriver() {
        return driver.get(); // returns WebDriver for current thread
    }

    public static void setDriver(WebDriver actDriver) {
        driver.set(actDriver); // assigns WebDriver for current thread
    }

}

```

How to implement UtilityClassObject

To implement UtilityClassObject, you first create a utility class that contains two ThreadLocal variables—one for WebDriver and one for ExtentTest. These variables ensure that each test thread gets its own independent copy, preventing interference when tests run in parallel. You then create getter and setter methods for both WebDriver and ExtentTest so that you can assign and retrieve these objects for the current thread during test execution. In your test setup, you assign a WebDriver instance and an ExtentTest instance to the current thread using the setter methods. During the test, whenever you need to interact with the browser or log test information, you retrieve the thread-specific instances using the getter methods. This approach ensures that each test has its own isolated browser session and reporting object, avoiding conflicts, maintaining clean logs, and making parallel execution reliable and thread-safe.


## 9 What is testing.xlm file.

testng.xml is like a control file for TestNG. Instead of hardcoding everything in the code, we use this XML file to tell TestNG which test classes to run, in what order, and with what settings. For example, we can group tests, run them in parallel, or pass parameters directly from the file. It basically makes test execution easier to manage and more flexible.

Instead of me running test classes one by one, this file tells TestNG which tests to run, in what sequence, and with what setup. For example, I can group login tests together, keep payment tests separate, and even decide to run them in parallel. It’s also like a central place where I can pass parameters or add listeners. So basically, it’s a configuration file that organizes and controls the test execution, just like a schedule organizes daily tasks.


| Tag / Attribute                                               | Example Used                          | Meaning / Purpose                                                                     |
| ------------------------------------------------------------- | ------------------------------------- | ------------------------------------------------------------------------------------- |
| `<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">` | Declaration at the top                | Tells TestNG that this file is a valid TestNG configuration file.                     |
| `<suite>`                                                     | `<suite name="Suite">`                | Root element of the XML. Represents the whole test suite. `name` gives it a label.    |
| `<test>`                                                      | `<test name="Test">`                  | Defines one group of tests inside the suite. Each `<test>` can have multiple classes. |
| `<classes>`                                                   | `<classes>...</classes>`              | Container for one or more `<class>` elements.                                         |
| `<class>`                                                     | `<class name="com.tests.LoginTest"/>` | Defines the fully qualified name of the test class (package + class name) to run.     |
| `</suite>`                                                    | Closing tag                           | Ends the suite definition.                                                            |


```xml
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd" >

<suite name="Suite">
    <test name="Test">
        <classes>
            <class name="com.tests.LoginTest"/>
        </classes>
    </test>
</suite>


```
## 10 Java–Selenium Architecture.


In my experience, the Selenium Java architecture is designed using OOP concepts like abstraction, inheritance, and runtime polymorphism. At the base, we have the SearchContext interface, which provides the fundamental methods like findElement() and findElements(). On top of that, the WebDriver interface extends SearchContext and adds browser-level methods such as get(), getTitle(), navigate(), close(), and quit(). Since WebDriver is just an interface, it only defines the behavior, but the actual implementation is provided by the RemoteWebDriver class. Browser-specific drivers like ChromeDriver or FirefoxDriver extend RemoteWebDriver and handle the communication with their respective browsers. In real projects, we usually use runtime polymorphism — for example, when I write WebDriver driver = new ChromeDriver();, I’m upcasting the ChromeDriver object to the WebDriver interface. This makes my framework browser-independent, because if I want to run the same test on Firefox, I only change the object creation, not the rest of the test logic. This architecture is what gives Selenium its flexibility and power for cross-browser testing.

| Component                              | Type                            | What it Contains                                       | What it Inherits                 | Role / Usefulness                                                                  |
| -------------------------------------- | ------------------------------- | ------------------------------------------------------ | -------------------------------- | ---------------------------------------------------------------------------------- |
| SearchContext                          | Interface                       | 2 abstract methods → `findElement()`, `findElements()` | —                                | Base interface – provides fundamental element location methods.                    |
| WebDriver                              | Interface                       | 13 abstract methods (11 new + 2 from SearchContext)    | Extends SearchContext            | Defines browser-level operations like navigation, title, window handling, etc.     |
| RemoteWebDriver                        | Class                           | 13 concrete methods (implements WebDriver)             | Implements WebDriver             | Core implementation of WebDriver methods; parent for all browser-specific drivers. |
| ChromeDriver                           | Class (extends RemoteWebDriver) | Inherits everything from RemoteWebDriver               | Extends RemoteWebDriver          | Launches and controls Chrome browser.                                              |
| FirefoxDriver                          | Class (extends RemoteWebDriver) | Inherits everything from RemoteWebDriver               | Extends RemoteWebDriver          | Launches and controls Firefox browser.                                             |
| IEDriver / EdgeDriver                  | Class (extends RemoteWebDriver) | Inherits everything from RemoteWebDriver               | Extends RemoteWebDriver          | Launches and controls IE/Edge browser.                                             |
| WebDriver driver = new ChromeDriver(); | Example Statement               | Interface reference → Object creation                  | Uses WebDriver as reference type | Achieves Runtime Polymorphism (RTP). Same code works for any browser driver.       |



## 11 Screenshot 

In Selenium, a screenshot is basically a captured image of the browser at a particular point during test execution. It is very useful because it helps in bug reporting—when a test fails, a screenshot gives developers a clear idea of what went wrong. It also serves as evidence that a test was executed on a specific page or functionality, and it helps in debugging by showing the exact UI state when something unexpected happens. Many teams also include screenshots in reports like ExtentReports or Allure to provide visual proof of the test run. Screenshots can be taken in two main ways: one is a full-page screenshot, where we capture the entire visible browser window, and the other is an element screenshot, where we capture only a specific element like a button, logo, or text field. Depending on the requirement, we use either of these approaches to make our testing more effective and reliable.

In Selenium, we capture screenshots using the TakesScreenshot interface. Since WebDriver itself doesn’t have a direct method to take screenshots, we first cast our driver object to TakesScreenshot. Then we call the getScreenshotAs() method, which captures the current state of the browser and returns it in the format we specify, usually as a file. Finally, we save that file to a permanent location on our system using the File class and FileHandler.copy(). This way we can preserve the screenshot and use it for bug reporting, debugging, or attaching in test reports. Depending on the need, we can capture the full browser window or even a specific element by calling getScreenshotAs() on a WebElement

1️⃣ Element Screenshot (only captures selected element like a button, logo, etc.

```java
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ElementScreenShot {
    public static void main(String[] args) throws IOException, InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement englishBtn = driver.findElement(By.xpath("//div[@class='icp-button']"));

        Thread.sleep(4000);
        js.executeScript("arguments[0].scrollIntoView(true);", englishBtn);

        File src = englishBtn.getScreenshotAs(OutputType.FILE);
        FileHandler.copy(src, new File("./Screenshots/logo1.png"));

        driver.quit();
    }
}

```
2️⃣ Full Page Screenshot (entire browser window.


```java

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShote {
    public static void main(String[] args) throws InterruptedException, IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in");

        Thread.sleep(6000);

        TakesScreenshot ts = (TakesScreenshot) driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        File f = new File("./Screenshots/screenshot.jpeg");
        FileHandler.copy(src, f);

        driver.quit();
    }
}

```

| Code Part                              | Type          | Belongs To / From Package              | Use / Role                                                                   |
| -------------------------------------- | ------------- | -------------------------------------- | ---------------------------------------------------------------------------- |
| `TakesScreenshot`                      | Interface     | `org.openqa.selenium`                  | Special interface in Selenium used to capture screenshots.                   |
| `(TakesScreenshot) driver`             | Type Casting  | Casts `WebDriver` to `TakesScreenshot` | Because `WebDriver` doesn’t directly have screenshot methods, so we cast it. |
| `getScreenshotAs(OutputType.FILE)`     | Method        | Defined in `TakesScreenshot`           | Captures screenshot and stores it as a file object (temporary).              |
| `OutputType.FILE`                      | Enum/Constant | `org.openqa.selenium`                  | Tells Selenium that the screenshot should be stored in file format.          |
| `File src`                             | Class         | `java.io.File`                         | Stores the temporary screenshot file returned by Selenium.                   |
| `FileHandler.copy(src, new File("…"))` | Method        | `org.openqa.selenium.io.FileHandler`   | Copies the temporary file to a permanent location on disk.                   |

## 12 Page Object Model or POM

Page Object Model, or POM, is a design pattern used in Selenium where we create separate classes for each page of the application. Each class stores the locators of the elements on that page and the methods to interact with them. This way, instead of writing locators directly inside test cases, we keep them in one place, which makes the code cleaner, reusable, and easier to maintain. If anything changes in the UI, we just update the locator in the page class and don’t need to touch the test logic. In short, POM helps in reducing code duplication and makes the framework more scalable.


To implement the Page Object Model (POM) in Selenium, first we declare a WebDriver variable in the page class to hold the browser instance. Then, we create a constructor that takes the WebDriver as a parameter and assigns it to the class variable using this.driver = driver;. Inside the constructor, we call PageFactory.initElements(driver, this) to initialize all the web elements defined in the class.

Next, we define web elements using annotations. For a single element, we use @FindBy. For multiple locators with an OR condition, we use @FindAll, and for multiple locators with an AND condition, we use @FindBys. We can also define lists of elements like checkboxes or links using List<WebElement>.

After defining elements, we create getter methods to access them if needed. Then, we write action methods that perform operations on the elements, such as login(), selectAllCheckboxes(), or printAllLinks(). In the test class, we simply create an object of this page class and call its methods. This approach separates locators and actions from test logic, makes the code reusable, easier to maintain, and allows us to handle UI changes by updating only the page class.

```java
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 {

    WebDriver driver;

    public LoginPage2(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Single element
    @FindBy(xpath = "//button[text()='Login']")
    private WebElement loginBtn;

    // OR condition using FindAll
    @FindAll({
        @FindBy(id = "email"),
        @FindBy(name = "userEmail")
    })
    private WebElement emailField;

    // AND condition using FindBys (all conditions must match)
    @FindBys({
        @FindBy(className = "input-field"),
        @FindBy(name = "password")
    })
    private WebElement passwordField;

    @FindBy(xpath = "//input[@type='checkbox']")
    private List<WebElement> checkboxes;

    @FindBy(tagName = "a")
    private List<WebElement> allLinks;

    // Getters
    public WebDriver getDriver() {
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
👉 And just to keep your quick notes ready:

@FindBy → Single locator

@FindBys → AND condition (all locators must match)

@FindAll → OR condition (any locator can match)

findElement(By) → Finds first matching element

findElements(By) → Finds all matching elements

| Component / Feature                      | Type / Annotation | Purpose / Usefulness                                                               |
| ---------------------------------------- | ----------------- | ---------------------------------------------------------------------------------- |
| `WebDriver driver;`                      | Class Variable    | Holds the browser driver instance for the page; used across page methods.          |
| `public LoginPage2(WebDriver driver)`    | Constructor       | Initializes the page class; `this.driver = driver;` assigns local driver to class. |
| `PageFactory.initElements(driver, this)` | Method Call       | Initializes all WebElements with locators defined in the class.                    |
| `@FindBy`                                | Annotation        | Single element locator.                                                            |
| `@FindAll`                               | Annotation        | Multiple locators (OR condition).                                                  |
| `@FindBys`                               | Annotation        | Multiple locators (AND condition).                                                 |
| `WebElement / List<WebElement>`          | Variable Type     | Stores page elements (single or multiple) for actions like click, sendKeys, etc.   |
| `login(String email, String password)`   | Method / Action   | Example action method using page elements to perform login.                        |
| `selectAllCheckboxes()`                  | Method / Action   | Example method to perform action on list of elements.                              |
| `printAllLinks()`                        | Method / Action   | Example method to iterate and read all links on the page.                          |


## 13 WEDRIVER

1 WEDRIVER ALL METHODS

🔹 Methods from WebDriver Interface

In Selenium, WebDriver is an interface that defines all the methods required for browser automation. It is the core component that allows us to interact with different browsers in a unified way. The main advantage of WebDriver is abstraction—it enables us to write common automation code that works across multiple browsers like Chrome, Firefox, or Edge without changing the logic. For example, when we write WebDriver driver = new ChromeDriver();, we are referring to the WebDriver interface but creating an object of ChromeDriver, which internally provides the actual implementation. This design, based on abstraction, inheritance, and polymorphism, allows Selenium to achieve cross-browser testing. In real-time, every automation script starts with WebDriver because it provides essential methods to open and close the browser, navigate between pages, find elements, handle windows, alerts, and frames, and perform various browser-level operations.

| Method                | Return Type      | Description (Usage)                                           | Example                                            |
| --------------------- | ---------------- | ------------------------------------------------------------- | -------------------------------------------------- |
| `get(String url)`     | void             | Opens the given URL in the browser.                           | `driver.get("https://google.com");`                |
| `getCurrentUrl()`     | String           | Returns the current page URL.                                 | `System.out.println(driver.getCurrentUrl());`      |
| `getTitle()`          | String           | Returns the current page title.                               | `System.out.println(driver.getTitle());`           |
| `getPageSource()`     | String           | Returns the HTML source of the page.                          | `driver.getPageSource();`                          |
| `getWindowHandle()`   | String           | Returns unique ID of the current browser window.              | `String handle = driver.getWindowHandle();`        |
| `getWindowHandles()`  | Set<String>      | Returns IDs of all open browser windows/tabs.                 | `Set<String> handles = driver.getWindowHandles();` |
| `findElement(By by)`  | WebElement       | Finds the first matching element on the page.                 | `driver.findElement(By.id("username"));`           |
| `findElements(By by)` | List<WebElement> | Finds all matching elements on the page.                      | `driver.findElements(By.tagName("a"));`            |
| `manage()`            | Options          | Provides browser options like cookies, timeouts, window size. | `driver.manage().window().maximize();`             |
| `navigate()`          | Navigation       | Used for navigation (back, forward, refresh, to).             | `driver.navigate().back();`                        |
| `switchTo()`          | TargetLocator    | Switches control to frame, alert, or window.                  | `driver.switchTo().alert().accept();`              |
| `close()`             | void             | Closes the current browser window.                            | `driver.close();`                                  |
| `quit()`              | void             | Quits the entire browser session (all windows).               | `driver.quit();`                                   |

2 🔹 Methods from WebElement Interface



In Selenium, WebElement is an interface that represents any element on a web page, such as a button, link, text box, or dropdown. It provides a wide range of methods to perform user interactions and retrieve information about elements. WebElement is very important because once we locate an element using findElement() or findElements() from WebDriver, we can perform actions like clicking, typing, reading text, or checking visibility. For example, if we want to enter a username in a login field, we first locate the element and then use sendKeys("username"). Similarly, to verify whether a button is enabled, we can use isEnabled(). In real-time testing, WebElement methods are used in almost every test case since they allow us to simulate user behavior on the web page.

| Method                                 | Usage Example                       | Meaning / Purpose                                                        |
| -------------------------------------- | ----------------------------------- | ------------------------------------------------------------------------ |
| `click()`                              | `element.click();`                  | Clicks the element (button, link, checkbox, etc.).                       |
| `submit()`                             | `element.submit();`                 | Submits a form if the element is inside a `<form>`.                      |
| `sendKeys(CharSequence... keysToSend)` | `element.sendKeys("admin123");`     | Types text into a text field or textarea.                                |
| `clear()`                              | `element.clear();`                  | Clears the existing text from an input/textarea field.                   |
| `getTagName()`                         | `element.getTagName();`             | Returns the element’s tag name (e.g., `input`, `div`, `button`).         |
| `getAttribute(String name)`            | `element.getAttribute("id");`       | Returns the value of an attribute (e.g., `id`, `name`, `value`).         |
| `getDomAttribute(String name)`         | `element.getDomAttribute("class");` | Returns the attribute directly from the DOM.                             |
| `getDomProperty(String name)`          | `element.getDomProperty("value");`  | Returns the live DOM property of the element.                            |
| `getCssValue(String propertyName)`     | `element.getCssValue("color");`     | Returns the value of a CSS property (e.g., color, font-size).            |
| `getText()`                            | `element.getText();`                | Gets the visible inner text of the element.                              |
| `getRect()`                            | `element.getRect();`                | Returns element’s dimensions and position (`x`, `y`, `width`, `height`). |
| `getLocation()`                        | `element.getLocation();`            | Returns the coordinates of the element on the page.                      |
| `getSize()`                            | `element.getSize();`                | Returns the element’s width and height.                                  |
| `isDisplayed()`                        | `element.isDisplayed();`            | Checks if the element is visible on the page.                            |
| `isEnabled()`                          | `element.isEnabled();`              | Checks if the element is enabled and interactive.                        |
| `isSelected()`                         | `element.isSelected();`             | Checks if a checkbox, radio button, or option is selected.               |

```java 
WebElement username = driver.findElement(By.id("username"));
String enteredValue = username.getAttribute("value");
Assert.assertEquals(enteredValue, "Saddam");

String isDisabled = button.getAttribute("disabled");
Assert.assertNotNull(isDisabled);  // confirms the button is disabled

```
14 Property file.

A property file is a simple text file that stores configuration data in key–value pairs. In Selenium, we use it to store common test data like URL, browser, username, password, and timeouts. This helps avoid hardcoding, makes the framework more flexible, and allows us to maintain environment-specific data easily. If any value changes, we just update the property file instead of touching the code.

```java 
public class FileUtility {

    public String getCommonDataFromPropertyFile(String key) throws IOException {
        FileInputStream fis = new FileInputStream("./commdata.properties");
        Properties p = new Properties();
        p.load(fis);
        return p.getProperty(key);
    }
}

```
Usage:

```java
FileUtility fUtil = new FileUtility();
String url = fUtil.getCommonDataFromPropertyFile("url");
driver.get(url);

```

| **Code**                                                              | **Type**                   | **Meaning / Use**                                                                                                              |
| --------------------------------------------------------------------- | -------------------------- | ------------------------------------------------------------------------------------------------------------------------------ |
| `public class FileUtility { }`                                        | **Class**                  | A utility class to handle property file operations (reusable across the framework).                                            |
| `public String getCommonDataFromPropertyFile(String key)`             | **Method**                 | A reusable method that accepts a **key** and returns its **value** from the property file.                                     |
| `throws IOException`                                                  | **Exception Handling**     | Declared because `FileInputStream` and `Properties.load()` may throw `IOException` if the file is missing or unreadable.       |
| `FileInputStream fis = new FileInputStream("./commdata.properties");` | **Class: FileInputStream** | Reads the property file from the given path (`./` means project root). Converts the file into a stream so Java can process it. |
| `Properties p = new Properties();`                                    | **Class: Properties**      | Java’s inbuilt class to work with `.properties` files. Stores data in **key–value pair** format.                               |
| `p.load(fis);`                                                        | **Method: load()**         | Loads the data from the property file into the `Properties` object.                                                            |
| `return p.getProperty(key);`                                          | **Method: getProperty()**  | Fetches the value of the given **key** from the property file and returns it.                                                  |


In my framework, I implemented a property file to store all the common configuration data like URL, browser name, username, password, and timeouts. This helps to avoid hardcoding values in the test scripts. I created a FileUtility class that reads the property file using FileInputStream and the Properties class provided by Java. Inside this utility, I used the getProperty() method to fetch values based on the key. For example, if I need the application URL or browser name in my test script, I just call the utility method with the key instead of hardcoding it. This makes the framework more flexible and easy to maintain because whenever there is a change, like a new URL or credentials, I only need to update the property file and not the test code. Overall, it centralizes common data, improves reusability, and makes the framework more professional.

15 Robot class

The Robot class in Java (under the java.awt package) is used to simulate keyboard and mouse events. In Selenium WebDriver, we use it when we need to handle OS-level popups, file upload/download windows, print dialogs, or authentication popups that WebDriver cannot interact with directly since WebDriver works only with HTML DOM elements inside the browser. Robot class bridges this gap by allowing us to perform native keyboard and mouse operations, making it very useful in automation where Selenium alone is not sufficient.


| **Method**                            | **Description**                                   | **Example Code**                                                             |
| ------------------------------------- | ------------------------------------------------- | ---------------------------------------------------------------------------- |
| `keyPress(int keycode)`               | Presses a key (key stays pressed until released). | `robot.keyPress(KeyEvent.VK_ENTER);`                                         |
| `keyRelease(int keycode)`             | Releases a pressed key.                           | `robot.keyRelease(KeyEvent.VK_ENTER);`                                       |
| `mousePress(int buttons)`             | Presses a mouse button.                           | `robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);`                            |
| `mouseRelease(int buttons)`           | Releases a pressed mouse button.                  | `robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);`                          |
| `mouseMove(int x, int y)`             | Moves mouse pointer to given screen coordinates.  | `robot.mouseMove(300, 200);`                                                 |
| `mouseWheel(int wheelAmt)`            | Scrolls the mouse wheel up/down.                  | `robot.mouseWheel(5);`                                                       |
| `delay(int ms)`                       | Pauses execution for given milliseconds.          | `robot.delay(2000); // wait 2 sec`                                           |
| `createScreenCapture(Rectangle rect)` | Captures screenshot of the given screen area.     | `BufferedImage img = robot.createScreenCapture(new Rectangle(0,0,500,500));` |


```java

WebElement uploadBtn = driver.findElement(By.id("fileUpload"));
uploadBtn.click();  // opens OS popup

Robot robot = new Robot();
robot.delay(2000);

// Type file path
StringSelection ss = new StringSelection("C:\\Users\\file.txt");
Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

// Press CTRL+V
robot.keyPress(KeyEvent.VK_CONTROL);
robot.keyPress(KeyEvent.VK_V);
robot.keyRelease(KeyEvent.VK_V);
robot.keyRelease(KeyEvent.VK_CONTROL);

// Press ENTER
robot.keyPress(KeyEvent.VK_ENTER);
robot.keyRelease(KeyEvent.VK_ENTER);

```
16. ExcelUtility

ExcelUtility is a reusable utility class used in Selenium frameworks to handle reading and writing data from Excel files. In real-time automation projects, test data is usually kept in Excel sheets instead of hardcoding it in the script, because Excel makes it easier to maintain, modify, and share test data. The ExcelUtility class helps us fetch data, count rows, and insert or update values into Excel, which makes data-driven testing possible.

In companies, this is very useful because it supports data-driven testing, where the same test can run with multiple sets of data. It also improves maintainability, since if any value changes, we just update the Excel file instead of changing the code. The utility class centralizes all Excel operations like reading cell data, writing results back, and getting row counts, making it reusable and consistent across the whole framework.


To implement ExcelUtility, first we need to import the Apache POI library because Java itself does not provide direct support for Excel handling. Inside the utility class, we create methods for different operations. For example, a method like getDataFromExcel() is used to fetch cell data from a given sheet by passing the file path, sheet name, row index, and cell index. Similarly, getLastRow() helps us find the total number of rows in a sheet, which is useful when running tests with multiple sets of data. Another method like setDataIntoExcel() allows us to insert or update values into specific cells, which can be used to store test results or logs back into the Excel file.

The actual implementation uses FileInputStream to open the Excel file and WorkbookFactory to create the workbook instance. From there, we fetch the required sheet, row, and cell. To write into Excel, we use FileOutputStream after updating the cell value. It’s also important to close the workbook to avoid memory leaks.

In test cases, instead of hardcoding values like usernames or passwords, we can call ExcelUtility.getDataFromExcel() to fetch them dynamically from the Excel sheet. This makes our framework data-driven, more flexible, and easier to maintain. In short, ExcelUtility separates test data from test scripts, improves reusability, and supports large-scale testing where test data frequently changes.

```java
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.*;

public class ExcelUtility {

    public String getDataFromExcel(String path, String sheet, int indexRow, int indexCell) 
            throws EncryptedDocumentException, IOException {

        FileInputStream fis = new FileInputStream(path);
        Workbook wb = WorkbookFactory.create(fis);
        Sheet sh = wb.getSheet(sheet);
        Row row = sh.getRow(indexRow);
        String data = row.getCell(indexCell).toString();
        wb.close();
        return data;
    }

    public int getLastRow(String path, String sheet) 
            throws EncryptedDocumentException, IOException {

        FileInputStream fis = new FileInputStream(path);
        Workbook wb = WorkbookFactory.create(fis);
        int rowNum = wb.getSheet(sheet).getLastRowNum();
        wb.close();
        return rowNum;
    }

    public void setDataIntoExcel(String path, String sheet, int index, String value) 
            throws EncryptedDocumentException, IOException {

        FileInputStream fis = new FileInputStream(path);
        Workbook wb = WorkbookFactory.create(fis);
        Sheet sh = wb.getSheet(sheet);
        Row row = sh.getRow(index);
        Cell cell = row.createCell(index);
        cell.setCellValue(value);
        wb.close();

        FileOutputStream fos = new FileOutputStream(path);
        wb.write(fos);
        wb.close();
    }
}
```
| **Code Part**                       | **Type**      | **Belongs To / From Package**                 | **Use / Role**                                                 |
| ----------------------------------- | ------------- | --------------------------------------------- | -------------------------------------------------------------- |
| `FileInputStream`                   | Class         | `java.io`                                     | Reads the Excel file (input stream).                           |
| `FileOutputStream`                  | Class         | `java.io`                                     | Writes data back into the Excel file (output stream).          |
| `Workbook`                          | Interface     | `org.apache.poi.ss.usermodel`                 | Represents the whole Excel workbook.                           |
| `WorkbookFactory.create(fis)`       | Static Method | `org.apache.poi.ss.usermodel.WorkbookFactory` | Creates `Workbook` instance (handles both `.xls` and `.xlsx`). |
| `Sheet`                             | Interface     | `org.apache.poi.ss.usermodel`                 | Represents a single sheet inside the workbook.                 |
| `Row`                               | Interface     | `org.apache.poi.ss.usermodel`                 | Represents a row inside a sheet.                               |
| `Cell`                              | Interface     | `org.apache.poi.ss.usermodel`                 | Represents a single cell inside a row.                         |
| `row.getCell(indexCell).toString()` | Method        | `org.apache.poi.ss.usermodel.Cell`            | Reads value from the cell and converts it into a string.       |
| `sheet.getLastRowNum()`             | Method        | `org.apache.poi.ss.usermodel.Sheet`           | Gets the last row number (used for looping test data).         |
| `row.createCell(index)`             | Method        | `org.apache.poi.ss.usermodel.Row`             | Creates a new cell in the row for writing data.                |
| `cell.setCellValue(value)`          | Method        | `org.apache.poi.ss.usermodel.Cell`            | Sets a string value into the cell.                             |
| `wb.close()`                        | Method        | `org.apache.poi.ss.usermodel.Workbook`        | Closes the workbook to release resources.                      |




17 SELECT CLASS

The Select class in Selenium is a built-in class used to handle dropdown menus that are created using HTML select tags. Normally, Selenium WebDriver cannot directly select options from dropdowns, so we use the Select class to interact with them. With this class, we can select options in three ways: by index, by visible text, or by value.

In companies, the Select class is important because dropdowns are very common in real-time applications, such as selecting a country, state, role, or payment type. Using the Select class makes automation scripts simple, readable, and reusable for such scenarios, and avoids writing complex code to handle dropdowns manually.




| **Method**                           | **Description**                                                     | **Example Code**                                         |
| ------------------------------------ | ------------------------------------------------------------------- | -------------------------------------------------------- |
| `Select(WebElement element)`         | Constructor → Creates a Select object for the given dropdown.       | `Select select = new Select(countryDropdown);`           |
| `selectByIndex(int index)`           | Selects option by index (0-based, first option = 0).                | `select.selectByIndex(2);`                               |
| `selectByValue(String value)`        | Selects option using the `value` attribute in HTML.                 | `select.selectByValue("IND");`                           |
| `selectByVisibleText(String text)`   | Selects option using the visible text shown to the user.            | `select.selectByVisibleText("India");`                   |
| `deselectByIndex(int index)`         | Deselects option by index. *(Works only for multi-select)*          | `select.deselectByIndex(1);`                             |
| `deselectByValue(String value)`      | Deselects option using the `value` attribute. *(Multi-select only)* | `select.deselectByValue("USA");`                         |
| `deselectByVisibleText(String text)` | Deselects option using visible text. *(Multi-select only)*          | `select.deselectByVisibleText("Canada");`                |
| `deselectAll()`                      | Deselects all selected options. *(Multi-select only)*               | `select.deselectAll();`                                  |
| `getFirstSelectedOption()`           | Returns the first selected option from the dropdown.                | `WebElement first = select.getFirstSelectedOption();`    |
| `getAllSelectedOptions()`            | Returns all selected options. *(Works only for multi-select)*       | `List<WebElement> all = select.getAllSelectedOptions();` |
| `getOptions()`                       | Returns all available options in the dropdown.                      | `List<WebElement> options = select.getOptions();`        |
| `isMultiple()`                       | Checks if the dropdown allows multiple selections.                  | `boolean multi = select.isMultiple();`                   |


```java
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectExample {
    public static void main(String[] args) {
        // Set up WebDriver
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.example.com/dropdown"); // Replace with actual site
        driver.manage().window().maximize();

        // Locate dropdown element
        WebElement countryDropdown = driver.findElement(By.id("country"));

        // Create Select object
        Select select = new Select(countryDropdown);

        // ✅ Select options
        select.selectByIndex(1); // Select 2nd option
        select.selectByValue("USA"); // Select option with value="USA"
        select.selectByVisibleText("India"); // Select option with visible text "India"

        // ✅ Check if dropdown supports multiple selections
        if (select.isMultiple()) {
            System.out.println("This is a multi-select dropdown.");

            // Deselect operations
            select.deselectByValue("USA");
            select.deselectAll();
        }

        // ✅ Get first selected option
        WebElement firstOption = select.getFirstSelectedOption();
        System.out.println("First selected option: " + firstOption.getText());

        // ✅ Get all available options
        for (WebElement option : select.getOptions()) {
            System.out.println("Available option: " + option.getText());
        }

        // Close browser
        driver.quit();
    }
}

```

18 Locators

Locators in Selenium are used to uniquely identify elements on a web page, such as buttons, text boxes, images, links, and dropdowns, so that we can perform actions on them like clicking, typing, or retrieving text. They are the backbone of Selenium automation, because without identifying elements, no interaction or testing can be performed. Selenium provides different types of locators such as ID, Name, Class Name, Tag Name, Link Text, Partial Link Text, CSS Selector, and XPath. Among these, ID is the most reliable and fastest because it is usually unique, while XPath and CSS Selector are more powerful when elements don’t have proper attributes. Choosing the right locator is very important for writing stable automation scripts, as poor locators can cause frequent failures when the application UI changes. In real-time projects, testers often use a combination of locators depending on the application’s structure, ensuring that scripts are both reusable and easy to maintain.

By is a Selenium class that provides different locator strategies to find elements on a web page. It has static methods such as id, name, xpath, and cssSelector, which we use with Selenium to locate elements and perform actions on them.

| **Locator Name**    | **Definition**                                                       | **Example Code**                                                                  |
| ------------------- | -------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| **id**              | Finds element using the **id attribute** (must be unique).           | `driver.findElement(By.id("txtUsername")).sendKeys("Admin");`                     |
| **name**            | Finds element using the **name attribute**.                          | `driver.findElement(By.name("password")).sendKeys("admin123");`                   |
| **className**       | Finds element using the **class attribute**.                         | `driver.findElement(By.className("oxd-button")).click();`                         |
| **tagName**         | Finds element using the **HTML tag name**.                           | `driver.findElement(By.tagName("input")).sendKeys("Test");`                       |
| **linkText**        | Finds **link element** by matching exact visible text.               | `driver.findElement(By.linkText("Forgot your password?")).click();`               |
| **partialLinkText** | Finds **link element** by matching partial visible text.             | `driver.findElement(By.partialLinkText("Forgot")).click();`                       |
| **cssSelector**     | Finds element using **CSS selectors** (very powerful).               | `driver.findElement(By.cssSelector("input[name='username']")).sendKeys("Admin");` |
| **xpath**           | Finds element using **XPath expression** (very flexible & powerful). | `driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();`    |




19. Synchronization in Selenium 

Synchronization in Selenium is the process of matching the speed of the automation script with the speed of the application under test. Since web elements may take some time to load, we use synchronization to avoid errors like NoSuchElementException or ElementNotInteractableException. Selenium provides two main types of waits for synchronization: implicit wait and explicit wait. Implicit wait applies globally for all elements, while explicit wait is applied to specific elements based on defined conditions such as visibility, clickability, or presence of an element. We also have fluent wait, which is a type of explicit wait that allows us to define polling frequency and to ignore specific exceptions. Using proper synchronization makes the script more stable and less likely to fail due to timing issues.

Implicit wait in Selenium is a type of synchronization that tells the WebDriver to wait for a specified amount of time before throwing a NoSuchElementException. It is applied globally, which means it works for all elements in the script. Once set, the driver will keep checking for the element until the defined time expires. However, it does not wait for conditions like visibility or clickability; it only checks for the presence of elements in the DOM


| Method                            | Description                                                                                                            | Example                                                                |
| --------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------- |
| `implicitlyWait(Duration time)`   | Sets a global wait for all elements. Selenium will wait for the specified time before throwing NoSuchElementException. | `driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));`   |
| `pageLoadTimeout(Duration time)`  | Waits for the entire page to load before throwing TimeoutException.                                                    | `driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));`  |
| `setScriptTimeout(Duration time)` | Waits for asynchronous scripts to finish execution (like JavaScript).                                                  | `driver.manage().timeouts().setScriptTimeout(Duration.ofSeconds(20));` |

 ```java
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

```
Fluent Wait is a type of explicit wait in Selenium that lets us set how long to wait in total, how often Selenium should keep checking for the element, and which exceptions to ignore during that time.

| Meaning                                                              | Condition                                     | Usage Example                                                                                |
| -------------------------------------------------------------------- | --------------------------------------------- | -------------------------------------------------------------------------------------------- |
| Waits until element is present in the DOM (not necessarily visible). | `presenceOfElementLocated(By locator)`        | `wait.until(ExpectedConditions.presenceOfElementLocated(By.id("email")));`                   |
| Waits until element is visible on page.                              | `visibilityOfElementLocated(By locator)`      | `wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login")));`                 |
| Waits until the given WebElement is visible.                         | `visibilityOf(WebElement element)`            | `wait.until(ExpectedConditions.visibilityOf(button));`                                       |
| Waits until element is clickable.                                    | `elementToBeClickable(By locator)`            | `wait.until(ExpectedConditions.elementToBeClickable(By.name("submit")));`                    |
| Waits until checkbox/radio button is selected.                       | `elementToBeSelected(By locator)`             | `wait.until(ExpectedConditions.elementToBeSelected(By.xpath("//input[@type='checkbox']")));` |
| Waits until an alert is present.                                     | `alertIsPresent()`                            | `wait.until(ExpectedConditions.alertIsPresent());`                                           |
| Waits until page title matches exactly.                              | `titleIs(String title)`                       | `wait.until(ExpectedConditions.titleIs("Dashboard"));`                                       |
| Waits until title contains given text.                               | `titleContains(String text)`                  | `wait.until(ExpectedConditions.titleContains("Dashboard"));`                                 |
| Waits until URL matches exactly.                                     | `urlToBe(String url)`                         | `wait.until(ExpectedConditions.urlToBe("https://example.com"));`                             |
| Waits until URL contains substring.                                  | `urlContains(String text)`                    | `wait.until(ExpectedConditions.urlContains("dashboard"));`                                   |
| Waits for frame to be available and switches to it.                  | `frameToBeAvailableAndSwitchToIt(By locator)` | `wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.name("frame1")));`         |
| Waits until element disappears.                                      | `invisibilityOfElementLocated(By locator)`    | `wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("loader")));`              |

```java
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import java.time.Duration;
import java.util.NoSuchElementException;

public class FluentWaitSimpleExample {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://example.com");

        // Create FluentWait
        FluentWait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(20))       // Maximum time to wait
                .pollingEvery(Duration.ofSeconds(2))       // Check every 2 seconds
                .ignoring(NoSuchElementException.class);   // Ignore exception

        // Use FluentWait with ExpectedConditions
        WebElement username = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("username"))
        );

        username.sendKeys("Admin");
        driver.quit();
    }
}

```

I implemented FluentWait in my framework mainly to handle elements that take unpredictable time to load. I created a FluentWait object on the WebDriver where I set the maximum timeout, the polling frequency, and the exceptions to ignore like NoSuchElementException. After that, I used the wait with ExpectedConditions, for example waiting until an element becomes visible before interacting with it. To make it reusable, I wrapped this logic inside a utility method so that instead of writing the FluentWait code every time, I could simply call the method in my test scripts. This made the framework more reliable and easier to maintain.



WebDriverWait in Selenium is a type of explicit wait that helps in handling synchronization between the script and the application. It allows us to wait for specific conditions such as an element becoming clickable, visible, or an alert being present. WebDriverWait keeps checking for the condition at regular intervals until the maximum time is reached. If the condition is met before the time ends, execution continues immediately, otherwise it throws a TimeoutException. This makes WebDriverWait more reliable than implicit wait, since it targets particular elements or conditions instead of applying a general wait to all elements.

```java 
// Create WebDriverWait object with max 10 seconds wait
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

// Wait until login button is clickable
WebElement loginBtn = wait.until(ExpectedConditions.elementToBeClickable(By.id("login")));
loginBtn.click();


``` 

I created a WebDriverWait object with a defined timeout, and then used it with ExpectedConditions, like waiting for an element to be clickable, visible, or for an alert to appear. To avoid repeating the same wait code across different tests, I wrote reusable utility methods where I passed the locator and condition, and the method returned the element once it was ready. This approach made the tests more stable and reduced flaky failures
WebDriverWait.



20 Assertion

Assertion in testing is a way to verify that the actual result of the application matches the expected result. In Selenium automation, we use assertions to check conditions like page titles, element visibility, text values, or messages. If the assertion passes, the test continues; if it fails, the test is marked as failed. Assertions basically help us confirm whether the application is working as expected.

In my framework, I used assertions to validate whether the actual behavior of the application matches the expected result. For example, I used assertions to check if a page title is correct after login, if a success message appears after submitting a form, or if an element is displayed on the screen. I mostly worked with hard assertions, where the test fails immediately if the condition is not met, but I also used soft assertions when I wanted to continue the execution and collect multiple failures in a single test run. By using assertions properly, I made sure the automation scripts were not only performing actions but also verifying outcomes, which improved the reliability of the tests.

There are two types of assertions – Hard Assertion and Soft Assertion. Hard assertions stop the test execution immediately when a validation fails, while soft assertions allow the test to continue even after a failure and finally collect all the results when we call assertAll(). The commonly used hard assertion methods like assertEquals, assertTrue, assertFalse are static methods from the TestNG Assert class, which means we can call them directly without creating an object. On the other hand, soft assertions are non-static because we need to create an object of the SoftAssert class to use them, and then finally call assertAll() to validate all collected results. In my framework, I mainly used hard assertions for critical checks like login or navigation validation, and soft assertions when verifying multiple UI elements on the same page without stopping at the first failure.

✅ Hard Assertion Example (Static methods)

```java
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionExample {

    @Test
    public void testPageTitle() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        String actualTitle = driver.getTitle();
        String expectedTitle = "Google";

        // Hard Assertion (static methods)
        Assert.assertEquals(actualTitle, expectedTitle, "Title mismatch!");
        Assert.assertTrue(actualTitle.contains("Google"), "Title not correct!");

        driver.quit();
    }
}

```
✅ Soft Assertion Example (Non-static methods)
```java

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionExample {

    @Test
    public void testPageTitleWithSoftAssert() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        String actualTitle = driver.getTitle();

        SoftAssert softAssert = new SoftAssert();

        // Soft Assertions (non-static methods)
        softAssert.assertEquals(actualTitle, "Google Home", "Title mismatch!");
        softAssert.assertTrue(actualTitle.contains("Search"), "Title does not contain 'Search'");

        System.out.println("Even if above assertions fail, this line will still execute.");

        driver.quit();

        // Collect all results at the end
        softAssert.assertAll();
    }
}
```
Methods


| Method                                     | Usage Example                              | Meaning & Explanation                                                                                                                         |
| ------------------------------------------ | ------------------------------------------ | --------------------------------------------------------------------------------------------------------------------------------------------- |
| `Assert.assertEquals(actual, expected)`    | `Assert.assertEquals(title, "Dashboard");` | Passes if both values are equal. Useful for validating page titles, success messages, or API responses.                                       |
| `Assert.assertNotEquals(actual, expected)` | `Assert.assertNotEquals(status, "Error");` | Passes if both values are not equal. Example: validating status should not return `"Error"`.                                                  |
| `Assert.assertTrue(condition)`             | `Assert.assertTrue(isDisplayed);`          | Passes if condition is true. Mostly used to check if an element is visible, enabled, or condition holds true.                                 |
| `Assert.assertFalse(condition)`            | `Assert.assertFalse(isEnabled);`           | Passes if condition is false. Example: verifying a button should be disabled before form submission.                                          |
| `Assert.assertNull(object)`                | `Assert.assertNull(obj);`                  | Passes if object is null. Used when expecting that an object should not be initialized, e.g., a failed login shouldn’t return a user session. |
| `Assert.assertNotNull(object)`             | `Assert.assertNotNull(driver);`            | Passes if object is not null. Example: checking driver/session is active or an element was successfully found.                                |
| `Assert.fail()`                            | `Assert.fail("Forcefully failing test");`  | Forces a test failure regardless of condition. Useful when you want to stop test execution deliberately on critical errors.                   |
| `SoftAssert.assertAll()`                   | `softAssert.assertAll();`                  | Collects results of all soft assertions and reports them together at the end. Without calling this, failures will be ignored.                 |




21 ACTIONS 

The Action Class in Selenium is a special utility provided in the org.openqa.selenium.interactions package that allows us to handle complex user interactions such as mouse hover, drag and drop, right click, double click, click and hold, releasing a key, or sending multiple key combinations. While methods like click() and sendKeys() work for simple operations, many real-time scenarios need advanced interactions, like hovering over a menu to see sub-options, dragging an item from one section to another, or simulating keyboard shortcuts like Ctrl + A or Ctrl + C. For this, we create an Actions object, pass the WebDriver instance, and then use the required method, followed by .perform() to execute.

Difference between Action Class and Robot Class

Action Class is a Selenium-specific class. It is designed to interact inside the browser (DOM elements). It can simulate mouse and keyboard actions on web elements like buttons, textboxes, frames, or menus.

Robot Class, on the other hand, belongs to the Java AWT (Abstract Window Toolkit) package. It is used to handle native system events like file upload pop-ups, keyboard shortcuts, or taking screenshots. Robot works outside the browser as well, because it directly interacts with the Operating System level.

Example: If you want to handle a file upload window (which Selenium cannot directly access since it’s a Windows pop-up), you’d use Robot Class. But if you want to drag and drop an element on a webpage, you’d use Action Class.

👉 In simple words:

Action Class = Browser level interactions (DOM/Web elements)

Robot Class = System level interactions (OS pop-ups, file dialogs, etc.)




| Method                                                | Description                                                | Example                                                                     |
| ----------------------------------------------------- | ---------------------------------------------------------- | --------------------------------------------------------------------------- |
| `click()`                                             | Clicks on the current mouse location                       | `act.click().perform();`                                                    |
| `click(WebElement element)`                           | Clicks on a specific element                               | `act.click(button).perform();`                                              |
| `doubleClick()`                                       | Double clicks at current mouse location                    | `act.doubleClick().perform();`                                              |
| `doubleClick(WebElement element)`                     | Double clicks on an element                                | `act.doubleClick(button).perform();`                                        |
| `contextClick()`                                      | Right click at current mouse location                      | `act.contextClick().perform();`                                             |
| `contextClick(WebElement element)`                    | Right click on an element                                  | `act.contextClick(button).perform();`                                       |
| `moveToElement(WebElement element)`                   | Moves mouse to an element (hover)                          | `act.moveToElement(menu).perform();`                                        |
| `moveByOffset(int x, int y)`                          | Moves mouse by x,y offset                                  | `act.moveByOffset(50, 100).perform();`                                      |
| `dragAndDrop(source, target)`                         | Drag source element and drop on target                     | `act.dragAndDrop(source, target).perform();`                                |
| `dragAndDropBy(source, xOffset, yOffset)`             | Drag element by x,y offset                                 | `act.dragAndDropBy(source, 100, 50).perform();`                             |
| `keyDown(Keys key)`                                   | Press a key (like Ctrl, Shift)                             | `act.keyDown(Keys.CONTROL).perform();`                                      |
| `keyUp(Keys key)`                                     | Release a key                                              | `act.keyUp(Keys.CONTROL).perform();`                                        |
| `sendKeys(CharSequence keys)`                         | Type keys at current focus                                 | `act.sendKeys("Hello").perform();`                                          |
| `sendKeys(WebElement element, CharSequence keys)`     | Type keys into an element                                  | `act.sendKeys(inputBox, "Hello").perform();`                                |
| `clickAndHold()`                                      | Click and hold at current mouse location                   | `act.clickAndHold().perform();`                                             |
| `clickAndHold(WebElement element)`                    | Click and hold on an element                               | `act.clickAndHold(element).perform();`                                      |
| `release()`                                           | Release mouse button at current location                   | `act.release().perform();`                                                  |
| `pause(Duration duration)`                            | Pause between actions                                      | `act.pause(Duration.ofSeconds(2)).perform();`                               |
| `build()`                                             | Builds the sequence of actions                             | `act.moveToElement(el).click().build().perform();`                          |
| `scrollToElement(WebElement element)`                 | Scrolls the page until the element is visible              | `act.scrollToElement(footer).perform();`                                    |
| `scrollByAmount(int x, int y)`                        | Scrolls by x (horizontal) and y (vertical) offset          | `act.scrollByAmount(0, 500).perform();`                                     |
| `scrollFromOrigin(ScrollOrigin origin, int x, int y)` | Scrolls from a defined origin (element/viewport) by offset | `act.scrollFromOrigin(ScrollOrigin.fromElement(header), 0, 300).perform();` |



 ```java
package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassDemo {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/simple_context_menu.html"); // demo site

        Actions act = new Actions(driver);

        // 1. Mouse Hover
        WebElement hoverMenu = driver.findElement(By.xpath("//a[contains(text(),'Selenium')]"));
        act.moveToElement(hoverMenu).perform();
        System.out.println("Hovered over Selenium menu");

        // 2. Right Click (Context Click)
        WebElement rightClickBtn = driver.findElement(By.xpath("//span[text()='right click me']"));
        act.contextClick(rightClickBtn).perform();
        System.out.println("Performed right click");

        // 3. Double Click
        WebElement doubleClickBtn = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
        act.doubleClick(doubleClickBtn).perform();
        System.out.println("Performed double click");
        driver.switchTo().alert().accept();

        // 4. Drag and Drop
        driver.get("https://demoqa.com/droppable"); // another demo site
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));
        act.dragAndDrop(source, target).perform();
        System.out.println("Performed drag and drop");

        // 5. Click and Hold + Release
        act.clickAndHold(source).moveToElement(target).release().perform();
        System.out.println("Click and hold performed");

        // 6. Send Keys with Modifier
        driver.get("https://www.google.com");
        WebElement searchBox = driver.findElement(By.name("q"));
        act.keyDown(searchBox, org.openqa.selenium.Keys.SHIFT)
                .sendKeys("selenium actions class")
                .keyUp(org.openqa.selenium.Keys.SHIFT)
                .perform();
        System.out.println("Typed text in uppercase using SHIFT key");

        // 7. Move By Offset (e.g., moving cursor)
        act.moveByOffset(100, 200).perform();
        System.out.println("Moved mouse by offset");

        // Close browser
        driver.quit();
    }
}



```
22 JAVASCRIPT EXECUTOR

JavaScript Executor in Selenium is an interface that lets us run JavaScript code directly inside the browser. Normally, we rely on WebDriver methods like click() and sendKeys() to interact with elements, but sometimes these methods fail. For example, if an element is hidden behind another element, overlapped by a pop-up, not yet in the visible viewport, or dynamically loaded after AJAX calls, the normal WebDriver methods may throw exceptions like ElementNotInteractableException or ElementClickInterceptedException. In such cases, JavaScript Executor comes to the rescue because it interacts directly with the DOM rather than relying only on Selenium’s native methods.

Technically, WebDriver is cast to the JavascriptExecutor interface, and then we can call two main methods: executeScript() for synchronous execution and executeAsyncScript() for asynchronous execution. With this, we can perform actions such as clicking on elements, entering values into input fields, scrolling up and down, scrolling an element into view, generating alerts, highlighting elements for debugging, or even retrieving information like page title, URL, or inner text.


```java
package seleniumDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class JavaScriptExecutorDemo {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://example.com");  // Replace with real app URL

        JavascriptExecutor js = (JavascriptExecutor) driver;

        // 1. Get Page Title
        String title = (String) js.executeScript("return document.title;");
        System.out.println("Page Title: " + title);

        // 2. Click element using JS
        WebElement button = driver.findElement(By.id("submitBtn"));
        js.executeScript("arguments[0].click();", button);
        System.out.println("Clicked on Submit button using JS");

        // 3. Enter text into input box using JS
        WebElement inputBox = driver.findElement(By.id("username"));
        js.executeScript("arguments[0].value='Saddam';", inputBox);
        System.out.println("Entered text into Username field using JS");

        // 4. Scroll to specific element
        WebElement footer = driver.findElement(By.id("footer"));
        js.executeScript("arguments[0].scrollIntoView(true);", footer);
        System.out.println("Scrolled to footer");

        // 5. Scroll to bottom of the page
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        System.out.println("Scrolled to bottom of page");

        // 6. Highlight an element (useful for debugging)
        WebElement loginBtn = driver.findElement(By.id("loginBtn"));
        js.executeScript("arguments[0].setAttribute('style','border:3px solid red; background:yellow');", loginBtn);
        System.out.println("Highlighted login button");

        // 7. Get URL and Domain using JS
        String url = (String) js.executeScript("return document.URL;");
        String domain = (String) js.executeScript("return document.domain;");
        System.out.println("Current URL: " + url);
        System.out.println("Domain: " + domain);

        // 8. Show an alert popup
        js.executeScript("alert('Automation Test Completed Successfully!');");
        Thread.sleep(2000); // wait to see alert
        driver.switchTo().alert().accept();

        // Close browser
        driver.quit();
    }
}


```
| Method                                                                                  | Description                        | Example                                                                                |
| --------------------------------------------------------------------------------------- | ---------------------------------- | -------------------------------------------------------------------------------------- |
| `executeScript("arguments[0].click();", element)`                                       | Click an element <br> using JS     | `js.executeScript("arguments[0].click();", button);`                                   |
| `executeScript("arguments[0].value='text';", element)`                                  | Enter text <br> into a field       | `js.executeScript("arguments[0].value='Saddam';", inputBox);`                          |
| `executeScript("return arguments[0].value;", element)`                                  | Get the value <br> of an input     | `String val = (String) js.executeScript("return arguments[0].value;", inputBox);`      |
| `executeScript("window.scrollBy(x, y)");`                                               | Scroll the page <br> by x,y pixels | `js.executeScript("window.scrollBy(0, 500)");`                                         |
| `executeScript("window.scrollTo(0, document.body.scrollHeight);");`                     | Scroll to the <br> bottom of page  | `js.executeScript("window.scrollTo(0, document.body.scrollHeight);");`                 |
| `executeScript("arguments[0].scrollIntoView(true);", element);`                         | Scroll until <br> element visible  | `js.executeScript("arguments[0].scrollIntoView(true);", myElement);`                   |
| `executeScript("return document.title;");`                                              | Get page <br> title                | `String title = (String) js.executeScript("return document.title;");`                  |
| `executeScript("return document.readyState;");`                                         | Get page load <br> state           | `String state = (String) js.executeScript("return document.readyState;");`             |
| `executeScript("return document.domain;");`                                             | Get domain <br> name               | `String domain = (String) js.executeScript("return document.domain;");`                |
| `executeScript("return document.URL;");`                                                | Get current <br> URL               | `String url = (String) js.executeScript("return document.URL;");`                      |
| `executeScript("history.back();");`                                                     | Navigate <br> back                 | `js.executeScript("history.back();");`                                                 |
| `executeScript("history.forward();");`                                                  | Navigate <br> forward              | `js.executeScript("history.forward();");`                                              |
| `executeScript("arguments[0].setAttribute('style','border:2px solid red');", element);` | Highlight element <br> with border | `js.executeScript("arguments[0].setAttribute('style','border:2px solid red');", btn);` |
| `executeScript("alert('Hello World!');");`                                              | Display <br> alert popup           | `js.executeScript("alert('Hello World!');");`                                          |
| `executeScript("arguments[0].disabled=false;", element);`                               | Enable a <br> disabled element     | `js.executeScript("arguments[0].disabled=false;", inputBox);`                          |
| `executeScript("return navigator.userAgent;");`                                         | Get browser <br> details (agent)   | `String ua = (String) js.executeScript("return navigator.userAgent;");`                |




23. Switch to Window / Switch to Tab in Selenium


In Selenium, a window or tab represents a separate browser instance or page that opens while interacting with the application. When a new window or tab is opened, Selenium by default continues to point to the parent window, and it cannot directly interact with elements in the newly opened window. If you try to locate elements without switching, Selenium will throw a NoSuchElementException. To work with elements inside another window or tab, you must first switch the driver’s focus from the parent window to the desired child window using driver.switchTo().window(windowHandle). Once the focus is switched, you can interact with the elements inside that window normally. After completing the operations, it is important to switch back to the parent window using driver.switchTo().window(parentHandle) to continue working on the original page.

Selenium provides getWindowHandle() to fetch the unique ID (handle) of the current window and getWindowHandles() to fetch all opened window handles. By looping through these handles, we can switch to the required window or tab. Once the work is completed, we can switch back to the parent window or continue working in the newly focused window.


```java

// Store the current (parent) window
String parentWindow = driver.getWindowHandle();

// Perform action that opens a new window/tab
driver.findElement(By.linkText("New Tab")).click();

// Get all window handles
Set<String> allWindows = driver.getWindowHandles();

// Switch to the child window
for (String window : allWindows) {
    if (!window.equals(parentWindow)) {
        driver.switchTo().window(window);
        break;
    }
}

// Now driver is focused on the child window
System.out.println("Child window title: " + driver.getTitle());

// Switch back to parent window
driver.switchTo().window(parentWindow);
System.out.println("Parent window title: " + driver.getTitle());
```

24 FRAME

In Selenium, a frame (or iframe) is an HTML document that is embedded inside another web page. It acts like a separate webpage within the main page. Elements inside a frame are not part of the main DOM, which means Selenium cannot access them directly. If you try to locate an element inside a frame without switching, Selenium will throw a NoSuchElementException. To work with these elements, you must first switch the driver’s focus from the main page to the desired frame using methods like driver.switchTo().frame(). Once the focus is on the frame, you can locate and interact with elements inside it as usual. After completing the operations, it is important to switch back to the default content using driver.switchTo().defaultContent() to continue interacting with elements on the main page.

Selenium provides three ways to switch into a frame: by using the index of the frame, by using the name or ID attribute of the frame, or by using the WebElement of the frame. Once the work inside the frame is completed, we can switch back either to the parent frame or directly to the main page (default content).


| **Way to Switch**        | **Code Example**                                                                                                                 | **Explanation**                                                                                     |
| ------------------------ | -------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| **By Index**             | `driver.switchTo().frame(0);`                                                                                                    | Switches to the first frame on the page (index starts from 0). Useful when frame has no name or ID. |
| **By Name or ID**        | `driver.switchTo().frame("frameName");`                                                                                          | Switches to a frame using its `name` or `id` attribute.                                             |
| **By WebElement**        | `WebElement frameElement = driver.findElement(By.xpath("//iframe[@id='myFrame']"));`<br>`driver.switchTo().frame(frameElement);` | Locates the frame as a WebElement and switches to it. Useful when the frame has dynamic attributes. |
| **Back to Parent Frame** | `driver.switchTo().parentFrame();`                                                                                               | Moves one level up to the immediate parent frame.                                                   |
| **Back to Main Page**    | `driver.switchTo().defaultContent();`                                                                                            | Exits all frames and switches back to the main page.                                                |


```java

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandlingDemo {

    public static void main(String[] args) throws InterruptedException {
        // Set up ChromeDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Open a sample page with frames
        driver.get("https://the-internet.herokuapp.com/iframe");

        // --- Switch by Index ---
        driver.switchTo().frame(0);  // switching to first frame
        System.out.println("Switched to frame by Index.");
        driver.switchTo().defaultContent();  // back to main page

        // --- Switch by Name or ID ---
        driver.switchTo().frame("mce_0_ifr"); // switching by frame name/id
        System.out.println("Switched to frame by Name/ID.");
        driver.switchTo().defaultContent();

        // --- Switch by WebElement ---
        WebElement frameElement = driver.findElement(By.id("mce_0_ifr"));
        driver.switchTo().frame(frameElement);
        System.out.println("Switched to frame by WebElement.");

        // --- Switch back to Parent Frame ---
        driver.switchTo().parentFrame();
        System.out.println("Switched back to Parent Frame.");

        // --- Switch back to Main Page ---
        driver.switchTo().defaultContent();
        System.out.println("Switched back to Main Page.");

        // Close the browser
        driver.quit();
    }
}

```

25 Database

A database is an organized collection of data where information is stored in a structured way so that it can be easily managed and retrieved when needed. In simple terms, it is the backend of an application where all the records, such as user details, transactions, or product information, are saved. We use a database because it allows applications to handle large amounts of data efficiently, ensures accuracy and consistency, and makes it possible to quickly fetch or update information whenever required.

In my framework, we had a DatabaseUtility class to interact with the database whenever required. Instead of writing connection code every time, we used this utility. For example, if I wanted to verify whether data entered from the UI is correctly stored in the backend database, I would use the executeConSelectQuery method to fetch the data and compare it with expected values. Similarly, in some test cases, we used non-select queries to update or insert test data directly into the DB before running UI tests. After every operation, I made sure to close the database connection using the closeDbconnection() method to avoid memory issues


I created a DataBaseUtility class to centralize and reuse all database operations in the framework. Inside it, I maintain a Connection object and register the MySQL driver using DriverManager. For connections, I wrote two methods: one getDbConnection(url, user, pass) to connect dynamically with parameters, and another overloaded getDbConnection() with default project credentials for quick access. To manage resources, I added a closeDbconnection() method to close the connection safely. For queries, I built executeSelectQuery(String) to run SELECT statements and return a ResultSet, and executeNonSelectQuery(String) to handle INSERT, UPDATE, or DELETE queries and return the number of affected rows. In my tests, I used these methods to cross-check whether data entered through the UI was correctly stored in the database, and also to prepare or clean test data. This approach made the framework more modular, reusable, and easy to maintain.

```java
package com.comcast.crm.Genric.DatabaseUtility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class DataBaseUtility {

	Connection conn;

	public void getDbConnection(String url, String username, String passsword) throws SQLException {
		try {
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			conn = DriverManager.getConnection(url, username, passsword);

		} catch (Exception e) {

		}

	}

	public void getDbConnection() throws SQLException {
		try {
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);

			conn = DriverManager.getConnection("jdbc:mysql://49.249.28.218:3333/ninza_hrm", "root", "root");
		} catch (Exception e) {

		}

	}

	public void closeDbconnection() throws SQLException {
		try {
			conn.close();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public ResultSet executeSelectQuery(String query) throws Throwable {
		ResultSet result = null;
		try {
			Statement stat = conn.createStatement();
			result = stat.executeQuery(query);

		} catch (Exception e) {
			// TODO: handle exception
		}
		return result;

	}

	public int executeNonSelectQuery(String query) throws Throwable {
		int result = 0;
		try {
			Statement stat = conn.createStatement();
			result = stat.executeUpdate(query);

		} catch (Exception e) {
			// TODO: handle exception
		}
		return result;

	}

}

```
| **Code Part**                                          | **Type**                      | **Usage / Role**                                                                 |
| ------------------------------------------------------ | ----------------------------- | -------------------------------------------------------------------------------- |
| `public class DataBaseUtility`                         | Class                         | Utility class that provides methods to interact with the database.               |
| `Connection conn;`                                     | Variable (Object)             | Holds the active database connection.                                            |
| `Driver driver = new Driver();`                        | Class (from MySQL)            | MySQL JDBC driver class used to establish a connection between Java and DB.      |
| `DriverManager.registerDriver(driver)`                 | Method (DriverManager class)  | Registers the JDBC driver so Java knows which DB driver to use.                  |
| `DriverManager.getConnection(...)`                     | Method (DriverManager class)  | Establishes the connection to the database using URL, username, and password.    |
| `Statement stat = conn.createStatement();`             | Method (Connection interface) | Creates a SQL statement object to send queries to the database.                  |
| `stat.executeQuery(query)`                             | Method (Statement interface)  | Executes **SELECT queries** and returns a `ResultSet` containing data.           |
| `stat.executeUpdate(query)`                            | Method (Statement interface)  | Executes **INSERT, UPDATE, DELETE queries** and returns number of rows affected. |
| `ResultSet result`                                     | Interface                     | Stores the output (table data) from SELECT queries.                              |
| `public void getDbConnection(...)`                     | Method                        | Opens DB connection using parameters (URL, username, password).                  |
| `public void getDbConnection()`                        | Method (Overloaded)           | Opens DB connection using hardcoded values.                                      |
| `public void closeDbconnection()`                      | Method                        | Closes the connection safely after operations.                                   |
| `public ResultSet executeConSelectQuery(String query)` | Method                        | Runs SELECT queries and returns data in `ResultSet`.                             |
| `public int executeNonSelectQuery(String query)`       | Method                        | Runs INSERT/UPDATE/DELETE and returns row count affected.                        |



## 26 Types of execution

## Group execution

Group execution in TestNG means organizing test cases into logical categories such as smoke, regression, or sanity, so that we can run them selectively instead of executing the entire suite every time. To achieve this, we assign tests to groups using the @Test(groups = "groupName") annotation. Later, in the testng.xml file, we can configure groups to include or exclude specific ones depending on our requirement. For example, if we only want to run smoke tests before a release, we can include only the smoke group in the XML. This approach gives flexibility, saves execution time, and avoids unnecessary running of the full suite. The line <class name="packageName.ClassName"/> is also correct, because in the XML we specify which test classes to execute, and inside that configuration, we can further control the execution by including or excluding groups.

```java

// Class 1
package tests;

import org.testng.annotations.Test;

public class LoginTest {

    @Test(groups = "smoke")
    public void validLogin() {
        System.out.println("Smoke: Valid login test executed");
    }

    @Test(groups = "regression")
    public void invalidLogin() {
        System.out.println("Regression: Invalid login test executed");
    }
}



// Class 2
package tests;

import org.testng.annotations.Test;

public class PaymentTest {

    @Test(groups = "smoke")
    public void paymentWithValidCard() {
        System.out.println("Smoke: Payment with valid card executed");
    }

    @Test(groups = "regression")
    public void paymentWithInvalidCard() {
        System.out.println("Regression: Payment with invalid card executed");
    }
}

```xml

<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">

<suite name="Suite">

    <groups>
        <run>
            <include name="smoke"/>
        </run>
    </groups>

    <test name="GroupExecution">
        <classes>
            <class name="com.project.tests.LoginTest"/>
            <class name="com.project.tests.PaymentTest"/>
        </classes>
    </test>

</suite>

```
## 2 Batch execution

Batch execution in TestNG means executing multiple test classes or test cases together in one go, rather than running them individually. This approach is very useful when you have a large test suite with different modules like login, payment, orders, or profile. Instead of manually running each test, you group them into a single batch and run them all at once. This saves time, ensures consistency, and helps in identifying integration issues quickly.

In TestNG, batch execution is usually achieved using the testng.xml file, where we can define multiple test classes under a <classes> tag or multiple <test> sections for different modules. For example, we can include LoginTest, PaymentTest, and OrderTest in the XML so that TestNG runs all of them together in a batch. This makes execution more organized and allows us to manage large-scale automation projects effectively.

```xml

<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">

<suite name="Suite">
    <test name="BatchExecution">
        <classes>
            <class name="com.project.tests.LoginTest"/>
            <class name="com.project.tests.PaymentTest"/>
            <class name="com.project.tests.ProfileTest"/>
        </classes>
    </test>
</suite>

```
## 3 Parallel execution

Parallel execution in TestNG means running multiple tests, classes, or methods at the same time in separate threads instead of one after another. This is very useful when you have a large test suite, because it significantly reduces the overall execution time and makes better use of system resources. For example, if you have 10 test classes and you configure TestNG to run them in parallel, instead of waiting for each class to finish before starting the next, TestNG will launch multiple tests simultaneously.

The thread-count attribute in TestNG controls how many threads (parallel executions) can run at the same time. It doesn’t always have to match the number of classes, but it defines the maximum concurrency allowed. If you want all classes to run together, you should set the thread-count equal to or greater than the number of classes. For instance, if you have 5 classes and set thread-count="5", TestNG can execute all 5 classes in parallel. This gives flexibility—depending on your suite size and machine capacity, you can adjust the thread count to balance between speed and system performance.

```xml

with tests

<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">

<suite name="ParallelSuite" parallel="tests" thread-count="2">

    <test name="LoginTests">
        <classes>
            <class name="tests.LoginTest"/>
        </classes>
    </test>

    <test name="PaymentTests">
        <classes>
            <class name="tests.PaymentTest"/>
        </classes>
    </test>

</suite>

with classes

<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">

<suite name="ParallelByClassesSuite" parallel="classes" thread-count="3">

    <test name="AllTests">
        <classes>
            <class name="tests.LoginTest"/>
            <class name="tests.PaymentTest"/>
            <class name="tests.ProfileTest"/>
        </classes>
    </test>

</suite>

```
## 4 Cross browser execution

Cross-browser testing is the process of executing the same test cases on different web browsers such as Chrome, Firefox, Edge, and Safari to ensure that a web application works consistently and correctly across all of them. Since users may access the application from different browsers and versions, cross-browser testing helps identify browser-specific issues like layout mismatches, functionality errors, or performance differences. In TestNG, this can be achieved by parameterizing the browser name in the testng.xml file and using the @Parameters annotation in the test script to launch tests dynamically on different browsers. This ensures better coverage and reliability of the application in real-world usage.

```xml

<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">

<suite name="CrossBrowserSuite" parallel="tests" thread-count="2">

    <test name="ChromeTest">
        <parameter name="browser" value="chrome"/>
        <classes>
            <class name="tests.LoginTest"/>
        </classes>
    </test>

    <test name="FirefoxTest">
        <parameter name="browser" value="firefox"/>
        <classes>
            <class name="tests.LoginTest"/>
        </classes>
    </test>

</suite>
```


INTERVIEW QUESTION
## 1 GIT AND GITHUB


1 What is git and git hub.

Git is a distributed version control system. It’s mainly used to track changes in code, manage different versions of a project, and allow multiple people to work on the same codebase at the same time without conflicts.

GitHub is a cloud-based platform built on top of Git. It provides a place where we can store our code repositories online, collaborate with team members, review code through pull requests, and manage issues or tasks. Basically, Git is the version control system, and GitHub is the platform that makes collaboration and project management easier.

2 Explain your daily interaction wrt GitHub?

In my project, we follow a proper branching strategy where developers create separate branches for each new feature or bug fix. As a tester, I usually switch to those branches to test the changes in isolation before they are merged into the main codebase. This really helps in avoiding conflicts and keeps the main branch stable.

Whenever we worked on a new feature or bug fix, we created separate branches, and once the work was done, we merged them into the main branch through pull requests. During this process, I also handled conflicts when multiple people worked on the same files. Git helped us keep track of changes, roll back if something went wrong, and made collaboration between developers and testers much easier.

For example, if a developer creates a feature branch for something like a login enhancement, I pull that branch, run all my test script, and validate the functionality end to end. Once everything looks good from my side, I usually update the pull request with my testing comments so that the reviewer or team lead knows it's been tested. After that, the team lead reviews the code and merges the PR if everything is fine. This process helps us catch issues early, maintain good collaboration between dev and QA, and ensure only stable code goes into the main branch.

3 Git conflicts and how will you resolve it.

A conflict in Git occurs when two or more people (or branches) change the same lines of code in the same file and Git cannot decide which version to keep during a merge or pull operation.
A Git conflict happens when two branches change the same part of a file and Git doesn’t know which one to keep. I resolve conflicts by opening the file, checking the conflict markers, manually correcting the code, then staging and committing the resolved file
Yes, I always pull the latest code before pushing mine. This ensures I have the latest updates and helps identify any conflicts early. If a conflict arises, I resolve it locally and commit the changes before pushing.

4 Write all git bash commands and explain them or  What are the git bash command used in your project.

| **Category**         | **Command**                              | **Description**                                                |
| -------------------- | ---------------------------------------- | -------------------------------------------------------------- |
| **Repo Setup**       | `git init`                               | Initialize a new Git repository.                               |
|                      | `git clone <repo_url>`                   | Clone an existing repository.                                  |
| **Configuration**    | `git config --global user.name "Name"`   | Set username for all repos.                                    |
|                      | `git config --global user.email "Email"` | Set email for all repos.                                       |
| **Status/Info**      | `git status`                             | Show working directory status.                                 |
|                      | `git log`                                | Show commit history.                                           |
|                      | `git log --oneline --graph --all`        | Compact history in tree format.                                |
|                      | `git diff`                               | Show unstaged changes.                                         |
| **Staging & Commit** | `git add <file>`                         | Add file(s) to staging area.                                   |
|                      | `git add .`                              | Stage all changes.                                             |
|                      | `git commit -m "message"`                | Commit staged changes with message.                            |
|                      | `git commit --amend`                     | Edit last commit message or add forgotten changes.             |
| **Branching**        | `git branch`                             | List all branches.                                             |
|                      | `git branch <name>`                      | Create a new branch.                                           |
|                      | `git checkout <branch>`                  | Switch to a branch.                                            |
|                      | `git checkout -b <branch>`               | Create and switch to new branch.                               |
|                      | `git switch <branch>`                    | Switch to a branch (newer syntax).                             |
|                      | `git switch -c <branch>`                 | Create and switch to a new branch.                             |
| **Merging**          | `git merge <branch>`                     | Merge a branch into current one.                               |
|                      | `git rebase <branch>`                    | Reapply commits on top of another branch.                      |
| **Remote**           | `git remote -v`                          | Show remote repositories.                                      |
|                      | `git remote add origin <url>`            | Add remote repository.                                         |
|                      | `git push origin <branch>`               | Push branch to remote.                                         |
|                      | `git push -u origin <branch>`            | Push branch & set upstream.                                    |
|                      | `git pull`                               | Fetch and merge changes from remote.                           |
|                      | `git fetch`                              | Download changes without merging.                              |
| **Undo/Reset**       | `git reset <file>`                       | Unstage a staged file.                                         |
|                      | `git reset --hard <commit>`              | Reset repo to a specific commit (dangerous, discards changes). |
|                      | `git restore <file>`                     | Restore file from last commit.                                 |
|                      | `git revert <commit>`                    | Create a new commit that undoes changes from a commit.         |
| **Tagging**          | `git tag <name>`                         | Create a tag.                                                  |
|                      | `git tag`                                | List tags.                                                     |
|                      | `git push origin <tag>`                  | Push a tag to remote.                                          |
| **Stash**            | `git stash`                              | Save changes temporarily.                                      |
|                      | `git stash pop`                          | Reapply stashed changes.                                       |
|                      | `git stash list`                         | Show stashed changes.                                          |
| **Clean Up**         | `git branch -d <branch>`                 | Delete branch (safe).                                          |
|                      | `git branch -D <branch>`                 | Force delete branch.                                           |

5 Explain Git branching.

In Git, branching is a way to create separate lines of development within the same project. It allows multiple people to work on different features or bug fixes without affecting the main codebase.
For example, we usually have a main (or master) branch that holds the stable production code. When we want to add a new feature or make changes, we create a new branch from the main branch — say, feature/login — and work there independently.
Once the work is completed and tested, we merge the branch back into the main branch using a pull request (PR) or merge command.
This process helps in parallel development, code isolation, and easy collaboration among team members.

6 How to add master branch data to other branch

If I need to add or update the latest code from the master branch into another branch, I usually use the merge or rebase command in Git. First, I switch to the branch where I want the updates — for example, if I’m working on the feature/login branch, I check out that branch. Then I run git merge master, which brings all the latest changes from the master branch into my current branch.
Sometimes, instead of merge, I use git rebase master. Rebase is helpful when I want a cleaner and linear commit history because it applies my branch changes on top of the latest master commits.
So, in short, I use merge when I want to keep both histories and rebase when I prefer a more streamlined commit structure. Both commands help me keep my branch updated with the latest code from master.

8 How do you handle conflicts in GIT?

When a conflict happens in Git, it usually means two branches have modified the same part of a file differently. In such cases, Git can’t decide which change to keep, so I resolve it manually.
What I do is first run a pull or merge command, and when the conflict appears, Git clearly marks the conflicting sections in the file using <<<<<<, ======, and >>>>>> symbols. I open that file, review both versions of the code, and then keep or combine the correct changes as per the requirement, Once the conflict is resolved, I remove those conflict markers, save the file, and then run the commands — git add, git commit, and git push — to finalize the merge, In short, I handle Git conflicts by manually reviewing, editing, and committing the corrected code to ensure both sets of changes are properly merged.

9 Which branch the git will be by default

By default, Git creates a branch called “main” when you initialize a new repository, Earlier, the default branch used to be “master”, but now Git has changed it to “main” to follow inclusive naming conventions, So, when you run git init, Git automatically creates the main branch as the default one unless it’s configured otherwise.

10 What is git bash

Git Bash is a command-line tool that allows you to use Git commands in a Unix-like terminal on Windows, In simple terms, it provides a Linux-style command interface where you can run Git commands such as git init, git clone, git add, git commit, and many more. It also supports basic Linux commands like ls, cd, and mkdir, which makes working with Git easier for Windows users.

11 What is the process of branching in a release?

In a release process, branching helps in managing different stages of development without affecting the main code. Generally, the main or master branch holds the stable production code. When a new release is planned, a release branch is created from the main branch. This branch is used for final testing, bug fixing, and preparing the release version. Once the testing is complete and everything is stable, the release branch is merged back into the main branch for deployment and also into the develop branch (if it exists) to keep all branches up to date. This process helps in isolating release activities from ongoing development work.


11 How to revert git commit or How to revert a Git commit

If we make a wrong commit in Git, we can undo it using the git revert command. This command doesn’t delete the commit but instead creates a new commit that reverses the changes from the previous one, keeping history safe. by using git revert <commit_id>.

12 What is git add and git commit?

git add moves changes to the staging area, and git commit saves those changes permanently in the local repository with a message.

13 What is a branch in Git?

A branch is a separate line of development. It allows us to work on features or fixes independently without affecting the main code.

14 Difference between main/master branch and feature branch

The main branch contains stable production-ready code, while feature branches are used for developing new features or bug fixes.

15 How do you create and switch branches?

We create a branch using git branch branchName and switch using git checkout branchName or git switch branchName.

16 What is a merge conflict?

A merge conflict occurs when Git cannot automatically combine changes because the same file and same line were modified differently in two branches. We resolve it manually.

17 Difference between merge and rebase

Merge preserves history and creates a merge commit, while rebase rewrites commit history and makes it linear. Merge is safer for shared branches.

18 What is git pull vs git fetch?

git fetch downloads changes without merging, while git pull fetches and merges changes automatically. (just to chek git pull)

19 What is git clone?

git clone creates a local copy of a remote repository along with its history.

20 How do you undo a commit?

We can undo commits using git reset or git revert, depending on whether the commit is pushed or not.

21 Difference between git reset and git revert

git reset removes commits from history (used locally), while git revert creates a new commit that reverses changes (safe for remote repos).

22 How do you check Git history?

To check Git history, we use the git log command. It shows the commit history with details like commit ID, author, date, and commit message.
If we want a short and clean view, we use git log --oneline.

23 What is .gitignore?

.gitignore is used to prevent unwanted files like logs, screenshots, or build files from being tracked by Git.

24 What is a stash in Git?

git stash temporarily saves uncommitted changes so we can switch branches without committing.

25 What is HEAD in Git?

HEAD points to the current branch and latest commit we are working on

## 2 MAVEN

1 What is Maven and what is the use of the Maven?

Maven is a build automation and project management tool mainly used for Java projects. It helps in compiling the source code, running the tests, packaging the application, and generating reports. The main advantage of Maven is dependency management — instead of manually adding jar files, we just declare them in the pom.xml and Maven automatically downloads them from the central repository. It also follows a standard project structure and uses plugins like the Compiler plugin and Surefire plugin to handle builds and test execution. In real-time projects, we use Maven not only to run tests but also to integrate with CI/CD pipelines like Jenkins.

2 Explain Maven life cycle.

In Maven, we use different lifecycle commands. The most common ones are mvn clean to remove the target folder, mvn compile to compile the source code, mvn test to execute test cases, mvn package to build the project into a JAR or WAR, and mvn install to place the package into the local repository. We also use mvn deploy to send the build to a remote repository. Additionally, commands like mvn dependency:tree and mvn help:effective-pom are useful for debugging dependencies.

3 What is the Work process of maven.

In my experience, Maven plays a very important role in managing Java projects smoothly. It uses a configuration file called pom.xml, where we define the entire structure of the project—like its dependencies, plugins, and build steps. I mostly use it to handle all project dependencies and to automate the build process.

When I run a command like mvn clean install, Maven follows a specific lifecycle. It starts by checking the project structure, then compiles the code, runs tests, and finally packages everything into a .jar or .war file. If needed, it can also deploy the final output to a remote repository.

One thing I really like about Maven is that it takes care of downloading all required JARs from its central repository, which saves a lot of manual work and helps maintain consistency across different systems.

Overall, Maven makes project setup and builds very straightforward. It also works really well with Jenkins. In my projects, I’ve used them together in CI/CD pipelines to automate builds and run regression tests, which has made the whole process much faster and more reliable.

4  What are the Maven commands

| Phase    | Command        | Easy Meaning                   | Technical Meaning                                                                 |
| -------- | -------------- | ------------------------------ | --------------------------------------------------------------------------------- |
| Clean    | `mvn clean`    | Delete old files, start fresh. | Removes previous build outputs (e.g., `target/` folder).                          |
| Validate | `mvn validate` | Check project setup.           | Ensures project structure & config are correct.                                   |
| Compile  | `mvn compile`  | Convert code to class files.   | Compiles Java source into `.class` bytecode files.                                |
| Test     | `mvn test`     | Run tests.                     | Executes unit/automation tests (JUnit, TestNG).                                   |
| Package  | `mvn package`  | Make JAR/WAR file.             | Bundles compiled code + resources into a distributable (`.jar`, `.war`).          |
| Verify   | `mvn verify`   | Double-check build.            | Runs integration checks to ensure the package is valid.                           |
| Install  | `mvn install`  | Save build locally.            | Installs package into local Maven repo (`~/.m2`) for use in other local projects. |
| Deploy   | `mvn deploy`   | Share with team.               | Uploads package to remote repo (Nexus, Artifactory) for sharing with others.      |

5 How you will Use Maven Commands

I use Maven commands through the command prompt or terminal to perform various build-related tasks. For example, I use mvn clean to delete the target folder and remove previously compiled files, mvn compile to compile the source code, mvn test to run the test cases, mvn package to build the project into a JAR or WAR file, and mvn install to install the package into the local repository. These commands help in automating and managing the entire build and testing process efficiently.

6 What is profiling and why you have used profiling in your maven project.

Profiling in Maven is used to define different configurations for different environments like dev, test, and production within the same project. It allows us to customize settings such as URLs, database connections, or dependencies based on the environment we are working in.

I have used profiling in my Maven project to avoid manual changes in configuration files every time we switch environments. By activating the required profile using a simple command like mvn test -Pdev, the appropriate settings automatically get applied, making the build process smoother and error-free.

7 Which build tool you are using

I am using Maven as the build tool in my project. It helps in managing dependencies, building, testing, and packaging the project efficiently. Maven also automates the build process and ensures consistency across different environments. I use commands like mvn clean, mvn test, and mvn install for different stages of the build lifecycle."

8 What does mvn compile does and mvn package does.

mvn compile command compiles the source code of the project and converts the .java files into .class files inside the target folder.
mvn package command goes one step further — it compiles the code, runs the tests, and then packages the compiled code into a distributable format like a .jar or .war file inside the target folder."

9 How can we execute the testcases using maven commands

In my project, we execute the test cases using Maven commands through the Maven Surefire plugin. I usually use the command mvn test, which automatically identifies and runs all the test cases written in TestNG or JUnit. If I want to run a specific test class, I use mvn -Dtest=ClassName test, and for multiple classes, I can specify them separated by commas. This approach allows me to execute the tests directly from the command line without opening any IDE, making the process faster and more convenient during CI/CD execution.

10 What is the role of maven surefire plugin in your automation framework.

In our automation framework, the Maven Surefire Plugin plays an important role in running the test cases automatically. It’s mainly used to execute test cases written in TestNG or JUnit during the Maven build process. When we run the command like mvn test, the Surefire plugin identifies and runs all the test classes, and then it also generates detailed HTML and XML reports of the test execution.

Basically, it helps in integrating test execution with the build lifecycle — so whenever a build is triggered, the tests run automatically before deployment. This ensures that any failure is caught early in the process.


## 3 Jenkins

1 Why you use Jenkins, explain how you perform On Scheduling execution in Jenkin?


Jenkins is an open-source automation server that we used mainly for Continuous Integration and Continuous Delivery (CI/CD). In my project, we integrated Jenkins with Git and Maven. Whenever we pushed code to the repository, Jenkins automatically triggered builds, compiled the project using Maven, ran the automated test cases, and generated reports.
To schedule my test runs in Jenkins, I use the "Build Periodically" option in the job configuration.
Open Jenkins job → Configure, Check the box for “Build periodically” In the Schedule textbox,  I use Cron syntax, for example: * 10 * * 1-5


2 Jenkins configuration?


In Jenkins, Global Tool Configuration is where we define tools that can be used by all jobs across the Jenkins instance, ensuring consistency and avoiding repetitive setup for each job. To configure these tools, we first go to Manage Jenkins → Global Tool Configuration, where we can set up essential tools like JDK, Maven, Git, Gradle, and Ant. For JDK, we define a name and either provide the installation path or let Jenkins install it automatically; jobs can then select the desired JDK version during build. Similarly, for Maven, we provide the Maven version name and path, or allow automatic installation, so jobs can use the configured Maven to build Java projects. In the Git section, we specify the path to the Git executable, enabling Jenkins to clone repositories for all jobs. Optional tools like Gradle and Ant can also be configured with their paths or automatic installation if a project requires them. Once saved, these global configurations are available in all jobs’ build steps or build environments, allowing jobs to select the required tool versions without manual configuration every time. This setup simplifies project builds, maintains uniformity, and reduces configuration errors across Jenkins jobs.


3 Write a condition to execute my suite on every Sunday 3pm, in Jenkins?

* 3 * * 7 AM 
0 15 * * 7 PM

4 How you are scheduling build and if you want to schedule the build at 2pm USA timing what is the approach.

In my project, I schedule builds in Jenkins using the “Build periodically” option under the configuration section. We use a CRON expression to set the exact timing for execution. For example, if I want to schedule the build at 2 PM USA time, I first convert that time to my local server time zone — because Jenkins follows the server’s system time. Once converted, I write the corresponding CRON schedule, such as H 0 2 * * or any matching format, depending on the server location. This ensures the build automatically runs at 2 PM USA time without manual triggering. I also make sure the time zone setting in Jenkins or on the system aligns with the required region to avoid timing mismatches.

5 How you executed script in Jenkins ?

In my project, I execute automation scripts in Jenkins by integrating my testing framework, such as TestNG with Maven or Gradle. First, I configure a Jenkins job and connect it with my project’s GitHub repository so that Jenkins automatically pulls the latest code whenever a build is triggered. Then, under the Build section, I specify the Maven command like mvn clean test to execute my test scripts. I can run the job manually by clicking Build Now, or schedule it automatically using a CRON expression. Once the execution is done, Jenkins generates test reports like TestNG reports, JUnit reports, or HTML reports, which help us track the build and test results directly from the Jenkins dashboard.

6 How u will Setup Jenkins in Different Environment and How u will Use Maven commands

In my project, I set up Jenkins in different environments like QA, Staging, and Production by configuring separate Jenkins jobs for each environment. Each job has its own Git branch or configuration file pointing to the respective environment setup. For example, the QA job connects to the QA server, while the production job connects to the production environment.

In Jenkins, I integrate Maven by adding the Maven path under Global Tool Configuration. Then, inside the Jenkins job, I use Maven commands like mvn clean test, mvn package, or mvn install in the “Build” section. This allows Jenkins to automatically clean the workspace, compile the code, and execute test cases through the configured POM file. This setup helps in maintaining a continuous and automated build process across multiple environments.

7 How do you pass external data from the Jenkins

In my project, we often needed to run the same test cases in different environments or with different configurations, so we passed external data from Jenkins using parameterized builds. I usually define parameters like browser, environment, or URL in Jenkins under the “This project is parameterized” option. When we trigger the job, Jenkins allows us to enter or select those values, and then it passes them to the test execution as system properties using commands like mvn test -Dbrowser=${browser} or -Denvironment=${environment}. Inside my code, I read those values using System.getProperty() so the same script can run on different browsers or environments without changing the code.


Sometimes, we also use environment variables for fixed values like credentials or API keys, which can be accessed in code using System.getenv(). In a few cases, we also maintain external property files for large configurations and pass the file path through Jenkins. This approach makes our test execution flexible, reusable, and easily configurable directly from Jenkins.

8 Can you describe how you set up a Jenkins pipeline in your project?

Yes, I have knowledge of building a pipeline in Jenkins. In my project, I created a Jenkins pipeline using a Jenkinsfile, which defines all the stages of the automation process such as build, test, and deploy. I usually configure it in the project’s Git repository so that Jenkins automatically detects the Jenkinsfile when the job runs.

Inside the Jenkinsfile, I define different stages like “Checkout Code,” “Build using Maven,” “Run Test Cases,” and “Deploy to Server.” Each stage runs step by step, making the process transparent and easy to debug. I use declarative pipelines most of the time because they’re easier to maintain and understand.

This pipeline setup helps in achieving continuous integration and continuous deployment (CI/CD), ensuring that every code change is automatically built, tested, and deployed without manual effort.

9 How can you make a job parameterized in Jenkins

To make a job parameterized in Jenkins, I enable the “This project is parameterized” option in the job configuration. After enabling it, I can add different types of parameters like String Parameter, Boolean Parameter, Choice Parameter, or File Parameter depending on what I need.

For example, if I want to pass an environment name like “QA” or “Production” during the build, I can add a Choice Parameter with those values. Then, I can access the parameter inside the build script or Jenkinsfile using the syntax like ${PARAMETER_NAME}.

This approach makes the Jenkins job more flexible and reusable because I can run the same job for different inputs or environments without creating multiple separate jobs.

9 How to fetch the report in Jenkins.

To fetch or view reports in Jenkins, I configure post-build actions in my Jenkins job. After the test execution finishes, the reports, including ExtentReports, get generated in my project workspace. 

In Jenkins, I go to “Post-build Actions” and select “Publish HTML Reports” or “Publish JUnit test result report” depending on the type of report. I then provide the path of the report folder (for example, target/surefire-reports or test-output).

Once the build is complete, Jenkins shows an “HTML Report” link on the build page. Since ExtentReports are HTML-based, I can simply click that link to open the Extent Report directly from the Jenkins dashboard. It displays detailed information about the test execution — including pass/fail status, logs, screenshots, and test duration — all in a clean, interactive format.

10 How do you send or share test reports with developers?

In my project, once the test execution is complete, Jenkins automatically generates the test report, such as the Extent Report. I usually configure Jenkins to send an email notification to the development and QA team using the “Editable Email Notification” or “Email Extension” plugin. The report file or link (like the HTML report URL) is attached or included in the email body. This way, developers can directly open the report from their inbox and review the test results, failed test cases, and screenshots. Sometimes, if the report is large, I simply share the Jenkins build link or the Extent Report URL through our project communication channels like Slack or Microsoft Teams. This ensures developers quickly get visibility of test outcomes without manually fetching reports.

This helps to monitor build results, track failed tests, and share reports with the team easily.
It has numerous features like, Annotations, Test Prioritization, Grouping of Test Cases, Data-Driven Testing (@DataProvider), Parallel Execution, Dependency Management, Assertions (Hard & Soft) ,Test Configuration using testng.xml, Listener Support ,Retry Failed Test Cases,Parameterization

11 How do you troubleshoot Jenkins failures?

To troubleshoot Jenkins failures, I first check the console output to understand the exact error and identify where the build failed. Then I verify the environment configuration on the Jenkins agent, such as Java, Maven, browser drivers, or Appium setup, because many issues occur due to environment mismatch. I also check plugin compatibility and dependency-related issues, especially Maven dependency failures. If required, I analyze the stack trace to find the root cause of test or code failures. Additionally, I ensure that the Jenkins agent is connected and running properly. Finally, I rerun the failed job to confirm whether the failure was due to a temporary issue or a genuine problem.

12  How do you trigger a Jenkins job automatically?

Jenkins jobs can be triggered automatically in multiple ways. The most common approach is using webhooks, where tools like GitHub or GitLab notify Jenkins immediately whenever code is pushed to the repository. Another method is SCM polling, where Jenkins periodically checks the repository for changes at fixed intervals. We can also use scheduled triggers with cron expressions to run jobs at specific times, such as nightly or weekly builds. In real projects, webhooks are preferred because they are faster and more efficient than polling.

13 How do you integrate Git with Jenkins?

To integrate Git with Jenkins, we first install and configure the Git plugin in Jenkins. Then, we create a Jenkins job or pipeline and provide the Git repository URL where the source code is stored. If the repository is private, we add the required credentials such as username/password or SSH key using Jenkins Credentials Manager and link them to the job securely. After configuring the repository, we set up build triggers like Git webhooks or SCM polling so that Jenkins automatically pulls the latest code whenever changes are pushed. During job execution, Jenkins checks out the code from Git and performs the configured build and test steps, such as running Maven commands for automation. This integration enables continuous integration by ensuring that every code change is automatically built and tested.

14  Difference between Poll SCM and Webhook?

Poll SCM works by Jenkins periodically checking the source code repository at fixed intervals to detect any changes, which can consume more system resources and may cause delays. Webhooks, on the other hand, are event-driven, where the repository immediately notifies Jenkins whenever a code change is pushed. Because of this, webhooks are faster, more efficient, and preferred in real projects compared to SCM polling.

15 How do you publish test reports in Jenkins?

In Jenkins, I publish test reports using Extent Reports generated in HTML format. During test execution, the automation framework generates an Extent HTML report in a specific directory, usually inside the project workspace. After the tests are completed, Jenkins is configured to archive the HTML report using the HTML Publisher Plugin.

In the Jenkins job or Jenkinsfile, I specify the report path, report name, and index file (for example, index.html). Once the build finishes, Jenkins displays a direct link to the Extent HTML report on the job dashboard.

This approach helps stakeholders easily view detailed test execution results, including pass/fail status, screenshots on failure, logs, and execution steps, without downloading any files. Using Extent HTML reports improves visibility, debugging, and reporting quality in CI pipelines.

16 How do you handle failed builds in Jenkins?

In Jenkins, I handle failed builds by first analyzing the console output and logs to identify the exact reason for failure, such as test failures, compilation errors, environment issues, or dependency problems. I configure Jenkins to mark the build as FAILED when any critical stage does not pass.

In my projects, I also set up notifications (email or Slack) so the team is immediately informed when a build fails. For unstable or flaky tests, I use retry logic at the test or pipeline level to re-execute failed tests. Additionally, I capture screenshots, logs, and Extent HTML reports for failed test cases to make debugging easier.

After fixing the issue, I re-run the build to verify the fix. This structured approach helps reduce downtime, improves build stability, and ensures quick resolution of failures in the CI/CD pipeline.


## 4 TestNg

1 What is testNg

TestNG is a powerful testing framework in Java that is inspired by JUnit and NUnit, but it provides more advanced features for organizing, managing, and running automated tests efficiently. The term “NG” stands for “Next Generation.” It is widely used in automation testing, especially with Selenium and API testing using REST Assured. TestNG allows testers to create a well-structured test suite by using annotations like @Test, @BeforeMethod, @AfterMethod, @BeforeClass, and @AfterClass to control the flow of test execution. One of the biggest advantages of TestNG is that it supports parallel execution, data-driven testing (through @DataProvider), and dependency testing (using dependsOnMethods or dependsOnGroups). It also allows grouping of test cases and prioritizing them, which helps in managing large test suites. TestNG automatically generates detailed HTML and XML reports after execution, making it easy to analyze test results. Overall, TestNG improves test efficiency, flexibility, and maintainability in automation frameworks.

2 Why we use testNg in automation.

We use TestNG in automation because it helps organize, manage, and execute test cases in a structured and efficient way. It provides several powerful features that make automation testing easier and more flexible compared to using plain Java. With TestNG, we can control the order of test execution, group related test cases, and even make one test depend on another using annotations like @Test, @BeforeMethod, and @AfterMethod. It also supports data-driven testing using the @DataProvider annotation, allowing the same test to run with multiple sets of data. Another key reason we use TestNG is for parallel execution, which helps save time by running multiple tests simultaneously. After execution, it automatically generates detailed HTML and XML reports, showing passed, failed, and skipped tests clearly. In short, TestNG makes automation testing more organized, reusable, and easier to maintain.

3 How do annotations works?

TestNG annotations work by controlling the order and flow of test execution automatically. When we run a TestNG test class or suite, the framework reads the annotations defined above each method — like @BeforeSuite, @BeforeClass, @Test, and so on — and determines which methods should execute first and which should follow. This means we don’t have to manually call methods; TestNG handles the sequence internally. For example, setup methods such as @BeforeSuite or @BeforeClass run before the actual test methods to prepare the environment, while cleanup methods like @AfterMethod or @AfterSuite run after the test completes to close the browser or generate reports. Internally, TestNG uses Java reflection to identify these annotations and manage execution automatically. This makes test execution structured, repeatable, and easy to maintain, especially when working on large automation frameworks.

4 What are annotations are there in there testing


| #  | Annotation                  | Description                                                               |
| -- | --------------------------- | ------------------------------------------------------------------------- |
| 1  | @BeforeSuite                | Runs before all tests in the suite.                                       |
| 2  | @AfterSuite                 | Runs after all tests in the suite.                                        |
| 3  | @BeforeTest                 | Runs before `<test>` tag in testng.xml.                                   |
| 4  | @AfterTest                  | Runs after `<test>` tag in testng.xml.                                    |
| 5  | @BeforeClass                | Runs once before the first method in the current class.                   |
| 6  | @AfterClass                 | Runs once after all test methods in the current class.                    |
| 7  | @BeforeMethod               | Runs before each test method.                                             |
| 8  | @AfterMethod                | Runs after each test method.                                              |
| 9  | @Test                       | Marks a method as a test case.                                            |
| 10 | @DataProvider               | Provides data to test methods (used for data-driven testing).             |
| 11 | @Parameters                 | Passes parameters from testng.xml to test methods.                        |
| 12 | @BeforeGroups               | Runs before the first method in a specified group.                        |
| 13 | @AfterGroups                | Runs after all methods in a specified group have run.                     |
| 14 | @Factory                    | Used to execute a set of test classes dynamically.                        |
| 15 | @Listeners                  | Used to define listener classes (like ITestListener, ISuiteListener).     |
| 16 | @Ignore                     | Ignores a test method or class (alternative is `enabled=false` in @Test). |
| 17 | @Test(invocationCount=…)    | Runs the same test multiple times.                                        |
| 18 | @Test(priority=…)           | Defines execution order of test methods.                                  |
| 19 | @Test(dependsOnMethods=…)   | Makes one test dependent on another test.                                 |
| 20 | @Test(expectedExceptions=…) | Defines exceptions a test method is expected to throw.                    |




5 What is dependsOn.

In TestNG, the dependsOn keyword is used when one test method depends on the successful execution of another. For example, if I have a test for login and another for booking, I can make the booking test depend on the login test. So, if the login fails, the booking test will be skipped automatically. It helps maintain a logical execution flow between dependent test cases.

6 What is dataprovider

In TestNG, a DataProvider is used to run the same test case multiple times with different sets of data. It helps in achieving data-driven testing. For example, if I have a login test that needs to check multiple usernames and passwords, instead of writing separate test cases, I can use a DataProvider to supply all the data. The test will automatically execute once for each data set. It makes testing more efficient and reduces code repetition.

7 How do you make one group depend on another group in TestNG?

In TestNG, we can make one group depend on another group using the dependsOnGroups attribute. This means that the tests in one group will only run after the dependent group has completed successfully. For example, if I have a group named ‘login’ and another named ‘dashboard’, I can make the ‘dashboard’ group depend on the ‘login’ group using @Test(dependsOnGroups = {"login"}). This helps maintain a proper execution flow between related test groups.

8 Other than @Before and @After annotations, what other TestNG annotations have you used in your framework?

Apart from the @Before and @After annotations, I have also used other important TestNG annotations such as @Test, @DataProvider, @Parameters, @DependsOnMethods, and @DependsOnGroups.

The @Test annotation is the main one that marks a method as a test case.
@DataProvider is used for data-driven testing — it helps to pass multiple sets of data to a single test method.
@Parameters allows passing values from the TestNG XML file to test methods.
And @DependsOnMethods or @DependsOnGroups are useful for setting dependencies between tests to maintain execution order

9 What is invocationCount attribute?

In TestNG, the invocationCount attribute is used when you want to run the same test method multiple times automatically without writing it again and again, For example, if you set invocationCount = 3, that particular test method will execute three times continuously during the test run. This is useful when you want to check the stability or consistency of a test, especially for performance testing, retry scenarios, or when verifying that a feature works the same way on multiple executions.

So, in simple terms — invocationCount helps you repeat the same test multiple times with a single line of configuration.


10 PRIORITY ORDER OF EXECUTION (-1,-2,0,1).

In TestNG, when you assign priorities to test methods using the priority attribute, the execution happens in ascending order of those priority numbers. That means the test with the lowest priority value runs first. If a priority is not defined, it is considered as priority = 0 by default.

For example, a test with priority = -2 will run before one with priority = -1, and a test with priority = -1 will run before priority = 0, followed by priority = 1.

👉 Order of execution:
priority = -2 → priority = -1 → priority = 0 → priority = 1, In simple words, the smaller the number, the higher the execution priority.

11 TestNg Annotations Order of execution like(@BS,@AS,@TEST@BC,@AC,BM,AM,BT,AT).

In TestNG, the annotations are executed in a specific order to maintain a structured testing flow. The execution starts with @BeforeSuite, which runs only once before all tests in the entire suite. Next comes @BeforeTest, which executes before any test tag in the TestNG XML file. After that, @BeforeClass runs once before any test method in the current class. Then, @BeforeMethod runs before each individual test method to handle setup tasks like launching a browser or logging in. Once that’s done, the actual @Test method runs. After every test method, @AfterMethod executes to perform cleanup actions like closing the browser or logging out. Then, after all test methods in a class have finished, @AfterClass runs once. Following that, @AfterTest runs after all the test tags in the XML are completed. Finally, @AfterSuite executes once at the end of the entire suite to wrap up final tasks like generating reports.


## 5 POM

1 What is pom why it is necessary

Page Object Model, or POM, is a design pattern used in Selenium where we create separate classes for each page of the application. Each class stores the locators of the elements on that page and the methods to interact with them. This way, instead of writing locators directly inside test cases, we keep them in one place, which makes the code cleaner, reusable, and easier to maintain. If anything changes in the UI, we just update the locator in the page class and don’t need to touch the test logic. In short, POM helps in reducing code duplication and makes the framework more scalable.

2 How to implement pom.

To implement the Page Object Model (POM) in Selenium, first we declare a WebDriver variable in the page class to hold the browser instance. Then, we create a constructor that takes the WebDriver as a parameter and assigns it to the class variable using this.driver = driver;. Inside the constructor, we call PageFactory.initElements(driver, this) to initialize all the web elements defined in the class.

Next, we define web elements using annotations. For a single element, we use @FindBy. For multiple locators with an OR condition, we use @FindAll, and for multiple locators with an AND condition, we use @FindBys. We can also define lists of elements like checkboxes or links using List<WebElement>.

After defining elements, we create getter methods to access them if needed. Then, we write action methods that perform operations on the elements, such as login(), selectAllCheckboxes(), or printAllLinks(). In the test class, we simply create an object of this page class and call its methods. This approach separates locators and actions from test logic, makes the code reusable, easier to maintain, and allows us to handle UI changes by updating only the page class.

3 What is lazy initialization?

In the context of Page Object Model (POM) and PageFactory in Selenium, lazy initialization means that the web elements are not found or loaded into memory until they are actually used in the code.
In simple words — Selenium doesn’t locate all elements of a page when the Page Object is created. Instead, it waits until you perform an action (like click or sendKeys) on that element. At that moment, the element is located and interacted with, This improves performance because unnecessary elements are not loaded upfront. It also helps handle dynamic elements that may not be visible immediately when the page loads.


4 How do you handle stale element reference exception?

StaleElementReferenceException occurs when the element I’m trying to interact with is no longer attached to the DOM — usually after a page refresh, navigation, or dynamic update. To handle this, I use one of the following approaches:

First, I re-locate the element before interacting with it. This is useful when the page refreshes or reloads because the old element reference becomes invalid. By locating the element again before performing any action, I ensure Selenium interacts with the updated element in the DOM.

Second, I use explicit waits to make sure the element is in a stable and interactable state before performing any operation. This helps when elements are dynamically reloaded or take time to become clickable.

Lastly, I apply a retry mechanism using a loop with a try-catch block. If the exception occurs, I catch it and attempt to locate and interact with the element again. This approach is especially helpful in handling intermittent DOM updates that may cause the exception occasionally.

5 Difference between POM and pageFactory.

The main difference between POM (Page Object Model) and Page Factory lies in how the web elements are initialized and managed.

In POM, we create a separate class for each webpage, store the locators using By objects, and then use driver.findElement() inside methods to perform actions. It’s a manual approach to locate and interact with elements, which makes it simple but slightly longer in code.

In Page Factory, it’s an advanced version of POM that provides lazy initialization of elements using @FindBy annotations and the PageFactory.initElements() method. It automatically initializes the elements when they are used, reducing code and improving readability.

7 What is the use of constructor POM.


In Page Object Model (POM), a constructor is used to initialize the web elements and the WebDriver instance for that particular page class, When we create a POM class, we usually define a constructor that takes the WebDriver as a parameter. Inside this constructor, we assign that driver to the local driver variable and initialize all the elements using PageFactory.initElements(driver, this), This ensures that whenever we create an object of the page class in our test, all the elements on that page are properly initialized and ready to use.

The constructor of LoginPage initializes all elements (like username, password, and login button) using the same driver instance, So, the main use of the constructor in POM is to initialize the WebDriver and web elements to make the page ready for interaction.

8 What is PageFactorgy.

PageFactory is class in Selenium is used to make the implementation of the Page Object Model (POM) more efficient and organized, In simple terms, PageFactory helps initialize all the web elements defined in a page class automatically, instead of locating them manually each time using driver.findElement(). It reduces code duplication and makes the code cleaner and easier to maintain, With PageFactory, we use annotations like @FindBy to locate elements. Then, the method PageFactory.initElements(driver, this) is used to initialize those elements when the page object is created.

9 Difference between POM.xml and PageFactory

In Selenium, POM.xml and PageFactory serve two completely different purposes. The POM.xml file is part of a Maven project and is mainly used for managing project dependencies, plugins, and build configurations. It tells Maven which libraries like Selenium, TestNG, or Rest Assured need to be downloaded and included in the project, so it helps in maintaining versions and building the project easily.

On the other hand, PageFactory is a concept in Selenium that helps in implementing the Page Object Model (POM) design pattern more efficiently. It is used to initialize web elements using the @FindBy annotation, making the code more readable and reusable. PageFactory helps reduce code duplication and improves test maintenance by separating locators and test logic.

In short, POM.xml is used for project setup and dependency management, while PageFactory is used for initializing and managing web elements inside page classes in Selenium automation.

10 Can we store the dynamic Xpath in POM class?

Yes, we can store dynamic XPath in a POM (Page Object Model) class, In real-time projects, some elements change dynamically based on user actions or data. To handle such elements, we can use parameterized or dynamic XPath inside the POM class by storing it as a String and replacing the variable part at runtime, For example, we can write a method in the POM class that builds the XPath dynamically:


## 6 Synchronization in Selenium

1 What is Synchronization in Selenium 

Synchronization in Selenium is the process of matching the speed of the automation script with the speed of the application under test. Since web elements may take some time to load, we use synchronization to avoid errors like NoSuchElementException or ElementNotInteractableException. Selenium provides two main types of waits for synchronization: implicit wait and explicit wait. Implicit wait applies globally for all elements, while explicit wait is applied to specific elements based on defined conditions such as visibility, clickability, or presence of an element. We also have fluent wait, which is a type of explicit wait that allows us to define polling frequency and to ignore specific exceptions. Using proper synchronization makes the script more stable and less likely to fail due to timing issues.

2 Difference between explicit wait and implicit Wait

Implicit wait in Selenium is a type of synchronization that tells the WebDriver to wait for a specified amount of time before throwing a NoSuchElementException. It is applied globally, which means it works for all elements in the script. Once set, the driver will keep checking for the element until the defined time expires. However, it does not wait for conditions like visibility or clickability; it only checks for the presence of elements in the DOM

Explicit wait or WebDriverWait in Selenium is a type of explicit wait that helps in handling synchronization between the script and the application. It allows us to wait for specific conditions such as an element becoming clickable, visible, or an alert being present. WebDriverWait keeps checking for the condition at regular intervals until the maximum time is reached. If the condition is met before the time ends, execution continues immediately, otherwise it throws a TimeoutException. This makes WebDriverWait more reliable than implicit wait, since it targets particular elements or conditions instead of applying a general wait to all elements.

2 What is fluent wait

Fluent Wait is a type of explicit wait in Selenium that lets us set how long to wait in total, how often Selenium should keep checking for the element, and which exceptions to ignore during that time.
              
3 How to implement FluentWait

I implemented FluentWait in my framework mainly to handle elements that take unpredictable time to load. I created a FluentWait object on the WebDriver where I set the maximum timeout, the polling frequency, and the exceptions to ignore like NoSuchElementException. After that, I used the wait with ExpectedConditions, for example waiting until an element becomes visible before interacting with it. To make it reusable, I wrapped this logic inside a utility method so that instead of writing the FluentWait code every time, I could simply call the method in my test scripts. This made the framework more reliable and easier to maintain.


4 How to implement webdriverWait

I created a WebDriverWait object with a defined timeout, and then used it with ExpectedConditions, like waiting for an element to be clickable, visible, or for an alert to appear. To avoid repeating the same wait code across different tests, I wrote reusable utility methods where I passed the locator and condition, and the method returned the element once it was ready. This approach made the tests more stable and reduced flaky failures
WebDriverWait.

5 What is thread.sleep

In automation, particularly in Selenium, Thread.sleep() is a method used to pause the execution of the script for a specific amount of time.
It belongs to the Java Thread class and takes time in milliseconds as an argument — for example, Thread.sleep(2000) pauses the test for 2 seconds. During this pause, the script does nothing; it simply waits before moving to the next step.
This is often used when you want to give the page or an element some time to load before performing the next action. However, it’s not a good practice to rely on Thread.sleep() too much because it causes unnecessary delays even when the element is ready earlier.
Instead, we usually prefer explicit waits (WebDriverWait) or implicit waits, which are more dynamic and wait only until the required condition is met.
So, in short — Thread.sleep() is a hard wait used to pause execution for a fixed time, but it should be replaced with smarter waiting methods in real-time

6 What exception you get when you use explicit wait

When we use Explicit Wait in Selenium and the expected condition is not met within the given time, we get a TimeoutException.
This happens when Selenium keeps checking for a certain condition (like element to be clickable, visible, or present) until the specified timeout period. If the element still doesn’t appear or meet the condition within that time, Selenium throws this TimeoutException to indicate that the wait has failed.
So in short, the TimeoutException is the most common exception we get when using Explicit Wait in Selenium.

7 What exception you get when you use fluent wait

When we use Fluent Wait in Selenium, the most common exception we get is also a TimeoutException if the condition is not met within the specified time.
Fluent Wait keeps checking for the element at regular polling intervals until the maximum timeout is reached. If the element is still not found or the condition doesn’t become true within that time, Selenium throws a TimeoutException.
However, the difference is that in Fluent Wait, we can ignore specific exceptions like NoSuchElementException, which prevents the script from failing during each polling cycle. So in short, the main exception thrown by Fluent Wait is TimeoutException, but it can be customized to ignore others during waiting.

8 What is default polling period

The default polling period in Selenium is 500 milliseconds (or 0.5 seconds).

This means that when you use Explicit Wait or Fluent Wait, Selenium checks the condition (like element visibility or presence) every 500 milliseconds until the maximum timeout is reached. If the condition is met before the timeout, it immediately proceeds with the next step; otherwise, it throws a TimeoutException.

In simple words, Selenium keeps checking every half a second to see if the element has appeared or the condition has been satisfied.

9 What is difference between Thread.sleep() and Wait commands in Selenium.

The main difference between Thread.sleep() and Wait commands in Selenium lies in how they pause execution and handle synchronization during automation testing.

Thread.sleep() is a Java command that pauses the execution of the script for a fixed amount of time, regardless of whether the element is present or not. It doesn’t care about the webpage’s condition; it simply waits for the specified time. For example, if you use Thread.sleep(5000), the script will wait for exactly 5 seconds before moving ahead.

On the other hand, Wait commands (like Implicit Wait, Explicit Wait, or Fluent Wait) are Selenium-specific and provide a more intelligent way of waiting. They wait dynamically — meaning they pause only until the required condition is met or until the maximum timeout is reached. For example, with Explicit Wait, Selenium waits until a particular element becomes clickable or visible, which avoids unnecessary waiting and makes the script faster and more reliable.

In short, Thread.sleep() is a hard wait (fixed delay), while Selenium Wait commands are smart waits (conditional and efficient)

10 What are the different types of parameters is accepted by sleep method and in implicit wait method

## 7 Selenium and its architecture.

1 What is Selenium WebDriver?

In Selenium, WebDriver is an interface that defines all the methods required for browser automation. It is the core component that allows us to interact with different browsers in a unified way. The main advantage of WebDriver is abstraction—it enables us to write common automation code that works across multiple browsers like Chrome, Firefox, or Edge without changing the logic. For example, when we write WebDriver driver = new ChromeDriver();, we are referring to the WebDriver interface but creating an object of ChromeDriver, which internally provides the actual implementation. This design, based on abstraction, inheritance, and polymorphism, allows Selenium to achieve cross-browser testing. In real-time, every automation script starts with WebDriver because it provides essential methods to open and close the browser, navigate between pages, find elements, handle windows, alerts, and frames, and perform various browser-level operations.

2 What is searchContext

In Selenium, SearchContext is the top-level interface that defines the basic methods used to locate elements on a web page. It provides two core methods — findElement() and findElements() — which are used to find single or multiple elements, respectively. Both WebDriver and WebElement interfaces extend SearchContext, meaning you can search for elements either from the entire page using the driver or within a specific section of the page using a WebElement. This interface acts as the foundation for all element search operations in Selenium.

3 What is webelement
In Selenium, a WebElement represents an element on a web page, such as a button, textbox, link, checkbox, or dropdown.

When you locate an element using methods like findElement(), Selenium returns it as a WebElement object. This object allows you to perform different actions on that element — like clicking a button (click()), typing text into an input field (sendKeys()), or fetching its text (getText()).

In simple words, WebElement is the reference or handle to a specific element on a web page that lets us interact with it in automation scripts.

4 What are difference between Selenium 3 and Selenium 4

The main difference between Selenium 3 and Selenium 4 is that Selenium 4 comes with major upgrades, new features, and improved architecture compared to Selenium 3.

In Selenium 3, the communication between the Selenium client and browser drivers was done using the JSON Wire Protocol, which caused extra conversion steps and slower execution. In Selenium 4, this is replaced with the W3C WebDriver Protocol, making communication faster and more stable.

Selenium 4 also introduced a new and improved UI for Selenium Grid, allowing testers to easily manage multiple nodes and sessions. It provides relative locators like above(), below(), near(), etc., which make locating elements easier and more human-readable.

Another big change is in Window and Tab management, which allows switching between multiple windows and tabs easily. The new version also added better support for Chrome DevTools Protocol (CDP), enabling performance monitoring, capturing network logs, and more advanced debugging features.

Overall, Selenium 4 is more modern, faster, and feature-rich, with better stability, improved APIs, and enhanced browser compatibility compared to Selenium 3.

5 How does selenium

Selenium works by interacting directly with web browsers to automate user actions just like a real person would do. When we write a Selenium script, it uses the WebDriver to communicate with the browser.

Here’s how it works in simple terms — when you run your test script, Selenium WebDriver sends commands (like click, enter text, or navigate) to the browser driver (for example, ChromeDriver for Chrome, GeckoDriver for Firefox). The browser driver then translates those commands into browser-specific actions using the W3C WebDriver Protocol. The browser executes those actions and sends the response back to the WebDriver, which finally reports the result to your test script.

So basically, Selenium acts as a bridge between your automation code and the browser, ensuring your script can perform all operations — like opening URLs, clicking buttons, or verifying text — just as a user would, but automatically and much faster.
 

6 Difference between get() and navigate().

The get() and navigate() methods in Selenium are both used to open web pages, but they differ slightly in usage and functionality.

The get() method is used to launch a new web page in the current browser window. It simply loads the specified URL and waits until the page is completely loaded before performing the next action.

On the other hand, the navigate() method (used as driver.navigate().to(url)) offers more control for browser navigation. It not only allows opening a URL but also supports additional navigation actions like back(), forward(), and refresh().

In short, get() is straightforward and used for directly loading a page, while navigate() provides more advanced navigation options within the same browser session.

7 Difference between close and quite

The close() and quit() methods in Selenium are both used to close browser windows, but they serve different purposes.

The close() method is used to close the current active browser window or tab where the driver is currently focused. If multiple browser windows are open, only that specific one will be closed, and the rest will remain open.

The quit() method, on the other hand, is used to close all browser windows opened by the WebDriver and end the entire browser session. It also releases the memory and resources used by the driver.                               |


8 Explain WebDriver driver=new ChromeDriver();

The statement WebDriver driver = new ChromeDriver(); is used to launch the Chrome browser in Selenium.

Here, WebDriver is an interface in Selenium that defines all the methods required to interact with a browser, such as get(), click(), sendKeys(), etc.
ChromeDriver is a class that implements the WebDriver interface and provides the actual implementation for Chrome-specific browser actions.

When we write WebDriver driver = new ChromeDriver();, we are creating an object of ChromeDriver and referring to it using the WebDriver interface reference.
This approach is useful because it makes the code browser-independent — later, we can easily switch to another browser (like Firefox or Edge) by just changing the driver object without modifying the rest of the test code.


9 Return type of getOptions method and get window handles


The getOptions() method returns an Options interface, which provides methods to manage browser settings such as cookies, timeouts, and windows.
The getWindowHandles() method returns a Set<String>, which contains the unique window IDs (also called handles) of all the open browser windows. Each window handle can be used to switch between multiple browser windows or tabs during automation.


10 Explain Selenium Architecture.

In my experience, the Selenium Java architecture is designed using OOP concepts like abstraction, inheritance, and runtime polymorphism. At the base, we have the SearchContext interface, which provides the fundamental methods like findElement() and findElements(). On top of that, the WebDriver interface extends SearchContext and adds browser-level methods such as get(), getTitle(), navigate(), close(), and quit(). Since WebDriver is just an interface, it only defines the behavior, but the actual implementation is provided by the RemoteWebDriver class. Browser-specific drivers like ChromeDriver or FirefoxDriver extend RemoteWebDriver and handle the communication with their respective browsers. In real projects, we usually use runtime polymorphism — for example, when I write WebDriver driver = new ChromeDriver();, I’m upcasting the ChromeDriver object to the WebDriver interface. This makes my framework browser-independent, because if I want to run the same test on Firefox, I only change the object creation, not the rest of the test logic. This architecture is what gives Selenium its flexibility and power for cross-browser testing.

## 8 Assertion Reporting


1 What is Assertion.

Assertion in testing is a way to verify that the actual result of the application matches the expected result. In Selenium automation, we use assertions to check conditions like page titles, element visibility, text values, or messages. If the assertion passes, the test continues; if it fails, the test is marked as failed. Assertions basically help us confirm whether the application is working as expected.

2 Why we use Assertion

In my framework, I used assertions to validate whether the actual behavior of the application matches the expected result. For example, I used assertions to check if a page title is correct after login, if a success message appears after submitting a form, or if an element is displayed on the screen. I mostly worked with hard assertions, where the test fails immediately if the condition is not met, but I also used soft assertions when I wanted to continue the execution and collect multiple failures in a single test run. By using assertions properly, I made sure the automation scripts were not only performing actions but also verifying outcomes, which improved the reliability of the tests.


3 Explain about soft assert and hard assert?

There are two types of assertions – Hard Assertion and Soft Assertion. Hard assertions stop the test execution immediately when a validation fails, while soft assertions allow the test to continue even after a failure and finally collect all the results when we call assertAll(). The commonly used hard assertion methods like assertEquals, assertTrue, assertFalse are static methods from the TestNG Assert class, which means we can call them directly without creating an object. On the other hand, soft assertions are non-static because we need to create an object of the SoftAssert class to use them, and then finally call assertAll() to validate all collected results. In my framework, I mainly used hard assertions for critical checks like login or navigation validation, and soft assertions when verifying multiple UI elements on the same page without stopping at the first failure.

4 What is the difference between verify and assert in testing?

The main difference between verify and assert is how they handle test failures.
With assert, if a condition fails, the test execution stops immediately — the remaining steps in that test will not run.
With verify, even if the condition fails, the test continues to execute the remaining steps.

In simple words, assert is used for critical validations where failure should stop the test, while verify is used for non-critical checks where we still want to continue the execution and collect all results.

5 How do you validate in automation testing?


I usually perform validation by using assertions in my test scripts. Assertions help me compare the actual result from the application with the expected result. If both match, the test passes; if not, it fails.

In Selenium with TestNG, I commonly use methods like Assert.assertEquals(), Assert.assertTrue(), or Assert.assertFalse() for validation. For example, I might validate a page title, URL, message, or element visibility after performing an action. So basically, I use assertions to ensure that the application’s behavior is correct as per the requirement.

6 What is the role of assertions in automation testing?

Assertions play a key role in verifying that the actual output of the application matches the expected result. I use assertions to validate critical checkpoints in a test — for example, checking whether a message, title, or element is displayed correctly. They help determine if a test case passes or fails automatically without manual verification. In short, assertions make automated tests meaningful and reliable because they confirm that the application behaves as expected

7 What is the difference between Assert and Verify in automation scripts?

The main difference is in how they handle failures. An assert immediately stops the test execution when a condition fails, meaning the rest of the steps in that test won’t run. On the other hand, a verify or soft assert allows the test to continue execution even if one condition fails. This is useful when I want to validate multiple conditions within a single test and still get a complete report of all failures at the end.

8 How do you integrate assertions with your test reporting framework?

In my framework, I combine assertions with reporting tools like Extent Reports or Allure Reports. Each assertion result, whether pass or fail, is automatically logged in the report. If any assertion fails, it captures a screenshot and includes the error message in the report. This way, the report clearly shows where and why a particular test step failed, which helps in faster debugging and analysis.

9 What key components do you include in your automated test report?

A well-designed report should give complete visibility into test results. I make sure the report includes the total number of test cases executed, passed, failed, and skipped. It also contains detailed logs for each test case, execution time, environment details, browser and OS used, and screenshots attached for failed steps. These components help the team quickly identify problem areas and understand the overall test health.

10 How do you handle failed tests in your reporting strategy?

Whenever a test fails, I log the exact reason for failure and attach a screenshot for better clarity. I also capture exception details and include them in the report. Sometimes, I configure retry logic for flaky tests, and if they still fail, they are marked as failed in the final report. This process ensures that the report gives a realistic view of test quality and makes troubleshooting easy for developers.

11 How have you customized or extended standard test reports in your framework?

I have customized my reports using Extent Reports to make them more detailed and user-friendly. I added extra information such as test categories, execution time, tester name, and business module name. I also implemented a listener class that automatically takes screenshots on failure and attaches them to the report. This customization makes the report visually appealing and more informative for both testers and management.

12 Why is it important to share automation reports with stakeholders, and how do you do it?

Sharing reports helps maintain transparency and keeps everyone updated on the project’s test progress. In my setup, Jenkins automatically publishes HTML or Extent reports after every build. I configure it to send email notifications to the team with a summary of results and a link to the full report. This ensures developers, testers, and managers can all review the outcomes and take quick action if any issues are found.

13  What metrics do you track in automation reports, and why?

I focus on metrics like total test count, pass percentage, fail percentage, test execution time, and defect count detected through automation. I also monitor flaky test rates and coverage of automated modules. These metrics help assess the stability of automation scripts and give a clear picture of product quality and testing efficiency over time.

14 How do you handle assertions when dealing with dynamic content or timing issues?

When dealing with dynamic web elements or slow-loading pages, I use Explicit Waits before performing assertions. This ensures the element or text is fully loaded before validation. If there are multiple checks in a single test, I use Soft Assertions to collect all results before failing the test. This approach minimizes false failures caused by timing issues and improves script stability.

15 Can you explain how you generate and access reports in CI/CD pipelines like Jenkins?

In Jenkins, after test execution through Maven or TestNG, I configure post-build actions to publish reports automatically. For example, I use the “Publish HTML Report” plugin or integrate Extent Reports within the project. The report path is provided in Jenkins, and once the build completes, a link appears in the Jenkins dashboard where I can view the full report. This automation helps in continuous monitoring without manual intervention.

16 How do you handle assertion failures in a CI/CD pipeline when tests are running automatically?

In CI/CD pipelines, if an assertion fails, the test is automatically marked as failed and reflected in the report. I handle such failures by capturing screenshots, logging the error details, and attaching them to the report for better debugging. I also review whether the failure is due to application issues, timing problems, or test instability, and then fix or re-run accordingly.

17 What strategy do you use to reduce or manage flaky tests that affect your test reports?

I reduce flaky tests by implementing proper synchronization using explicit or fluent waits instead of Thread.sleep. I also ensure that test data is consistent, environment is stable, and elements are properly located. For rare flaky cases, I use a retry analyzer in TestNG, which re-runs failed tests before marking them as failed in the report.

18 How do you ensure that your test reports remain readable and useful when many tests fail simultaneously?

I use structured reporting tools like Extent Reports or Allure Reports, which provide detailed logs, screenshots, and error stacks for each test. I also categorize tests by module or functionality, so even if multiple tests fail, the report clearly highlights which area of the application is affected.

19 How do you integrate screenshots, retry logic, or logs into your reports for failures in automated frameworks?

In my framework, I use listeners (like TestNG listeners or ITestListener interface) to capture screenshots whenever a test fails. I integrate these with Extent Reports so that each failed test case has an attached image and log message. Retry logic is implemented using TestNG’s RetryAnalyzer to re-run failed tests automatically and show both attempts in the report.

20 How do you validate that your automation framework is producing accurate coverage and meaningful reports (beyond just pass/fail counts)?

I validate framework effectiveness by checking that reports include key metrics like execution time, environment details, pass/fail ratio, skipped tests, and root cause summaries. I also ensure reports are consistent with manual test results and business priorities — meaning we’re testing high-risk areas effectively.

21 What metrics do you track in your test reports to identify test or framework health in CI/CD environments?

I track metrics like pass/fail rate, skipped tests, execution time per test suite, and flaky test frequency. These metrics help identify unstable modules, performance bottlenecks, or unreliable tests. Over time, analyzing these reports helps me improve framework stability and CI performance.

22 How do you debug and resolve test failures shown in your CI report which passed locally but failed in the pipeline?

When a test passes locally but fails in CI, I first check for environment differences — like browser versions, network latency, or timing issues. Then I review the CI logs and screenshots to pinpoint the issue. I may add extra waits, handle dynamic elements better, or mock unstable dependencies to make the tests environment-independent.

23 How do you handle dependencies between tests (assertions) when running in parallel in CI/CD and how this reflects in reports?

I design my tests to be independent using unique data sets and setup methods. If dependencies exist, I manage them with TestNG groups or “dependsOnMethods.” In reports, each test still appears separately, but the dependency relationship helps in understanding cascaded failures.

24 When your build pipeline fails due to test assertions, how do you communicate or escalate this to the development or QA team?

When a pipeline fails, I share the detailed test report and failure logs with the development or QA team. I highlight whether it’s a genuine application defect or an automation issue. For recurring failures, I log them in Jira with the evidence (screenshots, logs, and report snippet).

25 How do you maintain historical test report data so you can track trends (e.g., failure rates, flakiness) over time and use that for continuous improvement?

We maintain historical test reports by storing execution reports with build numbers or timestamps instead of overwriting them. These reports are archived in CI tools like Jenkins. By analyzing past reports, we track failure trends and identify flaky tests. This helps us improve test stability and overall automation quality.

Assertion and reporting are two different things. Assertions are used to validate the actual result against the expected result. If the assertion passes or fails, that outcome is then reflected in the test report. Reporting is only for showing the execution results, while assertions decide whether a test case should pass or fail.
## 9 Locators 

1 What are Locators?

Locators in Selenium are used to uniquely identify elements on a web page, such as buttons, text boxes, images, links, and dropdowns, so that we can perform actions on them like clicking, typing, or retrieving text. They are the backbone of Selenium automation, because without identifying elements, no interaction or testing can be performed. Selenium provides different types of locators such as ID, Name, Class Name, Tag Name, Link Text, Partial Link Text, CSS Selector, and XPath. Among these, ID is the most reliable and fastest because it is usually unique, while XPath and CSS Selector are more powerful when elements don’t have proper attributes. Choosing the right locator is very important for writing stable automation scripts, as poor locators can cause frequent failures when the application UI changes. In real-time projects, testers often use a combination of locators depending on the application’s structure, ensuring that scripts are both reusable and easy to maintain.

By is a Selenium class that provides different locator strategies to find elements on a web page. It has static methods such as id, name, xpath, and cssSelector, which we use with Selenium to locate elements and perform actions on them.


2 What are the locators you use in selenium

Selenium provides different types of locators such as ID, Name, Class Name, Tag Name, Link Text, Partial Link Text, CSS Selector, and XPath. Among these, ID is the most reliable and fastest because it is usually unique, while XPath and CSS Selector are more powerful when elements don’t have proper attributes.


3 What is the difference between Absolute XPath and Relative XPath in Selenium

The main difference between Absolute and Relative XPath is in the way they locate elements in the HTML structure. Absolute XPath provides the complete path from the root element (HTML) to the desired element, starting with a single slash (/). It is long, less flexible, and can easily break if there are any changes in the webpage structure. For example, /html/body/div[1]/div[2]/input is an Absolute XPath.

On the other hand, Relative XPath starts from any node in the HTML structure, not necessarily from the root, and it begins with a double slash (//). It is shorter, more reliable, and commonly used in automation because it is less affected by minor changes in the DOM structure. For example, //input[@id='username'] is a Relative XPath.

In short, I prefer using Relative XPath in automation testing because it is more robust, easy to maintain, and less likely to fail when the UI or structure of the page changes.

4 Difference between find element and find elements?

The main difference between findElement() and findElements() in Selenium lies in the number of elements they return and how they behave when no element is found,
In simple terms — findElement() returns a single WebElement, whereas findElements() returns a list of WebElements, When you use findElement(), Selenium searches for the first matching element based on the locator provided. If it finds one, it returns that element. However, if no matching element is found, it throws a NoSuchElementException.

On the other hand, findElements() is used when you expect multiple elements to match the locator. It returns a List<WebElement> containing all matching elements. If no element is found, it doesn’t throw an exception — instead, it simply returns an empty list.

5 How do you handle dynamic web elements in Selenium or How do you identify or create dynamic XPath in Selenium?

Dynamic web elements are those whose attributes like ID, name, or class keep changing whenever the page reloads or refreshes. To handle such elements in Selenium, I avoid using static locators like direct IDs or names. Instead, I prefer using Relative XPath with functions such as contains(), starts-with(), or text() to identify elements based on partially stable attributes. For example, I might use //input[contains(@id,'username')] to handle an element whose ID changes dynamically.

Additionally, I make use of XPath axes to locate elements in relation to other stable elements in the DOM. Some commonly used axes include following-sibling, preceding-sibling, parent, child, ancestor, and descendant. For example, if a label near a textbox is stable but the textbox ID changes, I can write an XPath like //label[text()='Username']/following-sibling::input to find the textbox dynamically. Similarly, ancestor::div or parent::form can help locate elements based on their structure rather than changing attributes.

Along with this, I use explicit waits like WebDriverWait with conditions such as visibilityOfElementLocated() or elementToBeClickable() to ensure Selenium interacts with the element only after it’s ready. By combining relative XPath, XPath axes, and proper waits, my test scripts remain stable, flexible, and reliable, even when the DOM structure or attributes change frequently.

6 Have you ever encountered pseudo elements in your application? If yes, how did you handle them in Selenium?

Yes, I have come across pseudo elements while testing web applications. Pseudo elements are not actual DOM elements — they are virtual elements defined in CSS, like ::before, ::after, or ::placeholder, which are used for styling or adding content dynamically. Since these elements are not part of the DOM, Selenium cannot directly locate or interact with them using normal locators like XPath or CSS selectors. To handle such cases, I use JavaScriptExecutor in Selenium to fetch or verify their content or style properties. For example, I execute a JavaScript command like window.getComputedStyle(element, '::before').getPropertyValue('content') to read pseudo-element text or color. In some situations, if it’s just a visual effect, I handle it through CSS validation or by checking the parent element’s properties instead of the pseudo element itself. This approach helps me test the UI behavior accurately even when pseudo elements are involved.

7 What is the difference between XPath and CSS Selector?

XPath and CSS Selector are both used to locate elements in Selenium, but they work differently. XPath can navigate both forward and backward in the DOM and allows locating elements based on text or attributes using functions like contains() or starts-with(). CSS Selector, on the other hand, is faster and preferred when working with static elements. It cannot move backward in the DOM and doesn’t support text-based search. In general, I use CSS selectors for speed and simplicity, and XPath when dealing with complex or dynamic structures.

8 How do you identify stable locators in your framework, especially when dealing with dynamic elements?

To identify stable locators, I focus on using unique and non-changing attributes like id, name, or data-* attributes. If those are dynamic, I switch to Relative XPath with functions such as contains(), starts-with(), or by using parent-child or sibling relationships. I also check if there are static elements around the dynamic one and build locators based on their relative position. Additionally, I always verify locators in browser dev tools to ensure they are unique and consistent across sessions.

9 What is the priority order of using locators such as ID, Name, ClassName, CSS, XPath?

The priority order I follow for locators is: ID → Name → ClassName → LinkText → PartialLinkText → TagName → CSS Selector → XPath. This is because ID is the fastest and most reliable, as it is unique for each element. If ID is not available, I go for Name or ClassName. XPath and CSS are used as the last options, mainly when no unique attribute is available or when handling dynamic elements.

10 Can you explain how you handle locators when the element’s attributes are dynamic (for example, IDs change each time)?

When dealing with dynamic attributes, I never use the complete ID or name directly since it changes on every reload. Instead, I use partial matching in XPath like contains(@id,'partialValue') or starts-with(@id,'prefix'). I also use parent-child or sibling relationships, or even text-based XPath when applicable. In CSS selectors, I use substring matches like [id*='partial']. These techniques help create flexible and stable locators that remain valid even when dynamic attributes change.

11 What are XPath axes and when would you use them in locator strategies?

XPath axes are keywords that help navigate through the DOM structure relative to the current element. Common axes include parent, child, ancestor, following-sibling, and preceding-sibling. I use axes when I need to locate an element in relation to another — for example, finding a checkbox next to a label or identifying a button following a specific text. XPath axes make locators powerful and dynamic, especially in complex HTML structures where direct attributes are not reliable.

12 When would you choose CSS selectors over XPath and vice versa?

I choose CSS selectors when I need faster execution and simpler locators, especially for static or well-structured pages. CSS is lightweight and generally performs better. However, I prefer XPath when I need to locate elements using text, navigate both forward and backward in the DOM, or handle complex relationships between elements. In short, CSS is ideal for speed and simplicity, while XPath is more flexible for handling dynamic or deeply nested elements.

13 How do you find elements that are not visible in the UI?

If an element is present in the DOM but not visible on the screen, I use JavaScriptExecutor to interact with it or to scroll it into view. For example, using ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", element); helps make it visible before performing actions.
Sometimes, I also check whether the element exists in the DOM using findElements(), because it doesn’t throw an exception even if the element is hidden — it just returns an empty list if not found, Additionally, I can verify its visibility by checking element.isDisplayed() — if it returns false, the element exists but is not visible on the UI.

14 When do we use Relative XPath?

We use relative XPath when we want a short, flexible, and stable locator. It is mainly used when elements do not have unique IDs or when the DOM structure changes frequently. Relative XPath starts with // and searches elements from anywhere in the page, which makes it faster and more maintainable compared to absolute XPath. In real projects, relative XPath is preferred because it reduces script failures.


15 What is XPath and what are the types of XPath?

XPath stands for XML Path. It is used in Selenium to locate web elements in the DOM structure of a webpage.
There are two types of XPath:
Absolute XPath: It starts from the root node and uses the full path of elements. It is not reliable because any DOM change breaks it.
Relative XPath: It starts with // and locates elements based on attributes, text, or relationships. This is the most commonly used XPath in automation.

16 How do you generate a Robust Locator?

A robust locator is one that does not break easily when UI changes. To generate a robust locator, I first prefer ID, name, or unique attributes. If they are not available, I use relative XPath with stable attributes like id, name, placeholder, or aria-label. I avoid using indexes, dynamic attributes, and absolute paths. I also use XPath functions like contains(), starts-with(), and normalize-space() to make locators more reliable.

17 What is &nbsp and how does it affect XPath?

&nbsp  stands for non-breaking space. It looks like a normal space but Selenium treats it differently. Because of this, text-based XPath may fail. To handle this, we use normalize-space() in XPath, which removes extra spaces and helps in matching text correctly.

## 10 Handling multiple window

1 How to handle multiple windows

To handle multiple windows in Selenium, we use getWindowHandles() and switchTo() methods.

Selenium provides getWindowHandle() to fetch the unique ID (handle) of the current window and getWindowHandles() to fetch all opened window handles. By looping through these handles, we can switch to the required window or tab. Once the work is completed, we can switch back to the parent window or continue working in the newly focused window.

2 What happens when new window opens

In Selenium, a window or tab represents a separate browser instance or page that opens while interacting with the application. When a new window or tab is opened, Selenium by default continues to point to the parent window, and it cannot directly interact with elements in the newly opened window. If you try to locate elements without switching, Selenium will throw a NoSuchElementException. To work with elements inside another window or tab, you must first switch the driver’s focus from the parent window to the desired child window using driver.switchTo().window(windowHandle). Once the focus is switched, you can interact with the elements inside that window normally. After completing the operations, it is important to switch back to the parent window using driver.switchTo().window(parentHandle) to continue working on the original page.

Selenium provides getWindowHandle() to fetch the unique ID (handle) of the current window and getWindowHandles() to fetch all opened window handles. By looping through these handles, we can switch to the required window or tab. Once the work is completed, we can switch back to the parent window or continue working in the newly focused window.

3 What does getWindowHandle() return, and how is it used in window switching scenarios?

getWindowHandle() returns a unique ID (or handle) of the current browser window as a String. Each window opened by Selenium WebDriver has its own unique handle. This method is usually used when I want to store the parent window’s handle before switching to another window, so that I can come back to the original one later. For example, I first get the parent window handle using driver.getWindowHandle(), then switch to the child window using driver.switchTo().window(handleId) when required.

4 What does getWindowHandles() return, and when would you use it over getWindowHandle()?

getWindowHandles() returns a set of all unique window IDs that are currently open. I use this method when there are multiple browser windows or tabs opened during test execution. By iterating through the set of window handles, I can switch to each one and perform specific actions — for example, verifying a popup message or interacting with an external page opened in a new tab.

5 What is the difference between getWindowHandle() and getWindowHandles()?

The main difference is that getWindowHandle() is used to get the handle of a single, currently active window, whereas getWindowHandles() returns the handles of all open windows or tabs in the browser session. getWindowHandle() gives one handle (a string), while getWindowHandles() gives a set of handles, allowing me to switch between multiple windows.

6 How do you switch from the main browser window to a newly opened child window using WebDriver?

To switch from the main browser window to a child window, I first store the parent handle using driver.getWindowHandle(). Then I call driver.getWindowHandles() to get all the open window handles and iterate through them. Whenever the handle doesn’t match the parent, I switch to it using driver.switchTo().window(childHandle). This way, I can perform actions on the new window. After completing the operations, I switch back to the parent window for the remaining steps.

7 How would you load a particular window out of multiple open browser windows and perform an action on it?

When there are multiple windows open, I get all handles using driver.getWindowHandles(). Then, I loop through each handle, switch to each window, and check for a specific title or URL that matches the expected one. Once I find the correct window, I perform the required actions like clicking or validating text. This ensures I’m interacting with the correct window rather than switching blindly.

8 What challenges can arise when handling multiple browser windows, and how do you ensure stable switching?

The main challenges include timing issues (window not fully loaded), unexpected popups, or multiple windows opening in parallel. To handle these, I use explicit waits before switching, verify the window title after switching, and always store the parent handle to avoid losing control. This helps ensure stability and prevents Selenium from throwing “NoSuchWindowException”.

9 Can we open multiple tab in same window

Yes, we can open multiple tabs within the same browser window in Selenium. From Selenium 4 onwards, this can be done using the newWindow() method with the WindowType.TAB parameter. For example, we can open one website in the first tab, then use driver.switchTo().newWindow(WindowType.TAB) to open a new tab in the same window and navigate to another website. This feature is helpful when we need to handle multiple pages in the same session, such as verifying links or comparing data between tabs. We can also manage and switch between tabs using getWindowHandles() and switchTo().window(handle) methods.
if I have opened 10windows then I have switch some specific wind write the code and explain

## 11 Frames

1 What is Frames in selenium?

In Selenium, a frame (or iframe) is an HTML document that is embedded inside another web page. It acts like a separate webpage within the main page. Elements inside a frame are not part of the main DOM, which means Selenium cannot access them directly. If you try to locate an element inside a frame without switching, Selenium will throw a NoSuchElementException. To work with these elements, you must first switch the driver’s focus from the main page to the desired frame using methods like driver.switchTo().frame(). Once the focus is on the frame, you can locate and interact with elements inside it as usual. After completing the operations, it is important to switch back to the default content using driver.switchTo().defaultContent() to continue interacting with elements on the main page.

3 How do you switch to a frame in Selenium?

Selenium provides three ways to switch into a frame: by using the index of the frame, by using the name or ID attribute of the frame, or by using the WebElement of the frame. Once the work inside the frame is completed, we can switch back either to the parent frame or directly to the main page (default content).

4 How do you come out of a frame and go back to the main page?

To come out of a frame and return to the main page in Selenium, we use driver.switchTo().defaultContent(). It shifts control from the current frame back to the main web page. If the page has nested frames and we want to go one level up, we use driver.switchTo().parentFrame(). This helps continue actions outside the frame smoothly after working inside it.

5 How do you handle nested frame?

In Selenium, nested frames are frames that exist inside another frame. To handle nested frames, we must switch step by step from the main page to the outer frame first and then into the inner frame using the driver.switchTo().frame() method. Selenium does not allow jumping directly to an inner frame without switching to its parent frame. We can switch using the frame’s index, name or ID, or by locating it as a WebElement. After completing actions inside the inner frame, we can move one level up using driver.switchTo().parentFrame() or return directly to the main page using driver.switchTo().defaultContent(). Proper frame switching is essential because Selenium can interact only with elements present in the currently focused frame.

## 12 Actions class

1 Tell me about Action class methods

The Action Class in Selenium is a special utility provided in the org.openqa.selenium.interactions package that allows us to handle complex user interactions such as mouse hover, drag and drop, right click, double click, click and hold, releasing a key, or sending multiple key combinations. While methods like click() and sendKeys() work for simple operations, many real-time scenarios need advanced interactions, like hovering over a menu to see sub-options, dragging an item from one section to another, or simulating keyboard shortcuts like Ctrl + A or Ctrl + C. For this, we create an Actions object, pass the WebDriver instance, and then use the required method, followed by .perform() to execute.

2 What are the different methods of the Actions class in Selenium?

| Method                                                | Description                                                | Example                                                                     |
| ----------------------------------------------------- | ---------------------------------------------------------- | --------------------------------------------------------------------------- |
| `click()`                                             | Clicks on the current mouse location                       | `act.click().perform();`                                                    |
| `click(WebElement element)`                           | Clicks on a specific element                               | `act.click(button).perform();`                                              |
| `doubleClick()`                                       | Double clicks at current mouse location                    | `act.doubleClick().perform();`                                              |
| `doubleClick(WebElement element)`                     | Double clicks on an element                                | `act.doubleClick(button).perform();`                                        |
| `contextClick()`                                      | Right click at current mouse location                      | `act.contextClick().perform();`                                             |
| `contextClick(WebElement element)`                    | Right click on an element                                  | `act.contextClick(button).perform();`                                       |
| `moveToElement(WebElement element)`                   | Moves mouse to an element (hover)                          | `act.moveToElement(menu).perform();`                                        |
| `moveByOffset(int x, int y)`                          | Moves mouse by x,y offset                                  | `act.moveByOffset(50, 100).perform();`                                      |
| `dragAndDrop(source, target)`                         | Drag source element and drop on target                     | `act.dragAndDrop(source, target).perform();`                                |
| `dragAndDropBy(source, xOffset, yOffset)`             | Drag element by x,y offset                                 | `act.dragAndDropBy(source, 100, 50).perform();`                             |
| `keyDown(Keys key)`                                   | Press a key (like Ctrl, Shift)                             | `act.keyDown(Keys.CONTROL).perform();`                                      |
| `keyUp(Keys key)`                                     | Release a key                                              | `act.keyUp(Keys.CONTROL).perform();`                                        |
| `sendKeys(CharSequence keys)`                         | Type keys at current focus                                 | `act.sendKeys("Hello").perform();`                                          |
| `sendKeys(WebElement element, CharSequence keys)`     | Type keys into an element                                  | `act.sendKeys(inputBox, "Hello").perform();`                                |
| `clickAndHold()`                                      | Click and hold at current mouse location                   | `act.clickAndHold().perform();`                                             |
| `clickAndHold(WebElement element)`                    | Click and hold on an element                               | `act.clickAndHold(element).perform();`                                      |
| `release()`                                           | Release mouse button at current location                   | `act.release().perform();`                                                  |
| `pause(Duration duration)`                            | Pause between actions                                      | `act.pause(Duration.ofSeconds(2)).perform();`                               |
| `build()`                                             | Builds the sequence of actions                             | `act.moveToElement(el).click().build().perform();`                          |
| `scrollToElement(WebElement element)`                 | Scrolls the page until the element is visible              | `act.scrollToElement(footer).perform();`                                    |
| `scrollByAmount(int x, int y)`                        | Scrolls by x (horizontal) and y (vertical) offset          | `act.scrollByAmount(0, 500).perform();`                                     |
| `scrollFromOrigin(ScrollOrigin origin, int x, int y)` | Scrolls from a defined origin (element/viewport) by offset | `act.scrollFromOrigin(ScrollOrigin.fromElement(header), 0, 300).perform();` |

3 How to perform mouse hover action

To perform a mouse hover action in Selenium, we use the Actions class. First, we create an instance of the Actions class and then use the moveToElement() method to hover over a specific element. For example:

``` java
Actions action = new Actions(driver);
action.moveToElement(element).perform();

```
4 Explain what is contextClick()

The contextClick() method in Selenium is used to perform a right-click action on a web element. It’s part of the Actions class and helps when you want to open a context menu or perform operations available on right-click.
```java

Actions action = new Actions(driver);
action.contextClick(element).perform();
```

5 What is perform method in action class

The perform() method in the Actions class is used to execute the series of actions that have been built using the Actions class methods.

In simple terms, all the actions like click(), doubleClick(), moveToElement(), or contextClick() are first stored as a sequence, and when you call perform(), Selenium executes those actions on the browser.

5 Where we action class use in your project

In my project, I used the Actions class mainly to handle advanced user interactions that can’t be done using simple click() or sendKeys() methods. For example, I used it to perform mouse hover actions on menu options where sub-menus appear only after hovering. I also used it for drag and drop operations, double-clicking elements, right-click (context click) for opening context menus, and click-and-hold actions for sliders.

In some cases, I used Actions class when normal click didn’t work due to hidden elements or JavaScript-based events. Using Actions.moveToElement() followed by click() helped perform actions smoothly. Overall, it made my automation more reliable for handling real user-like interactions in the application.

## 13 Select class


1 What is select class

The Select class in Selenium is a built-in class used to handle dropdown menus that are created using HTML select tags. Normally, Selenium WebDriver cannot directly select options from dropdowns, so we use the Select class to interact with them. With this class, we can select options in three ways: by index, by visible text, or by value.

In companies, the Select class is important because dropdowns are very common in real-time applications, such as selecting a country, state, role, or payment type. Using the Select class makes automation scripts simple, readable, and reusable for such scenarios, and avoids writing complex code to handle dropdowns manually.


2 What are the method present in select class

| **Method**                           | **Description**                                                     | **Example Code**                                         |
| ------------------------------------ | ------------------------------------------------------------------- | -------------------------------------------------------- |
| `Select(WebElement element)`         | Constructor → Creates a Select object for the given dropdown.       | `Select select = new Select(countryDropdown);`           |
| `selectByIndex(int index)`           | Selects option by index (0-based, first option = 0).                | `select.selectByIndex(2);`                               |
| `selectByValue(String value)`        | Selects option using the `value` attribute in HTML.                 | `select.selectByValue("IND");`                           |
| `selectByVisibleText(String text)`   | Selects option using the visible text shown to the user.            | `select.selectByVisibleText("India");`                   |
| `deselectByIndex(int index)`         | Deselects option by index. *(Works only for multi-select)*          | `select.deselectByIndex(1);`                             |
| `deselectByValue(String value)`      | Deselects option using the `value` attribute. *(Multi-select only)* | `select.deselectByValue("USA");`                         |
| `deselectByVisibleText(String text)` | Deselects option using visible text. *(Multi-select only)*          | `select.deselectByVisibleText("Canada");`                |
| `deselectAll()`                      | Deselects all selected options. *(Multi-select only)*               | `select.deselectAll();`                                  |
| `getFirstSelectedOption()`           | Returns the first selected option from the dropdown.                | `WebElement first = select.getFirstSelectedOption();`    |
| `getAllSelectedOptions()`            | Returns all selected options. *(Works only for multi-select)*       | `List<WebElement> all = select.getAllSelectedOptions();` |
| `getOptions()`                       | Returns all available options in the dropdown.                      | `List<WebElement> options = select.getOptions();`        |
| `isMultiple()`                       | Checks if the dropdown allows multiple selections.                  | `boolean multi = select.isMultiple();`                   |


3 If Dropdown is not developed using select tag then what is your approach

If a dropdown is not developed using the <select> tag, then we can’t use the Select class in Selenium. In that case, I handle it by locating and clicking the dropdown element first to open the list of options, and then selecting the desired option using normal locators like XPath or CSS selectors.

For example, I use XPath with text() or contains() functions to identify the option, such as:

```java
driver.findElement(By.xpath("//div[@class='dropdown']")).click();
driver.findElement(By.xpath("//li[text()='Option 2']")).click();
```

Sometimes, if the dropdown options appear only after scrolling or hovering, I use Actions class or JavaScriptExecutor to perform click or scroll operations, This approach works for custom dropdowns built using <div>, <ul>, or <li> elements instead of the standard <select> tag.


## 14 Exceptions in Selenium

1 What is exception in selenium

In Selenium, an exception is an error that occurs during the execution of a script when Selenium is unable to perform a particular action. It usually happens when the element is not found, not visible, or when the browser behaves unexpectedly, for example if an element is not found or the page doesn’t load properly. Selenium provides different types of exceptions like NoSuchElementException, TimeoutException, StaleElementReferenceException, and ElementNotInteractableException. I handle these exceptions using try-catch blocks, or by applying explicit waits to make the script more stable. Proper exception handling helps prevent script failures and ensures smooth execution of automation tests.

2 What types of exceptions have you encountered in Selenium?

In Selenium, I’ve encountered several types of exceptions during automation testing, and I handle them based on the situation. The most common one is NoSuchElementException, which occurs when the element is not found in the DOM — usually due to a wrong locator or page not fully loaded, so I fix it by verifying the locator or applying explicit waits. Another is ElementNotInteractableException, which happens when an element is present but not clickable or visible, so I wait until it becomes visible or scroll it into view. I’ve also faced StaleElementReferenceException, especially after page reloads, where I re-locate the element before interacting again. TimeoutException occurs when the expected condition isn’t met within the given time in explicit wait — in that case, I increase the wait or check the condition. Other exceptions I’ve handled include NoSuchFrameException, NoAlertPresentException, and ElementClickInterceptedException when pop-ups block the click. I’ve also seen SessionNotCreatedException due to version mismatches between WebDriver and browser, and InvalidSelectorException for incorrect XPath or CSS. In some cases, WebDriverException or FileNotFoundException occurs due to setup or missing file issues. I handle all these exceptions using proper waits, try-catch blocks, and framework-level error handling to make the automation suite more stable and reliable.

3 What types of exceptions have you encountered in Selenium?

I’ve faced several exceptions in Selenium like NoSuchElementException, StaleElementReferenceException, TimeoutException, ElementClickInterceptedException, and NoSuchFrameException. These usually occur due to synchronization or locator issues.

4 How do you handle exceptions in your Selenium framework?

To handle exceptions in my framework, I generally use try-catch blocks, explicit waits, and custom utility methods. I also use TestNG listeners to automatically capture screenshots and log errors whenever a test fails.

5 What is a StaleElementReferenceException, and how do you resolve it?

A StaleElementReferenceException occurs when the DOM changes after locating an element, usually after a page reload. I handle it by re-locating the element and using explicit waits to ensure the page is stable before performing any action.

6 What causes a NoSuchElementException, and how do you fix it?

NoSuchElementException occurs when the element is not found in the DOM, mostly because of wrong locators or delayed loading. To fix it, I verify the locator and use WebDriverWait for proper synchronization.

7 How do you handle TimeoutException in Selenium?

TimeoutException happens when an explicit wait condition is not met within the given time. In that case, I increase the wait time, verify the locator, or ensure that the element is visible and clickable before proceeding.

8 What is the difference between NoSuchElementException and ElementNotInteractableException?

The difference between NoSuchElementException and ElementNotInteractableException is that NoSuchElementException means the element doesn’t exist in the DOM, while ElementNotInteractableException means the element is present but hidden or disabled.

9 Have you ever faced ElementClickInterceptedException? How did you handle it?

I have faced ElementClickInterceptedException when another element, like a popup or banner, covers the element I’m trying to click. I usually wait for the overlay to disappear, scroll into view, or use a JavaScript executor to perform the click.

10 What is a NoSuchFrameException or NoAlertPresentException, and when do they occur?

NoSuchFrameException occurs when you try to switch to a frame that doesn’t exist, and NoAlertPresentException happens when you attempt to handle an alert that hasn’t appeared yet. I handle them by verifying the presence of the frame or alert before switching.

11 How do you prevent flaky tests caused by Selenium exceptions?

To prevent flaky tests caused by Selenium exceptions, I always use proper synchronization with explicit or fluent waits, stable locators, and retry logic for rare test failures. I also maintain consistent test data and environments.

12 How do you ensure your automation framework handles unexpected exceptions gracefully?

I make sure my automation framework handles unexpected exceptions gracefully by having a base class for common exception handling and using listeners to log and capture screenshots automatically. This helps in debugging and ensures smooth execution of all tests.



What are checked and unchecked exception

| **Type**                             | **Exception Name**                   | **When It Occurs / Description**                                                        |
| ------------------------------------ | ------------------------------------ | --------------------------------------------------------------------------------------- |
| ✅ **Checked Exceptions**             | **IOException**                      | When there’s an issue reading/writing external files (e.g., property or Excel files).   |
|                                      | **InterruptedException**             | When a thread is interrupted while sleeping or waiting (e.g., during `Thread.sleep()`). |
| ❌ **Unchecked Exceptions (Runtime)** | **NoSuchElementException**           | When an element is not found in the DOM.                                                |
|                                      | **StaleElementReferenceException**   | When the element is detached from the DOM after page refresh or reload.                 |
|                                      | **TimeoutException**                 | When an explicit wait exceeds the defined timeout period.                               |
|                                      | **ElementNotInteractableException**  | When an element is present but not visible or enabled for interaction.                  |
|                                      | **NoSuchFrameException**             | When switching to a frame that does not exist.                                          |
|                                      | **NoAlertPresentException**          | When trying to switch to an alert that isn’t displayed.                                 |
|                                      | **ElementClickInterceptedException** | When another element (like a popup) blocks the click action.                            |
|                                      | **InvalidSelectorException**         | When the XPath or CSS selector syntax is invalid.                                       |
|                                      | **WebDriverException**               | When the browser or driver session crashes or becomes unreachable.                      |


In short, checked exceptions in Selenium are very few and mostly related to external resources, while unchecked exceptions are the majority and occur during runtime while interacting with web elements.

## 15 Robot class 

1 What is Robot class


The Robot class in Java (under the java.awt package) is used to simulate keyboard and mouse events. In Selenium WebDriver, we use it when we need to handle OS-level popups, file upload/download windows, print dialogs, or authentication popups that WebDriver cannot interact with directly since WebDriver works only with HTML DOM elements inside the browser. Robot class bridges this gap by allowing us to perform native keyboard and mouse operations, making it very useful in automation where Selenium alone is not sufficient.


2 What are the methods are there in robot class

| **Method**                            | **Description**                                   | **Example Code**                                                             |
| ------------------------------------- | ------------------------------------------------- | ---------------------------------------------------------------------------- |
| `keyPress(int keycode)`               | Presses a key (key stays pressed until released). | `robot.keyPress(KeyEvent.VK_ENTER);`                                         |
| `keyRelease(int keycode)`             | Releases a pressed key.                           | `robot.keyRelease(KeyEvent.VK_ENTER);`                                       |
| `mousePress(int buttons)`             | Presses a mouse button.                           | `robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);`                            |
| `mouseRelease(int buttons)`           | Releases a pressed mouse button.                  | `robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);`                          |
| `mouseMove(int x, int y)`             | Moves mouse pointer to given screen coordinates.  | `robot.mouseMove(300, 200);`                                                 |
| `mouseWheel(int wheelAmt)`            | Scrolls the mouse wheel up/down.                  | `robot.mouseWheel(5);`                                                       |
| `delay(int ms)`                       | Pauses execution for given milliseconds.          | `robot.delay(2000); // wait 2 sec`                                           |
| `createScreenCapture(Rectangle rect)` | Captures screenshot of the given screen area.     | `BufferedImage img = robot.createScreenCapture(new Rectangle(0,0,500,500));` |

3 What is the Robot class in Selenium and what are its uses?

Robot class is a part of the java.awt package. It is used to handle keyboard and mouse events that Selenium WebDriver cannot control directly, such as OS-level pop-ups, file upload dialogs, or print windows. It simulates real user interactions at the operating system level.

4 Which package does the Robot class belong to?

The Robot class belongs to the java.awt package in Java. This package provides classes for creating user interface elements and handling system-level events.

5 How do you perform keyboard events using the Robot class?

Keyboard events are handled using methods like keyPress() and keyRelease(). For example, if you want to press the Enter key, you can use:

```java
robot.keyPress(KeyEvent.VK_ENTER);
robot.keyRelease(KeyEvent.VK_ENTER);
```
This helps in automating actions like form submission or dialog confirmation.

6 How do you perform mouse events using the Robot class?

Mouse actions such as clicking or moving the cursor can be done using methods like mouseMove(), mousePress(), and mouseRelease(). For example:

```java
robot.mouseMove(300, 400);
robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
```

This is useful when elements cannot be handled using standard Selenium locators.

7 Can you give an example of using the Robot class to handle OS-level dialogs that Selenium cannot handle directly?

Yes, for example, while uploading a file through a system window, Selenium cannot interact with the OS file chooser. So, we use the Robot class to type the file path and press Enter:

```java
robot.keyPress(KeyEvent.VK_CONTROL);
robot.keyPress(KeyEvent.VK_V);
robot.keyRelease(KeyEvent.VK_V);
robot.keyRelease(KeyEvent.VK_CONTROL);
robot.keyPress(KeyEvent.VK_ENTER);
robot.keyRelease(KeyEvent.VK_ENTER);

```
This pastes the file path into the dialog box and uploads it.

8 What are some limitations or challenges you faced when using the Robot class?

Robot class depends on the system’s focus, so if another window appears during execution, it can interrupt the automation flow. It also works based on screen coordinates, which may vary from one system to another, making scripts less reliable in distributed environments.

9 Which alternative techniques or classes do you use instead of Robot when possible?

Instead of using Robot, I prefer using the Actions class for web-level mouse and keyboard interactions or JavaScriptExecutor for interacting directly with web elements. For file uploads, using sendKeys() with the file path is a better and more stable approach whenever possible.

## 16 Listener

1 What is Listeners in testNG

Listeners in Selenium (especially with TestNG) are special interfaces that “listen” to the events that happen during test execution. They act like observers—whenever a specific event occurs (like a test starting, passing, failing, or skipping), the listener automatically executes the code you define for that event.


2 Why we use listeners in selenium or automation

In automation, we use listeners to monitor test execution and perform certain actions automatically when specific events happen — like when a test starts, passes, fails, or gets skipped. For example, I’ve used TestNG listeners such as ITestListener to capture screenshots automatically whenever a test fails and attach them to the report. This helps in debugging and improves the overall reporting process. Basically, listeners help make the framework more dynamic, reduce manual effort, and ensure that repeated actions like logging or screenshot capture happen consistently across all tests.

3 What are the ways to attach listeners

There are two ways to attach a listener to the test:

1 Using the @Listeners Annotation – This approach allows us to specify the listener class directly at the test class level using the @Listeners annotation. When the test runs, TestNG will automatically trigger the listener methods.

2 Using the testng.xml File – In this method, we configure the listener inside the testng.xml file by defining the fully qualified class name under the <listeners> tag. This is useful when we want to apply listeners globally across multiple test classes.

After attaching the listener through either of these two ways, when we run the tests, the listener methods will automatically get triggered, and we will see logs such as “Test Started,” “Test Passed,” “Test Failed,” or “Test Skipped” in the console. Apart from logging, listeners can also be enhanced to integrate with reporting tools like Extent Reports or to capture screenshots for failed cases, making them very useful for real-time reporting and debugging.

4 What are method in listeners

The main listener interfaces include ITestListener, ISuiteListener, and IInvokedMethodListener. Among these, the ITestListener interface is most commonly used and provides several useful methods such as onTestStart(), which executes before each test method begins; onTestSuccess(), which runs when a test passes successfully; onTestFailure(), which executes when a test fails and is often used to capture screenshots or log error details; and onTestSkipped(), which runs when a test is skipped. Additionally, onStart() executes before the test suite begins, and onFinish() executes after all tests in the suite have completed. These methods help monitor the test execution flow, generate detailed reports, capture screenshots for failures, and maintain logs, making the Selenium framework more efficient, informative, and maintainable.


5 What are the different listener interfaces available in TestNG and how have you used them?

→ In TestNG, commonly used listeners are ITestListener, ISuiteListener, and IInvokedMethodListener. I’ve mainly used ITestListener for logging, taking screenshots on failure, and updating reports automatically.

6 Can you describe a scenario in your project where you implemented a custom listener and what value it added?

In my project, I created a custom listener to capture screenshots whenever a test failed and automatically attached them to the extent report. It helped identify UI failures quickly and improved debugging efficiency.

7 How do you configure listeners in TestNG—through annotations or the XML file—and why would you choose one approach over the other?

We can configure listeners using the @Listeners annotation in the test class or by adding them in the testng.xml file. I prefer XML configuration for better reusability across multiple test classes.

8 Which listener method do you use to capture screenshots on test failure, and how do you integrate that into your report?

I use the onTestFailure() method of ITestListener to capture screenshots when a test fails, then attach the image path or embed it directly into my extent or allure report.

9 How do listeners help when executing tests in parallel or across suites in CI/CD pipelines?

Listeners automatically handle logging, reporting, and failure capture for each test thread, which helps maintain consistent reporting even when tests run in parallel through Jenkins or Maven.

10 Have you ever used the IInvokedMethodListener or IAnnotationTransformer interfaces? If yes, give an example of how they improved your framework.

Yes, I used IAnnotationTransformer to dynamically assign retry logic to failed tests and IInvokedMethodListener to log method-level execution, which helped manage flaky tests more effectively.

11 What are the differences between an ITestListener and an ISuiteListener in terms of execution context?

ITestListener works at the individual test method level, while ISuiteListener executes before and after the entire test suite, making it useful for setup or cleanup at the suite level.

12 How do you ensure your listener-based logging and reporting remains stable when your tests grow in number or complexity?

I maintain a centralized listener utility class with thread-safe operations and integrate it with Extent Reports, ensuring consistent logs even when tests are executed in parallel or across multiple environments.


## 17 UtilityClassObject

1 What is UtilityClassObject

UtilityClassObject is designed to manage WebDriver and ExtentTest objects in a thread-safe manner, which is especially important during parallel test execution. When multiple tests run simultaneously, sharing the same WebDriver or ExtentTest instances can cause conflicts, such as overlapping commands, mixed logs, or inconsistent results. To prevent this, UtilityClassObject uses ThreadLocal, which ensures that each test thread gets its own independent copy of WebDriver and ExtentTest. Setter methods store these objects in the thread-local storage at the start of the test, and getter methods retrieve them during execution. This approach isolates each test, keeping reports, logs, and browser actions separate, making parallel execution reliable and maintaining clean, accurate test reports. Essentially, it provides each test thread with its own private workspace, avoiding interference between tests.


2 What is ThreadLocal

ThreadLocal in Java is a special class used to create variables that are local to each thread. In other words, every thread that accesses a ThreadLocal variable gets its own separate copy, so the variable is not shared between threads.

In Selenium automation, ThreadLocal is often used when running tests in parallel (for example, using TestNG parallel execution). It helps ensure that each test thread has its own WebDriver instance, preventing conflicts and making the framework thread-safe.

we often use listeners (like ITestListener) along with ThreadLocal to track the test status for each thread separately. This helps in logging, taking screenshots, and generating accurate reports for every test execution, even when tests are running concurrently.

3 How to implement UtilityClassObject

To implement UtilityClassObject, you first create a utility class that contains two ThreadLocal variables—one for WebDriver and one for ExtentTest. These variables ensure that each test thread gets its own independent copy, preventing interference when tests run in parallel. You then create getter and setter methods for both WebDriver and ExtentTest so that you can assign and retrieve these objects for the current thread during test execution. In your test setup, you assign a WebDriver instance and an ExtentTest instance to the current thread using the setter methods. During the test, whenever you need to interact with the browser or log test information, you retrieve the thread-specific instances using the getter methods. This approach ensures that each test has its own isolated browser session and reporting object, avoiding conflicts, maintaining clean logs, and making parallel execution reliable and thread-safe.

## 18 ExcelUtility

1 What is DDT

DDT, or Data-Driven Testing, is a testing approach where test data is separated from the test scripts, allowing the same test case to run multiple times with different sets of input data. In Selenium, we use DDT to validate the functionality of an application for various data combinations without writing multiple test cases.

2 What is ExcelUtility

ExcelUtility is a reusable utility class used in Selenium frameworks to handle reading and writing data from Excel files. In real-time automation projects, test data is usually kept in Excel sheets instead of hardcoding it in the script, because Excel makes it easier to maintain, modify, and share test data. The ExcelUtility class helps us fetch data, count rows, and insert or update values into Excel, which makes data-driven testing possible.

In companies, this is very useful because it supports data-driven testing, where the same test can run with multiple sets of data. It also improves maintainability, since if any value changes, we just update the Excel file instead of changing the code. The utility class centralizes all Excel operations like reading cell data, writing results back, and getting row counts, making it reusable and consistent across the whole framework.

2 How to implement ExcelUtility.

To implement ExcelUtility, first we need to import the Apache POI library because Java itself does not provide direct support for Excel handling. Inside the utility class, we create methods for different operations. For example, a method like getDataFromExcel() is used to fetch cell data from a given sheet by passing the file path, sheet name, row index, and cell index. Similarly, getLastRow() helps us find the total number of rows in a sheet, which is useful when running tests with multiple sets of data. Another method like setDataIntoExcel() allows us to insert or update values into specific cells, which can be used to store test results or logs back into the Excel file.

The actual implementation uses FileInputStream to open the Excel file and WorkbookFactory to create the workbook instance. From there, we fetch the required sheet, row, and cell. To write into Excel, we use FileOutputStream after updating the cell value. It’s also important to close the workbook to avoid memory leaks.

In test cases, instead of hardcoding values like usernames or passwords, we can call ExcelUtility.getDataFromExcel() to fetch them dynamically from the Excel sheet. This makes our framework data-driven, more flexible, and easier to maintain. In short, ExcelUtility separates test data from test scripts, improves reusability, and supports large-scale testing where test data frequently changes.

4 How do you implement data-driven testing in your automation framework?

In my framework, I’ve implemented data-driven testing using TestNG’s @DataProvider annotation and external files like Excel or JSON. I fetch input values from these files using Apache POI or simple file readers and pass the data to test methods dynamically. This helps me test multiple data combinations without hardcoding any values in the script.

5 What types of external data sources have you used for DDT, and why?

I’ve mainly used Excel sheets with Apache POI, as they are easy for testers or business teams to maintain. I’ve also used CSV and JSON files when working with API or configuration-based data because they are lightweight and easily readable by automation scripts.

6 What key benefits and challenges have you experienced with DDT?

The main benefit is reusability — the same test logic can validate multiple datasets. It also improves coverage and reduces duplication. However, the challenge is maintaining large datasets and ensuring synchronization between the test logic and changing data formats.

7 How do you design test cases so that data is separated from logic?

I follow a modular framework structure — all test data is stored in a dedicated folder (like Excel or JSON files), and scripts just read data at runtime. This keeps scripts clean, readable, and easier to maintain when data changes.

8 How do you handle large datasets in DDT without slowing down regression?

I categorize test data — only critical or high-priority data sets are executed in smoke runs. For full regression, I use batch or parallel execution in TestNG and Jenkins pipelines to balance performance and coverage.

9 How have you handled negative or invalid data scenarios through DDT?

I maintain separate sheets or flags for invalid or boundary data. During execution, my test logic reads the “valid/invalid” tag and verifies whether the application shows correct error messages or validation alerts.

10 What tools or libraries do you use in Java/Selenium to read test data?

For Excel, I use the Apache POI library. For JSON, I use JSON-simple or Jackson. For CSV files, I use the built-in Java IO or OpenCSV. These help me fetch and parse external data easily for runtime execution.

11 How do you ensure maintainability when test data changes frequently?

I store all test data in a single source file and map it with keys. So if a value changes, it only needs to be updated once. I also implement version control (Git) for tracking data changes over time.

12 How do you integrate DDT with TestNG and ensure each iteration is reported separately?

Using @DataProvider, I pass multiple data sets to one test method. TestNG automatically logs each iteration separately in the report, showing which data set passed or failed. I also attach screenshots and logs per iteration for clarity.

13 How do you manage test data for DDT in CI/CD environments?

In Jenkins, I store data files in the project workspace or link them through Git so that every pipeline run uses the latest version. I also ensure cleanup scripts reset or recreate data before each run to maintain consistency.

## 19 PropertyFile

1 What is common data

In automation testing, Common data refers to the set of values or inputs that are shared across multiple test cases. These include reusable information like URLs, usernames, passwords, browser names, or environment details that don’t change frequently. Instead of hardcoding these values in every script, I store them in a centralized location such as a properties file, Excel sheet, or configuration class. This makes the framework more maintainable and reduces duplication — so if any common value changes, I just update it once and all related tests automatically use the new data.

2 What is property file

A property file is a simple text file that stores configuration data in key–value pairs. In Selenium, we use it to store common test data like URL, browser, username, password, and timeouts. This helps avoid hardcoding, makes the framework more flexible, and allows us to maintain environment-specific data easily. If any value changes, we just update the property file instead of touching the code.


3 How you implemented property fileUtility

In my framework, I implemented a property file to store all the common configuration data like URL, browser name, username, password, and timeouts. This helps to avoid hardcoding values in the test scripts. I created a FileUtility class that reads the property file using FileInputStream and the Properties class provided by Java. Inside this utility, I used the getProperty() method to fetch values based on the key. For example, if I need the application URL or browser name in my test script, I just call the utility method with the key instead of hardcoding it. This makes the framework more flexible and easy to maintain because whenever there is a change, like a new URL or credentials, I only need to update the property file and not the test code. Overall, it centralizes common data, improves reusability, and makes the framework more professional.


## 20 Extent Report

1 What is Extent Report

Extent Reports is a popular reporting library used in automation testing, especially with Selenium and TestNG, to generate interactive and visually appealing HTML reports. Unlike the default TestNG reports, which are basic and plain, Extent Reports allows testers to log detailed test execution steps, including pass/fail status, informational messages, and even screenshots for failed steps. It provides a clear, structured, and easy-to-read report that helps both testers and stakeholders understand the test results quickly.

2 Have you used Extent Report

In my projects, I have used Extent Reports to generate HTML reports of Selenium test execution. It shows test steps with pass/fail/skip status, environment details like OS and browser, and I can also attach screenshots for failed cases.

3 What are advantage of extent reports

The advantages of Extent Reports over default TestNG reports are significant. First, it allows step-by-step logging, so you can see exactly which actions passed or failed during the test execution. Second, it supports attaching screenshots, which is very useful for debugging failed test cases. Third, it is highly customizable—you can add themes, set report names, authors, categories, and organize tests by modules or priority. Fourth, it supports multiple tests in a single report, giving a consolidated view of the entire test suite. Overall, Extent Reports makes test reporting more professional, interactive, and easier to analyze compared to standard TestNG reports.


4 How to implement extent reports.

In my framework, I generate reports using Extent Reports library. First, I create an object of the ExtentSparkReporter class, which is used to define the report file path, title, name, and theme. Then I create an object of the ExtentReports class, which is the main class responsible for report generation, and attach the reporter to it.

For each test case, I use the ExtentTest interface (returned by the createTest() method of ExtentReports) to log execution steps. While logging, I use the Status enum (like Status.INFO, Status.PASS, Status.FAIL, Status.SKIP) to specify the test step result. At the end, I call the flush() method of ExtentReports to actually write all the logs into the HTML report.


5 How have you integrated ExtentReports into your automation framework?

I have integrated ExtentReports in my Selenium framework by initializing the ExtentReports and ExtentTest objects in the test setup, usually through a listener or base class. During execution, each test’s status—pass, fail, or skip—is logged using extentTest.log(). Finally, I flush the report at the end of the execution so that the HTML report is generated automatically with detailed logs and screenshots.

6 What are the key features of ExtentReports that you use?

I use ExtentReports for its detailed logging, categorized test reporting, and screenshot integration. It provides a clear visual representation of test results, including pass/fail counts, execution time, and stack traces. I also use features like adding custom logs, system information, and attaching screenshots on failure for better debugging.

7 How do you configure ExtentReports for parallel execution?

In parallel execution, I use ThreadLocal with ExtentTest to ensure that each thread logs its own test results without overlapping. This helps maintain report accuracy when multiple tests run simultaneously. Each thread stores a unique ExtentTest instance, and at the end of execution, all reports are merged into a single HTML report.

8 How do you attach screenshots or logs to test steps in ExtentReport?

I capture screenshots whenever a test fails and attach them using extentTest.addScreenCaptureFromPath(). Logs are added using extentTest.log(Status.INFO, “message”) to provide step-by-step details. This helps in identifying exactly where and why a test failed.

9 What information do you include in the report?

My ExtentReports include details like test name, status, execution time, exception message (if any), and screenshots. I also include environment details such as browser, OS, and tester name using extent.setSystemInfo(). This makes the report complete and easy to analyze.

10 How do you manage historical reports?

I maintain historical reports by saving them with unique names—usually based on the timestamp of execution. In Jenkins, I configure it to archive these reports so that I can compare previous and current build results to track progress and failure trends.

11 How do you customize ExtentReports?

I customize reports by setting themes (dark or standard), adding custom logos, project names, and system information. I also add categories or tags to group test cases by module or functionality, making the report more readable and professional.

12 What challenges have you faced with ExtentReports in CI/CD and how did you solve them?

One challenge I faced was reports not showing up correctly after parallel execution. I solved it by using ThreadLocal and proper synchronization of ExtentTest objects. In Jenkins, I configured the build to generate and archive the report after the test run so it’s easily accessible to the team.

13 How do you ensure failed tests are clearly reported?

For failed tests, I capture a screenshot, log the exception message, and mark the test with Status.FAIL. The screenshot is attached directly to the failed test node in the report. This makes it easy to identify the cause of the failure quickly.

14 How do you generate and publish the report in Jenkins?

After test execution, my framework automatically generates the Extent HTML report in the target folder. In Jenkins, I use the “HTML Publisher Plugin” to publish this report after the build completes. This allows stakeholders to view the detailed report directly from Jenkins.


14 Where you are keeping your reports and what tool you are using for reporting and how you are generating report 

In my automation framework, I use Extent Reports as the reporting tool because it provides a detailed, visually appealing, and interactive HTML report. The reports are automatically generated after every test execution and stored inside a dedicated Reports folder within the project directory (for example, ProjectName/Reports/ExtentReport.html). I have integrated Extent Reports with TestNG Listeners, so whenever a test passes, fails, or gets skipped, the report is automatically updated with the test status, execution time, screenshots for failed cases, and detailed logs. After execution, I can directly open the HTML file in a browser to review the results and share it with the team.



## 21 JavaScript Executor

1 What is JavaScript


JavaScript Executor in Selenium is an interface that lets us run JavaScript code directly inside the browser. Normally, we rely on WebDriver methods like click() and sendKeys() to interact with elements, but sometimes these methods fail. For example, if an element is hidden behind another element, overlapped by a pop-up, not yet in the visible viewport, or dynamically loaded after AJAX calls, the normal WebDriver methods may throw exceptions like ElementNotInteractableException or ElementClickInterceptedException. In such cases, JavaScript Executor comes to the rescue because it interacts directly with the DOM rather than relying only on Selenium’s native methods.

2 How to use JavaScript executor

Technically, WebDriver is cast to the JavascriptExecutor interface, and then we can call two main methods: executeScript() for synchronous execution and executeAsyncScript() for asynchronous execution. With this, we can perform actions such as clicking on elements, entering values into input fields, scrolling up and down, scrolling an element into view, generating alerts, highlighting elements for debugging, or even retrieving information like page title, URL, or inner text.


| Method                                                                                  | Description                        | Example                                                                                |
| --------------------------------------------------------------------------------------- | ---------------------------------- | -------------------------------------------------------------------------------------- |
| `executeScript("arguments[0].click();", element)`                                       | Click an element <br> using JS     | `js.executeScript("arguments[0].click();", button);`                                   |
| `executeScript("arguments[0].value='text';", element)`                                  | Enter text <br> into a field       | `js.executeScript("arguments[0].value='Saddam';", inputBox);`                          |
| `executeScript("return arguments[0].value;", element)`                                  | Get the value <br> of an input     | `String val = (String) js.executeScript("return arguments[0].value;", inputBox);`      |
| `executeScript("window.scrollBy(x, y)");`                                               | Scroll the page <br> by x,y pixels | `js.executeScript("window.scrollBy(0, 500)");`                                         |
| `executeScript("window.scrollTo(0, document.body.scrollHeight);");`                     | Scroll to the <br> bottom of page  | `js.executeScript("window.scrollTo(0, document.body.scrollHeight);");`                 |
| `executeScript("arguments[0].scrollIntoView(true);", element);`                         | Scroll until <br> element visible  | `js.executeScript("arguments[0].scrollIntoView(true);", myElement);`                   |
| `executeScript("return document.title;");`                                              | Get page <br> title                | `String title = (String) js.executeScript("return document.title;");`                  |
| `executeScript("return document.readyState;");`                                         | Get page load <br> state           | `String state = (String) js.executeScript("return document.readyState;");`             |
| `executeScript("return document.domain;");`                                             | Get domain <br> name               | `String domain = (String) js.executeScript("return document.domain;");`                |
| `executeScript("return document.URL;");`                                                | Get current <br> URL               | `String url = (String) js.executeScript("return document.URL;");`                      |
| `executeScript("history.back();");`                                                     | Navigate <br> back                 | `js.executeScript("history.back();");`                                                 |
| `executeScript("history.forward();");`                                                  | Navigate <br> forward              | `js.executeScript("history.forward();");`                                              |
| `executeScript("arguments[0].setAttribute('style','border:2px solid red');", element);` | Highlight element <br> with border | `js.executeScript("arguments[0].setAttribute('style','border:2px solid red');", btn);` |
| `executeScript("alert('Hello World!');");`                                              | Display <br> alert popup           | `js.executeScript("alert('Hello World!');");`                                          |
| `executeScript("arguments[0].disabled=false;", element);`                               | Enable a <br> disabled element     | `js.executeScript("arguments[0].disabled=false;", inputBox);`                          |
| `executeScript("return navigator.userAgent;");`                                         | Get browser <br> details (agent)   | `String ua = (String) js.executeScript("return navigator.userAgent;");`                |

3 Why we use JavaScript executor

We use JavaScriptExecutor in automation when certain web elements are not easily handled by regular Selenium commands. It allows direct interaction with the browser’s JavaScript engine, helping perform advanced actions like clicking hidden elements, entering text into fields, scrolling the page, or fetching values that Selenium might not access directly.

It is especially useful when elements are covered by another layer, not visible on the screen, or when synchronization issues occur. With JavaScriptExecutor, we can scroll into view, highlight elements, get page information like title, URL, domain, or trigger browser actions like navigating back, forward, or showing alerts, In short, JavaScriptExecutor helps improve automation stability and flexibility by directly executing JavaScript code when traditional Selenium methods fail.


4 What is JavaScriptExecutor in Selenium and why do we use it?

JavaScriptExecutor is an interface in Selenium that allows us to execute JavaScript code directly in the browser. We use it when normal WebDriver actions like click(), sendKeys(), or scroll fail due to issues such as hidden elements, disabled elements, synchronization problems, or complex DOM structures. It helps as a fallback mechanism to interact with elements that WebDriver cannot handle reliably.

5 How do you create an instance of JavaScriptExecutor?

JavaScriptExecutor is an interface, not a class, so we create its reference by type casting the WebDriver instance.

Syntax:
JavascriptExecutor js = (JavascriptExecutor) driver;

This shows that the driver object is capable of executing JavaScript.

6 Difference between executeScript() and executeAsyncScript()

executeScript() executes JavaScript synchronously, meaning Selenium waits until the script execution is completed and then continues.

executeAsyncScript() executes JavaScript asynchronously and waits until a callback function is explicitly called. It is mainly used for AJAX calls or long-running JavaScript operations.

7 How do you scroll the page using JavaScriptExecutor?

We can scroll the page using JavaScript when normal scrolling does not work.

Scroll by pixels:
js.executeScript("window.scrollBy(0,1000)");

Scroll to a specific element:
js.executeScript("arguments[0].scrollIntoView(true);", element);

Scroll to the bottom of the page:
js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

8 How do you click an element using JavaScriptExecutor?

When WebDriver’s click() fails due to overlapping elements or DOM issues, we use JavaScriptExecutor.

js.executeScript("arguments[0].click();", element);

This directly triggers the click event on the element.

9 How do you return a value using JavaScriptExecutor?

JavaScriptExecutor can return values like title, text, or attributes from the page.

Example:
String title = (String) js.executeScript("return document.title;");

We must explicitly use the return keyword in JavaScript.

10 When would you not use JavaScriptExecutor?

JavaScriptExecutor should not be used as a first approach. It bypasses real user interactions and browser validations, which may hide actual UI issues. It should be used only as a fallback when normal WebDriver actions fail.

11 How do you handle dynamic or hard-to-interact elements using JavaScriptExecutor?

JavaScriptExecutor is used when elements are dynamically loaded, hidden, disabled, or outside the viewport. It helps interact with such elements directly through the DOM without relying on standard WebDriver methods.

12 How do you highlight an element using JavaScriptExecutor?

Highlighting is useful for debugging and reporting.

js.executeScript("arguments[0].style.border='3px solid red'", element);

This visually marks the element during execution.

13 What exceptions can occur when using JavaScriptExecutor?

Exceptions that may occur include JavaScript syntax errors, StaleElementReferenceException if the element is no longer attached to the DOM, and runtime JavaScript errors if the element or object is not found. Improper casting or invalid scripts can also cause failures.


## 22 Which tools and technologies did you use in your Selenium framework?

In my current Selenium framework, I’ve used Java 17, which is the latest long-term support version commonly used in the industry. I’m using Selenium 4.13.0 with TestNG 7.11.0 for test execution and reporting structure. For reporting, I’ve integrated Extent Reports version 5.1.1, For Excel data handling, I use Apache POI 5.2.5, and WebDriverManager 5.2.0 for automatic browser driver setup. I also use Apache Commons IO for screenshot utilities and file handling. In case of mobile testing, I work with Appium 8.6.0.

| **Tool / Technology**                     | **Version** | **Description / Usage**                                        |
| ----------------------------------------- | ----------- | -------------------------------------------------------------- |
| **Java**                                  | 17 (LTS)    | Widely used current industry version for automation frameworks |
| **Selenium**                              | 4.13.0      | For web automation testing                                     |
| **TestNG**                                | 7.11.0      | For test execution, grouping, and reporting                    |
| **Appium**                                | 8.6.0       | For mobile application automation                              |
| **Rest Assured**                          | 5.4.0       | For API testing (validating RESTful web services)              |
| **Apache POI**                            | 5.2.5       | For handling Excel files in Data-Driven Testing                |
| **Extent Reports**                        | 5.1.1       | For generating detailed HTML test reports                      |
| **WebDriverManager**                      | 5.2.0       | For automatic driver management (no manual setup needed)       |
| **Apache Commons IO**                     | 2.8.0       | For file handling and I/O operations                           |
| **Screenshot Utility (Commons IO based)** | 5.2.0       | For capturing and storing screenshots during test execution    |



## Version of Tool

## 22 CHALLENGES

What are the automation challenges you faced in your previous project



In my 3.5 years of experience, I’ve faced several challenges during automation testing that helped me grow technically. One of the common issues was when the requirements kept changing. This made it hard to plan test cases in advance. I also faced bugs that didn’t always happen—like they appeared once and then never again. These were hard to reproduce and took extra time to investigate and raised.



One technical challenge I faced was synchronization issues, where elements took time to load and caused test failures. To handle this, I implemented implicit waits for global delays, explicit waits for specific conditions, and custom waits for dynamic content. This helped improve the stability and reliability of our automation scripts.


At one point, I  faced tool version compatibility issues — for example, after upgrading the browser or WebDriver, some scripts started failing due to mismatches between the browser version, Selenium WebDriver, and dependencies. To fix this, we ensured all tools and libraries were compatible, updated the required versions in the pom.xml, and used WebDriverManager to handle driver versions dynamically. This helped restore stability and avoided manual driver setup issues.



One of the challenges I faced was dealing with dynamic elements whose attributes like IDs or classes changed frequently, leading to script failures. To overcome this, I avoided direct static locators and instead used stable strategies like relative XPath and CSS selectors. I also applied advanced XPath axes such as ancestor, descendant, parent, child, and sibling to locate elements based on their relationship with nearby stable elements. This approach helped me build more robust and maintainable test scripts, especially for pages with complex or dynamic DOM structures.



Apart from that, I regularly worked under tight deadlines, so that's why I had to prioritize testing and focus on critical areas first. Also, sometimes I had to clearly explain the impact of a bug to developers to make them understand why it needed to be fixed. Good communication really helped in such cases. These challenges taught me to stay flexible, improve communication, and manage my time better during testing.



Sometimes developers and testers had different understanding of a feature. A developer might developed implement a feature with a certain logic in mind, but the tester might expect it to behave differently based on their understanding of the requirements. This caused chaos confusion and delays. What lessened I have acquired that If I'm having any sort of confusion but learned to ask questions early, get clear understanding, and keep proper documentation to avoid such gaps.

## 23 AUTOMATION ROLES AND RESPONSIBILITIES

I closely worked in an Agile environment, where I actively participated in all Agile ceremonies like sprint planning, daily stand-ups, and retrospectives.
I made sure to understand the project requirements, user stories clearly and manual test cases so that I could plan and prioritize my testing activities effectively within each sprint and to get clarity over functionality.
I was actively involved in the script development process by analyzing manual test cases and functional requirements. Based on that, I designed and executed test scripts to ensure coverage of key business areas, scenarios and functionality.
I also maintained a Requirement Traceability Matrix (RTM) to ensure that all the test cases were properly mapped to the corresponding requirements. This helped in tracking test case coverage and ensured that no requirement was left untested.
I was contributing in creating and maintaining POM (Page Object Model) classes to store web elements in a centralized object repository, which helped in improving code reusability and maintainability in our automation framework.
I ensured all test scripts were executed and validated locally for accuracy and correctness before adding them to the shared automation framework for further execution.
If a valid defect was identified during local execution, I analyzed the issue thoroughly and logged it in JIRA with complete details including steps to reproduce, screenshots, and logs. As a Test Engineer, my goal was to ensure that every defect was clearly documented and visible to the entire team for quick understanding and resolution.
I was involved in retesting for resolved defects and executing regression test suites to ensure the overall stability and functionality of the application after code changes.
I used Git commands to manage all our automation scripts. I regularly committed changes, I worked on separate branches for new feature testing, and my code got merged after proper review. This helped our team to collaborate efficiently without overwriting each other’s work.
I’ve used Maven commands to run our test suites, mainly during regression cycles and before releases. It helped us ensure the application was stable and to make sure everything is working fine and to catch bugs early.
I was involved in debugging process of the failed test scripts by checking logs, screenshots, and error messages. I fixed issues in scripts like broken locators or synchronizations.
I also collaborated with developers to confirm whether the issue was due to a script error or an actual defect in the application.
I also used breakpoints and step-by-step execution in the IDE to trace the flow of the test script.


## 24 OOPS concept in your project

In my Selenium framework, I have implemented all four OOPs concepts—Encapsulation, Inheritance, Abstraction, and Polymorphism. I used encapsulation by creating page classes (like LoginPage, HomePage) where all WebElements are declared as private and accessed using public methods. This helps keep the element locators and actions safe and reusable. For inheritance, I created a BaseClass that includes common setup methods like browser launch, teardown, and waits. Other test classes extend this BaseClass to reuse those methods, reducing code duplication. I applied abstraction by creating an interface called BrowserActions which includes abstract methods like clickElement(), enterText(), and waitForElement(). These are then implemented in a utility class, so the actual Selenium code stays hidden from the test logic. Lastly, I used polymorphism by method overloading in utility classes—for example, I created multiple click() methods: one that accepts a By locator and another that accepts a WebElement. This way, I can use the same method name for different situations, making my framework more flexible and readable.

## 25 Which tools and technologies did you use in your Selenium framework?

In my current Selenium framework, I’ve used Java 17, which is the latest long-term support version commonly used in the industry. I’m using Selenium 4.13.0 with TestNG 7.11.0 for test execution and reporting structure. For reporting, I’ve integrated Extent Reports version 5.1.1, For Excel data handling, I use Apache POI 5.2.5, and WebDriverManager 5.2.0 for automatic browser driver setup. I also use Apache Commons IO for screenshot utilities and file handling. In case of mobile testing, I work with Appium 8.6.0.

| **Tool / Technology**                     | **Version** | **Description / Usage**                                        |
| ----------------------------------------- | ----------- | -------------------------------------------------------------- |
| **Java**                                  | 17 (LTS)    | Widely used current industry version for automation frameworks |
| **Selenium**                              | 4.13.0      | For web automation testing                                     |
| **TestNG**                                | 7.11.0      | For test execution, grouping, and reporting                    |
| **Appium**                                | 8.6.0       | For mobile application automation                              |
| **Rest Assured**                          | 5.4.0       | For API testing (validating RESTful web services)              |
| **Apache POI**                            | 5.2.5       | For handling Excel files in Data-Driven Testing                |
| **Extent Reports**                        | 5.1.1       | For generating detailed HTML test reports                      |
| **WebDriverManager**                      | 5.2.0       | For automatic driver management (no manual setup needed)       |
| **Apache Commons IO**                     | 2.8.0       | For file handling and I/O operations                           |
| **Screenshot Utility (Commons IO based)** | 5.2.0       | For capturing and storing screenshots during test execution    |


## 26 Screenshot 

1 What is screenshot

In Selenium, a screenshot is basically a captured image of the browser at a particular point during test execution. It is very useful because it helps in bug reporting—when a test fails, a screenshot gives developers a clear idea of what went wrong. It also serves as evidence that a test was executed on a specific page or functionality, and it helps in debugging by showing the exact UI state when something unexpected happens. Many teams also include screenshots in reports like ExtentReports or Allure to provide visual proof of the test run. Screenshots can be taken in two main ways: one is a full-page screenshot, where we capture the entire visible browser window, and the other is an element screenshot, where we capture only a specific element like a button, logo, or text field. Depending on the requirement, we use either of these approaches to make our testing more effective and reliable.

2 How to implement screenshot

In Selenium, we capture screenshots using the TakesScreenshot interface. Since WebDriver itself doesn’t have a direct method to take screenshots, we first cast our driver object to TakesScreenshot. Then we call the getScreenshotAs() method, which captures the current state of the browser and returns it in the format we specify, usually as a file. Finally, we save that file to a permanent location on our system using the File class and FileHandler.copy(). This way we can preserve the screenshot and use it for bug reporting, debugging, or attaching in test reports. Depending on the need, we can capture the full browser window or even a specific element by calling getScreenshotAs() on a WebElement

3 If the screenshot is not valid then what will you do.

If the screenshot captured in the report is not valid or doesn’t show the correct state of the application, I first verify whether the screenshot was taken before or after the failure. Sometimes, timing issues or asynchronous actions cause incorrect captures. To fix this, I make sure the screenshot is captured exactly at the moment of failure using the onTestFailure() method in the TestNG Listener.

If the issue still persists, I debug the screenshot utility method — checking whether the driver instance is active and the correct window or tab is in focus. I also ensure proper synchronization so that the page is fully loaded before taking the screenshot. After correction, I re-run the failed test to confirm that valid screenshots are now attached to the report.


## 27 Framework Explanation 
## Script based practical Question

**1 Write Generic code for Read Data From Excel.**

```java

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.*;

public class ExcelUtility {

    public String getDataFromExcel(String path, String sheet, int indexRow, int indexCell) 
            throws EncryptedDocumentException, IOException {

        FileInputStream fis = new FileInputStream(path);
        Workbook wb = WorkbookFactory.create(fis);
        Sheet sh = wb.getSheet(sheet);
        Row row = sh.getRow(indexRow);
        String data = row.getCell(indexCell).toString();
        wb.close();
        return data;
    }

    public int getLastRow(String path, String sheet) 
            throws EncryptedDocumentException, IOException {

        FileInputStream fis = new FileInputStream(path);
        Workbook wb = WorkbookFactory.create(fis);
        int rowNum = wb.getSheet(sheet).getLastRowNum();
        wb.close();
        return rowNum;
    }

    public void setDataIntoExcel(String path, String sheet, int index, String value) 
            throws EncryptedDocumentException, IOException {

        FileInputStream fis = new FileInputStream(path);
        Workbook wb = WorkbookFactory.create(fis);
        Sheet sh = wb.getSheet(sheet);
        Row row = sh.getRow(index);
        Cell cell = row.createCell(index);
        cell.setCellValue(value);
        wb.close();

        FileOutputStream fos = new FileOutputStream(path);
        wb.write(fos);
        wb.close();
    }
}

```
**2 Write Generic Code for Properties Class.**

``` java

public class FileUtility {

    public String getCommonDataFromPropertyFile(String key) throws IOException {
        FileInputStream fis = new FileInputStream("./commdata.properties");
        Properties p = new Properties();
        p.load(fis);
        return p.getProperty(key);
    }
}

FileUtility fUtil = new FileUtility();
String url = fUtil.getCommonDataFromPropertyFile("url");
driver.get(url);

```
**3 Write syntax for taking screenshot of an element.**

``` java
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ElementScreenShot {
    public static void main(String[] args) throws IOException, InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement englishBtn = driver.findElement(By.xpath("//div[@class='icp-button']"));

        Thread.sleep(4000);
        js.executeScript("arguments[0].scrollIntoView(true);", englishBtn);

        File src = englishBtn.getScreenshotAs(OutputType.FILE);
        File target = new File("./Screenshots/logo1.png");
        FileHandler.copy(src, target);

        driver.quit();
    }
}

```
**4 Write syntax for taking screenshot of an webpage.**

```java

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShote {
    public static void main(String[] args) throws InterruptedException, IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in");

        Thread.sleep(6000);

        TakesScreenshot ts = (TakesScreenshot) driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        File f = new File("./Screenshots/screenshot.jpeg");
        FileHandler.copy(src, f);

        driver.quit();
    }
}
```
**5 Write and explain the syntax of explicit wait.**

```java 
// Import statements
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

// Create WebDriverWait object with max 10 seconds wait
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

// Wait until the login button is clickable, then click it
WebElement loginBtn = wait.until(ExpectedConditions.elementToBeClickable(By.id("login")));
loginBtn.click();

```
how will u upload file and download file
Which vergion control tool you have used in your project.
Write the git command to create branch, switch branch.
Write the git commands that you used frequently.
Explain how you handle the conflicts.
How you create the pull request.
Script to handle disabled element


automation frameworks.
What is rate limiter
What we limit in rate limiter.


how to save the update in GitHub.
which version control tool you are using
how did resolve the merge conflicts
- What is git fetch
- Difference between git fetch and git merge

maven lifecycle
Dynamic locator 
Dynamic xpath


GitHub how u used to share code from local to master is there any branching done 
8)What is Deadlock
Use of JavaScriptExecutor
how to automate images
Why have preferred excel to store the data why not other files

do you know how to upload the excelfile
how you handled the test data
9.What is multithreading? Where you will use? How to use it Explain?
8)What is Deadlock
Any other approach to create a branch
9. Difference between isDisplayed and isAccessible
7. Can yu handle colour in webpage

10)how you handeled file upload popup and file download popup?
11)what are the ways to perform click?
6)what exceptions you encountered in your project?
7)Explain about soft assert and hard assert?
8)How you handled frames?
9)how you handled alert?
Tools which are used for RestAssured framework devlopment.
Have you ever encountered pseudo elements in your application? If yes, how did you handle them in Selenium?

5. What is the Selenium Version that you have been using? Explain what are enhancements in Selenium 4 w.r.to Selenium 3
6. How do you set up your webdriver in Selenium 3? What has changed in Selenium 4?
2. Framework / Tools and Stack

In my automation framework, I’ve used the concept of threads indirectly through TestNG parallel execution. To handle thread safety, I used ThreadLocal with ExtentTest. Each test runs in its own thread, and ThreadLocal ensures that every thread maintains its own copy of the ExtentTest object. This prevents the reports from overlapping and keeps the logs accurate for each test when multiple tests run simultaneously. So even though I didn’t create threads manually using the Thread class or Runnable interface, this implementation is still based on Java’s threading concept.

Topic or question need to be focused

10 What is git bash
22 How do you check Git history?
What is profiling and why you have used profiling in your maven project.
10 Can we store the dynamic Xpath in POM class?
Return type of getOptions method and get window handles

12 How do you ensure your automation framework handles unexpected exceptions gracefully?

I make sure my automation framework handles unexpected exceptions gracefully by having a base class for common exception handling and using listeners to log and capture screenshots automatically. This helps in debugging and ensures smooth execution of all tests.

To use Maven, first we install Maven and configure it by setting MAVEN_HOME and adding it to the system PATH. After that, we create a Maven project (or convert an existing project) and manage dependencies and build using the pom.xml.
7 Can you give an example of using the Robot class to handle OS-level dialogs that Selenium cannot handle directly? Yes, for example, while uploading a file through a system window, Selenium cannot interact with the OS file chooser. So, we use the Robot class to type the file path and press Enter:

10 Have you ever used the IInvokedMethodListener or IAnnotationTransformer interfaces? If yes, give an example of how they improved your framework.