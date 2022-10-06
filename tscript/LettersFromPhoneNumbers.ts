/**
 * @param number digits
 * @return [string]
 */
 const letterCombinations = (digits) => {
    const digitMap = {
            1: [""], 2: ['a', 'b', 'c'], 3: ['d', 'e', 'f'], 4: ['g', 'h', 'i'],
            5: ['j','k', 'l'], 6: ['m', 'n', 'o'], 7: ['p', 'q', 'r', 's'],
            8: ['t', 'u', 'v'], 9: ['w', 'x', 'y', 'z'], 0: [""]
    };
    
    const bs = digits.split("").map(ltr => digitMap[Number(ltr)]);
    if (bs.length == 0) return bs;

    let res = bs[0];
    for (let i = 1; i < bs.length; i++) {
        res.forEach(e1 => res = res.concat(bs[i].map(e2 => e1 + e2)));
        res = res.filter(e1 => e1.length > i);
    }
    return res;
};

console.log(letterCombinations(""));
console.log(letterCombinations("11121"));
console.log(letterCombinations("2"));
console.log(letterCombinations("23"));
console.log(letterCombinations("236"));
console.log(letterCombinations("3459"));
const res = letterCombinations("23");
console.log('letterCombinations("23") => ["ad","ae","af","bd","be","bf","cd","ce","cf"] === ' + (JSON.stringify(["ad","ae","af","bd","be","bf","cd","ce","cf"]) === JSON.stringify(res)));

/* 

17. Letter Combinations of a Phone Number - Medium

Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent.
Return the answer in any order. A mapping of digits to letters (just like on the telephone buttons) is given below. 
Note that 1 does not map to any letters.

1 = null, 2 = abc,  3 = def,  4 = ghi,  5 = jkl,  6 = nmo,  7 = pqrs,  8 = tuv,  9 = wxyz,  0 = null.

Example 1:
Input: digits = "23"
Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]

Example 2:
Input: digits = ""
Output: []

Example 3:
Input: digits = "2"
Output: ["a","b","c"]
 

Constraints:
0 <= digits.length <= 4
digits[i] is a digit in the range ['2', '9'].

*/