// a19. Remove Duplicates from Array
// Write a function that removes duplicate elements from an array and returns a new array with unique elements.

function removeDuplicates(arr) {
    return[...new Set(arr)];
}

let numbers = [ 1, 2, 3, 4, 5, 5, 6];
console.log(removeDuplicates(numbers));

// ----- USING LOOPS -----

// function removeDuplicates(arr) {
//   let unique = [];
//   for (let i = 0; i < arr.length; i++) {
//     if (!unique.includes(arr[i])) {
//       unique.push(arr[i]);
//     }
//   }
//   return unique;
// }
