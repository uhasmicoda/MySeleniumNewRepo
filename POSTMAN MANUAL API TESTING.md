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


## 8 POSTMAN

Postman is a popular API testing tool used by testers and developers to send, receive, and validate API requests and responses. In simple terms, it helps us check whether an API is working as expected. In my project, I used Postman mainly for manual API testing. Using Postman, we can perform all types of HTTP methods such as GET, POST, PUT, PATCH, and DELETE to verify CRUD operations. We can easily add headers, parameters, and request bodies in JSON or XML format and then analyze the response code, response time, and data. Postman also allows creating collections of APIs for better organization and reusability. One of the major advantages is the built-in automation feature using Pre-request Scripts and Tests (JavaScript), which allows us to validate responses automatically. Additionally, Postman supports environment variables like base URLs or tokens, making it easier to test APIs across multiple environments (dev, staging, production). Overall, Postman simplifies API testing by providing a user-friendly interface and powerful validation options, which help ensure the backend services are reliable and integrated correctly with the front end.


## 9 Prerequisite for Postman

Before starting API testing using Postman, there are a few important prerequisites that help in understanding and performing the testing effectively. First, you should have a clear understanding of the client-server architecture, since API testing is all about communication between a client (which sends the request) and a server (which gives the response). You also need to know how HTTP requests and responses work, including methods like GET, POST, PUT, and DELETE, along with response codes and headers. A basic understanding of databases is helpful because many APIs interact with data stored on the backend.

You should also understand CRUD operations (Create, Read, Update, Delete) since these are the core actions performed through APIs. Knowledge of data formats like JSON and XML is essential, as APIs mostly exchange data in these formats. On top of that, familiarity with API testing tools like Postman, Rest Assured, FireFlink, or Requests (Python library) is important. Finally, you should know how to design API test cases — both positive and negative — and how to refer to API documentation or functional specifications, which describe the endpoints, parameters, and expected responses.


## 10 Environment

In Postman, an environment is basically a collection of variables that helps us manage different setups easily during API testing. For example, when we work on multiple stages like Development, QA, Staging, or Production, each of them has a different base URL or authentication token. Instead of changing these values manually in every request, we can store them as variables inside an environment. By doing this, we can simply switch the environment and Postman automatically picks the right set of values. This not only saves time but also reduces mistakes, especially when running large collections of requests. It’s very useful in real-time projects where we need to test the same APIs across different servers or environments.

## 11 Types of variable

In Postman, there are five types of variables, and each one has its own purpose and scope that defines where they can be accessed.
In my project, I’ve come across almost all of them. The very first variable I used was the Environment variable, especially when we were testing the same API on different setups like Development (Dev), QA, and Production (Prod). In those environments, we usually stored the base URL and authentication tokens to easily switch between setups without changing the request manually.

I’ve also worked with Global variables, which are accessible throughout the entire workspace. I mainly used them for storing common values like tokens or base URLs during quick testing.

Collection variables were useful when I needed to share common values across multiple requests within the same collection. This helped keep the data consistent for that particular project.

I’ve also used Local variables, which are limited to a single request or script block. I mostly used them for temporary or dynamic data like counters, timestamps, or random IDs generated during test execution.

Finally, I worked with Data variables during data-driven testing, where I imported CSV or JSON files and ran the same request multiple times with different input data using the Collection Runner.

| **Variable Type**        | **Scope / Accessibility**                                  | **Purpose / When to Use**                                                                                                         | **Example**                                           | **Persistence**                                             |
| ------------------------ | ---------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------------- |
| **Global Variable**      | Accessible across the entire workspace in Postman.         | Used for storing common values that are reused in multiple requests or collections (like base URLs, tokens, etc.).                | `{{baseUrl}}` → `https://api.example.com`             | Persists until manually deleted or changed.                 |
| **Environment Variable** | Limited to a specific environment (like Dev, QA, or Prod). | Used when you need different values for the same variable across environments — e.g., different URLs or tokens for Dev, QA, Prod. | `{{token}}` → `Bearer 123xyz`                         | Persists for that environment.                              |
| **Collection Variable**  | Available only within a specific collection.               | Used for values shared by all requests within that collection but not needed globally.                                            | `{{userId}}` → `101`                                  | Saved with the collection and reusable by all its requests. |
| **Local Variable**       | Accessible only within a single request or script block.   | Used for temporary or dynamic values like timestamps, random numbers, or counters.                                                | `let count = 5;`<br>`pm.variables.set("temp", count)` | Exists only during request execution.                       |
| **Data Variable**        | Used during data-driven testing (Collection Runner).       | Helps run the same request with multiple sets of input data from CSV or JSON files.                                               | `{{username}}`, `{{password}}` from CSV file          | Exists only during collection run.                          |


## 12 Parameter and its types

In Postman, a parameter is a way to send additional information with your API request. Parameters help the server understand what data you are requesting or sending. They are part of the URL, request body, or headers, depending on the type of request.

In API or In Postman, there are different types of parameters that play a crucial role in API communication.

One of the most common types I’ve worked with is the Path parameter, which is embedded directly into the endpoint URL to access a specific resource. For example, when I needed to fetch details of a particular user, the API endpoint looked like /users/101, where 101 is a dynamic path parameter representing the user ID.

