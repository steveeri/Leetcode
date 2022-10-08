package com.summerland.training;

import java.util.Vector;

public class AddTwoNumbers implements Problem {

    private Solution sol = new Solution();
    private Vector<ListNode> reqData = new Vector<>();
    private StringBuilder report = new StringBuilder("Report: => \n");

    @Override
    public void prepare() {
        reqData.add(0, new ListNode(2, new ListNode(4, new ListNode(3))));
        reqData.add(1, new ListNode(5, new ListNode(6, new ListNode(4))));

        reqData.add(2, new ListNode(5, new ListNode(6)));
        reqData.add(3, new ListNode(5, new ListNode(4, new ListNode(9))));
        
        reqData.add(4, new ListNode(9));
        reqData.add(5, new ListNode(1, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))))))))));
    
        reqData.add(6, new ListNode(0, new ListNode(8, new ListNode(6, new ListNode(5, new ListNode(6, new ListNode(8, new ListNode(3, new ListNode(5, new ListNode(7))))))))));
        reqData.add(7, new ListNode(6, new ListNode(7, new ListNode(8, new ListNode(0, new ListNode(8, new ListNode(5, new ListNode(8, new ListNode(9, new ListNode(7))))))))));
    }

    @Override
    public void solve() {

        ListNode res = sol.addTwoNumbers(reqData.get(0), reqData.get(1));
        this.addResultToReport(res);

        res = sol.addTwoNumbers(reqData.get(2), reqData.get(3));
        this.addResultToReport(res);

        res = sol.addTwoNumbers(reqData.get(4), reqData.get(5));
        this.addResultToReport(res);

        res = sol.addTwoNumbers(reqData.get(6), reqData.get(7));
        this.addResultToReport(res);
    }

    @Override
    public void report() {
        System.out.println(this.report);
    }

    // Build report string
    private void addResultToReport(ListNode l) {
        this.report.append("**** next Result ****\n\n");
        this.report.append("\nListNode result = \n[");
        ListNode cur = l;
        do {
            this.report.append(cur.val + ((cur.next != null) ? "," : ""));
            cur = cur.next;
        } while (cur != null);
        this.report.append("]\n");
    }


    //////////////////

    public class Solution {

        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

            ListNode idx1 = l1, idx2 = l2;
            int carry = 0;
            StringBuilder sb = new StringBuilder();

            while (idx1 != null || idx2 != null || carry > 0) {

                int val1 = 0, val2 = 0;
                
                if (idx1 != null) {
                    val1 = idx1.val;
                    idx1 = idx1.next;
                }

                if (idx2 != null) {
                    val2 = idx2.val;
                    idx2 = idx2.next;
                }

                int sum = val1 + val2 + carry;
                int rem = sum % 10;
                sb.append(rem);
                carry = sum / 10;

                // System.out.println(sb.toString() + " Carry = " + carry);
            }

            return this.convertStrNumToList(sb.toString());
        }

        private ListNode convertStrNumToList(String n) {
            if (n.length() == 1) return new ListNode(Integer.valueOf(n));
            int head = Integer.valueOf(n.substring(0, 1));
            return new ListNode(head, this.convertStrNumToList(n.substring(1)));
        }
    }

    //////////////////
}


// Input: l1 = [2,4,3], l2 = [5,6,4]
// Output: [7,0,8]
// Explanation: 342 + 465 = 807.





