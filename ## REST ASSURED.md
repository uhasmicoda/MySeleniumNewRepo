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

Encryption

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












