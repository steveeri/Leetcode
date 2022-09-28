package com.summerland.training;

import java.util.ArrayList;

public class IntegerToRoman {

	public Solution sol = new Solution();

	public class Solution {

		record Token (int slice, String roman){};

		public String intToRoman(int num) {
	
			ArrayList<Token> tokens = new ArrayList<>(13){{
				add(new Token(1000,"M")); add(new Token(900,"CM")); add(new Token(500,"D")); add(new Token(400,"CD")); 
				add(new Token(100 ,"C")); add(new Token(90 ,"XC")); add(new Token(50 ,"L")); add(new Token(40 ,"XL")); 
				add(new Token(10  ,"X")); add(new Token(9  ,"IX")); add(new Token(5  ,"V")); add(new Token(4  ,"IV")); 
				add(new Token(1   ,"I"));
			}};
			
			String res = "";
			int idx = num < 100 ? 5 : 0; // play odds to get a performance increase
			while (idx < 13) {
				int slice = tokens.get(idx).slice;
				while(num >= slice) {
					res += tokens.get(idx).roman;
					num -= slice;
				}
				idx++;
			}
			return res;
		}
	}
}


/* 
	Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

	Symbol       Value
	I             1
	V             5
	X             10
	L             50
	C             100
	D             500
	M             1000

	For example, 2 is written as II in Roman numeral, just two one's added together. 
	12 is written as XII, which is simply X + II. The number 27 is written as XXVII, 
	which is XX + V + II.

	Roman numerals are usually written largest to smallest from left to right. 
	However, the numeral for four is not IIII. Instead, the number four is written as IV. 
	Because the one is before the five we subtract it making four. 
	The same principle applies to the number nine, which is written as IX. 
	There are six instances where subtraction is used:

	I can be placed before V (5) and X (10) to make 4 and 9. 
	X can be placed before L (50) and C (100) to make 40 and 90. 
	C can be placed before D (500) and M (1000) to make 400 and 900.
	Given an integer, convert it to a roman numeral.

	Example 1:
	Input: num = 3
	Output: "III"
	Explanation: 3 is represented as 3 ones.

	Example 2:
	Input: num = 58
	Output: "LVIII"
	Explanation: L = 50, V = 5, III = 3.

	Example 3:
	Input: num = 1994
	Output: "MCMXCIV"
	Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
	
	Constraints:
	1 <= num <= 3999

*/