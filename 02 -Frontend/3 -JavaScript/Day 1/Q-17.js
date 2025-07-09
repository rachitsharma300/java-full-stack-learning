// 17. Capitalize First Letter
// Write a function that takes a string and returns it with the first letter capitalized. 
// Example: “hello” → “Hello”.

function capitalizeFirst(str) {
  if (str.length === 0) return ""; // handle empty string
  return str.charAt(0).toUpperCase() + str.slice(1);
}

console.log(capitalizeFirst("hello")); // Output: "Hello"
console.log(capitalizeFirst("javaScript")); // Output: "JavaScript"
