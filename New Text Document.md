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



