// 18. Sum of Digits
// Write a function to find the sum of all digits in a given number. 
// Example: 123 → 6.

function sumDigits(num) {
    let sum = 0;
    let str = num.toString();
    for (let i = 0; i <str.length; i++) {
        sum += parseInt(str[i]);
    }
    return sum;
}
console.log(sumDigits(123)); // OT--6
console.log(sumDigits(987)); // OT--24