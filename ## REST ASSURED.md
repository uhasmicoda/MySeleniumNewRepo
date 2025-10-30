## REST ASSURED
## 1 What is backend testing

Backend Testing means testing the part of an application that works behind the scenes — not the part that users can see on the screen. In this type of testing, we don’t open the website or app in a browser; instead, we test the server, database, and APIs directly to make sure everything works properly. The goal is to verify that data is stored correctly in the database, that APIs are sending and receiving the right information, and that all the internal systems are communicating smoothly with each other. Simply put, backend testing ensures that when a user performs any action on the front end (like placing an order or logging in), the backend system processes it correctly and returns the right result.


## 2 What is SOA (Service-Oriented Architecture)

SOA (Service-Oriented Architecture) is a design model where an application is divided into different layers, and each layer has a specific role.

The first layer is the Presentation Layer (Frontend), which is what the user sees and interacts with — like a website or mobile app screen. It is built using technologies such as HTML and JavaScript, and it displays data received from the backend.

The second layer is the Business Layer, which contains the main logic of the application. It handles how data moves between the user and the database. This layer is usually developed using programming languages like Java or Python, and it works through APIs that perform actions such as creating, updating, or deleting information (for example, creating an order or updating user details).

The third layer is the Database Layer, which stores all the application’s data using systems like MySQL. It connects with the business layer through a JDBC jar (Java Database Connectivity), which helps transfer data between the database and the application.

For testing these layers, tools like Postman are used for manual API testing, and Rest Assured is used for automation testing to verify that APIs and backend systems work correctly.

## 3 Use Case: E-commerce (Amazon Example)

In an E-commerce application like Amazon, the backend system has multiple servers that handle different parts of the process. The Inventory Management Server manages product information such as name, price, and quantity. Once products are uploaded here, they become visible on the Amazon app or website. When a user places an order, an Order ID is created, and the Billing & Revenue Server (CRM) checks whether the payment is successful. If the payment goes through, the order status changes to “Order Placed.” Finally, the Logistic Management Server takes care of product delivery to the customer. During this entire process, various APIs are used to perform backend operations like creating, reading, updating, and deleting products, as well as creating or modifying orders. This ensures smooth coordination between servers and accurate order management.

## 4 Why backend testing is required

Backend testing is required to make sure that the application’s internal systems — such as the server, database, and APIs — are working correctly and reliably. It ensures that data is stored, retrieved, and processed properly without any errors. Even if the front end looks fine, the application can fail if the backend is not functioning as expected.

This type of testing helps verify that all business rules, database connections, and APIs are performing the right actions. It also helps find issues like data mismatches, incorrect responses, or slow server performance before the user faces them. In short, backend testing is important to maintain data accuracy, system stability, and smooth communication between all layers of the application.

## 5 🔍 Difference Between Frontend and Backend Testing

| **Frontend Testing**                                                                                 | **Backend Testing**                                                                                                                    |
| ---------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- |
| 1. Frontend testing is always performed on the **GUI (Graphical User Interface)**.                   | 1. Backend testing is performed on the **business layer**, and the tester should have knowledge of **databases** and **backend APIs**. |
| 2. Testing becomes **slower** because it depends on **browser rendering time**.                      | 2. It is **faster** and saves time since no browser is involved.                                                                       |
| 3. **Performance testing** is not easy on the frontend.                                              | 3. **Performance testing** is easier and faster on the backend.                                                                        |
| 4. **Ad-hoc**, **usability**, and **compatibility** testing are possible on the frontend.            | 4. **Ad-hoc**, **usability**, and **compatibility** testing are **not possible** in backend testing.                                   |
| 5. **Selenium automation** is used for frontend testing (also known as **BBT – Black Box Testing**). | 5. **Web service testing** is done in backend testing (includes **WBT – White Box Testing** and **GBT – Gray Box Testing**).           |
| 6. **End-to-end testing** is easier to perform.                                                      | 6. **End-to-end testing** is more difficult because multiple systems are connected.                                                    |
| 7. Common tools: **Selenium**, **QTP (UFT)**, **TestComplete**, etc.                                 | 7. Common tools: **SOAP UI**, **Postman**, **Fiddler**, **REST Client**, **Rest Assured**, etc.                                        |


## 6 What is Rest assured

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


## 7 Perquisites of Rest assured

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


## 9 🧩 What is Java Serialization and Deserialization ?

Serialization is the process of converting a Java object into a format like JSON or XML so that it can be easily sent over the network. In API testing, we usually use serialization when we need to send request data in JSON format. Instead of manually creating a JSON string, we create a Java object and let the serialization process automatically convert it into JSON. This makes our code cleaner, easier to maintain, and reduces chances of human error. For example, in Rest Assured, when we pass a Java object in the .body() method, it gets automatically serialized into JSON before sending the API request.


Deserialization is the reverse process of serialization. It means converting a JSON or XML response from the API back into a Java object. In simple terms, when we receive a response from the server, instead of reading raw JSON data, we can map that response directly to a Java class (POJO). This makes it easier to extract and validate specific fields like name, id, or status. In Rest Assured, deserialization happens automatically when we use methods like .as(ClassName.class) to convert the response body into a Java object. It helps in writing clean, readable, and easily maintainable test scripts.


```java
package practice_serialization;

import java.io.*;

// Step 1: Create a class that implements Serializable
class NFSGame implements Serializable {
    String name;
    int level;
    long score;
    int life;

    public NFSGame(String name, int level, long score, int life) {
        this.name = name;
        this.level = level;
        this.score = score;
        this.life = life;
    }
}

public class Run1_serialization_deserialization {
    public static void main(String[] args) throws Exception {

        // Step 2: Create an object to serialize
        NFSGame user1 = new NFSGame("Hasmi", 10, 80000, 2);

        // Step 3: Serialization (object → file)
        FileOutputStream fileOut = new FileOutputStream("f.txt");
        ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
        objOut.writeObject(user1);
        objOut.close();
        fileOut.close();
        System.out.println("✅ Serialization completed successfully!");

        // Step 4: Deserialization (file → object)
        FileInputStream fileIn = new FileInputStream("f.txt");
        ObjectInputStream objIn = new ObjectInputStream(fileIn);
        NFSGame restoredUser = (NFSGame) objIn.readObject();
        objIn.close();
        fileIn.close();
        System.out.println("✅ Deserialization completed successfully!");

        // Step 5: Display restored data
        System.out.println("\n--- Restored Object Data ---");
        System.out.println("Name: " + restoredUser.name);
        System.out.println("Level: " + restoredUser.level);
        System.out.println("Score: " + restoredUser.score);
        System.out.println("Life: " + restoredUser.life);
    }
}

```


## 10 How to acheive Serialization and Deserialization ?

In order to achieve serialization in Java, first we need to make sure that the class implements the Serializable interface. This interface doesn’t have any methods — it just acts as a marker to tell the JVM that objects of this class can be converted into a byte stream.

Next, we create an object of that class which we want to serialize. Then we use two main classes — FileOutputStream and ObjectOutputStream. FileOutputStream is used to create or open a file, and ObjectOutputStream is used to actually convert the object into a stream of bytes and write it into that file using the writeObject() method. Once this is done, the object’s state is safely stored in that file, and we call it the serialization process.

Now, to achieve deserialization, we basically do the reverse process. We use FileInputStream to read the same file and then use ObjectInputStream to convert the byte stream back into a real Java object using the readObject() method. Since readObject() returns an object type, we typecast it to our original class type.

Finally, when we print the object’s data, it shows the same values that were stored before serialization — which confirms that both serialization and deserialization have worked successfully.

In short, serialization helps to save the state of an object or transfer it over a network, and deserialization helps to recreate that object back in memory whenever required.

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


## 11 Jackson Serialization

Jackson serialization is the process of converting a Java object into a JSON format using the Jackson library, which is one of the most widely used libraries in Java for handling JSON data. In simple words, it helps us convert our Java objects into JSON strings that can easily be used for API communication or stored in files or databases. To achieve serialization and deserialization, Jackson provides a powerful class called ObjectMapper, which acts as the main engine for converting between Java objects and JSON data.

It also supports advanced features like annotations (@JsonIgnore, @JsonProperty, @JsonInclude, etc.) which help developers control how specific fields are serialized or deserialized. It can handle complex data structures such as nested objects, arrays, lists, and maps efficiently.





```java

package practice_serialization;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

// POJO class (Plain Old Java Object)
class Project {
	
	private String projectName;
	private String createdBy;
	private int teamSize;
	private String status;

	// Default constructor (required for deserialization)
	public Project() {}

	// Parameterized constructor
	public Project(String projectName, String createdBy, int teamSize, String status) {
		this.projectName = projectName;
		this.createdBy = createdBy;
		this.teamSize = teamSize;
		this.status = status;
	}

	// Getters and Setters
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public int getTeamSize() {
		return teamSize;
	}
	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}

public class Run1_JacksonSerializationTest {
	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException, StreamReadException {
		
		// Step 1: Create a Project object
		Project projectObj = new Project("Walee", "Khaleed", 10, "Created");

		// Step 2: Create ObjectMapper instance (used for both serialization & deserialization)
		ObjectMapper objMapper = new ObjectMapper();
		
		// Step 3: Serialization - Convert Java Object to JSON and write to file
		objMapper.writeValue(new File("./project.json"), projectObj);
		System.out.println("✅ Serialization completed successfully!");

		// Step 4: Deserialization - Read JSON file and convert it back to Java Object
		Project readObj = objMapper.readValue(new File("./project.json"), Project.class);
		
		// Step 5: Print deserialized data
		System.out.println("✅ Deserialization completed successfully!");
		System.out.println("Project Name: " + readObj.getProjectName());
		System.out.println("Created By  : " + readObj.getCreatedBy());
		System.out.println("Team Size   : " + readObj.getTeamSize());
		System.out.println("Status      : " + readObj.getStatus());
	}
}

```

## 12 How to acheive Serialization and Deserialization Jackson?

In order to perform serialization, we first need a POJO class (Plain Old Java Object) that contains variables, constructors, and getter/setter methods. Then, we create an instance of the ObjectMapper class and use its methods like writeValue() or writeValueAsString(). The writeValue() method converts the Java object into JSON and writes it directly to a file, while writeValueAsString() converts the Java object into a JSON string which can be printed or used in API requests. During this process, Jackson automatically reads all the fields and their values from the Java object and converts them into key-value pairs in JSON format.

Next comes deserialization, which is the reverse process of serialization. In deserialization, the JSON data is converted back into a Java object using the readValue() method of ObjectMapper. For example, if we have a JSON file named project.json, Jackson will read the data from it and map it back to the Project class object. To make this possible, the POJO class must contain a default (no-argument) constructor and proper getter and setter methods, because Jackson internally uses them to create the object and assign values to its fields. Once the JSON is deserialized, we can access the data in the same way we access normal object properties in Java.

## 13 Jackson annotation 

Jackson annotations are used to control how Java objects are converted to JSON and vice versa during serialization and deserialization. They help customize field names, include or exclude specific fields, and manage data formats easily. For example, @JsonProperty is used to rename a field in JSON, @JsonIgnore hides a field from JSON output, and @JsonInclude controls whether null or empty fields should be included. Similarly, @JsonFormat defines date or number formats, and @JsonIgnoreProperties can ignore multiple fields at once.

| **Annotation**                               | **Purpose / Description**                                     | **Example Code Snippet**                                                                                              |
| -------------------------------------------- | ------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- |
| `@JsonProperty("customName")`                | Changes the field name in JSON.                               | `java\n@JsonProperty("emp_name")\nprivate String name;\n`<br>👉 JSON Output → `{ "emp_name": "Rahul" }`               |
| `@JsonIgnore`                                | Excludes a field from JSON serialization.                     | `java\n@JsonIgnore\nprivate String password;\n`<br>👉 JSON Output won’t include the password field.                   |
| `@JsonInclude(JsonInclude.Include.NON_NULL)` | Ignores null fields during serialization.                     | `java\n@JsonInclude(JsonInclude.Include.NON_NULL)\nprivate String address;\n`<br>👉 Null values won’t appear in JSON. |
| `@JsonFormat(pattern = "dd-MM-yyyy")`        | Defines custom date format in JSON.                           | `java\n@JsonFormat(pattern = "dd-MM-yyyy")\nprivate Date dob;\n`<br>👉 JSON Output → `{ "dob": "10-10-2025" }`        |
| `@JsonIgnoreProperties({"field1","field2"})` | Ignores multiple fields during serialization/deserialization. | `java\n@JsonIgnoreProperties({"age", "salary"})\nclass Employee { ... }\n`                                            |
| `@JsonPropertyOrder({"id","name","salary"})` | Sets custom order of JSON fields.                             | `java\n@JsonPropertyOrder({"id","name","salary"})\nclass Employee { ... }\n`                                          |

