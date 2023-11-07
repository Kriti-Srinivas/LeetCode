/*Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

 

Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0] */

class Solution {
    public void moveZeroes(int[] nums) {
        int lp=0, rp=0;
        while(rp<nums.length){
            if(nums[rp]!=0){
                int t=nums[lp];
                nums[lp]=nums[rp];
                nums[rp]=t;
                lp++;
            }
            rp++;
        }
    }
}