"use strict";

const isValid = (s: string): boolean => {

    const tokens :{ [id: string]: string; } = {};
    tokens[")"] = "(";
    tokens["]"] = "[";
    tokens["}"] = "{";

    const stack: string[] = [];

    stack.push(s.charAt(0));

    let l = s.length;
    for (let i = 1; i < l; i++) {
        const ch = s.charAt(i);
        const isClosing = tokens[ch] != null;
        if (stack.length > 0 && tokens[ch] == stack[stack.length-1]) stack.pop();
        else if (stack.length > 0 && isClosing) return false;
        else stack.push(ch);
    }

    return stack.length == 0;
};


export default isValid;


/// TESTS 


/* 

20. Valid Parentheses - Easy

Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:
 - Open brackets must be closed by the same type of brackets.
 - Open brackets must be closed in the correct order.
 - Every close bracket has a corresponding open bracket of the same type.


Example 1:
Input: s = "()"
Output: true

Example 2:

Input: s = "()[]{}"
Output: true

Example 3:
Input: s = "(]"
Output: false
 
Constraints:
1 <= s.length <= 10^4
s consists of parentheses only '()[]{}'.

*/