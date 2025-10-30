
Difference between inheritance and abstractions
What is interface and why should v use interface
what is inheritance 
what is encapsulation 
What is abstraction? Where do you use it?
explain polymorphism
Why we cant achieve multiple inheritance using class
Why multiple inheritance is supported in interface
Multiple inheritance is supported in java or not
is Java supports Multiple inheritance?
How u achieved Runtime polymorphism
What is multiple inheritance?
What is the use of interface to achieve 100 percent abstraction
Difference between compile time polymorphism and runtime polymorphism?

How can we achieve multiple inheritance using interface? its types?
Why did you use abstraction itself... Couldn't you use something else?
Inheritance and one simple program

Collection
what are the collection uses in selenium
Why list is used in selenium 
Explain collections
difference between collections and Arrays?
Why will go for array list?
difference between array list and linked list?
How you used hash map in your project and create one hash map and how will you insert data in hash map.
Difference between List and linked List and where have you implemented this in your project
Explain list
Explain Set
Explain collections concept in terms of java
Where you used collections in your test scripts
Difference between array and Arraylist 
Difference between list and linkedList
Difference between hash set and set 
Difference between array and array list
What is the difference between HashSet and HashMap?
What is Hashtable, What is the use
Difference between hashmap and hashset 
Difference between hashset and treeset
Difference between list and queue.
Difference between arrylist and vectors
Where you have used hashmap
Diff b/w Hash map and hash table
difference between arraylist and linkedarraylist
Where u have used collections in selenium 




Difference between final, this, super keywords 
Difference between throw and throws keyword
difference between method overloading and overriding
difference between final, finally, finalize
Difference between string, string buffer and string builder and string is immutable and others are not



explain singleton design pattern

What is the use of the SingleTon class? How to design a SingleTon class?
have u used singleton class in your project?
What is singleton class Purpose of using static key


Can we override static method
What is Constructor overloading 
What is Dynamic binding
What is Recursive statement
Difference b/w static and non static
explain static class?
What we limit in rate limiter.
why we got null pointer exception?
What is static keyword? What Is the advantage and main disadvantage of it?

What is Object overloading and over riding
Write code for try catch finally block and explain
what will happen if you write return 5; in try block
how to stop the execution without executing finally block
Static and non static blocks
Method overloading program example
What are Mathers?
Lambda expression? Explain your project and modules.
What is checked and unchecked exceptions
When or how can u handle checked exceptions 
Is it possible to handle checked exceptions using try catch block
What is time Complexity
Do you know about functional Interface in java?
Why main method is static?
Interface access modifier
collection and collections
Exception handling
Can a try block have multiple catch blocks
Diff throw throws Throweable
What is recursionq


1 Explain all the OOPS concepts used in your framework and why we use it.

In my Selenium framework, I have implemented all four OOPs concepts— Encapsulation, Inheritance, Abstraction, and Polymorphism. I used encapsulation by creating page classes (like LoginPage, HomePage) where all WebElements are declared as private and accessed using public methods. This helps keep the element locators and actions safe and reusable. For inheritance, I created a BaseClass that includes common setup methods like browser launch, teardown, and waits. Other test classes extend this BaseClass to reuse those methods, reducing code duplication. I applied abstraction by creating an interface called BrowserActions which includes abstract methods like clickElement(), enterText(), and waitForElement(). These are then implemented in a utility class, so the actual Selenium code stays hidden from the test logic. Lastly, I used polymorphism by method overloading in utility classes—for example, I created multiple click() methods: one that accepts a By locator and another that accepts a WebElement. This way, I can use the same method name for different situations, making my framework more flexible and readable.

2 Difference between abstract class and Interface?
An abstract class is a partially implemented class that can have both implemented (concrete) and unimplemented (abstract) methods. It’s used when we want to provide a common base with shared code, but still force child classes to implement specific behavior It can also have variables, constructors, and static blocks. We use an abstract class when we want to share some common code between related classes. On the other hand, an interface is like a contract that only has method declarations (without body) — though from Java 8 onwards, it can also have default and static methods with body. We use an interface when we want to define a set of rules or behaviors that can be followed by any class, even if they are not related.
 
