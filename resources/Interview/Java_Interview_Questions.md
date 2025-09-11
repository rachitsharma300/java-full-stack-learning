<h1>100 Important Java Interview Questions in 2025</h1>

## 1. Explain the main idea behind _Java_ and the concept of _Write Once, Run Anywhere_.

**Java** is a high-level, object-oriented programming language designed to be **platform-independent**. Its core philosophy is encapsulated in the concept of "**Write Once, Run Anywhere**" (WORA), which revolutionized software development by enabling cross-platform compatibility.

### Write Once, Run Anywhere (WORA)

WORA is a principle that allows Java code to be written once and run on any device or operating system without modification. This is achieved through several key components:

#### 1. Java Virtual Machine (JVM)

The **JVM** acts as an abstraction layer between Java code and the underlying hardware or operating system. It interprets and executes Java bytecode, ensuring consistent behavior across different platforms.

#### 2. Bytecode

Java source code is compiled into platform-independent **bytecode**, which can be executed by any JVM, regardless of the underlying system architecture.

#### 3. Standard Library

Java provides a comprehensive **standard library** that offers cross-platform capabilities for common tasks like file handling and networking.

### How Java Achieves WORA

1. **Platform Independence**: Java bytecode can run on any device with a compatible JVM, from smartphones to supercomputers.

2. **JVM Customization**: Each operating system has a tailored JVM version, ensuring WORA functionality across diverse environments.

3. **Garbage Collection**: Automatic memory management reduces the risk of memory leaks and simplifies development across platforms.

4. **Security**: Java's design excludes direct memory manipulation through pointers, enhancing security across different systems.

### Code Example: "Hello, World!" in Java

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

This simple program demonstrates Java's WORA principle. It can be compiled and run on any system with a JVM, producing the same output:

1. Compile: `javac HelloWorld.java`
2. Run: `java HelloWorld`
3. Output: `Hello, World!`

The same bytecode can be executed on Windows, Linux, macOS, or any other platform with a compatible JVM, showcasing the practical implementation of "Write Once, Run Anywhere" in Java.
<br>

## 2. What are the _main features_ of _Java_?

Java's robustness makes it stand out with its powerful features.

### Core Features of Java

1. **Platform Independence**: Write once, run anywhere (WORA) through Java Virtual Machine (JVM).

2. **Object-Oriented**: Emphasizes objects and classes, promoting `encapsulation`, `inheritance`, and `polymorphism`.

3. **Strong Typing**: Variables are strongly typed, reducing ambiguity and potential for errors.

4. **Security**: Offers a secure platform with features such as a `bytecode verifier` and a `security manager`.

5. **Automatic Memory Management**: Centralized memory allocation and automatic `garbage collection`, reducing the risk of memory leaks.

6. **Concurrency**: Supports `multi-threading`, enabling concurrent execution and efficient multitasking.

7. **Architecture-Neutral**: Promotes scalability across different hardware and software configurations.

8. **Dynamic**: Supports dynamic loading of classes and dynamic compilation.

9. **Simplicity**: Easy-to-learn syntax and standard libraries simplify software development.

10. **Portability**: Java's "compile once, run anywhere" philosophy enables it to function across diverse platforms.

11. **High Performance**: Utilizes `Just-In-Time (JIT)` compilation, combining the flexibility of bytecode with the performance of machine code.

### Additional Java Features

#### Exception Handling
Java provides a robust system to capture and handle runtime errors:

```java
try {
    // Code that may throw an exception
    int result = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Cannot divide by zero");
}
```
#### Rich Standard Library
Java offers a comprehensive set of APIs for common tasks:

```java
import java.util.ArrayList;
import java.util.List;

List<String> list = new ArrayList<>();
list.add("Java");
list.add("is");
list.add("powerful");
```

#### Networking Capabilities
Java simplifies network programming:

```java
import java.net.URL;
import java.net.HttpURLConnection;

URL url = new URL("https://api.example.com/data");
HttpURLConnection conn = (HttpURLConnection) url.openConnection();
conn.setRequestMethod("GET");
// ... handle the connection
```

#### Integration with Other Languages
Java leverages the Java Native Interface (JNI) to support native code:

```java
public class NativeMethodExample {
    native void nativeMethod();

    static {
        System.loadLibrary("native");
    }

    public static void main(String[] args) {
        new NativeMethodExample().nativeMethod();
    }
}
```

#### Advanced Concurrency Utilities
Java provides high-level concurrency APIs:

```java
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

ExecutorService executor = Executors.newFixedThreadPool(5);
executor.submit(() -> {
    System.out.println("Task executed by " + Thread.currentThread().getName());
});
```

<br>

## 3. Can you list some _non-object-oriented_ features of _Java_?

While Java is primarily an **object-oriented** language, it also incorporates several non-object-oriented features, allowing for multi-paradigm development:

### Primitive Data Types

Java supports **primitive data types** such as `int`, `boolean`, `char`, etc., which are not objects and provide simple value storage.

```java
int number = 42;
boolean isTrue = true;
char letter = 'A';
```

### Static Methods and Variables

**Static members** belong to the class rather than instances, allowing for utility functions and shared data.

```java
public class MathUtils {
    public static final double PI = 3.14159;
    
    public static int add(int a, int b) {
        return a + b;
    }
}
```

### Package-Level Access

Java's **default (package-private) access modifier** limits visibility to within the same package, providing a non-OO way to control access.

```java
package com.example;

class PackagePrivateClass {
    void packagePrivateMethod() {
        // Accessible only within the same package
    }
}
```

### Utility Classes

Java allows the creation of **utility classes** with only static methods, which don't require instantiation.

```java
public final class StringUtils {
    private StringUtils() {} // Prevent instantiation
    
    public static boolean isEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }
}
```
