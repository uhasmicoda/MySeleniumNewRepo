## REST ASSURED

## 1 What is rest assured

Rest Assured is a Java-based library used for automating RESTful API testing. It provides a simple and readable syntax for sending HTTP requests (like GET, POST, PUT, DELETE) and validating responses without needing to write complex code. It’s built on top of Java and integrates easily with tools like Maven, TestNG, and Jenkins, which makes it suitable for CI/CD pipelines


In my project, we used Rest Assured to validate backend APIs. It helped us automate test cases for both positive and negative scenarios — for example, verifying response status codes, headers, response body, and JSON schema validation.
We also parameterized test data using TestNG DataProviders, and integrated Rest Assured scripts with Jenkins for continuous testing after each deployment.
It’s especially useful because it works seamlessly with JSONPath and XMLPath, which makes it easy to extract and validate data from API responses.


| Area               | Explanation                                                                                    |
| ------------------ | ---------------------------------------------------------------------------------------------- |
| **Language**       | Built in **Java** (can integrate with frameworks like TestNG, Cucumber)                        |
| **Supports**       | Both **REST** and **SOAP** (partially) APIs                                                    |
| **Libraries used** | Uses **Apache HTTP Client**, **Hamcrest**, **JSONPath**, **XMLPath** internally                |
| **Validation**     | Assertions can be written using **Hamcrest matchers** (like `equalTo`, `containsString`, etc.) |
| **Integration**    | Works with **Postman**, **Jenkins**, **Maven**, and **GitHub** for CI/CD pipelines             |
| **Reporting**      | Can be combined with **Extent Reports**, **Allure Reports**, or **TestNG reports**             |


## 2 Perquisites of rest assured

Prerequisites for Rest Assured:
Before starting with Rest Assured, it’s important to have some basic technical knowledge and tools in place. First, a good understanding of Java programming is required since Rest Assured is built on top of Java. Concepts like classes, methods, loops, exception handling, and collections are commonly used while writing API automation scripts. Next, we use an IDE such as Eclipse or IntelliJ IDEA to create and manage the automation framework, as it provides features like auto-completion, project structure, and easy integration with build tools. A Maven project setup is also essential because Maven helps manage dependencies for Rest Assured, TestNG, and other libraries through the pom.xml file, avoiding the need to handle JAR files manually.

Along with that, a clear understanding of JSON language is very important because most RESTful APIs communicate using JSON format. Knowing how to read, send, and validate JSON data helps in working with request and response bodies effectively. Another prerequisite is familiarity with API documentation such as Swagger or Postman collections, which provides information about endpoints, request types, headers, parameters, and expected responses — this is what guides us while writing automation scripts. Finally, knowledge of TestNG is required since it acts as the testing framework used for structuring test cases, performing assertions, running suites, and generating reports.

In short, before working on Rest Assured, one should have hands-on experience with Java, IDE (like Eclipse), Maven, JSON structure, API documentation, and TestNG, as all these tools and concepts together form the foundation for effective API automation.


| **Prerequisite**      | **Brief Description**                                                          |
| --------------------- | ------------------------------------------------------------------------------ |
| **Java Knowledge**    | Needed to write Rest Assured scripts and handle logic, loops, and collections. |
| **IDE**               | Used to write and run code easily (e.g., Eclipse or IntelliJ).                 |
| **Maven Project**     | Manages dependencies like Rest Assured and TestNG through `pom.xml`.           |
| **JSON Language**     | Common format for API request and response handling.                           |
| **API Documentation** | Provides endpoint details, methods, and parameters (e.g., Swagger).            |
| **TestNG Tool**       | Testing framework to organize, execute, and report test cases.                 |

 