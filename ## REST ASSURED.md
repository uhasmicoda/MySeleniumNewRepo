## REST ASSURED
## 1 What is backend testing

Backend Testing means testing the part of an application that works behind the scenes — not the part that users can see on the screen. In this type of testing, we don’t open the website or app in a browser; instead, we test the server, database, and APIs directly to make sure everything works properly. The goal is to verify that data is stored correctly in the database, that APIs are sending and receiving the right information, and that all the internal systems are communicating smoothly with each other. Simply put, backend testing ensures that when a user performs any action on the front end (like placing an order or logging in), the backend system processes it correctly and returns the right result.


## 3 What is SOA (Service-Oriented Architecture)

SOA (Service-Oriented Architecture) is a design model where an application is divided into different layers, and each layer has a specific role.

The first layer is the Presentation Layer (Frontend), which is what the user sees and interacts with — like a website or mobile app screen. It is built using technologies such as HTML and JavaScript, and it displays data received from the backend.

The second layer is the Business Layer, which contains the main logic of the application. It handles how data moves between the user and the database. This layer is usually developed using programming languages like Java or Python, and it works through APIs that perform actions such as creating, updating, or deleting information (for example, creating an order or updating user details).

The third layer is the Database Layer, which stores all the application’s data using systems like MySQL. It connects with the business layer through a JDBC jar (Java Database Connectivity), which helps transfer data between the database and the application.

For testing these layers, tools like Postman are used for manual API testing, and Rest Assured is used for automation testing to verify that APIs and backend systems work correctly.

## 4 Use Case: E-commerce (Amazon Example)

In an E-commerce application like Amazon, the backend system has multiple servers that handle different parts of the process. The Inventory Management Server manages product information such as name, price, and quantity. Once products are uploaded here, they become visible on the Amazon app or website. When a user places an order, an Order ID is created, and the Billing & Revenue Server (CRM) checks whether the payment is successful. If the payment goes through, the order status changes to “Order Placed.” Finally, the Logistic Management Server takes care of product delivery to the customer. During this entire process, various APIs are used to perform backend operations like creating, reading, updating, and deleting products, as well as creating or modifying orders. This ensures smooth coordination between servers and accurate order management.

## 5 Why backend testing is required

Backend testing is required to make sure that the application’s internal systems — such as the server, database, and APIs — are working correctly and reliably. It ensures that data is stored, retrieved, and processed properly without any errors. Even if the front end looks fine, the application can fail if the backend is not functioning as expected.

This type of testing helps verify that all business rules, database connections, and APIs are performing the right actions. It also helps find issues like data mismatches, incorrect responses, or slow server performance before the user faces them. In short, backend testing is important to maintain data accuracy, system stability, and smooth communication between all layers of the application.

## 6 🔍 Difference Between Frontend and Backend Testing

| **Frontend Testing**                                                                                 | **Backend Testing**                                                                                                                    |
| ---------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- |
| 1. Frontend testing is always performed on the **GUI (Graphical User Interface)**.                   | 1. Backend testing is performed on the **business layer**, and the tester should have knowledge of **databases** and **backend APIs**. |
| 2. Testing becomes **slower** because it depends on **browser rendering time**.                      | 2. It is **faster** and saves time since no browser is involved.                                                                       |
| 3. **Performance testing** is not easy on the frontend.                                              | 3. **Performance testing** is easier and faster on the backend.                                                                        |
| 4. **Ad-hoc**, **usability**, and **compatibility** testing are possible on the frontend.            | 4. **Ad-hoc**, **usability**, and **compatibility** testing are **not possible** in backend testing.                                   |
| 5. **Selenium automation** is used for frontend testing (also known as **BBT – Black Box Testing**). | 5. **Web service testing** is done in backend testing (includes **WBT – White Box Testing** and **GBT – Gray Box Testing**).           |
| 6. **End-to-end testing** is easier to perform.                                                      | 6. **End-to-end testing** is more difficult because multiple systems are connected.                                                    |
| 7. Common tools: **Selenium**, **QTP (UFT)**, **TestComplete**, etc.                                 | 7. Common tools: **SOAP UI**, **Postman**, **Fiddler**, **REST Client**, **Rest Assured**, etc.                                        |


## 7 What is rest assured

