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


## 3 Rest assured class diagram

In Rest Assured, several important classes work together to make API automation smooth and structured. The main class is RestAssured, which acts as the starting point of the framework. It allows us to write REST API test cases in a readable BDD format using methods like given(), when(), and then(). These methods help us build requests, send them, and then validate the responses in a clear, step-by-step way.

Next, we have the RequestSpecification class, which is used to set up all the details of our API request before we send it. For example, we can define the base URI, headers, authentication, parameters, and body content inside it. This helps to avoid repeating the same setup code multiple times. To make our setup even more reusable, we can use the RequestSpecBuilder class. It helps us create common preconditions, like base URIs or headers, once and reuse them in different test cases — improving consistency and reducing duplication.

Once the request is prepared, we send it and receive a Response object. The Response class represents everything returned by the server — such as status code, headers, body, and response time. Using this class, we can extract values from the response body or verify specific fields. For validating responses more systematically, we use the ResponseSpecification class, which defines our expected response conditions like status code, content type, or specific response body values. Just like the request side, we can also use a ResponseSpecBuilder to create reusable response validation templates, which can be applied across multiple test cases.

After that, we have the ValidatableResponse class, which is used to perform assertions and validations. It’s usually called after the then() method. For example, we can check if the status code is 200 or if a field in the JSON response matches an expected value. This makes our tests both readable and reliable.

Apart from these, there are two important helper classes — JSONObject and ObjectMapper. The JSONObject class is used when we want to create JSON request bodies directly in our code, especially for POST or PUT methods. On the other hand, the ObjectMapper class, which comes from the Jackson library, is used for serialization and deserialization — that means it converts Java objects to JSON and vice versa. This is very useful when we work with complex request or response payloads using POJOs.

Overall, these classes work together in a structured flow: we start by defining the request setup using RequestSpecification or RequestSpecBuilder, then send the request using RestAssured methods, capture the response using Response, validate it using ValidatableResponse and ResponseSpecification, and finally use JSONObject or ObjectMapper for handling JSON data. This organized structure makes Rest Assured a powerful and reusable framework for API testing in Java.


| **Class Name**            | **Purpose / Description**                                                                                            | **Common Methods**                                                                           |
| ------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- |
| **RestAssured**           | Main class of Rest Assured — used to start the REST API test using BDD style like `given()`, `when()`, and `then()`. | `given()`, `when()`, `then()`, `get()`, `post()`, `put()`, `delete()`, `baseURI()`, `auth()` |
| **RequestSpecification**  | Used to set the specification of the request such as authentication, headers, parameters, and body.                  | `header()`, `queryParam()`, `pathParam()`, `body()`, `contentType()`, `auth()`               |
| **RequestSpecBuilder**    | Used to create reusable request preconditions (common setup like base URI, headers).                                 | `setBaseUri()`, `addHeader()`, `addQueryParam()`, `setBody()`, `build()`                     |
| **Response**              | Used to receive and store the response of the request (status code, headers, body, etc.).                            | `getStatusCode()`, `getBody()`, `getHeader()`, `jsonPath()`, `asString()`                    |
| **ValidatableResponse**   | Used to validate or assert the response after execution.                                                             | `statusCode()`, `body()`, `header()`, `log().all()`                                          |
| **ResponseSpecification** | Used to define reusable response expectations such as status code and content type.                                  | `expectStatusCode()`, `expectContentType()`, `expectHeader()`                                |
| **ResponseSpecBuilder**   | Used to build a reusable response specification to validate multiple APIs.                                           | `expectStatusCode()`, `expectContentType()`, `build()`                                       |
| **JSONObject**            | Used to create JSON request bodies dynamically for POST/PUT requests.                                                | `put()`, `get()`, `toString()`                                                               |
| **ObjectMapper**          | Used for serialization (Java → JSON) and deserialization (JSON → Java).                                              | `writeValueAsString()`, `readValue()`                                                        |

 