// 7. Reverse a String
// Write a function to reverse a given string. Example: “hello” → “olleh”

function reverseString(str) {
    return str.split('').reverse().join('');
}

console.log(reverseString("Hello"));

// function reverseString(str) {
//   let reversed = "";
//   for (let i = str.length - 1; i >= 0; i--) {
//     reversed += str[i];
//   }
//   return reversed;
// }
