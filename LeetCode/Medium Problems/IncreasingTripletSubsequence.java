/*
    Problem No : 334
    Title : Increasing Triplet Subsequence
    Link : https://leetcode.com/problems/increasing-triplet-subsequence/
*/

/*
    Input: [1,2,3,4,5]
    Output: true

    Input: [5,4,3,2,1]
    Output: false
*/
class Solution {
    public boolean increasingTriplet(int[] nums) {
        Integer num1 = Integer.MAX_VALUE;
        Integer num2 = Integer.MAX_VALUE;
        
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<=num1)
            {
                num1 = nums[i];
            }
            else if(nums[i]<=num2)
            {
                num2 = nums[i];
            }
            else 
            {
                return true;
            }
        }
        return false;
    }
}
/*
Assume we found one number A and another number B that is larger than A. 
If we could find a third number C that is larger than B, we can return a true. 
So the problem becomes how to update A and B to make them ready for C to be discovered.
Now the process becomes simple and clear, keep updating A to be the minimum value ever visited and keep B being the smallest value that is larger than A. 
Once C > B is encountered, return true;
*/