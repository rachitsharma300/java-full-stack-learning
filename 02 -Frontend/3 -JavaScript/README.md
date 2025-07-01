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
## Data Types
```
Type	Example
String	"Hello"
Number	42, 3.14
Boolean	true, false
Undefined	let x;
Null	let y = null;
Object	{name: "Rachit"}
Array	[1,2,3]
```
## Operators
```
Arithmetic
+ - * / % **

Assignment
= += -= *= /=

Comparison
== != === !== > < >= <=

Logical
&& || !
```
## Example
```js
Copy
Edit
let a = 10;
let b = 3;
console.log(a + b); // 13
console.log(a ** b); // 1000
```
## Functions
Function Declaration
```js
Copy
Edit
function greet(name) {
  console.log("Hello " + name);
}
greet("Rachit");
```
## Arrow Function (ES6)
```js
const greet = (name) => {
  console.log("Hello " + name);
}
greet("Rachit");
```
## Conditional Statements
```js
let num = 10;
if (num > 0) {
  console.log("Positive");
} else if (num < 0) {
  console.log("Negative");
} else {
  console.log("Zero");
}
```
##Loops
For Loop
```js
for(let i = 1; i <= 5; i++) {
  console.log(i);
}
```
## While Loop
```js
let i = 1;
while(i <= 5) {
  console.log(i);
  i++;
}
```
## Do-While Loop
```js
let i = 1;
do {
  console.log(i);
  i++;
} while(i <= 5);
```