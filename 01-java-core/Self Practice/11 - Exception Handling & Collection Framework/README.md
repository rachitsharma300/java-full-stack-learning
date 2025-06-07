# 📘 **Exception Handling in Java**
*A Comprehensive Guide with Real-World Examples & Code Snippets*

---

## 🧠 **Table of Contents**
1. [Purpose of `finally` Block](#-1-purpose-of-finally-block)
2. [`throw` Keyword](#-2-throw-keyword)
3. [`throws` Keyword](#-3-throws-keyword)
4. [Nested `try-catch` Blocks](#-4-nested-try-catch-blocks)
5. [`InputMismatchException`](#-5-inputmismatchexception)
6. [`NullPointerException`](#-6-nullpointerexception)
7. [`ArrayIndexOutOfBoundsException`](#-7-arrayindexoutofboundsexception)
8. [`ArithmeticException`](#-8-arithmeticexception)
9. [`NumberFormatException`](#-9-numberformatexception)
10. [`FileNotFoundException`](#-10-filenotfoundexception)

---

## 🔹 **1. Purpose of `finally` Block**
### 📌 **Definition**
The `finally` block executes **regardless of whether an exception occurs** in `try-catch`. Used for cleanup (e.g., closing files, DB connections).

### 🎯 **Why Use It?**
- Prevents resource leaks.
- Ensures critical code runs (e.g., saving state before crash).

### 🌍 **Real-Life Example**
> *You open a safe (`try`), take money (`catch` if someone interrupts), but **always lock it back** (`finally`).*

### 💻 **Code Snippet**
```java
try {
    File file = new File("test.txt");
    Scanner scanner = new Scanner(file); // Risky operation
} catch (FileNotFoundException e) {
    System.out.println("File not found!");
} finally {
    scanner.close(); // Always runs

```
## 🔹 **2. `throw` Keyword**
### 📌 **Definition**
Manually creates and throws an exception.

### 🎯 **Why Use It?**
- Enforce business rules.
- Create custom errors.

### 🌍 **Real-Life Example**
ATM throwing "Insufficient Funds" error.

### 💻 **Code Example**
```java
void withdraw(double amount) {
    if(amount > balance) {
        throw new InsufficientFundsException("Balance too low");
    }
    // Process withdrawal
}

```

## 🔹 **3. `throws` Keyword**
### 📌 **Definition**
Declares exceptions a method might throw.

### 🎯 **Why Use It?**
- Warn callers about potential errors.
- Required for checked exceptions.

### 🌍 **Real-Life Example**
Weather app warning "Might rain today".

### 💻 **Code Example**
```java
public void loadConfig() throws FileNotFoundException {
    File config = new File("config.cfg");
    // File operations
}

```
## 🔹 **4. Nested try-catch**
### 📌 **Definition**
try-catch blocks inside other try-catch blocks.

### 🎯 **Why Use It?**
- Handle different error types separately.
- Prevent cascading failures.

### 🌍 **Real-Life Example**
Online order: Payment → Shipping → Delivery.

### 💻 **Code Example**
```java
try {
    // Process payment
    try {
        // Validate shipping address
    } catch (InvalidAddressException e) {
        System.out.println("Fix address");
    }
} catch (PaymentFailedException e) {
    System.out.println("Payment failed");
}

```

## 🔹 **5. InputMismatchException**
### 📌 **Definition**
Wrong input type (e.g., text instead of number).

### 🎯 **Why Handle It?**
- Prevent form crashes.
- Improve user experience.

### 🌍 **Real-Life Example**
Entering "five" in age field.

### 💻 **Code Example**
```java
Scanner scanner = new Scanner(System.in);
try {
    int age = scanner.nextInt();
} catch (InputMismatchException e) {
    System.out.println("Numbers only please!");
}

```
## 🔹 **6. NullPointerException**
### 📌 **Definition**
Accessing null object reference.

### 🎯 **Why Handle It?**
- Most common Java exception.
- Prevent app crashes.

### 🌍 **Real-Life Example**
Trying to drive a car that doesn't exist.

### 💻 **Code Example**
```java
String name = null;
try {
    System.out.println(name.length());
} catch (NullPointerException e) {
    System.out.println("Object is null!");
}
```
## 🔹 **7. ArrayIndexOutOfBoundsException**
### 📌 **Definition**
Accessing invalid array index.

### 🎯 **Why Handle It?**
- Prevent invalid memory access.
- Common in loop operations.

### 🌍 **Real-Life Example**
*Asking for 6th item in 5-item menu.*

### 💻 **Code Example**
```java
int[] scores = {90, 85, 95};
try {
    System.out.println(scores[5]);
} catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("Invalid index!");
}
```
## 🔹 **8. ArithmeticException**
### 📌 **Definition**
Illegal math operation.

### 🎯 **Why Handle It?**
- Prevent calculation errors.
- Essential for financial apps.

### 🌍 **Real-Life Example**
Dividing pizza among 0 people.

### 💻 **Code Example**
```java
try {
    int result = 100 / 0;
} catch (ArithmeticException e) {
    System.out.println("Cannot divide by zero!");
}
```
## 🔹 **9. NumberFormatException**
### 📌 **Definition**
Invalid number conversion.

### 🎯 **Why Handle It?**
- Common in data parsing.
- Web form validations.

### 🌍 **Real-Life Example**
Converting "123abc" to number.

### 💻 **Code Example**
```java
try {
    int value = Integer.parseInt("12.5");
} catch (NumberFormatException e) {
    System.out.println("Invalid number format!");
}
```
## 🔹 **10. FileNotFoundException**
### 📌 **Definition**
Accessing missing file.

### 🎯 **Why Handle It?**
- Essential for file operations.
- Prevent data loss.

### 🌍 **Real-Life Example**
Opening deleted document.

### 💻 **Code Example**
```java
try {
    File file = new File("missing.txt");
    Scanner reader = new Scanner(file);
} catch (FileNotFoundException e) {
    System.out.println("File not found!");
}






