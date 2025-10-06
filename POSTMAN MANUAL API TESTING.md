## POSTMAN MANUAL API TESTING

## 1 API

An API, or Application Programming Interface, is a communication link between two software systems that allows them to exchange data and perform operations. In simple terms, it acts as a or bridge messenger between the client and the server. When a client, such as a web or mobile application, sends a request for some data, the API delivers that request to the server. The server then processes it and sends back the required response to the client through the same API.

For example, when we use an application like Zomato to search for restaurants, the app doesn’t directly connect to the database. Instead, it sends the request to Zomato’s API, which fetches the restaurant details from the server and returns them in a structured format, usually in JSON or XML. In manual testing, we mainly validate these API requests and responses to ensure that the data is correct, the functionality works as expected, and the response time and status codes are proper.



| **Step** | **Component** | **Example Description**                                                            |
| -------- | ------------- | ---------------------------------------------------------------------------------- |
| 1        | **Client**    | User opens the Zomato app and searches for “restaurants in Delhi.”                 |
| 2        | **Request**   | The app sends a `GET` request to Zomato’s API endpoint: `/restaurants?city=Delhi`. |
| 3        | **API**       | The API receives the request and communicates with the server/database.            |
| 4        | **Server**    | The server fetches matching restaurant details and sends them back.                |
| 5        | **Response**  | The API delivers the restaurant data to the app in JSON format.                    |
 
## 2 API TESTING

API testing is a type of software testing that focuses on verifying whether the APIs of an application are working correctly and reliably. Instead of testing the user interface, API testing is done at the backend level to check the communication between the client and the server. The main goal is to ensure that the API returns the correct responses for different requests, follows the expected format (like JSON or XML), handles errors properly, and performs well under various conditions.

In manual API testing, we usually send requests like GET, POST, PUT, and DELETE using tools such as Postman, and then validate the response status codes, response body, headers, and response time. For example, if we test a login API, we verify whether valid credentials allow successful login and invalid credentials show the proper error message. This type of testing helps in identifying issues early in the backend logic before the user interface is developed.


## 3 WEB SERVICE

A web service is a mechanism or medium of communication through which two applications or machines can exchange data over a network, irrespective of the underlying technology or platform they are built on. It allows one application to share its functionality with another without exposing its source code or database details. In simple terms, web services help different applications communicate and exchange information, whether they are running on the same or different platforms.

All web services are exposed through APIs, but not all APIs are considered web services. This means every web service is an API, but APIs can exist without being web services—for example, local APIs that work within the same system.

## 4 WEB SERVICE TESTING

Web Service Testing is the process of verifying the request and response of APIs that belong to a web service. It ensures that two applications are communicating properly and exchanging data as expected. In this testing, we validate various aspects like request format, response correctness, data accuracy, status codes, and error handling. In simple terms, web service testing focuses on testing the interaction and data exchange between two applications through APIs.

## 5 WHY WEBSERVICE TESTING IS REQUIRED

Web Service Testing is required to ensure that the communication between two applications or systems works correctly and reliably. Since web services act as a bridge for data exchange between different applications, any failure or incorrect response can affect the entire system’s functionality. Testing helps verify that the API requests and responses are accurate, the data being transferred is correct, and the service handles both valid and invalid inputs properly. It also ensures that the web service performs well under load, follows security standards, and remains compatible across different platforms. In short, web service testing is important to detect issues early at the integration or backend level before they impact the end users.

## 6 TYPES OF WEB SERVICE

There are mainly two types of web services — SOAP (Simple Object Access Protocol) and REST (Representational State Transfer).

SOAP Web Service is a protocol-based web service that uses XML for sending and receiving data. It is more rigid and follows strict standards for message structure and communication. SOAP supports features like security (WS-Security), transactions, and reliability, which makes it suitable for enterprise-level applications where high security and formal contracts are required.

REST Web Service, on the other hand, is an architectural style that uses standard HTTP methods such as GET, POST, PUT, and DELETE. REST usually transfers data in lightweight formats like JSON or XML and is faster and easier to use compared to SOAP. Because of its simplicity and performance, RESTful web services are widely used in modern web and mobile applications.


| **Feature**                | **SOAP (Simple Object Access Protocol)**                                               | **REST (Representational State Transfer)**                           |
| -------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------- |
| **Type**                   | Protocol-based web service                                                             | Architectural style-based web service                                |
| **Data Format**            | Uses only **XML** for data exchange                                                    | Uses **JSON**, **XML**, **HTML**, or **Text**                        |
| **Communication Protocol** | Works only over **HTTP**, **SMTP**, **TCP**, etc.                                      | Works mainly over **HTTP/HTTPS**                                     |
| **Message Format**         | Strict and predefined XML structure using **SOAP envelopes**                           | Lightweight data exchange using **URLs and HTTP methods**            |
| **Operations**             | Uses service interfaces like **WSDL (Web Service Description Language)**               | Uses **HTTP methods** such as **GET, POST, PUT, DELETE**             |
| **Performance**            | Slower due to heavy XML and strict rules                                               | Faster because of lightweight format (mostly JSON)                   |
| **Security**               | High security using **WS-Security** standards                                          | Relies on **HTTPS** and token-based security (e.g., OAuth)           |
| **Statefulness**           | Can be **stateful** or **stateless**                                                   | Always **stateless**                                                 |
| **Ease of Use**            | Complex to implement                                                                   | Simple and easy to integrate                                         |
| **Best Suited For**        | Enterprise or financial applications where high security and transactions are required | Web and mobile applications where speed and simplicity are preferred |

