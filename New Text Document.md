1 Git



Git is a distributed version control system. It’s mainly used to track changes in code, manage different versions of a project, and allow multiple people to work on the same codebase at the same time without conflicts.



GitHub is a cloud-based platform built on top of Git. It provides a place where we can store our code repositories online, collaborate with team members, review code through pull requests, and manage issues or tasks. Basically, Git is the version control system, and GitHub is the platform that makes collaboration and project management easier



Git is a distributed version control system that we use to manage our code. In my projects, we used Git with platforms like GitHub. Whenever we worked on a new feature or bug fix, we created separate branches, and once the work was done, we merged them into the main branch through pull requests. During this process, I also handled conflicts when multiple people worked on the same files. Git helped us keep track of changes, roll back if something went wrong, and made collaboration between developers and testers much easier.

## Git Branching and Merging Workflow
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





**2 MAVEN**



**Maven is a build automation and project management tool mainly used for Java projects. It helps in compiling the source code, running the tests, packaging the application, and generating reports. The main advantage of Maven is dependency management — instead of manually adding jar files, we just declare them in the pom.xml and Maven automatically downloads them from the central repository. It also follows a standard project structure and uses plugins like the Compiler plugin and Surefire plugin to handle builds and test execution. In real-time projects, we use Maven not only to run tests but also to integrate with CI/CD pipelines like Jenkins.**



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


3 Jenkins



Jenkins is an open-source automation server that we used mainly for Continuous Integration and Continuous Delivery (CI/CD). In my project, we integrated Jenkins with Git and Maven. Whenever we pushed code to the repository, Jenkins automatically triggered builds, compiled the project using Maven, ran the automated test cases, and generated reports.



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



**4 EXTENT REPORT**



**Extent Reports is a popular reporting library used in automation testing, especially with Selenium and TestNG, to generate interactive and visually appealing HTML reports. Unlike the default TestNG reports, which are basic and plain, Extent Reports allows testers to log detailed test execution steps, including pass/fail status, informational messages, and even screenshots for failed steps. It provides a clear, structured, and easy-to-read report that helps both testers and stakeholders understand the test results quickly.**



**The advantages of Extent Reports over default TestNG reports are significant. First, it allows step-by-step logging, so you can see exactly which actions passed or failed during the test execution. Second, it supports attaching screenshots, which is very useful for debugging failed test cases. Third, it is highly customizable—you can add themes, set report names, authors, categories, and organize tests by modules or priority. Fourth, it supports multiple tests in a single report, giving a consolidated view of the entire test suite. Overall, Extent Reports makes test reporting more professional, interactive, and easier to analyze compared to standard TestNG reports.**







**In my projects, I have used Extent Reports to generate HTML reports of Selenium test execution. It shows test steps with pass/fail/skip status, environment details like OS and browser, and I can also attach screenshots for failed cases.**



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


**5 Exceptions and Their Solutions**



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




**6 LISTENERS**



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



**7 TestNG Annotations**


**In TestNG, annotations are special instructions that we place above methods, starting with the @ symbol, to control the test execution flow. They tell TestNG when and how a particular method should run during the test lifecycle.**



**For example, @BeforeMethod will always run before each test case, @AfterMethod will run after each test case, and @Test is used to mark a method as a test case. Using these annotations, we can easily manage setup, cleanup, grouping of tests, dependencies, and even data-driven testing without writing extra boilerplate code.**



**In TestNG, annotations are special markers used to control the flow of test execution. They are written above methods with the @ symbol and help in organizing the setup, execution, and cleanup of test cases. For example, @BeforeSuite and @AfterSuite run only once before and after the entire test suite, usually for tasks like starting and closing a database connection. @BeforeTest and @AfterTest are executed before and after all tests defined under a <test> tag in the TestNG XML file, often used to launch and close the browser. @BeforeClass and @AfterClass run before and after the first and last method in a test class, typically for login and logout actions. @BeforeMethod and @AfterMethod run before and after each test method, commonly used to set preconditions like navigating to a page and postconditions like taking a screenshot or clearing cookies. Finally, @Test is used to define actual test cases. With these annotations, TestNG provides a structured and flexible way to manage test execution.**


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



8 UtilityClassObject

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


9 What is testing.xlm file.

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
10 Java–Selenium Architecture.


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



11 Screenshot 

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

12 Page Object Model or POM

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


13 WEDRIVER

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

An Excel Utility class is used to read and write test data from external resources like Excel files. This way, we don’t need to hardcode test data such as usernames, passwords, URLs, or input values inside the scripts. Instead, the data is stored in Excel, and our scripts simply fetch it when required.

In companies, this is very useful because it supports data-driven testing, where the same test can run with multiple sets of data. It also improves maintainability, since if any value changes, we just update the Excel file instead of changing the code. The utility class centralizes all Excel operations like reading cell data, writing results back, and getting row counts, making it reusable and consistent across the whole framework.


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
17 SELECT CLASS

The Select class in Selenium is a built-in class used to handle dropdown menus (HTML <select> tags). Normally, Selenium WebDriver cannot directly select options from dropdowns, so we use the Select class to interact with them. With this class, we can select options in three ways: by index, by visible text, or by value. It also provides methods like getOptions() to fetch all available choices, getFirstSelectedOption() to get the currently selected item, and deselectAll() for multi-select dropdowns.


In companies, the Select class is important because dropdowns are very common in real-time applications, such as selecting a country, state, role, or payment type. Using the Select class makes automation scripts simple, readable, and reusable for such scenarios, and avoids writing complex code to handle dropdowns manually.

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
