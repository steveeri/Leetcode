package com.summerland.training;

public class MedianOfTwoSortedLists {

	public Solution sol = new Solution();

	public class Solution {

		public double findMedianSortedArrays(int[] nums1, int[] nums2) {

			int sz1 = nums1.length, sz2 = nums2.length;
			int combinedSize = sz1 + sz2;			
			int half = combinedSize / 2;
			int maxLoop = half + 1;
			int[] ml = new int[maxLoop];

			if (combinedSize == 0) return 0d;

			if (sz1 == 0) {
				ml = nums2;
				maxLoop = 0;
			}
			if (sz2 == 0) {
				ml = nums1;
				maxLoop = 0;
			}

			int p1 = 0, p2 = 0;

			for (int i = 0; i < maxLoop; i++) {
				Integer v1 = null, v2 = null;
				if (p1 < sz1) v1 = nums1[p1];
				if (p2 < sz2) v2 = nums2[p2];

				if (v1 == null && v2 == null) {
					i = maxLoop;   // exit out
				} else if (v1 == null) {
					ml[i] = v2;
					p2++;
				} else if (v2 == null) {
					ml[i] = v1;
					p1++;
				} else if (v1 < v2) {
					ml[i] = v1;
					p1++;
				} else {
					ml[i] = v2;
					p2++;
				}
			}
			
			return (double) (((combinedSize) % 2 > 0) ? ml[half] : (double)(ml[half-1] + ml[half]) / 2d);
		}
	}
}


/* 

	Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
	The overall run time complexity should be O(log (m+n)).
	
	Example 1:
	Input: nums1 = [1,3], nums2 = [2]
	Output: 2.00000
	Explanation: merged array = [1,2,3] and median is 2.

	Example 2:
	Input: nums1 = [1,2], nums2 = [3,4]
	Output: 2.50000
	Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
	
	Constraints:
	nums1.length == m
	nums2.length == n
	0 <= m <= 1000
	0 <= n <= 1000
	1 <= m + n <= 2000
	-10^6 <= nums1[i], nums2[i] <= 10^6

*/