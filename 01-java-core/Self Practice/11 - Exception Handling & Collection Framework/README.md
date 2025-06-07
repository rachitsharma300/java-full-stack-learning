# Exception Handling in Java: Handling ArithmeticException (Divide by Zero)

## 1. What is this question asking?

When you perform division in Java (or any programming language), dividing a number by zero is mathematically undefined. In Java, if you try to divide an integer by zero, it throws a special runtime error called **ArithmeticException** — which crashes your program unless you handle it properly.

The question asks you to write a **try-catch block** — a mechanism that allows you to “try” executing some code that might throw an exception, and if the exception occurs, **catch** it to prevent your program from crashing and handle the issue gracefully.

---

## 2. Why is this important? (Real-life analogy)

Imagine you are building a calculator app.

If a user tries to divide by zero, your app **should not crash or freeze**. Instead, it should display a friendly message such as:

> "Error: Cannot divide by zero!"

This improves user experience and keeps your app stable.

In Java, the **try-catch** block helps you anticipate such problems and handle them properly, preventing abrupt program termination.

---

## 3. How does try-catch work in Java?

- **try block:** Contains code that might throw an exception.
- **catch block:** Contains code that runs if the specified exception occurs, allowing you to handle the error.

---

## 4. Code Example

```java
// Import statement (not mandatory for ArithmeticException as it belongs to java.lang package)
import java.lang.ArithmeticException;

public class DivisionExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;  // This will throw ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        }
    }
}