## 14 🧩 What is a Complex POST Request?

A Complex POST Request is an API request that sends multiple layers of data or nested JSON structures to the server, instead of just simple key-value pairs. In real-world applications, APIs often require sending detailed information such as objects within objects, arrays, or lists — for example, when creating an order that contains multiple products, customer details, and payment info all in one request.

In such cases, we call it a complex POST request, because the body is more structured and may include nested JSON data, lists, or multiple dependent objects.

``` json

{
  "customer": {
    "name": "Rahul Sharma",
    "email": "rahul@example.com"
  },
  "order": {
    "orderId": "ORD123",
    "items": [
      {
        "productId": "P101",
        "quantity": 2,
        "price": 500
      },
      {
        "productId": "P102",
        "quantity": 1,
        "price": 1200
      }
    ]
  },
  "payment": {
    "method": "UPI",
    "transactionId": "TXN98765"
  }
}
```

## 15 How many ways can you send a POST request in Rest Assured?

There are four main ways to send a POST request in Rest Assured:

## 1 Using JSONObject – This is suitable for simple request payloads, where we manually create a JSON object and pass it in the request body.

```java
package postViaDifferentWays;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;

public class PostRequestUsingJsonObjectTest {
    
    @Test
    public void postDataToServer() {
        
        // Step 1: Create a JSON Object
        JSONObject jsonObj = new JSONObject();
        jsonObj.put("createdBy", "Talha Anjum");
        jsonObj.put("projectName", "Helicopter");
        jsonObj.put("status", "Created");
        jsonObj.put("teamSize", 5);

        // Step 2: Perform POST request
        given()
            .contentType(ContentType.JSON) // Set content type as JSON
            .body(jsonObj.toJSONString())  // Convert JSONObject to JSON string
        .when()
            .post("http://49.249.28.218:8091/addProject") // API endpoint
        .then()
            .assertThat().statusCode(201) // Validate response code
            .log().all(); // Print full response in console
    }
}
```



## 2 Using JSON File – This approach supports complex JSON payloads stored in an external .json file, but handling dynamic data is a bit difficult.



```java
package postViaDifferentWays;

import java.io.File;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;

public class SampleTestForPostDataViaJsonFileTest {

    @Test
    public void postDataFromServer() {
        
        // Step 1: Create a File object referring to the external JSON file
        File file = new File("./project.json"); // Ensure project.json exists in your project root folder

        // Step 2: Send POST request using Rest Assured
        given()
            .contentType(ContentType.JSON)   // Specify content type as JSON
            .body(file)                      // Pass the JSON file as request body
        .when()
            .post("http://49.249.28.218:8091/addProject")  // API endpoint
        .then()
            .assertThat().statusCode(201)    // Validate successful creation (HTTP 201)
            .log().all();                    // Print full response for verification
    }
}
```

``` json 
{
  "createdBy": "Talha Anjum",
  "projectName": "Helicopter",
  "status": "Created",
  "teamSize": 5
}
```

## 3 Using HashMap – This is also used for simple key-value payloads. Rest Assured automatically converts the map into JSON format.

``` java

package postViaDifferentWays;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import java.util.HashMap;
import io.restassured.http.ContentType;

public class SampleTestForPostDataViaHashMapTest {

    @Test
    public void postDataFromServer() {
        
        // Step 1: Create a HashMap to store data in key-value pairs
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("createdBy", "Talha Anjum");
        map.put("projectName", "Helicopter_2025");
        map.put("status", "Created");
        map.put("teamSize", 5);

        // Step 2: Send POST request with HashMap body
        given()
            .contentType(ContentType.JSON)     // Specify content type as JSON
            .body(map)                         // Attach request body from HashMap
        .when()
            .post("http://49.249.28.218:8091/addProject")  // API endpoint
        .then()
            .assertThat().statusCode(201)      // Validate response code
            .log().all();                      // Log complete response
        
        System.out.println("✅ POST request sent successfully using HashMap!");
    }
}
```

## 4 Using POJO Class – This is the most preferred way for complex or nested payloads. It allows easy handling of dynamic data using object properties and supports serialization with Jackson.

## ProjectPojo.java

```java
package pojoclass.utility;

public class ProjectPojo {
	
	private String projectName;
	private String status;
	private String createdBy;
	private int teamSize;
	
	// Default constructor (mandatory for serialization/deserialization)
	public ProjectPojo() {
	}
	
	// Parameterized constructor
	public ProjectPojo(String projectName, String status, String createdBy, int teamSize) {
		this.projectName = projectName;
		this.status = status;
		this.createdBy = createdBy;
		this.teamSize = teamSize;
	}
	
	// Getters and Setters
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public int getTeamSize() {
		return teamSize;
	}
	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}
}

```
## SampleTestForPostDataViaPOJOclassTest.java

```java

package postViaDifferentWays;

import static io.restassured.RestAssured.given;

import java.util.Random;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;
import pojoclass.utility.ProjectPojo;

public class SampleTestForPostDataViaPOJOclassTest {
	
	@Test
	public void postDataFromServer() {
		
		// Step 1: Generate a random project name to avoid duplication
		Random random = new Random();
	    int randomNum = random.nextInt(5000);
		
		// Step 2: Create a POJO object and set the data
		ProjectPojo pObj = new ProjectPojo("Nizame-Allah-" + randomNum, "Created", "Maula", 5);
		
		// Step 3: Send the POST request using Rest Assured
		given()
			.contentType(ContentType.JSON)     // Specify content type as JSON
			.body(pObj)                         // Pass POJO as request body
		.when()
			.post("http://49.249.28.218:8091/addProject") // API endpoint
		.then()
			.assertThat().statusCode(201)       // Validate response code
			.log().all();                       // Log full response
		
		System.out.println("✅ POST request sent successfully using POJO class!");
	}
}

```
## 16 Assertion

In API testing with Rest Assured, assertions are used to validate different parts of the API response such as the status code, response body, headers, and response time. After we send a request to an API, we don’t just stop there — we verify whether the response we got is correct. This is done using assertions.

Response header

In API testing, we usually validate a few common things from the response header to ensure the API is behaving as expected.
The most common validations include:
Content-Type – to confirm the response body format, usually JSON or XML.
Status Code and Status Line – to check whether the request was successful or failed.
Response Time – to make sure the API performance is within the acceptable limit.
Server – to verify which web server is responding (optional but useful).
Transfer-Encoding – to ensure the response is delivered properly, often seen as ‘chunked’.

In order to validate the response headers in API testing, we generally use the Matchers class from the org.hamcrest package along with Rest Assured’s assertThat() method. The response headers contain key-value pairs such as Content-Type, Server, Connection, Content-Encoding, etc., which help verify that the API is returning the correct metadata along with the response body. Using Matchers methods like equalTo(), containsString(), or is() allows us to perform flexible and readable validations. For example, we can verify if the Content-Type header equals "application/json" or if the Server header contains a specific keyword. This approach ensures that the API behaves as expected and follows the correct communication format and standards.

These headers are common across almost all APIs, while other headers like Cache-Control or Access-Control-Allow-Origin depend on the specific project or setup.”
| **Header Name**       | **Example Value**         | **Purpose / What to Say in Interview**                                                                |
| --------------------- | ------------------------- | ----------------------------------------------------------------------------------------------------- |
| **Content-Type**      | `application/json`        | Defines the format of the response body — we validate this to ensure the API returns expected format. |
| **Status Code**       | `200, 201, 400, 404, 500` | Confirms whether the API request was successful or failed.                                            |
| **Status Line**       | `HTTP/1.1 200 OK`         | Gives protocol version and overall response summary.                                                  |
| **Response Time**     | `250ms`                   | Helps ensure the API performance is within expected limits.                                           |
| **Server**            | `nginx` / `Apache`        | Shows which web server handled the request (optional but commonly visible).                           |
| **Transfer-Encoding** | `chunked`                 | Indicates how the response body is sent — usually seen in large responses.                            |

```java 
package responseValidation;

import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class ValidateCommonResponseHeadersTest {

    @Test
    public void verifyCommonHeaders() {
        // Step 1: Send a GET request to the API endpoint
        Response resp = given()
                            .when()
                            .get("https://reqres.in/api/users?page=2"); // sample public API

        // Step 2: Log the complete response (optional)
        resp.then().log().all();

        // Step 3: Validate mandatory headers
        resp.then().assertThat()
            .contentType(ContentType.JSON)                       // ✅ Content-Type validation
            .statusCode(200)                                     // ✅ Status Code validation
            .statusLine("HTTP/1.1 200 OK");                      // ✅ Status Line validation

        // Step 4: Validate some common optional headers
        resp.then().assertThat().header("Server", "cloudflare");           // ✅ Common server header
        resp.then().assertThat().header("Transfer-Encoding", "chunked");   // ✅ Common encoding header
    }
}
```
Response time
In order to validate the response time present in the response header, we should prefer using the Matchers class available in the org.hamcrest package. The Matchers class provides predefined methods such as lessThan(), greaterThan(), and both().and() that allow us to compare dynamic values like response time efficiently. Since the response time varies with each request, we cannot use the equals() method for validation. Instead, using Matchers helps us verify that the response time falls within an acceptable range, ensuring that the API meets the expected performance standards. This approach makes the validation more flexible, readable, and reliable during automation testing.

``` java

package complexResponseValidatoin;

import static io.restassured.RestAssured.given;

import java.util.concurrent.TimeUnit;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;
import io.restassured.response.Response;

public class VerifyResponseTimeTest {
    @Test()
    public void verifyHeader() {
        // Step 1: Send GET request to the endpoint
        Response resp = given().get("http://49.249.28.218:8091/projects");

        // Step 2: Log complete response details
        resp.then().log().all();

        // Step 3: Capture response time in milliseconds and seconds
        long timeTaken = resp.time(); // in milliseconds
        long timeTakenSeconds = resp.timeIn(TimeUnit.SECONDS); // in seconds
        System.out.println("Response time in ms: " + timeTaken);
        System.out.println("Response time in sec: " + timeTakenSeconds);

        // Step 4: Validate time constraints using Hamcrest Matchers
        // Check if response time is less than 1000 ms
        resp.then().assertThat().time(Matchers.lessThan(1000L));

        // Check if response time is greater than 300 ms
        resp.then().assertThat().time(Matchers.greaterThan(300L));

        // Check if response time is between 300 ms and 1000 ms
        resp.then().assertThat().time(
            Matchers.both(Matchers.greaterThan(300L))
                    .and(Matchers.lessThan(1000L))
        );
    }
}

```

## 17 Request Chaining or API Chaining

Request Chaining, also called API Chaining, is a process where the response of one API is used as the input for another API. It’s mainly used in end-to-end API testing to verify workflows where multiple APIs depend on each other. For example, creating a user in one API and then using that user’s ID in another API to fetch or update details. I’ve also used this approach in Rest Assured by extracting values from responses using jsonPath() and passing them dynamically to subsequent requests.

## ✅ Scenario 1 – Create a Project → Delete the Same Project

