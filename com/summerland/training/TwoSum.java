package com.summerland.training;

import java.util.HashMap;
import java.util.Vector;

public class TwoSum implements Problem {

    private Solution sol = new Solution();
    private Vector<Object> reqData = new Vector<>();
    private StringBuilder report = new StringBuilder("Report: => \n");

    @Override
    public void prepare() {
        reqData.add(0, new int[]{2,22,11,7,15});
        reqData.add(1, 9);
    }

    @Override
    public void solve() {
        int[] res = sol.twoSum((int[])reqData.get(0), (int)reqData.get(1));
        this.report.append("values are {" + res[0] + ", " + res[1] + "}");
    }

    @Override
    public void report() {
        System.out.println(this.report);
    }

    //////////////////

    public class Solution {

        public int[] twoSum(int[] nums, int target) {
    
            HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    
            // Base condition is first isn't a match, just store
            map.put(target - nums[0], 0);
    
            // Start checking from second array item until the end
            int n = nums.length;
            for (int i = 1; i < n; i++) {
                if (map.containsKey(nums[i])) {
                    return new int[]{map.get(nums[i]), i};
                }
                map.put(target - nums[i], i);
            }
    
            return new int[]{0,0};
        }
        
    }


    ///////////////////
    
}


/*
    Example 1:

    Input: nums = [2,7,11,15], target = 9
    Output: [0,1]
    Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
    Example 2:

    Input: nums = [3,2,4], target = 6
    Output: [1,2]
    Example 3:

    Input: nums = [3,3], target = 6
    Output: [0,1]
    

    Constraints:

    2 <= nums.length <= 104
    -109 <= nums[i] <= 109
    -109 <= target <= 109
    Only one valid answer exists.

*/