In Java, a class can extend only one abstract class (because Java doesn’t support multiple inheritance with classes), but it can implement multiple interfaces. So, we choose abstract class when there is an "is-a" relationship (like TestCase is a BaseTest), and we choose interface when we want to achieve full abstraction and allow multiple implementations (like LoginPage implementing Clickable, Verifiable, etc.).

3 What is singleton class

A Singleton class in Java is a class that allows only one object (instance) of itself to be created throughout the program's lifetime. This is achieved by making the constructor private so that no other class can create a new object. Instead, a static method (usually named getInstance()) is provided, which returns the same instance every time it is called. 

Singleton is useful when exactly one object is needed to coordinate actions across the system. It helps in saving memory and maintaining consistency by ensuring that only one instance exists. Common use cases of Singleton include logging, database connections, configuration settings, cache management, and device control where shared access is necessary and creating multiple objects can lead to issues or overhead.

4 What's the use of Constructor? And it's types
A constructor is a special method in Java that is used to create and initialize an object. When we create an object using new, the constructor runs automatically and sets up the object. It usually helps to assign initial values to the variables or perform any setup when the object is created.
Default constructor
If you don’t write any constructor, Java creates one for you automatically. Used when we don’t need to pass anything at the time of object creation.
Yes, I’ve used user-defined constructors in my POM classes.
In POM, we usually pass the WebDriver instance from the test class to the page class using a constructor.
So I created a constructor manually in each page class to receive the driver and use it for locating and interacting with elements.
This helps with code reusability and makes the structure cleaner, instead of creating the driver again and again.

5 Can you make constructor as private

Yes, in Java, we can make a constructor private. This is usually done when we want to restrict object creation from outside the class. A common use case is in the Singleton design pattern, where we want to allow only one instance of a class throughout the application. By making the constructor private, we prevent other classes from using the new keyword to create objects. 

Instead, we usually provide a public static method that returns the single instance. Another use case is when we have utility classes that only contain static methods—like Math or Collections—where we don’t want the class to be instantiated at all. In such cases, making the constructor private ensures that no object of that class can be created, either accidentally or intentionally.

6 what are the collection uses in selenium


In my automation framework, I have used Collections in multiple places to manage and manipulate groups of test data and WebElements efficiently. For example, I have used List<WebElement> to store all elements fetched using findElements() while verifying dropdown options, menu items, or list elements on a page.

I also used Set in scenarios where I needed to ensure uniqueness—like collecting all product names from a search result and checking for duplicates. Additionally,

I’ve used Map to maintain key-value pairs, such as storing configuration values like URLs, usernames, and passwords fetched from a property file. I’ve also applied Collections utility methods like Collections.sort() to sort test data and validate order, and Collections.frequency() to count occurrences of specific elements. These help in writing cleaner, more maintainable, and reusable test scripts.

7 What is the Difference between final and finalize

The main difference between final and finalize() in Java is that final is a keyword, whereas finalize() is a method. The final keyword is used to apply restrictions on variables, methods, or classes. When a variable is declared as final, its value cannot be changed once assigned. If a method is marked as final, it cannot be overridden by subclasses, and a final class cannot be extended. On the other hand, finalize() is a method defined in the Object class and is called by the Garbage Collector before an object is destroyed. It was traditionally used to perform cleanup operations such as closing files or releasing resources, but it is now deprecated in newer versions of Java due to better alternatives like try-with-resources. In short, final is used to prevent modification, while finalize() is used for cleanup just before garbage collection.

8 What's the use of Finally block, and where did you use that in your framework?

The finally block is used in Java to write code that should always run, whether an exception occurs or not. It usually comes after a try-catch block. The main purpose of the finally block is to release resources like closing the browser, file, database connection, etc.
In my framework,

I used the finally block to make sure that the browser closes properly after the test, even if the test fails due to an exception. For example, in my BaseTest class, I wrapped the test execution inside a try-catch-finally, and in the finally block, I wrote driver.quit(); to ensure the browser is closed and no resources are left open.

9 What is StringBuilder and StringBuffer

