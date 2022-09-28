package com.summerland.training;

import java.util.HashMap;


public class RegExMatchingRecursion {

	public Solution sol = new Solution();

	public class Solution {

		public boolean isMatch(String s, String p) {
			return this.isMatch(s, p, new HashMap<String,Boolean>());
		}

		public boolean isMatch(String s, String p, HashMap<String,Boolean> hm) {

			var key = s + ':' + p;			
			var wild = (p.length() > 1 && p.charAt(1) == '*');
			if (hm.containsKey(key)) return hm.get(key);
			if (s.isEmpty() && p.isEmpty()) return true;
			if (!s.isEmpty() && p.isEmpty()) return false;
			if (s.isEmpty() && p.length() == 2 && wild) return true;
			if (s.isEmpty() && !p.isEmpty() && !wild) return false;
			
			var resultMatched = false;
			var match = p.charAt(0) == '.' || (!s.isEmpty() && s.charAt(0) == p.charAt(0));
			
			if (wild && (!match || s.isEmpty())) {
				resultMatched = this.isMatch(s, p.substring(2), hm);
			} else if (wild && match) {
				resultMatched = this.isMatch(s, p.substring(2), hm) || this.isMatch(s.substring(1), p, hm);
			} else if (match) {
				resultMatched = this.isMatch(s.substring(1), p.substring(1), hm);
			} 

			hm.put(key, resultMatched);
			return resultMatched;
		}
	}

}


/* 
	Given an input string s and a pattern p, implement regular expression matching with support for '.' and '*' where:

	'.' Matches any single character.​​​​
	'*' Matches zero or more of the preceding element.
	The matching should cover the entire input string (not partial).

	Example 1:
	Input: s = "aa", p = "a"
	Output: false
	Explanation: "a" does not match the entire string "aa".

	Example 2:
	Input: s = "aa", p = "a*"
	Output: true
	Explanation: '*' means zero or more of the preceding element, 'a'. Therefore, by repeating 'a' once, it becomes "aa".

	Example 3:
	Input: s = "ab", p = ".*"
	Output: true
	Explanation: ".*" means "zero or more (*) of any character (.)".
	

	Constraints:
	1 <= s.length <= 20
	1 <= p.length <= 30
	s contains only lowercase English letters.
	p contains only lowercase English letters, '.', and '*'.
	It is guaranteed for each appearance of the character '*', there will be a previous valid character to match.
*/