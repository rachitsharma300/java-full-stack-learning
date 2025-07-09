// 11. Swap Two Numbers
// Write a program to swap the values of two variables using a temporary third variable.

let num1 = 10;
let num2 = 20;

console.log('Original Num: ' + num1 + " " + num2);

let temp = num1; // temp = 10
num1 = num2;     // num1 = 20
num2 = temp;     // num2 = 10

console.log('After Swap: ' + num1 + " " + num2);