Next, we have Query parameters, which are mainly used for filtering, sorting, or paginating data. These parameters come after a question mark in the URL — for instance, /users?role=admin&sort=asc. I found them really useful whenever I had to retrieve data based on certain conditions.

Then there are Form parameters, which are used when we want to send sensitive data such as a username or password in the request body, typically in a key-value format. These are commonly sent using either x-www-form-urlencoded or form-data, especially during login functionality or file upload testing. Form parameters are not used with the GET method — they are mostly used with POST or PUT requests.

Finally, in Postman, the Params section generally refers to the key-value pairs we add either as query parameters in the URL or as form-data in the body, depending on the request type. For a GET request, the parameters appear in the URL as query parameters, while in a POST request, they appear in the request body as form parameters. So, the behavior depends on the HTTP method and the content type we use.


| **Parameter Type**       | **Description**                                                                       | **Example**                                                         | **Used In**    | **HTTP Method**  |
| ------------------------ | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------- | -------------- | ---------------- |
| **Path Parameter**       | Used to identify a specific resource in the API endpoint. It is part of the URL path. | `/users/101` → `101` is the user ID.                                | Endpoint URL   | GET, PUT, DELETE |
| **Query Parameter**      | Used to filter, sort, or search data. Added after a `?` in the URL.                   | `/users?role=admin&sort=asc`                                        | URL after `?`  | GET              |
| **Form Parameter**       | Used to send sensitive or structured data in the request body (key-value pairs).      | `username=John`<br>`password=1234`                                  | Request Body   | POST, PUT        |
| **Header Parameter**     | Used to send additional information such as authentication tokens or content type.    | `Authorization: Bearer <token>`<br>`Content-Type: application/json` | Request Header | All Methods      |
| **Body Parameter (Raw)** | Used to send raw data (JSON, XML, or text) directly in the request body.              | `{ "name": "John", "email": "john@gmail.com" }`                     | Request Body   | POST, PUT, PATCH |

## 13 Status code

A status code in API testing represents the result of the client’s request to the server. It’s part of the HTTP response and helps testers understand whether the request was successfully processed or if there was an error. These codes are divided into different categories based on their first digit — for example, 2xx indicates success, 4xx indicates client-side errors, and 5xx indicates server-side errors.

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


## 14 Endpoints

An endpoint is the specific URL path on a server where an API request is sent to perform an action or access data.

During my experience with Postman, I understood that an endpoint is the specific path or address in an API where a request is sent to interact with a particular web resource. For example, in REST APIs, the base URL points to the main API service, such as https://api.example.com, and the endpoint is appended to it—like /users, /products, or /orders—to access specific data or functionalities. Each endpoint is linked with an HTTP method such as GET, POST, PUT, or DELETE, depending on the operation being performed. In simple terms, endpoints help testers communicate with the exact feature or resource of the API that needs to be tested or validated.

| **Term**         | **Description**                                                                            | **Example**                      | **Purpose**                                                          |
| ---------------- | ------------------------------------------------------------------------------------------ | -------------------------------- | -------------------------------------------------------------------- |
| **Base URL**     | The main domain or root address of the API server.                                         | `https://api.example.com`        | Identifies the main location of the API service.                     |
| **Endpoint**     | A specific path appended to the base URL to access a particular resource or functionality. | `/users`, `/products`, `/orders` | Defines which resource or feature the client wants to interact with. |
| **Full API URL** | Combination of base URL and endpoint.                                                      | `https://api.example.com/users`  | Used to send the actual request to the server.                       |
| **HTTP Method**  | Defines the type of operation to perform on the resource.                                  | GET, POST, PUT, DELETE           | Specifies the action — fetch, create, update, or delete.             |


## 15 🧩 Authentication and 🔐 Authorization

Authentication is the process of verifying who the user or client is, In simple words, it confirms the identity of the person or system trying to access the API.

In API testing, authentication ensures that only valid users or systems can send requests to the server, When I worked with Postman, I often used different authentication types like Basic Auth, Bearer Token, or API Key depending on the project’s setup.


Authorization, on the other hand, decides what actions an authenticated user is allowed to perform, Once the identity is confirmed, authorization checks whether the user has permission to access certain data or perform specific operations.


After login, I might be allowed to view user data (GET request) but not delete it (DELETE request), If I tried to delete without proper permission, I’d get a 403 Forbidden error.

## 16 🔐 Difference between OAuth 1.0, OAuth 2.0, and Bearer Token

In my experience, I’ve mostly worked with OAuth 2.0 and Bearer Tokens, but I also understand how OAuth 1.0 differs.
The key difference is that OAuth 1.0 is more complex because it requires multiple credentials like access key, access secret, client ID, and client secret. It uses cryptographic signatures for every request, which makes it secure but harder to implement and maintain.

On the other hand, OAuth 2.0 is simpler, more flexible, and widely used in modern web and mobile applications. It uses access tokens (typically bearer tokens) instead of complex signatures to authenticate and authorize requests.

As for the Bearer Token, it’s actually a part of OAuth 2.0. Once the user is authenticated successfully, the server issues a bearer token, which is then passed in the request header like:

Authorization: Bearer <access_token>


It’s called a “bearer” token because whoever possesses it can access the resource — it doesn’t require an additional signature or key. That’s why it’s very important to keep the token secure.


## 17 🔁 Request Chaining

In my experience, request chaining in Postman or API testing means using the response of one API request as an input for another request.
This approach is especially useful when APIs are dependent on each other and need to be executed in sequence.

