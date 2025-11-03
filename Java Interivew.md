
Difference between inheritance and abstractions
What is interface and why should v use interface
 
How u achieved Runtime polymorphism

How can we achieve multiple inheritance using interface? its types?
Why did you use abstraction itself... Couldn't you use something else?
Inheritance and one simple program.

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
Difference between array and Arraylist.
Difference between list and linkedList
Difference between hash set and set 
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

difference between method overloading and overriding
difference between final, finally, finalize
Difference between string, string buffer and string builder and string is immutable and others are not



explain singleton design pattern

What is the use of the SingleTon class? How to design a SingleTon class?
have u used singleton class in your project?
What is singleton class Purpose of using static key



 
What is Recursive statement


What we limit in rate limiter.

What is static keyword? What Is the advantage and main disadvantage of it?



what will happen if you write return 5; in try block
how to stop the execution without executing finally block

Method overloading program example
What are Matchers?
Lambda expression? Explain your project and modules.


Do you know about functional Interface in java?
Interface access modifier
collection and collections

Exception handling

What is checked and unchecked exceptions
When or how can u handle checked exceptions 
Is it possible to handle checked exceptions using try catch block
Diff throw throws Throweable
Write code for try catch finally block and explain



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

In Java, both this and super are keywords used to refer to objects, but they serve different purposes. The this keyword refers to the current class object, meaning it is used when we want to access variables, methods, or constructors that belong to the same class. It helps to differentiate between instance variables and local variables that have the same name, and it can also be used to call one constructor from another within the same class.

On the other hand, the super keyword refers to the parent (or superclass) object, and it is mainly used to access variables, methods, or constructors from the parent class. For example, if a subclass has a method or variable with the same name as the parent class, the super keyword helps to call the parent class version. In simple terms, this is used for the current class, while super is used for the parent class. Both keywords help maintain clear communication between child and parent classes, especially when inheritance is involved.

14 What is the difference between the == and equals method?

In Java, the == operator and the equals() method are both used to compare values, but they work differently. The == operator is used to compare references or memory addresses, meaning it checks whether two objects point to the same location in memory. It is mostly used for comparing primitive data types like int, char, or boolean, or to check if two object references are the same. On the other hand, the equals() method is used to compare the actual content or values of two objects. For example, when comparing two strings using ==, it checks whether both string objects are stored at the same memory location, while equals() checks if the text inside both strings is the same. In short, == compares object references, whereas equals() compares object values.


15 What is time Complexity

In simple terms, time complexity means how much time an algorithm takes to run as the input size increases. It helps us understand how efficiently a program or logic performs when the amount of data grows.

For example, if you have a program that checks each element in a list one by one, the time it takes will increase directly with the size of the list — this is called O(n) or linear time complexity. Similarly, if your algorithm uses nested loops, it might take much longer, which could be O(n²).

16 Why main method is static?

The main method is static in Java because it allows the Java Virtual Machine (JVM) to call it without creating an object of the class. When a Java program starts, there are no objects created yet, so the JVM needs a way to begin execution directly. By declaring the main method as static, the JVM can load the class into memory and run the main() method without depending on any object.

In simple words, static means “belongs to the class, not to any object.” Since program execution starts from main(), it must be accessible at the class level. If it were not static, the JVM would first have to create an object before calling it, which isn’t possible because the main method itself is the entry point that tells the JVM what to run first.

17 What is abstraction and where you have implemented in your automation framework ?

Abstraction in Java means showing only the essential features of an object while hiding the internal implementation details. It focuses on what an programe does rather than how it does it. For example, when we drive a car, we just use the steering and pedals without knowing how the engine works — that’s abstraction. In Java, we achieve abstraction mainly using abstract classes and interfaces. Abstract classes can have both abstract and non-abstract methods, while interfaces provide a complete abstraction by only declaring methods that the implementing classes must define. It helps make the code cleaner, easier to maintain, and reduces complexity.

In our framework, there is a WebDriverUtility class where we have implemented abstraction. This class hides the complex implementation of common Selenium operations like scrolling, handling alerts, switching windows or frames, and waiting for elements. So, instead of writing the same Selenium code again and again, we just call simple methods like waitForElementLoad(driver, element, 10) or switchToWindow(driver, partialUrl) in our test scripts. This allows us to focus only on what action needs to be performed, not how it’s done internally. That’s how abstraction is implemented in our framework — by exposing only the essential methods and hiding the detailed logic.

