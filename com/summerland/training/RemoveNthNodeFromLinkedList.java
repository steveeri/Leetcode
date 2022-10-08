package com.summerland.training;

import java.util.ArrayList;
import java.util.List;

public class RemoveNthNodeFromLinkedList {

    public Solution sol = new Solution();

    public class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            List<ListNode> nodeArray = new ArrayList<>();

            var curNode = head;
            var cnt = 0;
            while (curNode != null) {
                nodeArray.add(curNode);
                curNode = curNode.next;
                cnt++;
            }

            // Deal with boundary case conditions first.
            if (cnt == 0 || cnt == 1 && n == 1) return null;
            if (n > cnt) return head;
            if (n == cnt) return head.next;

            // If we are here then slice & dice. Condition =>  n >= 2, nodeArray.length >= n + 1
            var hd = nodeArray.get(cnt-(n+1));
            var tl = nodeArray.get(cnt-n).next;
            hd.next = tl;
            return head;
        }
    }
    
}

/* 

19. Remove Nth Node From End of List - Medium

Given the head of a linked list, remove the Nth node from the end of the list and return its head.

Example 1:
Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]

Example 2:
Input: head = [1], n = 1
Output: []

Example 3:
Input: head = [1,2], n = 1
Output: [1]
 
Constraints:
The number of nodes in the list is sz.
1 <= sz <= 30
0 <= Node.val <= 100
1 <= n <= sz
 
*/