``` java
package request_Chaining;

import static io.restassured.RestAssured.given;

import java.util.Random;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojoclass.utility.ProjectPojo;

public class Scenario_1_Delete_Project {
	
    @Test
    public void postDataFromServer() {
        
        Random random = new Random();
        int randomNum = random.nextInt(5000);

        // Step 1: Create a project (POST request)
        ProjectPojo pObj = new ProjectPojo("Nizame-Allah" + randomNum, "Created", "Maula", 10);

        Response response = given()
            .contentType(ContentType.JSON)
            .body(pObj)
        .when()
            .post("http://49.249.28.218:8091/addProject");

        // Verify project creation
        response.then()
            .assertThat().statusCode(201)
            .log().all();

        // Step 2: Capture projectId from the response
        String projectId = response.jsonPath().getString("projectId");
        System.out.println("Created Project ID: " + projectId);

        // Step 3: Delete the project using projectId (DELETE request)
        given()
        .when()
            .delete("http://49.249.28.218:8091/project/" + projectId)
        .then()
            .assertThat().statusCode(204)  // or 200, depending on API behavior
            .log().all();
    }
}
```
## 🧩 Scenario 2 — Create a Project → Add an Employee to that Project
``` java

package request_Chaining;

import static io.restassured.RestAssured.*;

import java.util.Random;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojoclass.utility.EmployeePOJO;
import pojoclass.utility.ProjectPojo;

public class Scenario_2_AddEmployeeToProject {

    @Test
    public void postDataFromServer() {

        Random random = new Random();
        int randomNum = random.nextInt(5000);

        // ✅ API 1 → Add a Project inside the Server
        ProjectPojo pObj = new ProjectPojo("Nizame-Allah" + randomNum, "Created", "Maula", 0);

        Response response = given()
                .contentType(ContentType.JSON)
                .body(pObj)
                .when()
                .post("http://49.249.28.218:8091/addProject");

        response.then().assertThat().statusCode(201).log().all();

        // ✅ Capture projectName from the response
        String projectName = response.jsonPath().get("projectName");
        System.out.println("Created Project Name: " + projectName);

        // ✅ API 2 → Add Employee to the same Project
        EmployeePOJO empObj = new EmployeePOJO(
                "Mujahid",
                "11-03-1998",
                "mdsaddamffd811@gmail.com",
                "Mahboob-e-Khuda" + randomNum,
                18,
                "6767674554",
                projectName,
                "ROLE_EMPLOYEE",
                "Mahboob-e-Khuda" + randomNum
        );

        given()
                .contentType(ContentType.JSON)
                .body(empObj)
                .when()
                .post("http://49.249.28.218:8091/employees")
                .then()
                .assertThat()
                .statusCode(201)
                .log().all();
    }
}
```

## ✅ Scenario 3: Get Payroll Info via Authentication

``` java

package request_Chaining;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;
import io.restassured.response.Response;

public class Scenario_3_GetPayrollInfo {

    @Test
    public void getPayrollInfo() {

        // ✅ API 1 — Get Auth Token
        Response resp = given()
                .formParam("client_id", "rinzra-client")
                .formParam("client_secret", "q8JS......")  // your actual secret
                .formParam("grant_type", "client_credentials")
            .when()
                .post("http://49.249.28.218:8080/auth/realms/rinzra/protocol/openid-connect/token");

        resp.then().log().all();

        // ✅ Capture token from the response
        String token = resp.jsonPath().get("access_token");
        System.out.println("Access Token: " + token);

        // ✅ API 2 — Get Payroll Info using the token
        given()
            .auth().oauth2(token)
        .when()
            .get("http://49.249.28.218:8091/admin/payrolls")
        .then()
            .log().all();
    }
}
```


## 18 Parameter and its types

In Rest Assured, a parameter is a way to send additional information with your API request. Parameters help the server understand what data you are requesting or sending. They can be part of the URL, request body, or headers, depending on the type of request.

In API testing using Rest Assured, there are different types of parameters that play a crucial role in communication between the client and the server. One of the most common types is the Path Parameter, which is embedded directly into the endpoint URL to access a specific resource. For example, when we need to fetch details of a particular user, the endpoint might look like /users/{userId}. The value inside the curly braces is dynamic and represents the specific resource we want to access.

Next, there are Query Parameters, which are mainly used for filtering, sorting, or paginating data. These parameters appear after a question mark in the URL and are written in key-value pairs, such as /users?role=admin&sort=asc. Query parameters are especially useful when we need to retrieve data based on certain conditions without changing the endpoint itself.

Another type is the Form Parameter, which is used when we want to send sensitive or structured data like a username, password, or other information in the request body. These parameters are usually sent in a key-value format using either x-www-form-urlencoded or form-data. They are commonly used during login functionality or file upload testing. Form parameters are not used with the GET method — they are mostly used with POST or PUT requests.

Finally, in Rest Assured, parameters work similarly to how they do in Postman. For GET requests, parameters are sent through the URL, either as path or query parameters. For POST or PUT requests, parameters are included in the request body as form or JSON data. The behavior of parameters depends on the HTTP method and the content type being used in the request.

| **Parameter Type**   | **Description**                                                                               | **Where It Appears**                                  | **When It’s Used**                                                             | **Example Explanation**                                                                              |
| -------------------- | --------------------------------------------------------------------------------------------- | ----------------------------------------------------- | ------------------------------------------------------------------------------ | ---------------------------------------------------------------------------------------------------- |
| **Path Parameter**   | Used to identify a specific resource in the API endpoint. It is embedded directly in the URL. | Part of the URL path, enclosed in `{}`.               | Used when you want to access or modify a specific item or resource.            | Example endpoint `/users/{userId}` where `{userId}` is replaced with the actual user ID (e.g., 101). |
| **Query Parameter**  | Used to filter, sort, or search data. Written as key-value pairs after a `?` in the URL.      | At the end of the URL after `?` and separated by `&`. | Used when you need to retrieve data based on certain conditions.               | Example: `/users?role=admin&sort=asc` filters users by role and sorts results.                       |
| **Form Parameter**   | Used to send sensitive or structured data like username and password in key-value format.     | Sent in the request body.                             | Commonly used with POST or PUT methods for login or file upload.               | Data is sent using `x-www-form-urlencoded` or `form-data` content type.                              |
| **Header Parameter** | Used to send metadata or authentication details along with the request.                       | Sent in the request header section.                   | Used to provide tokens, content type, or other additional request information. | Example: `Authorization: Bearer <token>` or `Content-Type: application/json`.                        |
| **Body Parameter**   | Used to send raw JSON or XML data to the server.                                              | Present in the request body.                          | Mostly used with POST or PUT methods to send structured data.                  | Example: Sending complete user details like name, email, and password in JSON format.                |
``` java 

given()
    .pathParam("userId", 101)
.when()
    .get("https://api.example.com/users/{userId}")
.then()
    .statusCode(200)
    .log().all();
```

``` java

given()
    .queryParam("role", "admin")
    .queryParam("sort", "asc")
.when()
    .get("https://api.example.com/users")
.then()
    .statusCode(200)
    .log().all();
```

``` java
given()
    .contentType("application/x-www-form-urlencoded")
    .formParam("username", "john")
    .formParam("password", "12345")
.when()
    .post("https://api.example.com/login")
.then()
    .statusCode(200)
    .log().all();


```

In Rest Assured, the .param() method is a general-purpose method that can act as both query and form parameter, depending on the HTTP method used in the request.
✅ Explanation:

If the request is a GET or DELETE, .param() will behave like a query parameter.

If the request is a POST or PUT, .param() will behave like a form parameter.

So basically, .param() automatically adjusts based on the HTTP method you’re using.

Example 1 — Used as Query Parameter (GET request)



``` java

given()
    .param("role", "admin")
    .param("status", "active")
.when()
    .get("https://api.example.com/users")
.then()
    .statusCode(200)
    .log().all();
```
Example 2 — Used as Form Parameter (POST request)

``` java

given()
    .contentType("application/x-www-form-urlencoded")
    .param("username", "john")
    .param("password", "12345")
.when()
    .post("https://api.example.com/login")
.then()
    .statusCode(200)
    .log().all();
```
## 19 🧩 Authentication and 🔐 Authorization

Authentication is the process of verifying who the user or client is, In simple words, it confirms the identity of the person or system trying to access the API.

In API testing, authentication ensures that only valid users or systems can send requests to the server, When I worked with Postman, I often used different authentication types like Basic Auth, Bearer Token, or API Key depending on the project’s setup.

Authorization, on the other hand, decides what actions an authenticated user is allowed to perform, Once the identity is confirmed, authorization checks whether the user has permission to access certain data or perform specific operations.

Almost every REST API requires authorization before allowing access to a resource. Authentication details are generally present in the header of the request.

There are different types of authentication methods in REST API such as Basic Authentication, Digest Authentication, Pre-emptive Authentication, Bearer Token, and OAuth 2.0 Authentication.

In Basic Authentication, the client sends the username and password with each request. These credentials are encoded using Base64 but not encrypted, meaning they can be easily decoded if intercepted. Hence, it provides less security.

Digest Authentication is more secure than Basic Auth. Here, the username and password are sent in an encrypted format using the MD5 (Message Digest Algorithm). The password does not get exposed in the network because it is encrypted, making this approach safer than Basic Authentication.

Pre-emptive Authentication sends authentication details in the request header directly without waiting for the server to ask for them. It avoids the extra round trip between client and server, making it faster. Although the password is still exposed in the network, it remains encrypted. The main advantage of this method is simplicity.

Bearer Token Authentication involves using a token string for both authentication and authorization. The token is sent in the Authorization header while making API requests to access protected resources. This token usually has an expiry time and provides better security.

Finally, OAuth 2.0 is an advanced and widely used authentication protocol in modern API security. It requires passing client ID and client secret to obtain a Bearer Token from the OAuth 2.0 server. This token is used for every request and has a limited validity period. OAuth 2.0 provides a higher level of security and supports multiple authentication flows like Client Credentials and Password Credentials. It is considered simple, secure, and efficient for modern application development.

## 🧩 1. Basic Authentication

``` java 
import io.restassured.RestAssured;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class BasicAuthTest {
    @Test
    public void basicAuthExample() {
        given()
            .auth().basic("username", "password")   // Basic Auth credentials
        .when()
            .get("https://api.example.com/login")
        .then()
            .statusCode(200)
            .log().all();
    }
}
```

## 🔐 2. Digest Authentication

``` java

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class DigestAuthTest {
    @Test
    public void digestAuthExample() {
        given()
            .auth().digest("username", "password")   // Digest Auth credentials
        .when()
            .get("https://api.example.com/login")
        .then()
            .statusCode(200)
            .log().all();
    }
}

```

## ⚙️ 3. Preemptive Authentication

``` java

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class PreemptiveAuthTest {
    @Test
    public void preemptiveAuthExample() {
        given()
            .auth().preemptive().basic("username", "password")  // Preemptive Auth
        .when()
            .get("https://api.example.com/login")
        .then()
            .statusCode(200)
            .log().all();
    }
}
```

## 🎟️ 4. Bearer Token Authentication

``` java
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class BearerTokenAuthTest {
    @Test
    public void bearerTokenExample() {
        given()
            .auth().oauth2("your_bearer_token_here")  // Bearer token
        .when()
            .get("https://api.example.com/projects")
        .then()
            .statusCode(200)
            .log().all();
    }
}

```

## 🔑 5. OAuth 2.0 Authentication

``` java

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class OAuth2AuthTest {
    @Test
    public void oauth2Example() {
        given()
            .auth().oauth2("your_access_token_here")  // OAuth2 access token
        .when()
            .get("https://api.example.com/userinfo")
        .then()
            .statusCode(200)
            .log().all();
    }
}

```

## 🧠 Bonus Tip:

If you need to generate an OAuth 2.0 token first, you can send a POST request to the token endpoint:

``` java 

Response response = given()
    .formParam("client_id", "your_client_id")
    .formParam("client_secret", "your_client_secret")
    .formParam("grant_type", "client_credentials")
.when()
    .post("https://authserver.com/oauth/token");

String token = response.jsonPath().getString("access_token");
System.out.println("Access Token: " + token);

```

## 20 Encoding, Decoding & Encryption (for REST Assured / API Testing)

In REST Assured, when we use Basic Authentication, the username and password are encoded using Base64 encoding.
Base64 is a method used to convert binary data into ASCII characters so that it can be safely sent over the network. It does not encrypt the data — it only encodes it, which means it can be easily decoded back to its original form.

For example, when you encode the text "abc" using Base64, it becomes "YWJj". Similarly, when decoding "YWJj", it returns "abc". In Java, Base64 encoding and decoding can be done using the built-in Base64 class (Base64.getEncoder() for encoding and Base64.getDecoder() for decoding). REST Assured internally uses this Base64 mechanism for Basic Authentication to send credentials in the request header.
## 🧩 Base64 Encoding and Decoding Example

