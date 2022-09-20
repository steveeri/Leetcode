package com.summerland.training;

import java.util.HashMap;
import java.util.Map;

public class MultiplyTwoStrings {

    public Solution sol = new Solution();

    //////////////////

    public class Solution {
        public String multiply(String num1, String num2) {
            
            if (num1.equals("0") || num2.equals("0")) return "0";

            int idx1 = num1.length() - 1;
            int idx2 = num2.length() - 1;
            int offset = 0;
            Map<Integer,Integer> cols = new HashMap<>();
            
            for (int i = idx2; i >= 0; i--) {
                int multiplier = Integer.valueOf("" + num2.charAt(i));
                int colIdx = 0;
                int colVal = 0;
                int carry = 0;

                for (int j = idx1; j >= 0; j--) {
                    // calculate index and get current value a tht at that index;
                    if (j == idx1)
                        colIdx += offset;
                        
                    int num = Integer.valueOf("" + num1.charAt(j));
                    int sum = ((multiplier * num) + carry);
                    int colDigit = sum % 10;
                    carry = sum / 10;
                    
                    colVal = cols.get(colIdx) != null ? cols.get(colIdx) : 0;
                    cols.put(colIdx, colVal + colDigit);

                    colIdx++;
                }

                if (carry > 0) {
                    colVal = cols.get(colIdx) != null ? cols.get(colIdx) : 0;
                    cols.put(colIdx, colVal + carry);
                }

                offset++;
            }

            // Build returning sum of product expressions.
            String sumStr = "";
            int carry = 0;
            for (int i = 0; i < cols.size(); i++) {
                int colVal = cols.get(i) != null ? cols.get(i) : 0;
                int sumVal = colVal + carry;
                sumStr = (sumVal % 10) + sumStr;
                carry = sumVal / 10;
            }

            if (carry > 0) 
                sumStr = carry + sumStr; 

            return sumStr;
        }
    }

    //////////////////
}


// Example 1:

// Input: num1 = "2", num2 = "3"
// Output: "6"
// Example 2:

// Input: num1 = "123", num2 = "456"
// Output: "56088"
 

// Constraints:

// 1 <= num1.length, num2.length <= 200
// num1 and num2 consist of digits only.
// Both num1 and num2 do not contain any leading zero, except the number 0 itself.




