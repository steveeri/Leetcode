package com.summerland.training;

public class ReverseInteger {

	public Solution sol = new Solution();

	public class Solution {

	public int reverse(int x) {
			boolean negNum = x < 0;
			if (negNum) x *= -1;
			StringBuilder sb = new StringBuilder("" + x);
	
			try {
				int num = Integer.parseInt(sb.reverse().toString());
				if (negNum) return num * -1;
				return num;
			} catch (NumberFormatException nfe) {
				return 0;
			}
		}
	}
}

/* 

	Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-2^31, 2^31 - 1], then return 0.
	Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

	Example 1:
	Input: x = 123
	Output: 321

	Example 2:
	Input: x = -123
	Output: -321

	Example 3:
	Input: x = 120
	Output: 21
	
	Constraints:

	-2^31 <= x <= 2^31 - 1
	
*/