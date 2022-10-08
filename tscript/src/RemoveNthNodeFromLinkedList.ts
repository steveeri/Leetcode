import ListNode from './ListNode';

const removeNthFromEnd = (head: ListNode | null, n: number): ListNode | null => {

    var nodeArray: ListNode[] = [];
    var curNode = head;
    var cnt = 0;
    while (curNode != null) {
        nodeArray[cnt] = curNode;
        curNode = curNode.next;
        cnt++;
    }

    // Deal with boundary case conditions first.
    if (cnt == 0 || cnt == 1 && n == 1) return null;
    if (n > cnt) return head;
    if (n == cnt) return head?.next || null;

    // If we are here then slice & dice. Condition =>  n >= 2, nodeArray.length >= n + 1
    var hd = nodeArray[cnt-(n+1)];
    var tl = nodeArray[cnt-n].next;
    hd.next = tl;
    return head;
};


/// TESTS 

// Zero number of LED's =>  time = '0:00'
var head = new ListNode(1);
console.log(removeNthFromEnd(head, 1) === null);

// Zero number of LED's =>  time = '0:00'
var head = new ListNode(5);
head = new ListNode(4, head);
head = new ListNode(3, head);
head = new ListNode(2, head);
head = new ListNode(1, head);
console.log(removeNthFromEnd(head, 2) === head);

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
