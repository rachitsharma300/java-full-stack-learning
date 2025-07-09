// 12. Count Vowels in a String
// Write a function that takes a string and returns the count of vowels (a, e, i, o, u) in it.

const readline = require("readline");

const r1 = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

r1.question("Enter a string: ", function (str) {
  function countVowels(s) {
    let count = 0;
    let vowels = ["a", "e", "i", "o", "u"];

    s = s.toLowerCase();
    for (let i = 0; i < s.length; i++) {
      if (vowels.includes(s[i])) {
        count++;
      }
    }
    return count;
  }
  console.log("Number of vowels:" + countVowels(str));

  r1.close();
});
