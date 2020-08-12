/*
Problem : Search in Rotated Sorted Array

Link :https://leetcode.com/explore/featured/card/30-day-leetcoding-challenge/530/week-3/3304/ 
      or 
      https://leetcode.com/problems/search-in-rotated-sorted-array/
*/

class Solution {
    public int search(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        if(nums.length==0)
            return -1;
        if(nums.length==1)
        {
            return nums[0]==target?0:-1;
        }
        while (low < high) {
            
            int mid = low + (high - low) / 2;
            if (target == nums[mid])
                return mid;
         
            if(nums[mid]>=nums[low])
            {
                if(target>=nums[low]&&target<nums[mid])
                    high = mid-1;
                else
                    low = mid+1;
            }else
            {
                if(target>nums[mid]&&target<=nums[high])
                   low = mid+1;
                else
                    high = mid-1;
            }
        }
        return nums[low]==target?low:-1;
    }
}