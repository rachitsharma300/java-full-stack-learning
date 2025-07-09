// 9. Palindrome Check
// Write a function that checks whether a string is a palindrome or not. (Same forward and backward)a

// function isPalindrome(str) {
//   let reversed = str.split('').reverse().join('');
//   return str === reversed;
// }

// console.log(isPalindrome("madam")); // Output: true
// console.log(isPalindrome("hello")); // Output: false

function isPalindrome(str) {
    for (let i = 0; i < str.length / 2; i++) {
        if (str[i] !== str[str.length - 1 - i]) {
            return false;
        }
    }
    return true;
}


console.log(isPalindrome("madam")); // Output: true
console.log(isPalindrome("hello")); // Output: false
