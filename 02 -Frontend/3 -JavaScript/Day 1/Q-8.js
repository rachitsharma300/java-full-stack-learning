// 8. Factorial
// Write a function to find the factorial of a number using a for loop.

function factorial(n) {
    let fact = 1;
    for (let i=1; i<=n; i++) {
        fact *=i;
    }
    return fact;
}

console.log(factorial(5)); // O/T= 120