Rest Assured is a Java-based library used for automating RESTful API testing. It provides a simple and readable syntax for sending HTTP requests (like GET, POST, PUT, DELETE) and validating responses without needing to write complex code. It’s built on top of Java and integrates easily with tools like Maven, TestNG, and Jenkins, which makes it suitable for CI/CD pipelines
Rest Assured provides a simple and powerful way to test REST APIs by sending HTTP requests and validating responses. It supports features like validating status codes, response body, headers, and response time. This makes it one of the most widely used tools for API automation testing.

Rest Assured can be used with multiple programming languages such as Java, Kotlin, Scala, and Groovy. It is especially popular among testers using Java for automation.

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

## 8 Rest assured project setup

In Rest Assured project setup, we first create a Maven project in Eclipse and add all the required dependencies in the pom.xml file. The main dependency is Rest Assured, which is used for API automation testing. Along with that, we can add json-simple for creating or parsing JSON data, TestNG for writing and managing test cases, and mysql-connector-java if we need to connect and validate data from a database. Optionally, selenium-java can also be added if we want to integrate API and UI testing together. Once the dependencies are added, we create a package under the src/test/java folder and write a test class inside it. Finally, we can write a simple Rest Assured test, such as sending a GET request to an API and verifying the response. This setup helps us structure our API automation testing efficiently.

## 9 Rest assured class diagram

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

## 10 Crud operation with and without bdd

In API testing, CRUD stands for Create, Read, Update, and Delete, which represent the basic operations on any resource. For example, in Rest Assured, Create is done using POST, Read using GET, Update using PUT/PATCH, and Delete using DELETE methods.

In non-BDD (traditional) style, we directly use Rest Assured methods to create requests and validate responses. However, in BDD (Behavior Driven Development) style, we use a more readable format with given(), when(), and then() keywords — where given() sets up the request, when() sends it, and then() validates the response.

BDD in Rest Assured also follows the method chaining concept, which allows these methods to be linked in a single flow, making the code cleaner, more readable, and easy to maintain. Based on my experience, I prefer using the BDD style as it provides better structure, collaboration, and clarity in test scripts.

## 🧩 Non-BDD (Traditional) Style

```java
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class NonBDDExample {
    public static void main(String[] args) {
        // Base URL
        RestAssured.baseURI = "https://reqres.in/api";

        // Sending GET request and capturing response
        Response response = RestAssured
                .given()
                .header("Content-Type", "application/json")
                .get("/users?page=2");

        // Validating the status code
        System.out.println("Status Code: " + response.getStatusCode());
        System.out.println("Response Body: " + response.asPrettyString());
    }
}
```

### 🌿 BDD Style (Using Method Chaining)

```java

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class BDDExample {
    public static void main(String[] args) {
        RestAssured.baseURI = "https://reqres.in/api";

        given()
            .header("Content-Type", "application/json")
        .when()
            .get("/users?page=2")
        .then()
            .statusCode(200)
            .body("data[0].email", containsString("@reqres.in"))
            .log().all();
    }
}
``` 


 ## 4 Crud operation

In API testing, CRUD stands for Create, Read, Update, and Delete, which represent the four main operations we perform on resources. Using Rest Assured, we can automate and validate each of these operations easily in Java.

The first operation is Create, which corresponds to the HTTP POST method. It is used to create or add new data on the server. In Rest Assured, we perform this by sending a POST request along with a request body in JSON format. For example, when we create a new user or record, we include the details in the body using a JSONObject or POJO class, and then call given().body(data).when().post(endpoint). We validate the response using then().statusCode(201) to ensure the resource was created successfully.

The next operation is Read, which is handled by the HTTP GET method. It is used to fetch or retrieve information from the server without making any changes to the data. In Rest Assured, we use given().when().get(endpoint) to send a GET request and check the response using assertions like then().statusCode(200) or by verifying specific fields in the response body using JSONPath. For example, fetching a list of users or details of a single user based on their ID.

The third operation is Update, which is done using either the HTTP PUT or PATCH method. PUT is used to completely update an existing record, while PATCH updates only specific fields. In Rest Assured, we send an updated JSON body with the request using given().body(updatedData).when().put(endpoint) or .patch(endpoint). After sending the request, we validate that the server returns a 200 or 204 status code, indicating the record was updated successfully.

