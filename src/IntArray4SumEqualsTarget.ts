"use strict";

const fourSum = (nums: number[], target: number): number[][] => {

    // Some working variables
    let numsMap = new Map<number,number>();
    let flatNums: number[] = [];

    // Remove all unnecessary duplicate values 4-of-each is the max we need.
    for (let i = 0; i < nums.length; i++) {
        const cnt = !!numsMap.get(nums[i]) ? numsMap.get(nums[i])! : 0;
        if (cnt < 4) {
            flatNums.push(nums[i]);
            numsMap.set(nums[i], cnt+1);
        }
    }
    numsMap.clear();

    // Sort list and capture context values
    flatNums = flatNums.sort((a,b) => a - b);
    let nLen: number = flatNums.length;
    const max = flatNums[nLen-1];
    const min = flatNums[0];

    let resMap = new Map<string, number[]>();

    // A reducing bubble-sort styles routine
    for (let i = 0; i < nLen; i++) {
        for (let j = i+1; j < nLen; j++) {
            for (let k = j+1; k < nLen; k++) {
                for (let l = k+1; l < nLen; l++) {
                    const sum = flatNums[i] + flatNums[j] + flatNums[k] + flatNums[l];
                    if (sum == target) {
                        const item = [flatNums[i], flatNums[j], flatNums[k], flatNums[l]].sort((a,b) => a - b);
                        const key = item.toString();
                        if (!resMap.has(key)) resMap.set(key, item);
                    }
                    if (sum >= target) l = nLen;
                }
            }
        }
    }
    return [...resMap.values()];
};

export default fourSum;


/// TESTS 

console.log(JSON.stringify(fourSum([1,0,-1,0,-2,2], 0)));

/* 

18. 4Sum - Medium

Given an array nums of n integers, return an array of all the unique quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:

0 <= a, b, c, d < n
a, b, c, and d are distinct.
nums[a] + nums[b] + nums[c] + nums[d] == target
You may return the answer in any order.

Example 1:
Input: nums = [1,0,-1,0,-2,2], target = 0
Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]

Example 2:
Input: nums = [2,2,2,2,2], target = 8
Output: [[2,2,2,2]]
 
Constraints:
1 <= nums.length <= 200
-109 <= nums[i] <= 109
-109 <= target <= 109

*/