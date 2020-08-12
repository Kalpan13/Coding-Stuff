/* Move Zeroes
Link : https://leetcode.com/explore/featured/card/30-day-leetcoding-challenge/528/week-1/3286/
*/

class Solution {
    public void moveZeroes(int[] nums) {
        int cnt = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
                nums[cnt++] = nums[i];
        }
        for(int i=cnt;i<nums.length;i++)
        {
            nums[i]=0;
        }
    }
}
