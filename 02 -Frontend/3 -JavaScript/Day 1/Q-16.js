// 16. Generate Random Number
// Write a function that generates a random integer between 1 and 100 (inclusive).

function randomNumber() {
    return Math.floor(Math.random() * 100) + 1;
}

console.log(randomNumber());