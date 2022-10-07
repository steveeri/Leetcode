package com.summerland.training;

import java.util.ArrayList;
import java.util.List;

public class BinaryWatch {

    public Solution sol = new Solution();

    public class Solution {
        public List<String> readBinaryWatch(int turnedOn) {
            
            List<String> res = new ArrayList<>();

            if (turnedOn == 0) {
                res.add("0:00");
                return res;   // Zero time no LEDs
            }

            for (int i = 0; i < 12; i++) {
                var hr1s = Integer.toBinaryString(i).chars().filter(c -> c == '1').count();
                for (int j = 0; j < 60; j++) {
                    var min1s = Integer.toBinaryString(j).chars().filter(c -> c == '1').count();
                    if (hr1s + min1s == turnedOn)
                        res.add(i + ":" + (j < 10 ? "0"+j : ""+j));
                }
            }
            return res;
        }
    }
    
}

/* 

A binary watch has 4 LEDs on the top to represent the hours (0-11), 
and 6 LEDs on the bottom to represent the minutes (0-59). 
Each LED represents a zero or one, with the least significant bit on the right.

For example, the below binary watch reads "4:51".

H  =   8  "4"  2  1                 PM / AM
M  =  "32"  "16"  8  4  "2"  "1"

    8  4  2  1      32  16  8  4  2  1
    0  0  0  0      0   0   0  0  0  0


Given an integer turnedOn which represents the number of LEDs that are currently on (ignoring the PM), 
return all possible times the watch could represent. You may return the answer in any order.

The hour must not contain a leading zero.

For example, "01:00" is not valid. It should be "1:00".
The minute must be consist of two digits and may contain a leading zero.

For example, "10:2" is not valid. It should be "10:02".
 
Example 1:
Input: turnedOn = 1
Output: ["0:01","0:02","0:04","0:08","0:16","0:32","1:00","2:00","4:00","8:00"]

Example 2:
Input: turnedOn = 9
Output: []
 
Constraints:
0 <= turnedOn <= 10

*/