For example, in one of my projects, I made a POST request to create a new user, and the response returned a userId. I then used that userId in the next GET request to fetch the details of that same user.
To achieve this, I stored the userId using the Postman script command:

Then, in the next request, I simply used {{userId}} as a variable.
This process helped me test complete workflows step-by-step, similar to how a real user interacts with the system — ensuring data consistency and flow between related APIs.

## 18 Validation in backend

In my project, I used Postman to perform backend API testing and validated several things to ensure the APIs were working correctly.

Firstly, I verified the response status codes like 200 for success, 201 for creation, 400 for bad requests, 401 for unauthorized access, 404 for not found, and 500 for server errors. This helped in confirming whether the API was behaving as expected in different scenarios

Let’s say I was testing a login API — if I entered correct credentials, I expected a 200 status code. If I entered wrong credentials, then a 401 code should be returned. This helped me ensure that the API was responding correctly based on different situations."


Secondly, I validated the response body, after sending the API request,  I validate that expected fields or data were coming back correctly in the response, for that I have used postman snippets something call json value check for need to how to fetch the json xpath For example, I checked if certain keys existed in the JSON response and confirmed that their values were accurate as per the requirements. This helped me ensure that the backend was functioning properly and returning the right data.

Then I validated the response time to make sure the API was working fast enough. For example, if the system expects a reply within 2 seconds, I verified how long the API actually took using postman snippets tools. If it was slow or took longer than expected, I reported it to the development team along with the timing details and logs. This helped them identify where the delay was and improve the performance.

While testing the API, I also checked the Content-Type in the response header. This tells us what format the data is coming in. Most of the time, it should be application/json, especially if the response contains structured data like product details or user info.

If the Content-Type is wrong, the application might not understand the data, and it could cause errors. So, I make sure the format is correct. For example, if I’m expecting product data in JSON format, I check that the Content-Type is set to application/json. If it shows something else, I report it to the development team.


| Validation Type   | What I Checked                                 | Example                                            |
| ----------------- | ---------------------------------------------- | -------------------------------------------------- |
| **Status Code**   | Correct response code for each scenario        | 200 (Success), 401 (Unauthorized), 404 (Not Found) |
| **Response Body** | Data accuracy, key presence, value correctness | Checked `userId`, `token` fields                   |
| **Response Time** | Performance and speed of API                   | Verified if response came under 2 seconds          |
| **Headers**       | Correct data format (Content-Type)             | Ensured `application/json` for JSON data           |


## 19 Batch execution

In the context of Postman or API testing, batch execution refers to running multiple API requests together in one go, usually through tools like the Collection Runner or Newman.

In real-time projects, we often have several APIs that are part of a single flow — for example, login, fetch user details, update information, and logout. Instead of executing these APIs one by one manually, we can execute them as a batch. This ensures that all requests run in a specific order automatically, which helps validate the entire workflow efficiently.

Using the Collection Runner in Postman, we can execute a complete collection of APIs along with their test scripts, environment variables, and data files (like CSV or JSON) for data-driven testing. Similarly, Newman, which is a command-line tool for Postman, allows us to run the same collection directly from the terminal or integrate it into a CI/CD pipeline using tools like Jenkins.

Batch execution is very useful in automation because it saves time, ensures consistency, and helps verify whether the APIs are working correctly together as part of a system flow.


## 20 Report generation
In Postman, report generation using Newman is a way to get detailed results after running a collection of APIs through the command line.

When we execute APIs in bulk using Newman, it automatically generates a report that shows information like the number of tests passed or failed, response times, status codes, and any errors encountered during the execution. This report helps us easily analyze the overall quality and performance of the APIs.

In my experience, I’ve used Newman for batch execution and report generation by running the command:

newman run collection_name.json -e environment_name.json -r cli,html


## 21 JAVASCRIPT SNIPPETS 

In Postman, there are several predefined JavaScript snippets available that help in quickly writing test validations without needing to manually type all the code. These snippets are used under the “Tests” or “Pre-request Script” tab to validate the API response automatically.

| **Snippet Name**                             | **Purpose**                                                                         | **Example / Description**                                                                                                            |
| -------------------------------------------- | ----------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------ |
| **Status code: Code is 200**                 | Checks if the response status code is 200 (OK).                                     | `pm.test("Status code is 200", function () { pm.response.to.have.status(200); });`                                                   |
| **Response time is less than 200ms**         | Validates if the API response is received within the expected time.                 | `pm.test("Response time is less than 200ms", function () { pm.expect(pm.response.responseTime).to.be.below(200); });`                |
| **Response body: Contains string**           | Checks if the response body includes a specific text or keyword.                    | `pm.test("Body contains success message", function () { pm.expect(pm.response.text()).to.include("success"); });`                    |
| **Response body: JSON value check**          | Validates a specific key-value pair in a JSON response.                             | `pm.test("Validate name in response", function () { var jsonData = pm.response.json(); pm.expect(jsonData.name).to.eql("John"); });` |
| **Response header: Content-Type is present** | Ensures that a specific header (like Content-Type) exists in the response.          | `pm.test("Content-Type header is present", function () { pm.response.to.have.header("Content-Type"); });`                            |
| **Set an environment variable**              | Stores a value (like token or ID) in an environment variable for chaining requests. | `pm.environment.set("token", pm.response.json().token);`                                                                             |
| **Clear an environment variable**            | Removes an environment variable from memory.                                        | `pm.environment.unset("token");`                                                                                                     |
| **Check if response has a JSON body**        | Validates if the response body format is JSON.                                      | `pm.test("Response is JSON", function () { pm.response.to.be.json; });`                                                              |
| **Check response code name**                 | Validates if the response status text (like “OK”, “Created”) matches expected.      | `pm.test("Status code name is OK", function () { pm.response.to.have.status("OK"); });`                                              |