18 What is polymorphism and where you have implemented in your automation framework?

Polymorphism in Java means performing one action in many different ways. In simple terms, it allows the same method name to behave differently based on the object or parameters used. It helps make the code flexible and reusable. There are two types of polymorphism — compile-time polymorphism (method overloading) and runtime polymorphism (method overriding). For example, when we have multiple switchToFrame() methods with different parameters in our framework, that’s compile-time polymorphism. And when a subclass overrides a method from its parent class, that’s runtime polymorphism

In our framework, we have implemented polymorphism mainly through method overloading and method overriding. For example, in our WebDriverUtility class, we use method overloading in functions like switchToFrame() — where we have the same method name but different parameter types, such as switchToFrame(driver, int index), switchToFrame(driver, String nameOrId), and switchToFrame(driver, WebElement element). This is compile-time polymorphism, as the method to be called is decided at compile time based on the arguments.

We also use runtime polymorphism in our framework — for example, in the Page Object Model, where we create a reference of the parent class (like BasePage) and assign it to child classes (like LoginPage or HomePage). This allows us to reuse code and achieve flexibility, where the actual method executed depends on the object created at runtime. So overall, polymorphism in our framework helps make our code more reusable, clean, and easy to maintain.


19 What is Encapsulation where you have implemented in your automation framework?


Encapsulation in Java means wrapping data (variables) and code (methods) together into a single unit, like a class. It also helps in protecting the data by making variables private and allowing access to them only through public getter and setter methods. This ensures that the internal details of a class are hidden and can’t be directly changed from outside. In short, encapsulation provides data security and better control over how data is accessed or modified

In our framework, we have implemented encapsulation through the Page Object Model. In each page class, we store the web elements as private variables and provide public methods to access or perform actions on them. For example, on the LoginPage, elements like username, password, and login button are declared as private, so they can’t be accessed directly from outside the class. Instead, we use public methods like enterUsername(), enterPassword(), and clickLogin() to interact with those elements. This hides the element details from the test scripts and exposes only the required actions, which is exactly what encapsulation means — wrapping data and behavior together and controlling access to it


20 Why we cant achieve multiple inheritance using class

In Java, we can’t achieve multiple inheritance using classes because it can create ambiguity and confusion for the compiler. For example, if two parent classes have the same method and a child class inherits from both, the compiler won’t know which parent’s method to execute — this is called the diamond problem. To avoid this ambiguity and maintain simplicity, Java doesn’t allow multiple inheritance through classes. However, we can achieve multiple inheritance using interfaces, because interfaces only contain method declarations, and the implementing class provides its own definition, so there’s no conflict in implementation.

21 Why multiple inheritance is supported through interface

Multiple inheritance is supported through interfaces in Java because interfaces only contain method declarations, not method implementations. So even if two interfaces have the same method name, there’s no ambiguity — the implementing class provides its own implementation for that method. This avoids the diamond problem that occurs with multiple inheritance in classes. In short, since interfaces don’t carry actual method code, Java allows a class to implement multiple interfaces safely without any conflict

22 What is multiple inheritance?

Multiple inheritance means a class can inherit features or properties from more than one parent class. In simple terms, it allows a child class to have more than one direct parent. For example, if Class C inherits from both Class A and Class B, that’s multiple inheritance. However, Java doesn’t support multiple inheritance using classes to avoid ambiguity (like the diamond problem), but it does support it through interfaces, since interfaces only have method declarations and not actual implementations.

23 What is the use of interface to achieve 100 percent abstraction?

In Java, we use an interface to achieve 100% abstraction because an interface only contains method declarations and constants — it doesn’t have any method implementation. That means it completely hides how things are done and only defines what needs to be done. The classes that implement the interface provide the actual logic or behavior for those methods. This helps in achieving full abstraction, as the user or other parts of the program only know the method names, not their internal working. It also helps in maintaining loose coupling and supports multiple inheritance.

24 Difference between throw and throws keyword

The throw keyword in Java is used to actually throw an exception from a method or block of code. We use it to create and throw a specific exception object, like throw new ArithmeticException("Divide by zero");. On the other hand, the throws keyword is used in a method declaration to declare that the method might throw certain exceptions. It informs the caller that they need to handle those exceptions. For example, public void readFile() throws IOException { ... }. In short, throw is used to throw an exception, and throws is used to declare possible exceptions

25 What is recursion

