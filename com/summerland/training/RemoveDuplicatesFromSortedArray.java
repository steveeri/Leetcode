package com.summerland.training;

public class RemoveDuplicatesFromSortedArray {

	public Solution sol = new Solution();

	public class Solution {
		public int removeDuplicates(int[] nums) {
			int ptr = 0;
			if (nums.length > 1) {
				for (int i = 1; i < nums.length; i++) {
					if (nums[ptr] != nums[i]) {
						nums[++ptr] = nums[i];
					}
				}
			}
			return ptr + 1;
		}
	}

}
