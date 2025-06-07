# 📘 Exception Handling in Java

---

## 1. What is the purpose of the `finally` block in Java?

When you write `try-catch` blocks to handle exceptions, sometimes you want to run some code **no matter what happens** — whether an exception is thrown or not.

The `finally` block lets you do exactly that: it contains code that always executes after `try` and `catch` blocks finish. It's usually used for clean-up activities, like closing files, releasing resources, or closing database connections.

---

### 🔹 Real-life Example

Imagine you borrowed a book from a library.  
You want to read it (`try`), but if something happens (`catch`) — say the book is torn — you **still have to return the book** (`finally`), whether or not there was a problem.

---

### 🔹 Why is this important?

- Ensures critical clean-up code runs regardless of exceptions.
- Avoids resource leaks (files, network connections, memory).
- Makes your program more reliable and safe.

---

## 2. What does the `throw` keyword do?

The `throw` keyword in Java is used to **manually throw an exception**.

Unlike `throws` (which declares exceptions that a method might throw), `throw` actually **creates and throws** an exception object.  
You use it when you want to **forcefully signal an error** in your program.

---

### 🔹 Real-life Example

Imagine a vending machine that only accepts coins of ₹5 or ₹10.  
If you insert a ₹2 coin, the machine should manually throw an error saying:

> "Invalid coin"

This is where `throw` comes into action.

---

### 🔹 Why is this important?

- Allows programmers to enforce rules and constraints explicitly.
- Helps create meaningful, customized error messages or exceptions.

---

## 3. What is the `throws` keyword in Java?

The `throws` keyword is used in a **method declaration** to inform the caller that this method **might throw an exception**.

It is **not for handling** the exception but for **passing the responsibility** to the calling method.

It’s mostly used for **checked exceptions** like `IOException`, `SQLException`, etc.

---

### 🔹 Real-life Example

Imagine you're a delivery boy. If it rains heavily (exception), instead of handling it yourself, you call your manager and say:

> "Sir, I might get late."

You’re passing the info, **not solving the problem**.

Same with `throws` — the method says:

> "I might throw this exception. You handle it."

---

### 🔹 Why is `throws` important?

- Java forces you to either handle or declare **checked exceptions** using `throws`.
- Helps in **code clarity**, knowing which methods can fail.
- Promotes **cleaner separation of concern** — declaring vs handling.

---

## 4. What are Nested `try-catch` blocks?

**Nested try-catch** means placing one try-catch block inside another. It is used when:

- You expect different types of exceptions in different parts of your code.
- You want to handle exceptions more specifically and locally.
- You want the outer block to continue execution even if the inner block fails.

---

### 🔹 Real-life Analogy

You go to a mall:

- **Inner try:** You try to take the lift (could throw error: lift malfunction).
- **Outer try:** You try to pay at the counter (could throw error: card not working).

Both are unrelated. If one fails, the other can still work.

---

### 🔹 Why is this important?

- Helps in **granular error handling**.
- Makes code more **robust** and less prone to crash.
- Common in large apps like **banking systems**, **form validations**, etc.

---

## 5. InputMismatchException in Java

### What is InputMismatchException?
It occurs when the user inputs the wrong type of data.
Example: You expect an integer but the user types `"abc"`.

### Why handle this?
In real-world applications like:

- ATM PIN entry
- Age input in forms
- Price input in billing systems

Users might mistype, so you must handle such situations gracefully instead of crashing the program.

### Real-life Analogy
Imagine filling a form that asks:

> "Enter your Age"

You type `"twenty"` instead of `20`.

A good app shows:

> "Invalid input. Please enter a number!"

instead of crashing.

### Code Example

```java
import java.util.Scanner;
import java.util.InputMismatchException;

public class InputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter your age: ");
            int age = scanner.nextInt(); // May throw InputMismatchException
            System.out.println("Your age is: " + age);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number!");
        }
    }
}