## 7 HTTP STRUCTURE

The HTTP Structure is mainly divided into two parts — Header and Body. The header carries important details like the type of request, content type, authorization, cookies, and other metadata required to process the request. The body, on the other hand, contains the actual data that is either sent to the server or received from it. Whenever a client sends a request to the server, it is called an HTTP Request, and when the server processes that request and sends back the result, it is known as an HTTP Response.

An HTTP Request is what a client sends to the server to perform a specific action, and it consists of several components. The first one is the HTTP Method, which defines the type of operation you want to perform. The most common methods include POST for creating new data, GET for reading or fetching data, PUT/PATCH for updating an existing resource, and DELETE for removing data. Each of these methods tells the server what kind of action the client wants to execute.

Next, the Web URL (Uniform Resource Locator) represents the exact address of the server or the resource you are trying to access. For example, a URL like https://api.example.com/users
 specifies where the request should go. The Content Type indicates the data format being sent in the request body, such as application/json, which informs the server that the data being shared is in JSON format.

The Cookies in an HTTP Request carry additional information that helps maintain session details or remember user-specific data like authentication tokens or session IDs. These cookies allow communication between the client and server to remain consistent across multiple requests. Along with this, the Form Data or Raw Data represents the actual information being transmitted from the client to the server. Form Data is usually used in web forms, while Raw Data contains manually entered formats like JSON or XML, for example:

{
  "name": "John",
  "email": "john@gmail.com"
}


This is the data the server receives and processes based on the client’s request.

An HTTP Response is the message sent back from the server to the client after executing the requested action. It includes key components such as the Status Code, Response Time, Cookies, and Actual Data. The Status Code indicates whether the request was successful or if an error occurred, and these are grouped into three main categories. The 2xx series represents success responses like 200 OK (successful request), 201 Created (resource created), and 204 No Content (successful but no data to return). The 4xx series represents client-side errors such as 400 Bad Request (invalid format), 401 Unauthorized (missing authentication), 404 Not Found (invalid resource), and 409 Conflict (data conflict). The 5xx series represents server-side issues such as 500 Internal Server Error, 501 Not Implemented, 503 Service Unavailable, and 504 Gateway Timeout.

Response Time refers to the total time taken for the request to be sent, processed, and the response to be received — generally measured in milliseconds (ms). It is usually defined in the Service Level Agreement (SLA) shared by the client; if not specified, the industry standard is around 1 second (1000 ms) per operation.

Similar to requests, responses can also include Cookies if the server needs to share extra information like authentication details or tracking data. Finally, the Actual Data is the main content the server sends back to the client — for example, user information, product details, or transaction data. It’s often structured in JSON format, such as:

{
  "status": "success",
  "userId": 101,
  "name": "John"
}


This data confirms that the server successfully processed the client’s request and provides the final output.


| **Component**                   | **Description**                                        | **Example / Notes**                                                                                                                                                                              |
| ------------------------------- | ------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| **HTTP Structure**              | Divided into two parts – Header and Body               | Header: Metadata (content type, cookies, etc.)<br>Body: Actual data sent/received                                                                                                                |
| **HTTP Request**                | Data sent from client to server                        | Example: Sending login details from app to server                                                                                                                                                |
| **HTTP Methods**                | Define the operation type                              | **POST** → Create<br>**GET** → Read<br>**PUT/PATCH** → Update<br>**DELETE** → Delete                                                                                                             |
| **Web URL (Endpoint)**          | Address of the server/resource                         | `https://api.example.com/users`                                                                                                                                                                  |
| **Content-Type**                | Format of data sent to server                          | `application/json`, `text/html`, `application/xml`                                                                                                                                               |
| **Cookies (Request)**           | Additional info from client (like session ID or token) | Used to maintain session or authentication                                                                                                                                                       |
| **Form Data / Raw Data**        | Actual data sent from client                           | Example:<br>`{"name":"John","email":"john@gmail.com"}`                                                                                                                                           |
| **HTTP Response**               | Data returned from server after processing request     | Includes status code, response time, cookies, and actual data                                                                                                                                    |
| **Status Codes**                | Indicate result of request                             | **2xx – Success:** 200 OK, 201 Created<br>**4xx – Client Error:** 400 Bad Request, 401 Unauthorized, 404 Not Found<br>**5xx – Server Error:** 500 Internal Server Error, 503 Service Unavailable |
| **Response Time**               | Total time to send, process, and receive response      | Usually in milliseconds (ms); standard ≈ **1000 ms**                                                                                                                                             |
| **Cookies (Response)**          | Extra info from server to client                       | Used for session management or preferences                                                                                                                                                       |
| **Actual Data (Response Body)** | Main content returned from server                      | Example:<br>`{"status":"success","userId":101,"name":"John"}`                                                                                                                                    |


