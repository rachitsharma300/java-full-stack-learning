// 20. Merge Two Arrays
// Write a function to merge two arrays and return a single merged array.

function mergeArrays(arr1, aar2) {
    return [...arr1, ...aar2];
}

let a = [1, 2, 3];
let b = [4, 5, 6];

console.log(mergeArrays(a, b)); // OT-- [1,2,3,4,5,6]