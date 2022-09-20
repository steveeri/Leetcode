package com.summerland.training;

import java.util.ArrayList;
import java.util.HashMap;


public class LongestSubstring implements Problem {

	public final Solution sol = new Solution();
	private ArrayList<String> reqData = new ArrayList<>();
	private StringBuilder report = new StringBuilder("Report: => \n");

	@Override
	public void prepare() {
		reqData.add(0, "abcabcbb");
		reqData.add(1, "bbbbb");
		reqData.add(2, "pwwkew");
	}

	@Override
	public void solve() {
		int res = sol.lengthOfLongestSubstring(reqData.get(0));
		this.addResultToReport(reqData.get(0), res);

		res = sol.lengthOfLongestSubstring(reqData.get(1));
		this.addResultToReport(reqData.get(1), res);

		res = sol.lengthOfLongestSubstring(reqData.get(2));
		this.addResultToReport(reqData.get(2), res);
	}

	@Override
	public void report() {
		System.out.println(this.report);
	}

	// Build report string
	private void addResultToReport(String input, int result) {
		this.report.append("**** next Result ****\n\n");
		this.report.append("\tLongest substring of ( " + input + " ) is ( " + result + " )\n");
	}

	//////////////////

	public class Solution {

		public int lengthOfLongestSubstring(String s) {

			if (s == null || s.length() == 0)
				return 0;

			HashMap<Integer, String> map = new HashMap<>();

			String longSStr = "";

			int strLen = s.length();
			for (int i = 0; i < strLen; i++) {

				String c = s.substring(i, i + 1);
				int len = longSStr.length();

				if (!longSStr.contains(c)) {
					longSStr += c;
					if (map.get(len) == null) {
						map.put(len, longSStr);
						// System.out.println("Storing new long str = " + longSStr);
					// } else {
						// System.out.println("Not quite longest new str = " + longSStr);
					}
				} else {
					int idx = longSStr.lastIndexOf(c);
					if (idx + 1 == len) {
						longSStr = c;
						// System.out.println("Resetting long str = " + longSStr);
					} else {
						longSStr = longSStr.substring(idx+1);
						longSStr += c;
						// System.out.println("found dup char = " + longSStr);
					}
				}
			}

			return map.size();
		}
	}

	//////////////////

}

/*
 * Given a string s, find the length of the longest substring without repeating
 * characters.
 * 
 * 
 * Example 1:
 * 
 * Input: s = "abcabcbb" Output: 3 Explanation: The answer is "abc", with the
 * length of 3. 
 * 
 * 
 * Example 2:
 * 
 * Input: s = "bbbbb" Output: 1 Explanation: The answer is "b", with the length
 * of 1.
 * 
 * 
 * Example 3:
 * 
 * Input: s = "pwwkew" Output: 3 Explanation: The answer is "wke", with the
 * length of 3. Notice that the answer must be a substring, "pwke" is a
 * subsequence and not a substring.
 * 
 * 
 * Constraints:
 * 
 * 0 <= s.length <= 5 * 104 s consists of English letters, digits, symbols and
 * spaces.
 */
