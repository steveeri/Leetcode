package com.summerland.training;

import java.util.HashMap;

public class SumEvenNumberInListAfterQuery {

	public Solution sol = new Solution();

	public class Solution {
		public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {

			final int nl = nums.length, ql = queries.length;
			final int[] res = new int[ql];
			int sumEvens = 0;

			for (int i = 0; i < nl; i++)
				if (nums[i] % 2 == 0) sumEvens += nums[i];

			for (int i = 0; i < ql; i++) {
				int num = queries[i][0];
				int idx = queries[i][1];
				if (num != 0 && idx >= 0 && idx < nl) {
					int sum = nums[idx] + num;
					if (nums[idx] % 2 == 0 && (sum) % 2 == 0)		// was even, still even
						sumEvens += num;
					else if (nums[idx] % 2 != 0 && (sum) % 2 == 0)	// wasn't before, but now even
						sumEvens += sum;
					else if (nums[idx] % 2 == 0 && (sum) % 2 != 0)	// was even before, but no longer
						sumEvens -= nums[idx];
					nums[idx] = sum; // update new value.
				}
				res[i] = sumEvens;  // update result of q(i)
			}
			return res;
		}
	}
}


/* 

	You are given an integer array nums and an array queries where queries[i] = [vali, indexi].
	For each query i, first, apply nums[indexi] = nums[indexi] + vali, then print the sum of the even values of nums.
	Return an integer array answer where answer[i] is the answer to the ith query.


	Example 1:
	Input: nums = [1,2,3,4], queries = [[1,0],[-3,1],[-4,0],[2,3]]
	Output: [8,6,2,4]

	Explanation: At the beginning, the array is [1,2,3,4].
	After adding 1 to nums[0], the array is [2,2,3,4], and the sum of even values is 2 + 2 + 4 = 8.
	After adding -3 to nums[1], the array is [2,-1,3,4], and the sum of even values is 2 + 4 = 6.
	After adding -4 to nums[0], the array is [-2,-1,3,4], and the sum of even values is -2 + 4 = 2.
	After adding 2 to nums[3], the array is [-2,-1,3,6], and the sum of even values is -2 + 6 = 4.

	Example 2:
	Input: nums = [1], queries = [[4,0]]
	Output: [0]
	

	Constraints:
	1 <= nums.length <= 10^4
	-10^4 <= nums[i] <= 10^4
	1 <= queries.length <= 10^4
	-10^4 <= vali <= 10^4
	0 <= indexi < nums.length

*/