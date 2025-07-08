// 5. Simple Calculator
// Create a function calculator that takes three parameters: num1, num2, and operator (+, -, *, /), and returns the result.

function calculator(num1, num2, operator) {
    if (operator === '+') {
        return num1 + num2;
    } else if (operator === '-') {
        return num1 - num2;
    } else if (operator === '*') {
        return num1 * num2;
    } else if ( operator === '/') {
        return num1 / num2;
    } else {
        return "Invalid operator";
    }
}

console.log(calculator(10, 5, '+'));