``` java

import java.util.Base64;

public class Base64Example {

    public static void main(String[] args) {

        // Original text
        String originalText = "abc";

        // Encoding the text into Base64
        String encodedText = Base64.getEncoder().encodeToString(originalText.getBytes());
        System.out.println("Encoded Text: " + encodedText);

        // Decoding the Base64 back to original text
        byte[] decodedBytes = Base64.getDecoder().decode(encodedText);
        String decodedText = new String(decodedBytes);
        System.out.println("Decoded Text: " + decodedText);
    }
}
```
## Encryption

Encryption is a security technique used to protect data before sending it from the client to the server. It converts plain text into cipher text, which looks unreadable to anyone intercepting the data. Only the authorized receiver (server) can decrypt it back into readable text using a key.
Encryption ensures data security and privacy during communication between client and server.

There are two main types of encryption:

Symmetric Encryption – In this method, the same key is used for both encryption and decryption.
Example: AES, DES, and Blowfish algorithms.
It is faster but less secure, as both sides share the same key.

Asymmetric Encryption – This method uses two keys: a public key for encryption and a private key for decryption.
Example: RSA and ECC algorithms.
It is slower but much more secure than symmetric encryption, because even if someone gets the public key, they cannot decrypt the data without the private key.

In short, encoding is for data conversion, encryption is for security, and Base64 encoding is mainly used in REST Assured for authentication purposes — not as a security mechanism but to safely transmit credentials over the network.

In API testing, encryption plays an important role when we deal with sensitive data like passwords, user details, or payment information. Encryption basically converts readable data into an unreadable format so that even if someone intercepts it, they can’t understand the actual information. There are mainly two types of encryption — symmetric and asymmetric. In symmetric encryption, the same key is used for both encryption and decryption, while in asymmetric encryption two keys are used — one public and one private.

In most cases, we use AES, which stands for Advanced Encryption Standard. It’s a symmetric algorithm that is fast, secure, and commonly used in APIs. For example, if we are testing a payment API, we can use AES to encrypt the card number before sending the request, and later decrypt it using the same key to verify the response. This ensures that the data remains protected during communication.

In simple terms, encryption adds an extra layer of security during API testing. It’s different from encoding — encoding just converts data format, but encryption actually hides the meaning. So, whenever I deal with confidential information in REST Assured, I prefer using AES encryption to make sure the data is transmitted securely.

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






To achieve serialization in Java, the class must implement the Serializable interface**, which is a **marker interface** (it doesn’t contain any methods). Then we use **ObjectOutputStream** along with **FileOutputStream** to convert the Java object into a byte stream and store it in a file. We call the method **writeObject()` to perform serialization.






## Interview Question
| **S.No.** | **Topic Area** | **Interview Question**                                                       |
| --------- | -------------- | ---------------------------------------------------------------------------- |
| **1**     | Basics         | What is REST Assured and why is it used in API testing?                      |
| **2**     | Basics         | What are REST APIs and how do they differ from SOAP APIs?                    |
| **3**     | Basics         | What are the common HTTP methods used in REST Assured?                       |
| **4**     | Basics         | Explain the syntax of a REST Assured test using given(), when(), and then(). |
| **5**     | Basics         | What are status codes in API testing? Can you name a few important ones?     |
| **6**     | Basics         | What is the default return type of the response in REST Assured?             |
| **7**     | Basics         | What is the difference between get(), post(), put(), and delete() methods?   |
| **8**     | Basics         | How do you validate response status code and response body in REST Assured?  |
| **9**     | Basics         | What is the use of `RequestSpecification` and `Response` interfaces?         |
| **10**    | Basics         | How do you log request and response details in REST Assured?                 |

| **S.No.** | **Topic Area**        | **Interview Question**                                                |
| --------- | --------------------- | --------------------------------------------------------------------- |
| 11        | Parameters            | What are path parameters in REST Assured and how are they used?       |
| 12        | Parameters            | What are query parameters and how do you pass them in REST Assured?   |
| 13        | Parameters            | What are form parameters and when do you use them?                    |
| 14        | Parameters            | What is the difference between `param()` and `queryParam()` methods?  |
| 15        | Parameters            | What is request chaining in REST Assured and how do you implement it? |
| 16        | Authentication        | What is Authentication and Authorization in API testing?              |
| 17        | Authentication        | How do you perform Basic Authentication in REST Assured?              |
| 18        | Authentication        | What is Digest Authentication and how is it different from Basic?     |
| 19        | Authentication        | What is Preemptive Authentication in REST Assured?                    |
| 20        | Authentication        | How do you use Bearer Token in REST Assured?                          |
| 21        | Authentication        | How do you handle OAuth 2.0 Authentication in REST Assured?           |
| 22        | JSON Handling         | How do you validate a JSON response in REST Assured?                  |
| 23        | JSON Handling         | What is JSONPath and how is it used in REST Assured?                  |
| 24        | JSON Handling         | How do you extract values from JSON response using REST Assured?      |
| 25        | JSON Handling         | How do you handle nested JSON objects in API response?                |
| 26        | JSON Handling         | What is the difference between JSONPath and XMLPath?                  |
| 27        | Serialization & POJO  | What is a POJO class in REST Assured?                                 |
| 28        | Serialization & POJO  | What is serialization and deserialization in API testing?             |
| 29        | Serialization & POJO  | How do you send a POJO class as a request body in REST Assured?       |
| 30        | Serialization & POJO  | How do you deserialize JSON response to a POJO in REST Assured?       |
| 31        | Framework Integration | How do you integrate REST Assured with TestNG or JUnit?               |
| 32        | Framework Integration | How do you perform data-driven testing in REST Assured?               |
| 33        | Framework Integration | How do you handle dynamic data in API automation?                     |
| 34        | Framework Integration | How do you create reusable methods for API requests?                  |
| 35        | Framework Integration | How do you generate API test reports in your framework?               |
| 36        | Headers & Cookies     | How do you add headers in a REST Assured request?                     |
| 37        | Headers & Cookies     | How do you validate headers and cookies in REST Assured?              |
| 38        | Headers & Cookies     | How do you pass Content-Type and Accept headers?                      |
| 39        | Headers & Cookies     | What is the importance of Content-Type in API testing?                |
| 40        | Advanced Concepts     | How do you upload a file using REST Assured?                          |
| 41        | Advanced Concepts     | How do you send multipart/form-data requests?                         |
| 42        | Advanced Concepts     | How do you validate JSON schema in REST Assured?                      |
| 43        | Advanced Concepts     | How do you handle response time validation in REST Assured?           |
| 44        | Advanced Concepts     | How do you handle API errors or failed responses?                     |
| 45        | Advanced Concepts     | How can you use REST Assured with Maven and Jenkins?                  |
| 46        | Real-time Scenarios   | How would you test login functionality using REST Assured?            |
| 47        | Real-time Scenarios   | How do you test pagination or filtering APIs?                         |
| 48        | Real-time Scenarios   | How do you handle dependent APIs (like first create, then fetch)?     |
| 49        | Real-time Scenarios   | How do you test negative API scenarios using REST Assured?            |
| 50        | Real-time Scenarios   | How do you debug an API failure in your automation framework?         |





6 How do you pass Content-Type and Accept headers?
In REST Assured, I pass the Content-Type and Accept headers to define the type of data I’m sending and the type of data I want in the response. The Content-Type header tells the server the format of the request body, like application/json, and the Accept header tells the server what kind of response format I expect.

I can pass these headers using either the .contentType() and .accept() methods or by using the .header() method. For example:

``` java

given()
    .contentType("application/json")
    .accept("application/json")
    .body("{ \"name\": \"John\", \"job\": \"Tester\" }")
.when()
    .post("https://reqres.in/api/users");
```

7 What are query parameters and how do you pass them in REST Assured?
In REST Assured, query parameters are used to filter, sort, or search data from an API. They are added to the end of a URL after a question mark (?) and usually appear in key-value format — for example:
/users?role=admin&sort=asc.

In REST Assured, I can pass query parameters using the .queryParam() method. For example:
```java
given()
    .queryParam("role", "admin")
    .queryParam("sort", "asc")
.when()
    .get("https://reqres.in/api/users");

```
Here, I’m passing two query parameters — role=admin and sort=asc. The server will use these values to return data based on the given conditions.

So, query parameters are mainly used when we want to fetch specific data by applying filters or sorting options in an API request.


8 What are path parameters in REST Assured and how are they used?
In REST Assured, path parameters are used when we want to access a specific resource by embedding a value directly into the endpoint URL. They are part of the URL path itself — for example, in /users/101, the value 101 is a path parameter representing the user ID.

In REST Assured, I can pass path parameters using the .pathParam() method. For example:

```java

given()
    .pathParam("userId", 101)
.when()
    .get("https://reqres.in/api/users/{userId}");
```

Here, {userId} in the URL is replaced with the actual value 101 at runtime. This helps in dynamically passing values like user IDs, product IDs, or order numbers in API requests.

So, path parameters are mainly used when we want to target a specific record or resource in an API.


9 What are form parameters and when do you use them?
In REST Assured, form parameters are used when we want to send data in the body of a request in a key-value format — especially while testing login forms, registration, or file upload features. These parameters are usually sent using the x-www-form-urlencoded or form-data content type.

In REST Assured, I can pass form parameters using the .formParam() method. For example:


``` java
given()
    .formParam("username", "john")
    .formParam("password", "12345")
.when()
    .post("https://example.com/login");
```
Form parameters are not used with GET requests — they’re mainly used with POST or PUT requests where we need to send sensitive data like login credentials or user details in the request body.

So, simply put, form parameters help send structured input data securely to the server during form submissions.

10 What is the difference between param() and queryParam() methods?

In REST Assured, both param() and queryParam() methods are used to send parameters, but there’s a small difference between them.

The queryParam() method is specifically used to send parameters as part of the URL after a question mark (?). For example:
/users?role=admin&status=active.

The param() method is a more general one — it automatically decides how to send the parameter based on the HTTP method being used. For a GET request, it behaves like a query parameter, and for a POST request, it behaves like a form parameter.

```java
// Using queryParam()
given()
    .queryParam("role", "admin")
    .queryParam("status", "active")
.when()
    .get("https://reqres.in/api/users");

// Using param()
given()
    .param("username", "john")
    .param("password", "12345")
.when()
    .post("https://example.com/login");
