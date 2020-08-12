/*
Title :   First Bad Version
Link : https://leetcode.com/explore/challenge/card/may-leetcoding-challenge/534/week-1-may-1st-may-7th/3316/
*/

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

/*Idea

	--> Simple Binary Search can be used to find the required number
*/
public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int low=1;
        int high=n;
        
        while(low<high)
        {
            int mid = (high-low)/2 + low;           //Finding mid by avoiding overflow.
            boolean mid_bad = isBadVersion(mid); 
            if(mid_bad)				    // Mid is having a BadVersion, hence, the smallest number having BadVersion will be <=mid
            {
                high = mid; 
            }
            else
            {
                low = mid+1;	                    // Mid is not having a BadVersion, hence, the smallest number having BadVersion will be >mid
            }
         }
        return low;
    }
}