Recursion in Java is a process where a method calls itself to solve a problem. It continues to call itself until a specific condition, known as the base condition, is met. Recursion is mainly used to solve problems that can be divided into smaller, similar subproblems — like calculating factorials, Fibonacci series, or traversing data structures. It helps make code shorter and more readable, but it must have a proper base condition to avoid infinite calls and stack overflow errors

26 Difference b/w static and non static.

In Java, static members belong to the class, while non-static members belong to objects. A static variable or method can be accessed without creating an object — we can call it directly using the class name. Non-static members, on the other hand, require an object to access them because they are instance-specific. For example, if we declare a static method like display(), we can call it using ClassName.display(), but for a non-static method, we need to create an object first. In short, static is used for common data or behavior shared by all objects, while non-static represents unique behavior for each object.

27 Can we override static method

No, we cannot override a static method in Java, Static methods belong to the class, not to any specific object. Method overriding happens only when one object’s method replaces another’s (i.e., between parent and child objects). Since static methods are class-level and not object-level, they can’t take part in runtime polymorphism.

However, if you declare a static method with the same name and parameters in a child class, it doesn’t override — it simply hides the parent’s static method. This is called method hiding, not overriding.

28 Difference between compile time polymorphism and runtime polymorphism?

Compile-time polymorphism happens when the decision of which method to call is made at compile time, and it’s achieved through method overloading, where multiple methods have the same name but different parameters. On the other hand, runtime polymorphism happens when the decision is made during program execution, and it’s achieved through method overriding, where a child class provides its own implementation of a method that already exists in the parent class. For example, if a parent and child class both have the same method, and we call it using a parent reference holding a child object, the child’s method gets executed — that’s runtime polymorphism. So basically, overloading happens at compile time and overriding happens at runtime.”

29 What do you mean by static and dynamic binding ?

In Java, binding means connecting a method call to its actual method body. When this connection happens at compile time, it’s called static binding — for example, in method overloading or when we call a static or final method. The compiler already knows which method to run.

But when the method call is resolved at runtime, it’s called dynamic binding. This usually happens with method overriding, where the method that gets executed depends on the actual object the reference is pointing to at runtime, not on the reference type. So basically, static binding happens during compile time, and dynamic binding happens during runtime. 

30 What is method hiding 
 
Method hiding happens when a static method in a subclass has the same name and signature as a static method in its superclass. It looks similar to method overriding, but it’s actually different because static methods belong to the class level, not the object. So, which method gets called is decided at compile time, based on the reference type — not at runtime.

For example, if both parent and child classes have a static method with the same name, and you call that method using a parent class reference, the parent class method will execute, even if the object is of the child class. This is known as method hiding.

31 What is collection in java?

In Java, the Collection is a framework used store and manage multiple data efficiently. Unlike arrays, collections are dynamic in nature — meaning their size can grow or shrink at runtime. The framework provides various interfaces like List, Set, and Map, and their implementing classes such as ArrayList, HashSet, and HashMap to handle data in different ways.

It also offers many built-in methods to add, remove, search, sort, and iterate over elements, which makes handling large or complex data much easier and more efficient in real-time applications

32 What is collections?

“In Java, Collections is a utility class that is part of the java.util package. It provides static methods to perform operations on collection objects — like sorting, searching, reversing, or finding minimum and maximum elements.

For example, we can use methods like Collections.sort(list) to sort a list, or Collections.reverse(list) to reverse the order of elements.

So basically, the Collection Framework is the overall structure that defines how to store and manage objects, while the Collections class provides helpful utility methods to operate on those collections

33 Does Java supports Multiple inheritance?

No java doesn't supports multiple inheritance through class because, it can create ambiguity and confusion for the compiler. For example, if two parent classes have the same method and a child class inherits from both, the compiler won’t know which parent’s method to execute — this is called the diamond problem. To avoid this ambiguity and maintain simplicity, Java doesn’t allow multiple inheritance through classes. However, we can achieve multiple inheritance using interfaces, because interfaces only contain method declarations, and the implementing class provides its own definition, so there’s no conflict in implementation.

34 What is static class

In Java, a static class means a nested class that is declared with the keyword static. It cannot exist on its own — it always belongs to the outer class.

A static class can access only static members of the outer class directly. It doesn’t need an object of the outer class to be created.

We generally use static classes when we want to group related helper methods or data together and don’t need to access non-static members of the outer class, In short, a static class helps make the code more organized and memory-efficient, especially for utility or helper purposes.


