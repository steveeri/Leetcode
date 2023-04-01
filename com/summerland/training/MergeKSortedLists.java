package com.summerland.training;

public class MergeKSortedLists {

  public Solution sol = new Solution();

  public class Solution {

    public ListNode mergeKLists(ListNode[] lists) {

      ListNode rList = null;

      ListNode[] hPtrs = new ListNode[lists.length];
      ListNode[] tPtrs = new ListNode[lists.length];

      int lowVal = Integer.MAX_VALUE;
      ListNode lowPtr = null;

      // Load initial head and tails ptrs
      for (var i = 0; i < lists.length; i++) {
        if (lists[i] != null) {
          hPtrs[i] = lists[i];
          tPtrs[i] = hPtrs[i].next;
          if (hPtrs[i].val < lowVal) {
            lowVal = hPtrs[i].val;
            lowPtr = hPtrs[i];
          }
        }
      }

      rList = lowPtr;

      return rList;
    }
  }
}

/*
 * Merge k Sorted Lists - Hard
 * You are given an array of k linked-lists lists, each linked-list is sorted in
 * ascending order.
 * Merge all the linked-lists into one sorted linked-list and return it.
 * 
 * Example 1:
 * Input: lists = [[1,4,5],[1,3,4],[2,6]]
 * Output: [1,1,2,3,4,4,5,6]
 * Explanation: The linked-lists are:
 * [
 * 1->4->5,
 * 1->3->4,
 * 2->6
 * ]
 * merging them into one sortedrlist:
 * 1->1->2->3->4->4->5->6
 * 
 * Example 2:
 * Input: lists = []
 * Output: []
 * 
 * Example 3:
 * Input: lists = [[]]
 * Output: []
 * 
 * Constraints:
 * k == lists.length
 * 0 <= k <= 104
 * 0 <= lists[i].length <= 500
 * -10^4 <= lists[i][j] <= 10^4
 * lists[i] is sorted in ascending order.
 * The sum of lists[i].length will not exceed 10^4.
 */
