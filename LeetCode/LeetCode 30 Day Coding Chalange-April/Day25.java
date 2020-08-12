/*

	Problem : Jump Game
	Link : https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/531/week-4/3310/
*/

class Solution {
    public boolean canJump(int[] nums) {
        if (nums == null || nums.length == 0)
            return false;
        
        for(int i=nums.length-2;i>=0;)
        {
            if(nums[i]==0)
            {
                int j=i-1;
                while(j>=0 && nums[j]<=i-j)
                    j--;
                if(j<0)
                    return false;
                i=j;
            }
            else
            {
                i--;
            }
           
        }
        return true;
	}	
}

/*
	Idea

	If an element is 0, then only there are chances of not reaching the final point.
	Hence,

	Start from end, if element == 0
					check if from any element before 0 this '0' can be skipped (or jumped) 
						if possible find next 0
						else return false;
					 
*/