35 What is Object overloading and overriding

In Java, there’s actually no concept called object overloading. The correct term is method overloading. It means having multiple methods with the same name but different parameter lists in the same class. This is decided at compile time. Some people casually say “object overloading,” but technically it’s incorrect — Java supports method overloading, not object overloading.

In Java, there’s actually no concept called object overriding. The correct term is method overriding. It happens when a subclass provides its own implementation of a method that is already defined in its parent class. This is decided at runtime using dynamic binding. Some people may casually say “object overriding,” but technically it’s incorrect — Java supports method overriding, not object overriding.

36 Explain Exception handling

Exception handling in Java is a mechanism that helps us handle unexpected situations or runtime errors in a controlled way without crashing the program. In simple terms, it allows us to detect and manage errors smoothly. We use try, catch, finally, throw, and throws keywords for this purpose. For example, if there’s a chance that a piece of code might cause an exception — like dividing by zero or accessing a null object — we place that code inside a try block, and the handling logic inside a catch block. The finally block is used to execute important code like closing a file or a database connection, no matter what happens. Exception handling makes the program more stable and user-friendly by catching the errors and giving proper messages or alternate actions instead of breaking the flow of execution.

37 Can a try block have multiple catch blocks?

Yes, a try block can have multiple catch blocks in Java. This is useful when different types of exceptions might occur in the same block of code, and you want to handle each one differently, For example, you might get an ArithmeticException for dividing by zero or a NullPointerException for accessing a null object. In that case, you can write separate catch blocks for each exception type, When an exception occurs, Java checks each catch block from top to bottom and executes the first one that matches the type of exception. This helps make the error handling more specific and organized.

38 What is Constructor overloading

Constructor overloading in Java means having multiple constructors in the same class with different parameter lists (different number or type of arguments).

It allows us to create objects in different ways based on the data available. For example, one constructor might take no arguments (default), while another might take parameters to initialize class variables directly basically we can choose which constructor to use depending on the situation. It’s also an example of compile-time polymorphism, because the constructor is selected at compile time based on the arguments passed.

39 Static and non static blocks 

In Java, static and non-static blocks are used to initialize data, but they work a bit differently, A static block runs only once when the class is loaded into memory. It’s mostly used to initialize static variables or perform setup tasks that should happen only once for the entire class, on the other hand A non-static block (also called an instance block) runs every time an object is created — just before the constructor is called. It’s used to initialize instance variables or perform setup specific to each object.

40 Can you able to create object for private constructor

We cannot create an object directly from outside the class if the constructor is private., But we can create an object within the same class, which is useful in Singleton design patterns or factory methods where we want to control how the object is created.

41 Why Object class is super class in java

In Java, the Object class is considered the superclass of all classes because every class in Java automatically inherits from it, either directly or indirectly. This means all classes get some common and useful methods like toString(), equals(), hashCode(), and getClass() without needing to write them again. The main idea behind making Object the root class is to provide a common structure and behavior to every Java class, so they can be handled in a consistent way. For example, you can store different types of objects in a single collection or compare them easily. In short, Object class acts as a base foundation for all other classes in Java.

42 Difference between public and protected?

In Java, the public access modifier allows complete access to the class members from anywhere — whether it’s the same class, same package, different package, or even from outside the package. So there are no restrictions with public.

On the other hand, protected gives access within the same class, within the same package, and also in subclasses, even if those subclasses are in a different package. However, it does not allow access from outside the package unless there is inheritance involved. So protected is slightly more restrictive than public but more open than default access

43 What are access specifier, modifier, and return type

In Java, whenever we define a method or variable, there are three main things involved: the access specifier, modifier, and return type. The access specifier controls the visibility — or in simple words, who can access that method or variable. For example, private means it's only accessible within the same class, default (when we don’t mention anything) allows access within the same package, protected means it can be accessed in the same package and also in child classes even if they're in a different package, and public means it can be accessed from anywhere. Next comes the modifier, which adds special behavior. For example, static means the method belongs to the class and not to any object, final means it cannot be changed or overridden, and abstract means the method has no body and must be implemented in a subclass. Finally, the return type defines what kind of value the method will return. If it returns an integer, we use int; if it returns nothing, we use void; if it returns a string, we use String, and so on. For example, in the method public static int add(int a, int b), public is the access specifier, static is the modifier, and int is the return type. All three together define how the method works and how it can be accessed.

45 

