#  JavaScript Day 1 Notes

##  **Introduction to JavaScript**
- JavaScript is a **high-level, interpreted programming language**.
- Runs in the **browser (client-side)** but can also run on **server-side (Node.js)**.
- Used for making web pages **interactive and dynamic**.

---

##  **Hello World**

```js
console.log("Hello World");
```
## Variables
var
Can be re-declared and updated.
Function scoped, hoisted.
```js
Copy
Edit
var name = "Rachit";
console.log(name);
```
## let
Can be updated but not re-declared in the same scope.
Block scoped.

```js
Copy
Edit
let age = 25;
age = 26;
console.log(age);
```
## const
Cannot be updated or re-declared.
Block scoped.
```js
Copy
Edit
const pi = 3.14;
console.log(pi);
```
