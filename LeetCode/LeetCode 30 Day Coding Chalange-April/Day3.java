/* Maximum Subarray
   Link https://leetcode.com/explore/featured/card/30-day-leetcoding-challenge/528/week-1/3285/ 
*/


/*Simple Kadane's Algorithm */

class Solution {
    public int maxSubArray(int[] nums) {
        int maxsofar=Integer.MIN_VALUE;
        int maxending = 0;
    
        for(int i=0;i<nums.length;i++)
        {
            maxending = maxending+nums[i];
            
            if(maxsofar<maxending)
            {
                maxsofar = maxending;
            }
            if(maxending<0)
                maxending = 0;
        }
        return maxsofar;
    }
}