# 🧩 Postman Predefined JavaScript Snippets for API Validation

These are some of the most commonly used Postman test snippets that help validate API responses effectively.

---

### ✅ 1. Validate Status Code is 200
```javascript
pm.test("Status code is 200", function () {
    pm.response.to.have.status(200);
});
```

### ⚙️ 2. Validate Response Time is Less Than 2000ms
```javascript
pm.test("Response time is less than 2000ms", function () {
    pm.expect(pm.response.responseTime).to.be.below(2000);
});
```

### 🧾 3. Validate Content-Type Header
```javascript
pm.test("Content-Type is application/json", function () {
    pm.expect(pm.response.headers.get("Content-Type")).to.include("application/json");
});
```

### 🔍 4. Validate Specific Field in JSON Response
```javascript
pm.test("User name is correct", function () {
    var jsonData = pm.response.json();
    pm.expect(jsonData.name).to.eql("John");
});
```

### 🧩 5. Validate Key Exists in JSON Response
```javascript
pm.test("Response contains userId", function () {
    var jsonData = pm.response.json();
    pm.expect(jsonData).to.have.property("userId");
});
```

### 🔢 6. Validate Status Code is Between Range
```javascript
pm.test("Status code is between 200 and 204", function () {
    pm.expect(pm.response.code).to.be.within(200, 204);
});
```

### 🧠 7. Store Response Value into Environment Variable
```javascript
var jsonData = pm.response.json();
pm.environment.set("userId", jsonData.id);
```

### 🔄 8. Use Saved Environment Variable in Next Request
```javascript
pm.test("Verify stored userId", function () {
    var userId = pm.environment.get("userId");
    pm.expect(userId).to.not.be.undefined;
});
```

### ⚠️ 9. Validate Error Message in Response
```javascript
pm.test("Validate error message", function () {
    var jsonData = pm.response.json();
    pm.expect(jsonData.message).to.eql("Invalid credentials");
});
```

### ⏱️ 10. Validate Response Has a JSON Body
```javascript
pm.test("Response has valid JSON", function () {
    pm.response.to.be.json;
});
```

### 🔐 11. Validate Token is Returned
```javascript
pm.test("Token is present in response", function () {
    var jsonData = pm.response.json();
    pm.expect(jsonData).to.have.property("token");
});
```

### 🌐 12. Validate Response Body Contains a Text
```javascript
pm.test("Response body contains 'success'", function () {
    pm.expect(pm.response.text()).to.include("success");
});
```

### 📊 13. Validate Response Code is 201 (Created)
```javascript
pm.test("Status code is 201", function () {
    pm.response.to.have.status(201);
});
```

### 🧾 14. Validate Response Header Exists
```javascript
pm.test("Server header is present", function () {
    pm.response.to.have.header("Server");
});
```

### 🔄 15. Validate Array Length in JSON Response
```javascript
pm.test("Validate array length", function () {
    var jsonData = pm.response.json();
    pm.expect(jsonData.data.length).to.be.above(0);
});
```

### 🧹 16. Delete Environment Variable
```javascript
pm.environment.unset("userId");
```

### 🧮 17. Validate Numeric Value in JSON Response
```javascript
pm.test("Check user age is greater than 18", function () {
    var jsonData = pm.response.json();
    pm.expect(jsonData.age).to.be.above(18);
});
```

### 🧱 18. Validate Status Code 400 (Bad Request)
```javascript
pm.test("Status code is 400", function () {
    pm.response.to.have.status(400);
});
```

### ⚡ 19. Validate Non-Empty Response Body
```javascript
pm.test("Response body is not empty", function () {
    pm.expect(pm.response.text()).to.not.be.empty;
});
```

### 📦 20. Validate JSON Array Contains Value
```javascript
pm.test("Response array contains item", function () {
    var jsonData = pm.response.json();
    pm.expect(jsonData.items).to.include("apple");
});
```
| Day | Topics                                                           |
| --- | ---------------------------------------------------------------- |
| 1   | Selenium concept + experience Qs                                 |
| 2   | Selenium framework + Introduction + Roles & Responsibilities     |
| 3   | Manual testing concept + experience Qs                           |
| 4   | Manual mobile testing + experience Qs                            |
| 5   | Appium concept + experience Qs                                   |
| 6   | Appium framework + Introduction + Roles & Responsibilities       |
| 7   | Manual API testing + experience Qs                               |
| 8   | Rest Assured concept + experience Qs                             |
| 9   | Java programming + logical programming                           |
| 10  | Java logical programming practice + Jira concept & experience Qs |
| 11  | Revision + Mock interview + weak topic practice                  |


Interview Question



Explain What are the http methods you used in your previous project.
What is CRUD
How to perform API response validation?
Hoy u fetch data for api
How u conclude the api defect
What are the things you will do in back end
How you pass the query parameter