```
So, in short — queryParam() is used mainly for GET requests to filter data in the URL, while param() is more flexible and can adjust based on the request type.

## Interview Questions

1 What is REST Assured?

Rest Assured is a Java-based library used for automating RESTful API testing. It provides a simple and readable syntax for sending HTTP requests (like GET, POST, PUT, DELETE) and validating responses without needing to write complex code. It’s built on top of Java and integrates easily with tools like Maven, TestNG, and Jenkins, which makes it suitable for CI/CD pipelines
Rest Assured provides a simple and powerful way to test REST APIs by sending HTTP requests and validating responses. It supports features like validating status codes, response body, headers, and response time. This makes it one of the most widely used tools for API automation testing.

Rest Assured can be used with multiple programming languages such as Java, Kotlin, Scala, and Groovy. It is especially popular among testers using Java for automation.

In my project, we used Rest Assured to validate backend APIs. It helped us automate test cases for both positive and negative scenarios — for example, verifying response status codes, headers, response body, and JSON schema validation.
We also parameterized test data using TestNG DataProviders, and integrated Rest Assured scripts with Jenkins for continuous testing after each deployment.
It’s especially useful because it works seamlessly with JSONPath and XMLPath, which makes it easy to extract and validate data from API responses.

2 List the types of methods used in Rest Assured or What are the API calls you have used.

In my project, I’ve worked with different types of API calls depending on the functionality we were testing. I’ve mainly used GET calls to fetch data from the server, POST calls to create new records like user registration or login, PUT calls to update existing data, and DELETE calls to remove records. Sometimes, I also worked with PATCH calls for partial updates. All these API calls were validated through Rest Assured scripts or Postman, where I checked the status codes, response time, and body validation to ensure the APIs were working as expected.

In Rest Assured, we commonly use different HTTP methods depending on the purpose of our API testing. For example, we use GET to fetch data, POST to create new records, PUT when we need to update the complete data, and PATCH for partial updates. We also use DELETE to remove records from the server. Apart from these, HEAD and OPTIONS methods are sometimes used to check headers and supported methods of an endpoint. So overall, these methods help us validate the full functionality of the API — from creating and updating to fetching and deleting data — ensuring the back-end services work as expected.

3 How to perform API testing using Rest Assured?

In our project, we perform API testing using Rest Assured, which is a Java-based library. First, we set the base URI and then specify the endpoints we want to test. After that, we create a request using methods like given(), where we can pass headers, authentication details, parameters, or request bodies as needed. Then we send the request using HTTP methods like GET, POST, PUT, or DELETE. Once we get the response, we validate it by checking the status code, response body, headers, and response time. We also use TestNG assertions to compare actual and expected results. Finally, we integrate reports using Extent Reports to track the execution results. Overall, Rest Assured makes API testing easier by allowing automation of end-to-end API validation in a simple and readable way.

4 How will you use assertion in api script

In API testing, I use assertions to validate that the actual response matches the expected result. For example, after getting the response using Rest Assured, I verify the status code, response message, or specific values inside the JSON body. I usually use TestNG assertions like Assert.assertEquals() or Rest Assured built-in validations like then().statusCode(200) or then().body("key", equalTo("value")). This helps confirm that the API is behaving as expected and returning the correct data. Basically, assertions act as checkpoints in the script to make sure our test passes only if the response is correct.

5 If you got 500 instead of 200 series what will you do

If I get a 500 status code instead of a 200, it means there’s a server-side issue. First, I’ll recheck my request details — like the endpoint URL, request body, headers, and parameters — to make sure everything is correct from my end. If everything looks fine, then I’ll capture the request and response logs and share them with the developer team along with the error details. Sometimes, I’ll also use Charles Proxy or Postman console to verify if the request is actually reaching the server and what exact error message is coming in the response body. Basically, I’ll try to identify whether the issue is from the testing side or the backend side before escalating it

6 How do you integrate REST Assured with TestNG or JUnit or How do you add REST Assured to your project??

I’ve integrated REST Assured with TestNG to structure my API tests in a proper test framework. Basically, I create a Maven project where I add REST Assured and TestNG dependencies in the pom.xml file. Then, I write my test scripts inside a TestNG class and use @Test annotations to define test cases. REST Assured handles the API request and response part, while TestNG helps in assertions, test grouping, parallel execution, and report generation. This integration makes the framework more reusable and maintainable. Similarly, if we use JUnit, the concept remains the same — only the annotations change like using @Test, @BeforeEach, etc

7 Explain RestAssured BDD approach

In our project, we followed the BDD approach while working with REST Assured because it makes the API test scripts more readable and easy to understand. It mainly follows the Given–When–Then structure, where ‘Given’ is used to define all the preconditions like base URI, headers, or request body, ‘When’ represents the actual API action such as sending a GET, POST, PUT, or DELETE request, and ‘Then’ is used to verify the expected results like status code, response body, or headers. This approach makes the tests more structured and aligns well with TestNG or Cucumber frameworks. It also helps team members — including non-technical ones — easily understand the test flow just by reading the script


8 What is Authentication and authorization


Authentication is the process of verifying who the user or client is, In simple words, it confirms the identity of the person or system trying to access the API.

In API testing, authentication ensures that only valid users or systems can send requests to the server, I often used different authentication types like Basic Auth, Auth 2.0, Bearer Token, or API Key depending on the project’s setup.

Authorization, on the other hand, decides what actions an authenticated user is allowed to perform, Once the identity is confirmed, authorization checks whether the user has permission to access certain data or perform specific operations, After login, I might be allowed to view user data (GET request) but not delete it (DELETE request), If I tried to delete without proper permission, I’d get a 403 Forbidden error.

9 Difference between client side error and server side error

The main difference between client-side and server-side errors is based on where the issue occurs. Client-side errors are represented by the 400 series status codes, like 400 Bad Request or 404 Not Found — these usually happen because of a mistake from the client’s end, such as wrong input data, invalid parameters, or missing authentication. On the other hand, server-side errors are shown by 500 series status codes, like 500 Internal Server Error or 503 Service Unavailable — these occur when something goes wrong on the server, such as a crash, exception, or configuration issue. In simple terms, 400 means the client request was incorrect, and 500 means the server failed to process a valid request properly.

10 How do you get the APIs that you need to test or How you get the api calls

I usually get the API calls from the Swagger document or Postman collection that the backend team shares with us. Swagger helps me understand all the available endpoints, their request methods, parameters, and expected responses. Sometimes, if the API details are not fully documented, I use Charles Proxy to capture live API calls from the app and check what requests are being sent to the server.

Once I have the endpoint details, I import them into Postman or use them directly in my Rest Assured scripts for validation. So basically, I either get them from Swagger, Postman collections, or intercept them using Charles Proxy depending on the situation.

11 How you pass the query parameter  in restassured.

In Rest Assured, I usually pass query parameters using the queryParam() method. For example, if I need to pass parameters like page=2 or status=active, I include them before the request method, In this way, the query parameters are automatically appended to the API URL, and it makes the request look cleaner and easy to maintain. In real projects, I sometimes fetch these parameters dynamically from Excel or property files, especially when doing data-driven testing.

12 What is status code

A status code in API testing represents the result of the client’s request to the server. It’s part of the HTTP response and helps testers understand whether the request was successfully processed or if there was an error. These codes are divided into different categories based on their first digit — for example, 2xx indicates success, 4xx indicates client-side errors, and 5xx indicates server-side errors.

13 How you fetch data for api

In my project, I usually fetch API test data from different sources depending on the need. Most of the time, I use an Excel sheet or a properties file to store input data like query parameters, request bodies, or tokens. For Excel, I use the Apache POI library to read values dynamically, which helps in data-driven testing. If the data is small or configuration-based, like base URLs or authentication keys, I keep them in a .properties file and fetch them using the Properties class. In some cases, I also get request payloads from JSON files, especially when dealing with large or complex data structures. This approach keeps my test scripts flexible, reusable, and easy to maintain without hardcoding values.

14 Explain the difference between 'given()', 'when()', and 'then()' in REST Assured.
The given() part is where I set up all the preconditions, such as headers, authentication details, parameters, request body, or base URI.
The when() part defines the action or event, meaning the actual API request — like a GET, POST, PUT, or DELETE call.
The then() part is where I write my validations or assertions, such as checking the response status code, verifying specific fields, or validating response time.

15 What is Authentication standards

Authentication standards are basically methods used to verify the identity of a user or system before giving access to an API. In my experience, I’ve worked with Basic Authentication, where we send the username and password in Base64 format, and Bearer Token or OAuth 2.0, which is more secure and uses a token in the header. I’ve also used API Key Authentication, where an API key is passed in the header or query parameter. These standards help ensure that only authorized users can access the API securely.

16 What are the things present in swagger document

Swagger UI, is basically a detailed and interactive representation of an API. It gives complete information about the API like its title, version, and base URL. It lists all the available endpoints such as /login or /users, along with the supported HTTP methods like GET, POST, PUT, and DELETE. It also shows request parameters, request body structure (usually in JSON), and the type of responses with status codes like 200 or 400. Swagger also includes authentication details, like where to pass tokens or API keys, and even provides example requests and responses. Overall, it helps testers and developers understand and test APIs easily without needing backend access.

17  How do you manage cookies in REST Assured?

In REST Assured, cookies can be managed easily using the built-in methods. When we send a request and the server responds with cookies, we can capture them using Response.getCookies() or Response.getDetailedCookies(). Then, we can pass those cookies in the next request using .cookie() or .cookies() methods.

For example, after login, if the API returns a session cookie, I usually store it and reuse it in subsequent requests to maintain the same session. This helps simulate real user behavior across multiple API calls.

18 Explain how to log requests and responses in REST Assured.

“In REST Assured, logging helps in debugging and understanding the flow of API requests and responses. I usually use methods like .log().all() to print complete details of the request, including headers, parameters, and body. Similarly, I use .then().log().all() to log the full response after execution.

We can also log specific parts using .log().body(), .log().headers(), or .log().status() depending on what we want to see. This logging feature helps a lot during debugging or when a test case fails


19 What is api or Do you have knowledge on API?
 
API stands for Application Programming Interface. In simple words, it acts as a bridge that allows two different software systems to communicate with each other. 
The EdTech mobile apps I tested, when a user logged in or fetched their course content, the app communicated with the backend through APIs. I used tools like Postman to verify these API requests and responses. APIs typically use methods like GET, POST, PUT, and DELETE to perform operations.
A well-structured API helps us test backend functionality independently from the UI, improves debugging, and ensures smooth data exchange between the client and server systems


20 What is difference between JSON and XML

In my experience with API testing, I’ve worked with  mainly JSON but I can tell the major difference XML formats. JSON (JavaScript Object Notation) is a lightweight and easy-to-read format, mainly used in REST APIs. It uses key-value pairs and supports data types like strings, numbers, arrays, and booleans, making it faster to parse and more efficient in terms of data size.

On the other hand, XML (extensible Markup Language) is more structured and tag-based, often used in older or SOAP-based APIs. While XML is more powerful in terms of schema validation and supports comments, it tends to be more verbose and slower to process. Overall, JSON is more common today due to its simplicity and better performance in modern web and mobile applications.

21 How to pass bearer token in RestAssured?

we usually get a Bearer Token after hitting a login or authentication API — for example, by sending credentials (username and password) to an endpoint like /login or /auth. The response returns a token, which we extract dynamically using response.jsonPath().getString("token").
Then, we pass this token in the header of subsequent API requests using the Authorization key with the value Bearer <token>.
We normally store this token in a variable or use it in request chaining so that the next requests automatically use the same token.
This approach simulates how APIs are secured with JWT (JSON Web Token) or OAuth tokens in real projects.

22 what is diff b/w  path parameters and query parameters

The main difference between path parameters and query parameters is how and where they are used in the URL. Path parameters are part of the URL itself and are used to identify a specific resource — for example, /users/101 means user with ID 101. On the other hand, query parameters are added after a ‘?’ in the URL and are mainly used to filter or sort data — like /users?city=Delhi&age=25, So basically, path parameters help locate a specific resource, while query parameters help customize or filter the result

23. What is BDD?

In testing, BDD or Behavior Driven Development is an approach where we focus on testing the behavior of an API or application from the user’s perspective. In REST Assured, we follow the BDD style using given(), when(), and then() methods, which make our test scripts more readable and easy to understand. For example, given() is used to set up preconditions like headers or request body, when() is used to perform the API action such as GET or POST, and then() is used to validate the response. This approach helps in maintaining clear, behavior-based test cases that can be easily understood by both technical and non-technical team members


24 How to pass payload in POST request without POJO?

In REST Assured, if I don’t want to use a POJO class, I usually pass the payload in different ways like using a HashMap, a JSONObject, or by directly writing the JSON body as a string. For example, I can create a HashMap with key-value pairs and pass it inside the body, or I can use new JSONObject() to build the request dynamically. In some cases, if the payload is large or frequently reused, I prefer keeping it in an external JSON file and reading it using File or FileReader. This gives flexibility and helps manage payloads without always creating POJO classes.

25 If you don't provide path parameter what happens?

If we don’t provide a required path parameter in the API endpoint, the request will fail because the server won’t know which specific resource we’re trying to access. For example, if the API endpoint is /users/{id} and I send /users/ without the ID, it will usually return a 404 Not Found or 400 Bad Request error. That’s because the path parameter is mandatory for identifying a specific record

26 What is the difference between API and Web Servic
API and Web Service are closely related, but not the same. An API is a broader concept — it allows two different software systems to communicate with each other. It can work over any protocol like HTTP, HTTPS, or even offline methods. A Web Service, on the other hand, is a specific type of API that works only over the web using network protocols like HTTP or SOAP. In short, all web services are APIs, but not all APIs are web services


27 Difference between oauth1.0 and Oauth2.0

OAuth 1.0 and OAuth 2.0 are both authorization frameworks, but OAuth 2.0 is a more advanced and simplified version. In OAuth 1.0, the client and server used complex signature-based authentication, which required both sides to generate and verify cryptographic signatures — making it harder to implement. In OAuth 2.0, it became much simpler and more flexible, as it uses access tokens (like Bearer tokens) instead of signatures. OAuth 2.0 also supports multiple grant types like authorization code, client credentials, and refresh tokens, which makes it more suitable for modern web and mobile applications


28 How to handle dynamic parameter in restAssured

In real-time API testing, we often deal with dynamic parameters — like user IDs, tokens, or order IDs — that keep changing with each request. In REST Assured, I usually handle these dynamically by first capturing the value from one API response and then passing it into the next API request. For example, I extract the value using response.jsonPath().get("id") and store it in a variable. Then I use that variable in the next API call, like in the path or query parameter. Sometimes, I also fetch dynamic data from external files like Excel, JSON, or property files when doing data-driven testing. This approach helps to make the tests reusable and handle real-time data efficiently.

29 Tell me difference between basic auth and JWT Token
In Basic Authentication, we send the username and password encoded in Base64 format with every API request. It’s simple to use but less secure because credentials are exposed in each call.

Whereas in JWT (JSON Web Token), we use a token-based authentication system. After login, the server generates a token, and we use that token in the header (as ‘Authorization: Bearer <token>’) for all subsequent requests. It’s more secure because the username and password aren’t shared repeatedly — only the token is used until it expires, So, Basic Auth is mainly for simple or internal APIs, while JWT is preferred in real-time projects for better security and scalability.”

30 How to validate response body using restAssured
In REST Assured, I usually validate the response body using assertions with the then() section. After sending the request, I use methods like body() along with Hamcrest matchers to verify specific values. For example, I might write something like then().body("status", equalTo("success")) to check if the response status matches the expected value.

In real-time, I also validate fields like user IDs, names, or messages returned by the API to make sure the response data is correct and in the expected format. Sometimes I convert the response to a string or JSON object and use JSONPath to extract specific values for comparison.

So overall, I use then().body(), JSONPath, or sometimes Java assertions to make sure the API response matches the expected output.

31 How will you use assertion in api scripts
In my API scripts, I use assertions to validate that the API response is correct and meets the expected result. For example, I use REST Assured assertions with the then() section to check the response status code, headers, and body, This helps me make sure the API is returning the correct status and data. In real-time, I usually validate important fields like user ID, name, or response messages. I also use TestNG assertions like Assert.assertEquals() when I need custom validation logic, So basically, assertions help ensure that the API is behaving as expected and the response data is accurate before marking the test as passed.
then().statusCode(200).body("message", equalTo("Success"));

32 Difference between then.assertThat and status code

When I use then().assertThat(), it’s a more general way to start writing multiple assertions together. For example, I can write:
then().assertThat().statusCode(200).body("status", equalTo("success"));Here, I can chain multiple checks like status code, response body, headers, etc., under one assertion block, But if I just write then().statusCode(200), it’s a shorthand way to check only the response status code. It’s simpler when I only want to validate that the API returned 200 or 201, without checking other fields, So basically, then().assertThat() gives me more flexibility for multiple validations, while statusCode() is used when I just want to check the HTTP status.”


33 What you validate in backend testing.

In backend testing, I usually validate whether the data flow between the frontend, API, and database is working correctly. I check if the data sent through the API request is correctly stored or updated in the database. For example, after performing a POST or PUT request, I verify the response body, status codes, and database records to make sure the values are correct.

I also validate things like response time, headers, schema structure, error codes, and data integrity. If it’s an e-commerce or learning app, I make sure actions like login, purchase, or course progress are reflecting properly in the backend. Basically, my focus is on ensuring that the API logic and database updates are consistent, accurate, and secure

34 What is the difference between 401 and 403.
In my experience during API testing using Postman or while validating mobile app backend behavior, I frequently encountered both 401 and 403 status codes, and I always made sure to distinguish between them clearly during debugging and defect logging.

A 401 Unauthorized error typically means that the request has not been applied because it lacks valid authentication credentials. This usually occurs when the bearer token is missing, expired, or invalid. For example, in our language learning platform, if a user tries to fetch their profile without logging in or with an expired token, the backend returns a 401 status code. I used this response to ensure the app properly prompted the user to log in again.

On the other hand, a 403 Forbidden status means that the server understood the request and the user is authenticated, but they do not have permission to perform that specific action. For example, even if a user is logged in, they shouldn’t be able to access premium features like native speaker sessions unless they are a paid subscriber. In this case, I tested by logging in as a free user and intentionally accessing restricted APIs—if the API returned a 403, it confirmed that authorization was correctly implemented.

35 What are all the status codes you have come across in your project and how to handle?

200 Series – Success Codes

These indicate that the request was successfully received, understood, and processed by the server.

| **Code**                              | **Meaning**      | **Explanation / Use Case**                                                                                |
| ------------------------------------- | ---------------- | --------------------------------------------------------------------------------------------------------- |
| **200 OK**                            | Success          | Request completed successfully and server returned the expected response. Example: Fetching user details. |
| **201 Created**                       | Resource Created | A new resource has been successfully created. Example: Creating a new user account.                       |
| **202 Accepted**                      | Request Accepted | The request is accepted but still being processed (asynchronous). Example: File upload queued.            |
| **203 Non-Authoritative Information** | Partial Info     | Response returned from a third-party or cached source, not directly from the origin server.               |
| **204 No Content**                    | Success, No Data | Request was successful but there’s no content to return. Example: Deleting a record.                      |


300 Series – Redirection Codes

These indicate that further action is needed — like following a redirect to another URL.

| **Code**                               | **Meaning**        | **Explanation / Use Case**                            |
| -------------------------------------- | ------------------ | ----------------------------------------------------- |
| **301 Moved Permanently**              | Permanent Redirect | Resource has been permanently moved to a new URL.     |
| **302 Found (Temporarily Redirected)** | Temporary Redirect | Resource is temporarily available at a different URL. |


400 Series – Client Error Codes

These mean there’s an issue with the request sent by the client (like invalid input or missing authorization).


| **Code**                       | **Meaning**             | **Explanation / Use Case**                                                              |
| ------------------------------ | ----------------------- | --------------------------------------------------------------------------------------- |
| **400 Bad Request**            | Invalid Request         | Server can’t process the request due to syntax or missing data.                         |
| **401 Unauthorized**           | Authentication Required | Missing or invalid authentication token.                                                |
| **403 Forbidden**              | Access Denied           | User is authenticated but doesn’t have permission to access the resource.               |
| **404 Not Found**              | Resource Not Found      | The requested resource doesn’t exist.                                                   |
| **405 Method Not Allowed**     | Invalid Method          | The HTTP method (GET, POST, etc.) is not allowed for this endpoint.                     |
| **409 Conflict**               | Request Conflict        | Request conflicts with current state of the resource. Example: Duplicate record.        |
| **415 Unsupported Media Type** | Wrong Format            | Server doesn’t support the format of the request body (e.g., wrong Content-Type).       |
| **422 Unprocessable Entity**   | Invalid Data            | The request is well-formed but contains semantic errors. Example: Invalid email format. |
| **429 Too Many Requests**      | Rate Limit Exceeded     | Too many requests in a short time — throttling applied.                                 |
| **499 Client Closed Request**  | Client Cancelled        | Client closed the connection before the server could respond.                           |


500 Series – Server Error Codes
These indicate that the server failed to process a valid request due to internal problems.

Code

| **Code**                        | **Meaning**                    | **Explanation / Use Case**                                         |
| ------------------------------- | ------------------------------ | ------------------------------------------------------------------ |
| **500 Internal Server Error**   | General Server Error           | The server encountered an unexpected condition.                    |
| **501 Not Implemented**         | Not Supported                  | The request method or feature is not implemented by the server.    |
| **502 Bad Gateway**             | Invalid Response from Upstream | The server received an invalid response from another server.       |
| **503 Service Unavailable**     | Temporary Downtime             | Server is overloaded or down for maintenance.                      |
| **504 Gateway Timeout**         | Timeout Error                  | The server didn’t receive a response in time from another service. |
| **599 Network Connect Timeout** | Network Timeout                | The network connection timed out before completing the request.    |

36 What is CRUD

CRUD basically stands for Create, Read, Update, and Delete — which are the four main operations we perform on data in any application or API. In simple terms, Create is used to add new data (using a POST request), Read is used to retrieve data (using GET), Update is used to modify existing data (using PUT or PATCH), and Delete is used to remove data (using DELETE). So, whenever we perform API testing, these CRUD operations form the base to verify if the API is correctly handling data at every level.

37 1 Difference between put, patch and post.
In my project, while working on API testing , I frequently dealt with POST, PUT, and PATCH methods for different operations, and I learned how each one is used based on the business requirement.

POST (Create):
I used POST requests whenever new data needed to be created. For example, when a new user registers on the app, a POST API is triggered to send user details like name, email, selected language, etc., to the backend. I tested this by validating the response code (usually 201 Created) and ensuring the data is correctly stored in the database.

PUT (Update full resource):
PUT APIs were used when the user wanted to completely update their profile information, such as changing their name, email, or selected language. Since PUT replaces the entire record, I ensured that all previous data fields were updated correctly in the database, not just the modified ones.

PATCH (Update partial resource):
PATCH was used for partial updates. For example, if the user only wanted to update their email address or progress in one language course, the PATCH API allowed updating just that particular field without affecting other data. I validated that only the intended field changed, and the rest remained unchanged.

38 What's the difference between POST and GET

The main difference between POST and GET lies in how they send and handle data.
In simple terms, GET is used to retrieve data from the server — it sends information through the URL, which makes it visible in the browser and less secure. It’s mostly used for fetching or viewing data without making any changes to the server.
On the other hand, POST is used to send data to the server to create or update something — the data is sent in the request body, making it more secure and suitable for sensitive or large amounts of data. So, in API testing, we generally use GET to check if the API is fetching correct data and POST to verify if it’s creating or submitting data properly.

39 Can we create resources with the help of get() or not?

The GET method is only meant for retrieving or reading data from the server — it should never modify or create any resource. It’s considered a safe and idempotent operation, meaning that calling it multiple times won’t change the state of the server.
To create new resources, we use the POST() method, as it allows us to send data in the request body to the server, which then processes it and creates a new record or resource.

40 Can you use do post using put

No, we shouldn’t use a PUT request to perform a POST operation.
In real-time API design, both have different purposes — POST is used to create a new resource, while PUT is used to update or replace an existing one. When you send a POST request, the server usually generates a new resource ID, but with PUT, you specify the resource ID yourself and update that specific record.
So even though technically you can send data with both, using PUT for creation goes against REST principles and can lead to confusion or unexpected results. It’s always best to use POST for creation and PUT for updates.

41 Delete request present in rest-Assured or not.

Yes, the DELETE request is present in Rest Assured.
In real-time testing, we use the DELETE method when we want to remove a specific resource from the server, like deleting a user or an order by its ID. In Rest Assured, it’s done using the .delete() method, just like we use .get() or .post(), This sends a DELETE request to remove the user with ID 101. It’s mainly used to verify whether the API correctly deletes data and returns the proper response code (like 200, 202, or 204).

42 No, I never hardcode the bearer token directly in my test scripts because it’s not a good practice — tokens can expire and it also creates a security risk, In my framework, I maintain the bearer token in a generic and reusable way. Usually, I create a separate utility class or a method in the BaseClass that fetches the token dynamically before test execution. For example, I first hit the authentication API (like a login endpoint) using Rest Assured to get the token, store it in a variable or a static field, and then reuse that token across all API requests.
Sometimes, I also keep the token in a properties file or environment file if it’s valid for a longer duration. But in most real-time projects, I prefer fetching it dynamically before test execution using a @BeforeSuite method in TestNG, so it’s available globally for all tests, This makes the framework flexible, avoids manual token updates, and keeps the code more maintainable and secure.

43 How you were getting bearer token from developer?

Usually, I get the bearer token from the backend or developer team, who share either the authentication API details or the token generation API with me. Sometimes, they provide the client ID and client secret, and I use those credentials in Postman or in my automation script to hit the auth endpoint and generate a fresh token dynamically.

In real-time projects, we often automate this process by writing a small utility method in the framework that first calls the token API, extracts the token from the response, and then passes it automatically to all the other API requests — so we don’t have to depend on developers every time.


44 when authentication fail what status code you will get

When authentication fails, you typically get a 401 Unauthorized status code, This means the request didn’t include valid authentication credentials — either the token is missing, expired, or invalid. Sometimes, if access is restricted even with valid credentials, you might get a 403 Forbidden, but for failed authentication specifically

45 Explain oauth2.0 and bear token

OAuth 2.0 is an authentication and authorization framework that allows secure access to resources without sharing the user’s actual credentials. Instead of passing a username and password every time, the user first logs in through an authentication server, which then provides an access token — commonly known as a Bearer Token.

This token is then used in every API request as proof of authentication. In REST Assured or Postman, we usually pass it in the header as:
Authorization: Bearer <token>.

The server verifies this token to ensure the request is coming from an authorized user. The main benefit of OAuth 2.0 and Bearer Token is that it adds a strong security layer — tokens are temporary, can be refreshed, and don’t expose the user’s credentials in every request. This is the most commonly used authentication method in modern APIs.

46 How can you test the performance in API

In real-time projects, I usually test API performance by checking how fast the API responds and whether it can handle multiple requests efficiently. I start by using Postman or REST Assured to manually observe the response time for each request — this gives an initial idea of performance. For more detailed load or stress testing, tools like JMeter or K6 are used to simulate multiple users hitting the same API at once.

In REST Assured, we can also measure performance by capturing the response time using methods like response.time() and validating if it meets the expected SLA (Service Level Agreement). So basically, I check how quickly the API responds under normal and heavy loads, whether it’s consistent, and if the server can handle the expected traffic smoothly.

47 Difference between soap and rest and Which is best and why and which one is more secure?

SOAP and REST are two different approaches for building and testing APIs.

SOAP (Simple Object Access Protocol) is a protocol that uses XML format for sending and receiving data. It’s very strict, has predefined standards, and supports features like security (WS-Security), transactions, and reliable messaging. However, it’s heavier because it requires more bandwidth and is slower due to XML formatting.

REST (Representational State Transfer) is an architectural style that uses lightweight formats like JSON or XML. It works over standard HTTP methods like GET, POST, PUT, and DELETE, making it faster and easier to use. REST APIs are stateless, simple, and widely used in modern web and mobile applications.

In the current industry, REST is preferred over SOAP because it’s faster, easier to implement, supports multiple formats, and integrates smoothly with web and mobile apps. It’s also developer-friendly and better suited for microservices-based applications.

SOAP is generally considered more secure than REST because it has built-in security features like WS-Security, which supports encryption, digital signatures, and authentication at the message level. This makes it suitable for enterprise-level or banking applications where high security is required.

However, REST can also be made secure using HTTPS and OAuth 2.0 for authentication, but those are external implementations, not built-in.


48 Why we use api

We use APIs because they act as a bridge between different software systems, allowing them to communicate and share data seamlessly. In simple terms, an API helps one application talk to another without needing to know how the other system works internally.

For example, in testing or automation, we use APIs to validate whether data is being correctly sent to and received from the backend without depending on the user interface. It saves time, makes testing faster, and helps identify backend issues early.

In real-time projects, APIs are used for things like login, fetching product details, making payments, or updating user profiles — all these actions happen through API calls.


49 What is api automation approach or What you do in API testing 

In our project, we followed a structured API automation approach to ensure accuracy and maintainability. First, I understood the API documentation (mostly from Swagger) to get details like endpoints, request types, headers, parameters, and responses. Then, I manually tested the APIs in Postman to verify their behavior and confirm expected responses from the backend.

Once the manual verification was done, I automated the same APIs using Rest Assured with TestNG. I created reusable methods for different HTTP methods like GET, POST, PUT, and DELETE, and handled authentication like Bearer Tokens or Basic Auth dynamically from configuration files. I also used data-driven testing by fetching input values from Excel or JSON files, so the same script could run with multiple data sets.

During execution, I validated status codes, response times, headers, and response bodies using assertions to ensure the APIs worked as expected. I also integrated reporting tools like Extent Reports to capture the results clearly.

So, overall in API testing, I verify both functional and non-functional aspects of the API — ensuring that the backend logic, data flow, and integrations between different systems work correctly — and through automation, I make this process faster and repeatable.

50 Why you are doing api testing?

I perform API testing to make sure the communication between the frontend and backend works correctly before the UI is even ready. It helps identify defects early in the development cycle since APIs handle most of the business logic and data transfer between systems.

By testing APIs, I can validate whether the data is sent, processed, and received properly — including checking status codes, response time, headers, and the response body. It also ensures that the application’s functionality is stable, secure, and performs well under different conditions.

In short, API testing helps improve overall product quality, reduces UI-related testing effort, and ensures smooth integration between services before they reach the end user.
I perform API testing to make sure the communication between the frontend and backend works correctly before the UI is even ready. It helps identify defects early in the development cycle since APIs handle most of the business logic and data transfer between systems.

By testing APIs, I can validate whether the data is sent, processed, and received properly — including checking status codes, response time, headers, and the response body. It also ensures that the application’s functionality is stable, secure, and performs well under different conditions.

In short, API testing helps improve overall product quality, reduces UI-related testing effort, and ensures smooth integration between services before they reach the end user.


51 How do you test APIs when requirements are missing?

If proper requirements are not available, I first try to get information from the Swagger document, Postman collections, or by discussing directly with the developers or backend team to understand the API’s purpose and expected behavior.

If that’s also not available, I use tools like Charles Proxy or network logs to capture live API calls made by the application. From there, I analyze the endpoints, request parameters, and responses to understand what each API does.

Once I have that understanding, I perform exploratory API testing — where I send different combinations of input values, observe responses, and validate if the API behaves logically. This helps uncover unexpected behavior or defects even without formal documentation.

So even without requirements, I rely on technical investigation, discussion with the team, and my understanding of the system flow to test APIs effectively.


52 What is the purpose of request header?

In API testing, the request header plays an important role because it carries additional information that helps the server understand how to handle the request. For example, it may include authentication details like a bearer token, content type to specify the data format (such as JSON or XML), and accept type to tell the server what kind of response format the client expects. Sometimes, custom headers are also used, depending on the API’s requirements. In simple terms, headers act like instructions or metadata for the request, ensuring secure and proper communication between the client and the server.

53 What is cURL and Which format cURL uses?

In API testing, cURL (Client URL) is a command-line tool used to send requests and receive responses from APIs. It’s mainly used to test endpoints quickly without using tools like Postman. Testers and developers often use it to verify API behavior, check headers, or debug network issues.

cURL uses command-line syntax (text format) and supports various protocols like HTTP, HTTPS, FTP, etc. When interacting with APIs, it usually deals with data in JSON format for request and response bodies, though it can handle XML and form data as well.

54 What is endpoint, Explain it?

An endpoint is the specific URL path on a server where an API request is sent to perform an action or access data.

During my experience with Postman, I understood that an endpoint is the specific path or address in an API where a request is sent to interact with a particular web resource. For example, in REST APIs, the base URL points to the main API service, such as https://api.example.com, and the endpoint is appended to it—like /users, /products, or /orders—to access specific data or functionalities. Each endpoint is linked with an HTTP method such as GET, POST, PUT, or DELETE, depending on the operation being performed. In simple terms, endpoints help testers communicate with the exact feature or resource of the API that needs to be tested or validated.

55 What do you mean by request chaining can u give on example


Request chaining in API testing means using the response of one API request as the input for another. It’s mainly used when APIs are dependent on each other. For example, in a real-time scenario, first, I might send a POST request to create a new user, and the response will return a user ID. Then I’ll use that same user ID in the next API, like a GET or PUT request, to fetch or update the user details. This helps to validate the flow between multiple APIs and ensures that the integration between them is working correctly. In Rest Assured, we usually extract the value (like an ID or token) from the first response and pass it dynamically into the next request.


56 Why you are using pojo class?

In API testing, I use a POJO (Plain Old Java Object) class to handle request payloads and responses in a clean and structured way. Instead of hardcoding JSON data directly inside the script, I map the data to a POJO class using variables and getters/setters. This makes the code more readable, reusable, and easier to maintain.

For example, when I send a POST request to create a user, I create a POJO class with fields like name, email, and job. I just set the values in that object, and Rest Assured automatically converts it into JSON. It’s very useful when working with large or frequently changing payloads because

57 How will you send dynamic payload for API through Restassured.

In real-time API testing, I usually send dynamic payloads in Rest Assured when the data keeps changing, like user IDs, names, or project details. To handle this, I don’t hardcode the values — instead, I generate them dynamically using Java logic (like Random class or System.currentTimeMillis()) or fetch them from external sources such as Excel, property files, or JSON files.

For example, if I need to send a unique employee name each time, I might create it like "emp_" + System.currentTimeMillis(). Then I pass that value into the JSON body using a HashMap, JSONObject, or POJO class. This approach helps make my scripts more flexible and data-driven, avoiding duplicate or hardcoded data during API automation.

58 Explain how you created a payload for in your project?
In my project, I created the payloads in different ways depending on the scenario. For simple APIs, I used a HashMap or JSONObject to build the payload directly inside the test script. But for larger or more complex APIs, I used a POJO class to make the payload more structured and reusable.

For example, if I had to create a new employee, I created a POJO class with variables like empName, empId, designation, and used getter and setter methods. Then, in my test script, I just created an object of that POJO class, set the values dynamically, and passed it to the body() method in Rest Assured.

In some cases, I also fetched the test data from Excel sheets or property files using utility methods, so that the payload values

59 How to set request in rest assured?

In Rest Assured, we set up a request using the BDD style — starting with the given() method. Inside given(), we can set all the request details like headers, parameters, authentication, and payload before sending it to the server, Here, inside given(), we define everything required to make the request — like base URI, headers, and body. Then under when(), we specify which HTTP method to use (GET, POST, PUT, DELETE, etc.), and finally under then(), we write validations or assertions.


60 Explain how you created a payload for in your project?

In my project, I created payloads in different ways depending on the requirement. For small or simple APIs, I directly created the payload using HashMap or JSONObject inside the test script. But for more complex APIs, I preferred using a POJO class because it made the code cleaner, reusable, and easier to maintain.
For example, in one of my APIs, I had to create a new user. So, I created a POJO class named UserPojo with variables like name, email, and role, along with getter and setter methods. Then, in my Rest Assured script, I created an object of that POJO class, set values dynamically, and passed it to the body() method — like body(userObject).
In some cases, I also fetched test data from Excel sheets or property files so that the payload values were not hardcoded and could be easily changed for different test scenarios. This approach made the API testing more flexible and closer to real-time project practices.


61 How to modify payload?

In real-time API testing, we often need to modify payloads to test different scenarios or update certain fields dynamically. I usually modify the payload in a few simple ways depending on how it’s created.
If the payload is created using a POJO class, I just update the field values by using setter methods before sending the request. For example, if I want to change a user’s name or email, I simply call setName("NewName") or setEmail("new@email.com") on the POJO object.
If the payload is in JSON format, I modify it using a JSONObject or a HashMap by updating the key-value pairs. For example, json.put("name", "UpdatedName") or map.put("age", 30) before passing it into the body.
Sometimes, when I get the payload from an external file like Excel or a JSON file, I read it and replace only the specific values that need to change. This helps keep the test data dynamic and reusable.
So, in short, modifying a payload means updating its content — either by using POJO setters, changing JSON key values, or editing external test data — before sending it in the API request.


62 What is sslcertification error, Have you ever faced sslCertification error in your project and how you handled SSL certificate exception  ? 

Yes, I’ve faced SSL certification errors during API testing in my project, especially when testing APIs in staging or QA environments where the SSL certificates were either self-signed or not trusted.

Basically, an SSL certification error happens when the server’s SSL certificate cannot be verified by the client — for example, if it’s expired, self-signed, or doesn’t match the domain. This usually prevents the request from going through because the connection isn’t considered secure.

In Rest Assured, when I faced this issue, I handled it by using the method relaxedHTTPSValidation(). This method allows Rest Assured to bypass SSL certificate validation temporarily and continue testing without security interruptions. For example:
In real-world testing, we usually inform the backend or DevOps team if the SSL issue is from the server side. But for testing purposes, using relaxedHTTPSValidation() is a common and safe workaround in non-production environments.


63 Do you know Data Mocking?

Yes, I’m familiar with data mocking. In simple terms, data mocking means creating fake or simulated data that looks real but isn’t fetched from the actual backend or database. It’s mainly used during testing when the real API, server, or database is not ready or available.

For example, in API testing, if the backend endpoint is still under development, we use data mocking tools like Postman Mock Server, WireMock, or Mockoon to simulate API responses. This helps us test how the frontend or automation scripts behave without waiting for the actual API.

In my project, I’ve used data mocking to verify API integration and UI flows even before the backend was fully functional. It helps save time, reduce dependency on backend teams, and ensures early validation of functionalities.


63 What is wiremocking and Did you work on wiremocking in api?

WireMock is a tool used for API mocking and service virtualization. It helps simulate (or fake) REST APIs so that we can test our applications even if the real backend or third-party APIs are not available. Basically, it allows us to create mock endpoints that return predefined responses — like success, error, or timeout — without needing the actual server.

For example, if the developer hasn’t completed the API or the third-party service is down, we can use WireMock to mimic those APIs and continue our testing. It also allows us to test how our system behaves under different conditions, like when

64 Have you used excel to for simulating or mocking data?

Yes, I’ve used Excel both for simulating and mocking data during API testing. In some cases, I store test data like user details, product information, or token values in Excel sheets, and then fetch that data dynamically using Apache POI in my Rest Assured scripts. This helps in performing data-driven testing without hardcoding values.

I’ve also used Excel for mocking data, especially when the backend was not ready. For example, if an API expected a response body in a specific format, I created dummy data in Excel to simulate real responses and used that while testing request validation or payload structures. This approach makes the testing more flexible and reusable across different environments.

65 Can you tell how we can create random data using APIs?

Yes, we can create random data in APIs to make testing more dynamic and realistic. In Rest Assured, I usually use Java’s built-in classes like Random, UUID, or even Faker library for this purpose.

For example, if I’m testing a user creation API, instead of hardcoding names or emails, I generate random values like:

``` java
String randomName = "User_" + UUID.randomUUID().toString();
String randomEmail = "user" + new Random().nextInt(1000) + "@gmail.com";
```
Or if I’m using the Faker library, I can directly get realistic data such as names, addresses, and phone numbers using simple methods like:

```java
Faker faker = new Faker();
String name = faker.name().fullName();
String email = faker.internet().emailAddress();
```
This helps ensure that every API request is unique and prevents duplication errors — especially useful when creating resources like users, products, or orders during automation runs. In real-time projects, I often combine this random data with payloads to simulate real-world test scenarios.




66 What is a POJO class in REST Assured?

In REST Assured, a POJO class stands for Plain Old Java Object. It’s basically a simple Java class that we use to represent the request or response data in a structured way. Instead of writing raw JSON directly in our code, we create a POJO class with variables, constructors, getters, and setters. REST Assured then automatically converts this POJO into JSON when sending the request body and also converts the JSON response back into a POJO object. This makes the code cleaner, easier to maintain, and more readable during API automation.

67 What is serialization and deserialization in API testing? 

Serialization is the process of converting a Java object into a format like JSON or XML so that it can be easily sent over the network. In API testing, we usually use serialization when we need to send request data in JSON format. Instead of manually creating a JSON string, we create a Java object and let the serialization process automatically convert it into JSON. This makes our code cleaner, easier to maintain, and reduces chances of human error. For example, in Rest Assured, when we pass a Java object in the .body() method, it gets automatically serialized into JSON before sending the API request.

Deserialization is the reverse process of serialization. It means converting a JSON or XML response from the API back into a Java object. In simple terms, when we receive a response from the server, instead of reading raw JSON data, we can map that response directly to a Java class (POJO). This makes it easier to extract and validate specific fields like name, id, or status. In Rest Assured, deserialization happens automatically when we use methods like .as(ClassName.class) to convert the response body into a Java object. It helps in writing clean, readable, and easily maintainable test scripts.

67 How do you send a POJO class as a request body in REST Assured?  
To send a POJO class as a request body in REST Assured, we first create a POJO class that represents our JSON structure — with variables, constructors, and getter-setter methods. Then we create an object of that POJO and simply pass it inside the .body() method. REST Assured automatically converts the POJO object into JSON format before sending the request.


68 How do you deserialize JSON response to a POJO in REST Assured?
In REST Assured, deserialization means converting the JSON response into a Java object. We just create a matching POJO class and use response.as(POJOClass.class). REST Assured handles the conversion internally using the Jackson library


69 How do you integrate REST Assured with TestNG or JUnit?

To integrate REST Assured with TestNG, I first add both the REST Assured and TestNG dependencies in the Maven pom.xml file. Then, I create a Java class for my test cases and import both REST Assured and TestNG packages. Inside that class, I use TestNG annotations like @BeforeClass to set up the base URI and @Test to write the actual API test methods using REST Assured.

Finally, I execute the test cases either directly from the IDE or through the testng.xml file, which helps in grouping and managing multiple API test classes. The results are automatically displayed in TestNG’s HTML report.



























































Explain the main components of a REST Assured test script.
What are the various HTTP methods supported by REST Assured?
How do you send a GET request using REST Assured?
Explain REST Assured method chaining.
Explain the difference between 'given()', 'when()', and 'then()' in REST Assured.
 What is the request specification, and how is it initiated?
How do you handle authentication in REST Assured?
What is the role of the 'baseURL' and 'basePath' methods in REST Assured?
 How do you validate responses in REST Assured?
Describe how to extract data from a response in REST Assured.
 What is GPath in REST Assured, and how is it used?
Explain how to handle parameters in REST Assured.

Parameters in REST Assured can be handled using methods like param(), queryParams(), and formParams(). These methods allow you to add parameters to your request, whether they are query parameters, form parameters, or path parameters.

 How do you manage cookies in REST Assured?
Cookies can be managed using the ‘cookie()’ method for adding cookies to requests and the ‘cookies()’ method for extracting cookies from responses. REST Assured also allows for detailed cookie specifications, including setting their name, value, path, and expiry.
 Discuss the use of filters in REST Assured.
Filters in REST Assured are used to intercept and modify requests and responses. They can be used for logging, authentication, or cust
17. What is JSONPath in REST Assured, and how do you use it?
JSONPath is a query language for JSON, similar to XPath for XML. In REST Assured, JSONPath expressions are used to extract specific parts from a JSON response. This is done using the ‘JsonPath’ class or the ‘path()’ method in the response.

18. How do you perform path parameterization in REST Assured?
Path parameterization in REST Assured is done using the ‘pathParam()’ method. This allows for dynamic URLs where certain parts of the path can be set at runtime. For example, given().pathParam(“id”, 123).when().get(“/users/{id}”).
19. Explain the concept of serialization and deserialization in REST Assured.
Serialization in REST Assured refers to converting a Java object into a JSON or XML payload to send with a request. Deserialization is the opposite, where a JSON or XML response is converted back into a Java object. This is typically handled automatically by REST Assured using libraries like Jackson or Gson.

20. How do you integrate REST Assured with TestNG or JUnit?

21. Discuss the importance of the ContentType enum in REST Assured.
The ContentType enum in REST Assured is used to specify the content type of the request and response. It’s important to ensure that the API correctly interprets the data format being sent and received, such as JSON, XML, or HTML.

22. 
Logging in REST Assured can be done using the ‘log()’ method. You can log requests, responses, or both, and it can be configured to log only when the test fails. This is useful for debugging and verifying the details of API interactions.


23. What are the common assertions used in REST Assured?




24 Explain authentication method in restassured

In REST Assured, there are multiple authentication methods available based on how the API is secured. The most common ones are Basic, Digestive, Preemptive, and Bearer Token (OAuth 2.0).

Basic Authentication sends the username and password encoded in Base64 format with each request. It’s simple but less secure unless used over HTTPS.

Preemptive Authentication is a type of Basic Authentication where credentials are sent immediately with the request — so it doesn’t wait for the server’s challenge, which makes it faster.

Digestive Authentication is more secure than Basic because it uses hashing; the credentials aren’t sent directly but in an encrypted form.

Then we have Bearer Token or OAuth 2.0, which is the most commonly used in real-time projects. Here, a token is passed in the request header like Authorization: Bearer <token> to verify the user.

All these methods can be implemented in REST Assured using the .auth() method depending on what kind of authentication the API requires.






What type of code you write in the API Asked about api's used in project and operations performed on it. Again cross questions on it.




On which Framework did you work on for APIs, POSTMAN or RestAssured?

if you're a developer, can you configure post method to retrieve data from the back-end?
open notepad and write a get request to fetch a particular invoice id



now collected







create method to launch the browser which is generic




suppose I have token for authoraization and it expires in one day and I want execute api test scripts every day what is your approach
in api automation how did you handle dynamic data in post request
suppose I have 1000 api scripts will you create 1000 pojoclasses for post request(No for complex reqest and handling dynamic data we create pojo classes and for simple post request we have used jsonfiles and hashmaps )



suppose I have 1000 api scripts will you create 1000 pojoclasses for post request(No for complex reqest and handling dynamic data we create pojo classes and for simple post request we have used jsonfiles and hashmaps )




Others Question
⁠How did you handle 3rd party api


Have you used excel to for simulating or mocking data?
Can you tell how we can create random data using APIs?
How u conclude the api defect

What is sign off
Who will sign off the defect report
Have 

How u identify backend and frontend issue

Tell me a scenario where you have used put and delete http method in your project
I give an API What is your approach What all the fields you check for
I have data in excel and I want to use that data in one request how you fetched the data

suppose I have token for authoraization and it expires in one day and I want execute api test scripts every day what is your approach

what is header part contains in api test cases
7)what is rate limit
8)what api contract


If I am sending the request for first time through API, the time is less,. But if I send the same type of request again, it is taking more time.. So what are all the possible reasons for it to take more time.
how to integrates restAssured with ci/cd tool
Assume that I have a book_title in response body. Write a Restassured script to assert that.
can you write excel or json code to store the variable from script


About schema validation
API testcases.
how many module expose to api?
how many api you have expose?








how to handle the response body in API?
Tell about given() when() then()

Script based

Sample Post request in rest assured program 
Write the Delete Request for by taking any endpoint.
Write a post method and fetch the value from the body.
write script for restAssured api for post method?
restAssured Use Get Method and Give Endpoint in previous Project
Write a Script to send Api request and validate the response.
Gave one url and asked to say which is query and which is path parameter.
Find the JSONpath for "employeeId": "E003"?
9.fetch username and password from a JSON file without adding Jackson dependency(deserialization) and put in POST request?
He gave one response body and asked me to write jsonPath to fetch all the id.
Write RestAssured code for the POST method.
Fetch firstName from POST method and use that for PUT method.



BDD
Do you know BDD
What do you know about bdd
Where you have used bdd
Do you have any idea about BDD Framework
whats the flow of BDD
Do you gerkin language

API

            


Did you work on API testing?
Why u are doing api testing?





Validation
Rest assured employee verification




Authentication and authorization


which authentication techniques have you used?
How you used baerer token in postman and RestAssured?
How you were handling the token in framework 







Crud operation
Diff between put and patch with example  
What all api testing you used to do?








status code




Assume there is a web table all datas are dynamic write a xpath for it.
what is the diff between the verify and assertion
how did resolve the merge conflicts
maven command to fetch the dependencies that you have in your project
framework explanation
in api automation how did you handle dynamic data in post request
suppose I have 1000 api scripts will you create 1000 pojoclasses for post request(No for complex reqest and handling dynamic data we create pojo classes and for simple post request we have used jsonfiles and hashmaps )
3.Where you are used in your project
4.Explain positive and negative scenario of api
Given one scenario with nested frame and asked to write script 

How to upload a file write the script 
How to fetch data from excelsheet
Occurance of duplicates in a string program, I/p - yr name
How to find Webtable elements for admin and user
How u perform Functionality testing in last project
Exception
implicit, explicit wait
Explain End-to-end scenario of your project
testng annotations
Have you worked on any payment options.
If user cancel the product have you return the amount.
you have tested in all the env and build is released in the production but client found a bug after 5days of the release, how do you handle this situation.
What is Epic
explain me agile characteristics
define a test() funtion to find unique element from the array int a[]={1,3,1,9,0,10,6,4,9,1}; 
I have written logic by using Linkedhashset but he asked to write logic without using collection. I have Written logic by using Ascii value
Write a logic to move mouse cursor on the element and click on the 3rd data from the dropdown
Previous project explanation and asked to explain with 
I want to delete particular resourse in the DB...Tell me on what bases you will delete the resourse
Introduce yourself he stopped me while explaining API experience.
Difference between isDisplayed and isAccessible
program print no divisible by 2 in an array and add one string and integer.
adb commands to connect devices,interruption testing, connect to specific device.
adb commands for install the app. 
program take two user inputs and give a^b  .
if logo is not visible on web application which type defect it is ?
what is join in sql?
In database Which query you worked on more? Have you work with delete query?
Have u worked on the bdd framework 
Difference between git fetch and git merge


