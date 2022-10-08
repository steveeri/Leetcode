"use strict";

const readBinaryWatch = (turnedOn: number): string[] => {
    if (turnedOn == 0) return ["0:00"];

    const res: string[] = [];
    for (let i = 0; i < 12; i++) {
        const hr = Number(i).toString(2);
        for (let j = 0; j < 60; j++) {
            const min = Number(j).toString(2);
            if ((hr.split("1").length-1 + min.split("1").length-1) == turnedOn) {
                res.push(`${i}:${(j < 10) ? '0'+j : j}`);
            }
        }
    }
    return res;
};


/// TESTS 

console.log(JSON.stringify(readBinaryWatch(0)), "\n");
console.log(JSON.stringify(readBinaryWatch(1)), "\n");
console.log(JSON.stringify(readBinaryWatch(2)), "\n");
console.log(JSON.stringify(readBinaryWatch(3)), "\n");
console.log(JSON.stringify(readBinaryWatch(4)), "\n");
console.log(JSON.stringify(readBinaryWatch(5)), "\n");
console.log(JSON.stringify(readBinaryWatch(6)), "\n");
console.log(JSON.stringify(readBinaryWatch(7)), "\n");
console.log(JSON.stringify(readBinaryWatch(8)), "\n");
console.log(JSON.stringify(readBinaryWatch(9)), "\n");


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