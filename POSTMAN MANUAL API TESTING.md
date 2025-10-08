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


## 12 Types of parameter

In Postman, there are different types of parameters that play a crucial role in API communication.

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