What are the status codes you got in api automation

Tell me what is API and what are the actions to be performed on APIs?

I have data in excel and I want to use that data in one request how you fetched the data
How you have done debugging

How do you perform API testing?
difference between post and get method?
how did you use authentication?
10.Explain how you will traverse to json array? By using which method you will verify it?

10. How will you connect device with charles
11.


What is an API

An API, or Application Programming Interface, is a communication link between two software systems that allows them to exchange data and perform operations. In simple terms, it acts as a or bridge messenger between the client and the server. When a client, such as a web or mobile application, sends a request for some data, the API delivers that request to the server. The server then processes it and sends back the required response to the client through the same API.

For example, when we use an application like Zomato to search for restaurants, the app doesn’t directly connect to the database. Instead, it sends the request to Zomato’s API, which fetches the restaurant details from the server and returns them in a structured format, usually in JSON or XML. In manual testing, we mainly validate these API requests and responses to ensure that the data is correct, the functionality works as expected, and the response time and status codes are proper.

What is API testing?

API testing is a type of software testing that focuses on verifying whether the APIs of an application are working correctly and reliably. Instead of testing the user interface, API testing is done at the backend level to check the communication between the client and the server. The main goal is to ensure that the API returns the correct responses for different requests, follows the expected format (like JSON or XML), handles errors properly, and performs well under various conditions.

In manual API testing, we usually send requests like GET, POST, PUT, and DELETE using tools such as Postman, and then validate the response status codes, response body, headers, and response time. For example, if we test a login API, we verify whether valid credentials allow successful login and invalid credentials show the proper error message. This type of testing helps in identifying issues early in the backend logic before the user interface is developed.

## Validation
Explain all the validations you did in your project for API


In my project, I used Postman to perform backend API testing and validated several things to ensure the APIs were working correctly.

Firstly, I verified the response status codes like 200 for success, 201 for creation, 400 for bad requests, 401 for unauthorized access, 404 for not found, and 500 for server errors. This helped in confirming whether the API was behaving as expected in different scenarios

Let’s say I was testing a login API — if I entered correct credentials, I expected a 200 status code. If I entered wrong credentials, then a 401 code should be returned. This helped me ensure that the API was responding correctly based on different situations."


Secondly, I validated the response body, after sending the API request,  I validate that expected fields or data were coming back correctly in the response, for that I have used postman snippets something call json value check for need to how to fetch the json xpath For example, I checked if certain keys existed in the JSON response and confirmed that their values were accurate as per the requirements. This helped me ensure that the backend was functioning properly and returning the right data.

Then I validated the response time to make sure the API was working fast enough. For example, if the system expects a reply within 2 seconds, I verified how long the API actually took using postman snippets tools. If it was slow or took longer than expected, I reported it to the development team along with the timing details and logs. This helped them identify where the delay was and improve the performance.

While testing the API, I also checked the Content-Type in the response header. This tells us what format the data is coming in. Most of the time, it should be application/json, especially if the response contains structured data like product details or user info.

If the Content-Type is wrong, the application might not understand the data, and it could cause errors. So, I make sure the format is correct. For example, if I’m expecting product data in JSON format, I check that the Content-Type is set to application/json. If it shows something else, I report it to the development team.


| Validation Type   | What I Checked                                 | Example                                            |
| ----------------- | ---------------------------------------------- | -------------------------------------------------- |
| **Status Code**   | Correct response code for each scenario        | 200 (Success), 401 (Unauthorized), 404 (Not Found) |
| **Response Body** | Data accuracy, key presence, value correctness | Checked `userId`, `token` fields                   |
| **Response Time** | Performance and speed of API                   | Verified if response came under 2 seconds          |
| **Headers**       | Correct data format (Content-Type)             | Ensured `application/json` for JSON data           |

What is Request chaining

In my experience, request chaining in Postman or API testing means using the response of one API request as an input for another request.
This approach is especially useful when APIs are dependent on each other and need to be executed in sequence.

For example, in one of my projects, I made a POST request to create a new user, and the response returned a userId. I then used that userId in the next GET request to fetch the details of that same user.
To achieve this, I stored the userId using the Postman script command:

Then, in the next request, I simply used {{userId}} as a variable.
This process helped me test complete workflows step-by-step, similar to how a real user interacts with the system — ensuring data consistency and flow between related APIs.

What is status code

A status code in API testing represents the result of the client’s request to the server. It’s part of the HTTP response and helps testers understand whether the request was successfully processed or if there was an error. These codes are divided into different categories based on their first digit — for example, 2xx indicates success, 4xx indicates client-side errors, and 5xx indicates server-side errors.

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

What is endpoint, Explain it?

An endpoint is the specific URL path on a server where an API request is sent to perform an action or access data.

During my experience with Postman, I understood that an endpoint is the specific path or address in an API where a request is sent to interact with a particular web resource. For example, in REST APIs, the base URL points to the main API service, such as https://api.example.com, and the endpoint is appended to it—like /users, /products, or /orders—to access specific data or functionalities. Each endpoint is linked with an HTTP method such as GET, POST, PUT, or DELETE, depending on the operation being performed. In simple terms, endpoints help testers communicate with the exact feature or resource of the API that needs to be tested or validated.

