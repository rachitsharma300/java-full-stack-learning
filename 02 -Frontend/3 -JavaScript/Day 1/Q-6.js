// 6. Array Sum
// Given an array [1,2,3,4,5], write a function to calculate and return the sum of all elements.

function arraysum(arr) {
    let sum = 0;
    for(let i = 0; i<arr.length; i++) {
        sum += arr[i];
    }
    return sum;
}

let numbers = [1, 2, 3, 4, 5];

console.log(arraysum(numbers));