// 13. Find Minimum in Array
// Write a function to find and return the smallest number in an array of numbers.

function findMinimum(arr) {
  let min = arr[0]; //assume first element in mini..
  for (let i = 1; i < arr.length; i++) {
    if (arr[i] < min) {
      min = arr[i];
    }
  }
  return min;
}

let number = [5, 2, 8, 9, 4, 3];
console.log(findMinimum(number));