| **Term**         | **Description**                                                                            | **Example**                      | **Purpose**                                                          |
| ---------------- | ------------------------------------------------------------------------------------------ | -------------------------------- | -------------------------------------------------------------------- |
| **Base URL**     | The main domain or root address of the API server.                                         | `https://api.example.com`        | Identifies the main location of the API service.                     |
| **Endpoint**     | A specific path appended to the base URL to access a particular resource or functionality. | `/users`, `/products`, `/orders` | Defines which resource or feature the client wants to interact with. |
| **Full API URL** | Combination of base URL and endpoint.                                                      | `https://api.example.com/users`  | Used to send the actual request to the server.                       |
| **HTTP Method**  | Defines the type of operation to perform on the resource.                                  | GET, POST, PUT, DELETE           | Specifies the action — fetch, create, update, or delete.             |


Charles proxy

What Charles proxy
Charles Proxy is a network debugging tool used to monitor and analyze API calls between a client (like a mobile app) and the server. I use it to capture requests and responses, check headers, verify parameters, debug failed APIs, and sometimes modify responses using Map Local or Rewrite features.

What are features of Charles proxy

In my testing experience, I’ve used Charles Proxy mainly for capturing and analyzing network traffic between the mobile app and the server. It helps me monitor all HTTP and HTTPS requests and responses, showing complete details like URLs, headers, parameters, and response data. By installing its SSL certificate, I can also decrypt secure HTTPS traffic, which allows me to check encrypted API calls and verify if the data sent and received is correct.

Charles provides a Request and Response Viewer, where I can view data in different formats like JSON or XML—this is really helpful for debugging payloads and verifying API responses. I’ve also used features like Map Local to redirect a request to a local file, especially when the backend wasn’t ready, and Map Remote to switch environments easily, for example, testing staging instead of production.

The Rewrite Tool is another useful feature that lets me modify requests or responses on the fly, which is great for testing different error codes or conditions. Using Throttling, I can simulate slow network connections such as 2G or 3G, to check how the app performs in poor network conditions. The Breakpoint feature helps pause and edit requests before they reach the server, which is useful for negative or boundary testing.

Additionally, Charles allows recording and exporting sessions, so I can share logs with developers while reporting bugs. And I often use the Repeat and Edit Request option to retest a particular API without running the full test flow again. Overall, Charles Proxy is a powerful tool for debugging, analyzing, and validating app-to-server communication in real-time.


What is Map Local in charles
In Charles Proxy, the Map Local feature allows you to redirect a network request to a local file stored on your computer instead of sending it to the actual server.

For example, if an API or backend service isn’t ready yet, you can create a mock JSON response file on your system and map it to that particular request URL. When the app or browser sends that request, Charles will return your local file’s data as the response instead of hitting the real server.

In simple terms, Map Local is used to test with mock data or to check how the application behaves with specific responses without depending on the live backend. This is especially helpful during early testing or when the backend is under maintenance.

What is SSL
SSL (Secure Sockets Layer) is a security protocol that helps establish a secure and encrypted connection between a web browser (or app) and a server. It ensures that all the data transferred — like login details, payment information, or personal data — remains private and cannot be read or modified by hackers.

In simple terms, SSL keeps your communication safe over the internet. You can easily identify a secure connection by looking for “https://” in the website URL — the “s” stands for secure.

In tools like Charles Proxy, SSL is used for HTTPS decryption (called SSL Proxying). By installing the Charles SSL certificate, we can view and debug encrypted HTTPS traffic safely to analyze requests and responses during testing.


Difference between uri and url?
both are used to identify resources on the internet, but there’s a small difference between them. A URI, or Uniform Resource Identifier, is a broader concept — it’s used just to identify a resource, either by name, location, or both. A URL, or Uniform Resource Locator, is actually a type of URI that not only identifies the resource but also gives the address to access it, including the protocol like HTTP or HTTPS. In simple words, every URL is a URI, but not every URI is a URL.

