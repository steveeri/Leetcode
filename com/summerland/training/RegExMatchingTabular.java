package com.summerland.training;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RegExMatchingTabular {

	public Solution sol = new Solution();

	public class Solution {

		record Token(char reCh, Boolean wild){};

		public boolean isMatch(String s, String p) {

			int sl = s.length(), pl = p.length();

			if (p.indexOf('.') < 0 && p.indexOf('*') < 0) return s.equals(p);

			// 2-dimensional array s.length + 1, and p.length will be more than enough space.
			final Integer[][] table = new Integer[sl+1][pl+1];
			table[0][0] = -1; // base case - empty prefix can be matched by empty string re prefix.

			// deconstruct regex predicate into an array of re tokens
			final List<Token> reTokens = new ArrayList<>();
			for (int i = 0; i < pl; i++) {
				var wild = (i+1 < pl && p.charAt(i+1) == '*');
				reTokens.add(new Token(p.charAt(i), wild));
				if (wild) i += 1; // cause double increment 
			}

			// Loop through table array corresponding to walking down the target string 's'.
			for (int i = 0; (i < sl && table[i][0] != null); i++) {
				var sCh = s.charAt(i);
				var matchesThisPosition = new HashMap<Integer,Integer>();
				// This 2nd loop will be nominally small, although looks forboding at first glance.
				for (int j = 0; j <= pl && table[i][j] != null; j++) {
					var tokIdx = table[i][j];
					// This 3rd loop will also be nominally small all, but appears crazy eh!
					var lastMatchIndex = -1;
					var lastWildIndex = -1;
					for (int k = tokIdx+1; k < reTokens.size(); k++) {
						var reNxt = reTokens.get(k);
						var match = reNxt.reCh == '.' || reNxt.reCh == sCh;
						if (!match && !reNxt.wild) 
							k = reTokens.size() + 1; 
						if (match) 
							lastMatchIndex = k;
						if (reNxt.wild) 
							lastWildIndex = k;
					}

					// Craft discovered info into table for next use.
					var maxMatchIndex = (lastMatchIndex >= 0 && lastWildIndex > lastMatchIndex) ? lastWildIndex : lastMatchIndex;
					var startOffset = (lastMatchIndex >= 0 && lastWildIndex <= lastMatchIndex) ? 0 : 1;
					for (int x = tokIdx+startOffset; x <= maxMatchIndex; x++) {
						if (!matchesThisPosition.containsKey(x)) {
							matchesThisPosition.put(x, x);
							table[i+1][matchesThisPosition.size()-1] = x;
						}
						if (i+1 == sl && x == reTokens.size() - 1) return true;
					}
				}
			}
			return false;
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