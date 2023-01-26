"use strict";

const longestPalindrome = (s: string): string => {
    let h = 0, t = 0, len = s.length;
    const p = s.charAt(0);  // first char is base candidate for palindrome

    for (let i = 0; i < len; i++) {

    }

    return "bab";
};

export default longestPalindrome;


/// TESTS 


/* 

5. Longest Palindromic Substring - Medium

Given a string s, return the longest palindromic substring in s.
A string is called a palindrome string if the reverse of that string is the same as the original string.

Example 1:
Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.

Example 2:
Input: s = "cbbd"
Output: "bb"
 
Constraints:
1 <= s.length <= 1000
s consist of only digits and English letters.

*/