StringBuilder and StringBuffer are classes in Java are present in the java.lang package. it is used to create mutable strings, meaning you can modify the contents (like append, delete, insert) without creating new objects like in the case of String. The main difference between the two is that StringBuffer is synchronized, which makes it thread-safe (safe to use in multi-threaded environments), whereas StringBuilder is not synchronized, so it is faster and preferred in single-threaded situations. Both maintain the order of characters and belong to the java.lang package. So, if thread safety is not a concern, StringBuilder is recommended for better performance.

10 What is method overriding

Method overriding in Java is a concept where a child class provides its own version of a method that is already defined in its parent class. This allows the subclass to modify or completely change the behavior of that method as per its requirement. The method in the subclass must have the same name, return type, and parameters as the method in the parent class. One of the most common uses of overriding is to implement runtime polymorphism—which means the method call is decided at runtime depending on the object type.

11 What is thread class.
A thread in Java is class It’s present in the package java.lang ,or basically a small unit of a process that allows a program to do multiple tasks at the same time, For example, if one thread is opening a webpage, another thread can take a screenshot or perform validation — both can run in parallel, So, threads help in multitasking and make our programs faster and more efficient.

12 What is multithreading? Where you will use? How to use it Explain?

Multithreading in Java is a concept that allows multiple threads to run at the same time within a single program. Each thread performs a separate task, helping the program execute multiple operations simultaneously, which improves speed and efficiency. For example, in automation testing with Selenium, one thread can open a browser, another can perform login actions, and another can validate data — all running in parallel. This concept is used in real-time scenarios where we need to perform parallel or background tasks, such as executing multiple test cases in parallel using TestNG, downloading files, fetching data from a database, or running animations while the main program continues to work.

We can implement multithreading in Java in two ways: by extending the Thread class or by implementing the Runnable interface. When we extend the Thread class and call the start() method, a new thread is created that executes the run() method in parallel. Alternatively, when we implement the Runnable interface, we pass a Runnable object to the Thread class constructor and then call start(), which also runs the code in parallel. This second approach is preferred when a class already extends another class, as Java supports only single inheritance.

Multithreading improves performance, saves time by running tasks concurrently, and is especially useful in situations like parallel test execution or background operations. Overall, it helps make Java applications faster, more responsive, and capable of handling multiple tasks efficiently.

13 Difference between this and super keyword

In Java, both this and super are keywords used to refer to objects, but they serve different purposes. The this keyword refers to the current class object, meaning it is used when we want to access variables, methods, or constructors that belong to the same class. It helps to differentiate between instance variables and local variables that have the same name, and it can also be used to call one constructor from another within the same class. On the other hand, the super keyword refers to the parent (or superclass) object, and it is mainly used to access variables, methods, or constructors from the parent class. For example, if a subclass has a method or variable with the same name as the parent class, the super keyword helps to call the parent class version. In simple terms, this is used for the current class, while super is used for the parent class. Both keywords help maintain clear communication between child and parent classes, especially when inheritance is involved.

14 What is the difference between the == and equals method?

In Java, the == operator and the equals() method are both used to compare values, but they work differently. The == operator is used to compare references or memory addresses, meaning it checks whether two objects point to the same location in memory. It is mostly used for comparing primitive data types like int, char, or boolean, or to check if two object references are the same. On the other hand, the equals() method is used to compare the actual content or values of two objects. For example, when comparing two strings using ==, it checks whether both string objects are stored at the same memory location, while equals() checks if the text inside both strings is the same. In short, == compares object references, whereas equals() compares object values.


15 What is time Complexity

In simple terms, time complexity means how much time an algorithm takes to run as the input size increases. It helps us understand how efficiently a program or logic performs when the amount of data grows.

For example, if you have a program that checks each element in a list one by one, the time it takes will increase directly with the size of the list — this is called O(n) or linear time complexity. Similarly, if your algorithm uses nested loops, it might take much longer, which could be O(n²).

16 Why main method is static?

The main method is static in Java because it allows the Java Virtual Machine (JVM) to call it without creating an object of the class. When a Java program starts, there are no objects created yet, so the JVM needs a way to begin execution directly. By declaring the main method as static, the JVM can load the class into memory and run the main() method without depending on any object.

In simple words, static means “belongs to the class, not to any object.” Since program execution starts from main(), it must be accessible at the class level. If it were not static, the JVM would first have to create an object before calling it, which isn’t possible because the main method itself is the entry point that tells the JVM what to run first.

17 










