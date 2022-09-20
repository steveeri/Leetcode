package com.summerland.training;

import java.util.ArrayList;

public class AddBinary implements Problem {

    private Solution sol = new Solution();
    private ArrayList<String> reqData = new ArrayList<>();
    private StringBuilder report = new StringBuilder("Report: => \n");

    @Override
    public void prepare() {
    	reqData.add(0, "1010");
    	reqData.add(1, "1011");
    	
    	reqData.add(2, "11");
    	reqData.add(3, "1");
    }

    @Override
    public void solve() {
        String res = sol.addBinary(reqData.get(0), reqData.get(1));
        this.addResultToReport(reqData.get(0), reqData.get(1), res);

        res = sol.addBinary(reqData.get(2), reqData.get(3));
        this.addResultToReport(reqData.get(2), reqData.get(3), res);
    }

    @Override
    public void report() {
        System.out.println(this.report);
    }

    // Build report string
    private void addResultToReport(String bin1, String bin2, String sum) {
        this.report.append("**** next Result ****\n\n");
        this.report.append("\tBinary addition of Bin 1 = ( " + bin1 + " ) and Bin 2 ( " + bin2 + " ) => Result (" + sum + ")\n");
        this.report.append("\t\t\t" + bin1 + "\n");
        this.report.append("\t\t\t" + bin2 + "+\n");
        this.report.append("\t\t\t------------\n");
        this.report.append("\t\t\t" + sum + "\n\n");
    }

    //////////////////

    public class Solution {

        public String addBinary(String a, String b) {

            // Check base case for zero
            if (a.equals("0") && b.equals("0")) return "0";

            int ptrA = a.length() - 1;
            int ptrB = b.length() - 1;
            int carry = 0;
            StringBuilder res = new StringBuilder();

            while (ptrA >= 0 || ptrB >= 0 || carry > 0) {

                int val1 = 0, val2 = 0;
                
                if (ptrA >= 0) {
                    val1 = (a.charAt(ptrA) == '1') ? 1 : 0;
                    ptrA--;
                }

                if (ptrB >= 0) {
                    val2 = (b.charAt(ptrB) == '1') ? 1 : 0;
                    ptrB--;
                }

                int sum = val1 + val2 + carry;

                switch (sum) {
                    case 0:
                        res.append('0');
                        break;
                    case 1:
                    	res.append('1');
                        carry = 0;
                        break;
                    case 2:
                    	res.append('0');
                        carry = 1;
                        break;
                    case 3:
                    	res.append('1');
                        carry = 1;
                        break;
                    default:
                        break;
                }
            }

            return res.reverse().toString();
        }

    }

    //////////////////
//    record Point (int x, int y) {}

}

/*
    Example 1:

    Input: a = "11", b = "1"
    Output: "100"

    Example 2:

    Input: a = "1010", b = "1011"
    Output: "10101"
    

    Constraints:

    1 <= a.length, b.length <= 104
    a and b consist only of '0' or '1' characters.
    Each string does not contain leading zeros except for the zero itself.
*/