Explain me whole url and why we need domain name?
a URL, which stands for Uniform Resource Locator, is basically the complete web address that we type in the browser to reach a specific webpage. It tells the browser where to find a resource on the internet and how to access it. A typical URL has different parts — like the protocol (for example, https://), which defines how data will be transferred; the domain name (like www.google.com), which tells the browser which website to connect to; and sometimes a path or query parameters that point to a specific page or data within that site.

Now, about the domain name — we need it because it’s a user-friendly way to access websites. Computers use IP addresses (like 142.250.183.78) to identify servers, but those numbers are hard for humans to remember. So, the domain name acts like a nickname or readable label for an IP address. For example, instead of remembering Google’s IP, we just type google.com, and the DNS (Domain Name System) converts that domain name into the actual IP address of the server. This makes it much easier for people to browse and access websites.

What are the things present in swagger document
Swagger UI, is basically a detailed and interactive representation of an API. It gives complete information about the API like its title, version, and base URL. It lists all the available endpoints such as /login or /users, along with the supported HTTP methods like GET, POST, PUT, and DELETE. It also shows request parameters, request body structure (usually in JSON), and the type of responses with status codes like 200 or 400. Swagger also includes authentication details, like where to pass tokens or API keys, and even provides example requests and responses. Overall, it helps testers and developers understand and test APIs easily without needing backend access.

Difference between SOAP and Rest.
SOAP and REST are two different ways of designing web services. SOAP (Simple Object Access Protocol) is more rigid and follows a strict XML-based format for sending and receiving data. It has built-in security and standards but is heavier and slower. On the other hand, REST (Representational State Transfer) is lightweight, faster, and more flexible — it supports multiple data formats like JSON, XML, or plain text. REST works through standard HTTP methods like GET, POST, PUT, and DELETE, making it easier to use and more common in modern APIs. In short, SOAP is protocol-based and formal, while REST is architecture-based and simple.

What is the use of performing API Testing?

API testing helps to verify whether the backend logic of an application is working correctly without involving the user interface. It ensures that different software systems communicate properly through requests and responses. By testing APIs, we can check if the data is sent and received correctly, validate response time, security, and error handling. It also helps us find issues early in development since APIs are tested before the UI is built. Overall, API testing improves reliability, performance, and stability of the application.


What is the difference between PUT and PATCH
Both PUT and PATHCH are used to update resources in an API, but the main difference is in how they update data. PUT replaces the entire resource with the new data you send, meaning all fields must be provided. If any field is missing, it might get overwritten or removed. On the other hand, PATCH is used for partial updates — you only send the specific fields you want to change, and the rest of the data remains unchanged. So, PUT is a complete update, while PATCH is a partial update.

What is the difference between query and form parameter
A query parameter is usually part of the URL and is used to send data in GET requests. It appears after a question mark (?) in the URL, like /users?id=101&status=active, and is mainly used for filtering or searching data.

On the other hand, a form parameter is sent in the body of a POST request, not visible in the URL. It’s commonly used when submitting forms, like login details or registration data, because it can handle sensitive or large data more securely.

What is Authentication and authorization
Authentication is the process of verifying who the user or client is, In simple words, it confirms the identity of the person or system trying to access the API.

In API testing, authentication ensures that only valid users or systems can send requests to the server, When I worked with Postman, I often used different authentication types like Basic Auth, Bearer Token, or API Key depending on the project’s setup.

Authorization, on the other hand, decides what actions an authenticated user is allowed to perform, Once the identity is confirmed, authorization checks whether the user has permission to access certain data or perform specific operations, After login, I might be allowed to view user data (GET request) but not delete it (DELETE request), If I tried to delete without proper permission, I’d get a 403 Forbidden error.


Have you ever faced the 204 issue, what does it mean
Yes, I’ve faced the 204 issue during API testing. A 204 status code means “No Content.” It indicates that the request was successfully processed by the server, but there’s no response body returned.

For example, it often happens with DELETE requests — the resource is deleted successfully, so the server doesn’t need to send any data back. Sometimes it can also appear in PUT or POST requests if the server doesn’t return a confirmation body.

In short, 204 isn’t an error — it’s a successful response without content. But if I was expecting some data (like a success message or response body) and got 204 instead, I’d recheck with the backend team whether that’s the expected behavior or a missing response from the server.

what authentication you used in your project?
In my experience, I’ve mostly worked with OAuth 2.0 and Bearer Tokens, OAuth 2.0 is simpler, more flexible, and widely used in modern web and mobile applications. It uses access tokens (typically bearer tokens) instead of complex signatures to authenticate and authorize requests, As for the Bearer Token, it’s actually a part of OAuth 2.0. Once the user is authenticated successfully, the server issues a bearer token, which is then passed in the request header.

Explain all the crud operation or http methods


In my experience working on a language learning mobile and web application, I actively tested all CRUD operations using REST APIs. Each HTTP method mapped directly to a specific feature or functionality of the application.

POST (Create):
I used POST requests whenever new data needed to be created. For example, when a new user registers on the app, a POST API is triggered to send user details like name, email, selected language, etc., to the backend. I tested this by validating the response code (usually 201 Created) and ensuring the data is correctly stored in the database.

GET (Read):
I used GET requests to retrieve data, such as when a user logs in and their profile details need to be fetched, or when loading available courses and vocabulary lists for a selected language. I ensured the API returned the correct data set, with proper status codes (200 OK) and no performance delays.

PUT (Update full resource):
PUT APIs were used when the user wanted to completely update their profile information, such as changing their name, email, or selected language. Since PUT replaces the entire record, I ensured that all previous data fields were updated correctly in the database, not just the modified ones.

PATCH (Update partial resource):
PATCH was used for partial updates. For example, if the user only wanted to update their email address or progress in one language course, the PATCH API allowed updating just that particular field without affecting other data. I validated that only the intended field changed, and the rest remained unchanged.

DELETE (Remove):
I tested DELETE APIs for features like removing a user’s account or deleting a saved vocabulary list. Once the request was sent, I verified that the data was removed from the database and the response returned with status code 204 No Content or appropriate success confirmation.

What is the difference between 401 and 403.

In my experience during API testing using Postman or while validating mobile app backend behavior, I frequently encountered both 401 and 403 status codes, and I always made sure to distinguish between them clearly during debugging and defect logging.

A 401 Unauthorized error typically means that the request has not been applied because it lacks valid authentication credentials. This usually occurs when the bearer token is missing, expired, or invalid. For example, in our language learning platform, if a user tries to fetch their profile without logging in or with an expired token, the backend returns a 401 status code. I used this response to ensure the app properly prompted the user to log in again.

On the other hand, a 403 Forbidden status means that the server understood the request and the user is authenticated, but they do not have permission to perform that specific action. For example, even if a user is logged in, they shouldn’t be able to access premium features like native speaker sessions unless they are a paid subscriber. In this case, I tested by logging in as a free user and intentionally accessing restricted APIs—if the API returned a 403, it confirmed that authorization was correctly implemented.

1 Difference between put, patch and post.
In my project, while working on API testing , I frequently dealt with POST, PUT, and PATCH methods for different operations, and I learned how each one is used based on the business requirement.

POST (Create):
I used POST requests whenever new data needed to be created. For example, when a new user registers on the app, a POST API is triggered to send user details like name, email, selected language, etc., to the backend. I tested this by validating the response code (usually 201 Created) and ensuring the data is correctly stored in the database.

PUT (Update full resource):
PUT APIs were used when the user wanted to completely update their profile information, such as changing their name, email, or selected language. Since PUT replaces the entire record, I ensured that all previous data fields were updated correctly in the database, not just the modified ones.

PATCH (Update partial resource):
PATCH was used for partial updates. For example, if the user only wanted to update their email address or progress in one language course, the PATCH API allowed updating just that particular field without affecting other data. I validated that only the intended field changed, and the rest remained unchanged.


What is difference between authentication and authorization

Authentication is about verifying who the user is. For example, when a user logs into the language learning app using their email and password, the backend checks whether the credentials are valid. I tested this process thoroughly by validating login API responses

Authorization, on the other hand, determines what the authenticated user is allowed to do. After login, if the user is a paid subscriber, they should have access to premium features like native speaker interaction, quizzes, or certification. I tested authorization by checking if users without valid roles or permissions were restricted from accessing these protected resources. This included verifying correct HTTP status codes like 403 Forbidden and checking role-based access through the APIs.

If the defect is in backend how will you log it 

In my experience as a mobile app tester, if I encounter a defect that seems to originate from the backend, my first step is to reproduce the issue and carefully observe the API request and response using Charles Proxy. Charles acts as a network debugging tool.

If the request from the app is correct but the response contains an error like a 500 Internal Server Error or incorrect data, I capture the full request-response details using Charles and take a screenshot or export the session.

I then log the defect in the bug tracking tool (like JIRA), clearly mentioning the endpoint, request type (GET/POST), request payload, response status code, and the issue observed. Including the Charles logs as attachments helps the backend team quickly identify and resolve the problem. This approach ensures clear communication and faster debugging from both testing and development sides.

How would you expose SOAP API 

SOAP APIs are exposed using a WSDL file, which stands for Web Services Description Language. The backend team usually shares the WSDL URL.. This WSDL defines the structure of the request and response, including all the CRUD operations supported by the service. One limitation of SOAP is that it strictly accepts and returns only XML format. In my experience, SOAP is not widely used nowadays as most systems have shifted to REST APIs due to their simplicity and support for JSON and some others language too.

How would you expose REST API

REST APIs are exposed using URIs, which are made up of a base URL and specific endpoints. The base URL is the address of the API, like https://api.example.com/, and the endpoints are added to this base URL to access different resources, In my experience while testing the Busuu language learning app, REST APIs were exposed using URIs,For example, the base URL could be something like https://api.busuu.com/, and different endpoints were added to access specific resources. For instance, to fetch user profile data, an endpoint like https://api.busuu.com/users/{userId} was used. Similarly, for login, the API endpoint might be https://api.busuu.com/auth/login.
Each of these endpoints supported standard HTTP methods — GET to retrieve user data or lessons, POST to submit login credentials or save progress, PUT to update user settings, and DELETE to remove unwanted saved items or history.

What is protocol.

In my experience, a protocol acts as a common language between different systems or applications. It is a defined set of rules and regulations that ensures accurate communication over a network. For example, while testing APIs in mobile applications, I worked with HTTP , which define how requests and responses should be formatted and transmitted. These protocols ensure that both client and server understand each other, even if they’re built on different technologies. Without protocols, smooth data exchange between systems wouldn't be possible. So, for me as a tester, understanding protocols helps in debugging issues and verifying whether data flow is happening correctly between client and server. 

For one API how many test cases you have written 
The number of test cases we can write for an API depends on various factors, such as the complexity of the API, the different input parameters, possible error conditions, and the expected outputs. Here's a rough breakdown of test cases you might consider for a single API:

For a GET or DELETE request, I generally write around 1 to 2 test cases. These would typically cover the positive scenario (successful request with valid data) and a negative scenario (invalid input or unauthorized access).

 
For POST, PUT, and PATCH requests, I usually write about 7 to 8 test cases. These include positive cases (valid data submission), various negative cases (missing or incorrect data, invalid formats, unauthorized access), and edge cases (like testing with boundary values, null values, and large payloads). Additionally, I include security and performance-related tests for these methods."


What is state full and state less

Stateful means the server keeps track of the client's previous activities — like login session details, shopping cart items, etc.
after a user logs into an application, the server stores the session information. This way, the user doesn’t have to log in again for every action. 

Stateless means the server treats each request as a completely new one without any memory of past interactions — the client must send all necessary information every time.
In my experience with APIs and mobile application testing, REST APIs are mostly stateless , which are designed to be stateless. because each API call should be independent, which improves scalability and performance.


What is WSDL.

WSDL stands for Web Services Description Language, It is basically an XML document that describes the details about a web service — like what operations it provides, what request it expects, and what response it gives back, As per my knowledge, while working with APIs, especially in SOAP API testing, WSDL files were used to understand the complete structure of the service before starting the testing.

