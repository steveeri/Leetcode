import ListNode from './ListNode';

"use strict";

const mergeTwoLists = (list1: ListNode | null, list2: ListNode | null): ListNode | null => {

    // Check base data conditions
    if (list1 == null) return list2;
    if (list2 == null) return list1;

    let lp1: ListNode = list1;
    let lp2: ListNode = list2;
    let hp: ListNode = null;

    if (list1.val <= list2.val) {
        hp = list1;
        lp1 = list1.next;
    } else {
        hp = list2;
        lp2 = list2.next;
    }
    let tp: ListNode = hp;

    while(lp1 != null || lp2 != null) {
        if (lp1 != null && lp2 != null) {
            if (lp1.val <= lp2.val) {
                tp.next = lp1;
                tp = lp1;
                lp1 = lp1.next;
            } else {
                tp.next = lp2;
                tp = lp2;
                lp2 = lp2.next;
            }
        } else if (lp1 != null) {
            tp.next = lp1;
            lp1 = null;
        } else {
            tp.next = lp2;
            lp2 = null;
        }
    }

    return hp;
};

export default mergeTwoLists;


/// TESTS 


/*

    You are given the heads of two sorted linked lists list1 and list2.
    Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.
    Return the head of the merged linked list.

    Example 1:
    Input: list1 = [1,2,4], list2 = [1,3,4]
    Output: [1,1,2,3,4,4]

    Example 2:
    Input: list1 = [], list2 = []
    Output: []
    
    Example 3:
    Input: list1 = [], list2 = [0]
    Output: [0]

    Constraints:
    The number of nodes in both lists is in the range [0, 50].
    -100 <= Node.val <= 100
    Both list1 and list2 are sorted in non-decreasing order.

*/