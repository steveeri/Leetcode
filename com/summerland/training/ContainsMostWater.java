package com.summerland.training;

public class ContainsMostWater {

    public final Solution sol = new Solution();
 
    public class Solution {
        public int maxArea(int[] height) {
            
        	int water = 0;
        	int idxL = 0;
        	int idxR = height.length - 1;

            while (idxL < idxR) {
            	int hL = height[idxL];
            	int hR = height[idxR];
            	int maxHeight = hL < hR ? hL : hR;
            	int tmpVol = maxHeight * (idxR - idxL);
            	
            	if (tmpVol > water)
            		water = tmpVol;
            	
            	if (hL > hR) 
					idxR--;
            	else 
					idxL++;
            }
            
            return water;
        }
    }

}