Finally, we have Delete, which corresponds to the HTTP DELETE method. This operation is used to remove an existing record or resource from the server. In Rest Assured, we simply call given().when().delete(endpoint) and then verify the response code, which is usually 200 or 204, to confirm that the resource has been deleted successfully.

In short, Rest Assured makes CRUD operations simple and readable using the BDD style — given() for request setup, when() for action, and then() for validation. These operations help ensure that our APIs handle data correctly throughout their lifecycle — from creation to deletion.




## 11 🧩 What is Serialization and Deserialization ?

Serialization is the process of converting a Java object into a format like JSON or XML so that it can be easily sent over the network. In API testing, we usually use serialization when we need to send request data in JSON format. Instead of manually creating a JSON string, we create a Java object and let the serialization process automatically convert it into JSON. This makes our code cleaner, easier to maintain, and reduces chances of human error. For example, in Rest Assured, when we pass a Java object in the .body() method, it gets automatically serialized into JSON before sending the API request.


Deserialization is the reverse process of serialization. It means converting a JSON or XML response from the API back into a Java object. In simple terms, when we receive a response from the server, instead of reading raw JSON data, we can map that response directly to a Java class (POJO). This makes it easier to extract and validate specific fields like name, id, or status. In Rest Assured, deserialization happens automatically when we use methods like .as(ClassName.class) to convert the response body into a Java object. It helps in writing clean, readable, and easily maintainable test scripts.




12 ## How to perform Serialization and Deserializatio ?

Serialization in Java is the process of converting a Java object into a stream of bytes so that it can be easily stored in a file or transferred over a network. In simple words, it helps to save the state of an object. Java provides a class called ObjectOutputStream to perform serialization. When we serialize an object, the data is converted into a non-readable binary format and can be stored in a file using FileOutputStream.

On the other hand, Deserialization is the reverse process of serialization. It means converting the byte stream back into the original Java object. This allows us to restore the saved state of an object. In Java, deserialization is done using the ObjectInputStream class, which reads the binary data from a file (using FileInputStream) and reconstructs the object in memory.

For example, if we have a class named NFSGame that implements the Serializable interface, we can serialize its object using ObjectOutputStream and later deserialize it using ObjectInputStream. By doing this, we can store and retrieve object data such as game name, level, and score whenever needed.

This concept is very useful because it teaches how data from objects can be converted and transferred, which is the same concept we use in API testing when we serialize and deserialize Java objects into JSON format using tools like Rest Assured. So, having a good understanding of Java serialization and deserialization really helps in understanding API automation more clearly.





| **Feature**                | **Serialization**                                                     | **Deserialization**                                               |
| -------------------------- | --------------------------------------------------------------------- | ----------------------------------------------------------------- |
| **Definition**             | Process of converting a Java object into a byte stream (binary data). | Process of converting a byte stream back into a Java object.      |
| **Purpose**                | Used to save the state of an object or send it over a network.        | Used to restore the state of an object that was previously saved. |
| **Classes Used**           | `ObjectOutputStream` and `FileOutputStream`                           | `ObjectInputStream` and `FileInputStream`                         |
| **Direction of Data Flow** | Java Object ➜ Byte Stream (Binary Data)                               | Byte Stream (Binary Data) ➜ Java Object                           |
| **Interface Required**     | Class must implement the `Serializable` interface.                    | No specific interface required; reads the serialized object.      |
| **Output Format**          | Non-readable binary data stored in a file or sent over network.       | Reconstructed Java object in readable form.                       |
| **Method Used**            | `writeObject(Object obj)`                                             | `readObject()`                                                    |
| **Storage File Example**   | Data is stored in a `.ser` file (e.g., `game.ser`).                   | Reads data from the same `.ser` file.                             |
| **Example Classes**        | `ObjectOutputStream`, `FileOutputStream`                              | `ObjectInputStream`, `FileInputStream`                            |
| **Use Case**               | Saving user session, game state, or configuration.                    | Loading saved session, restoring object data.                     |


To achieve serialization in Java, the class must implement the Serializable interface**, which is a **marker interface** (it doesn’t contain any methods). Then we use **ObjectOutputStream** along with **FileOutputStream** to convert the Java object into a byte stream and store it in a file. We call the method **writeObject()` to perform serialization.












