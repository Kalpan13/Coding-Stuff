/*
Title :   Subarray Sum Equals K
Link : https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/531/week-4/3307/
       or
       https://leetcode.com/problems/subarray-sum-equals-k/
*/
class Solution {
    public int subarraySum(int[] nums, int k) {
        
     Map<Integer, Integer> prevSum = new HashMap<>();
        
        int res = 0;
        int currSum = 0;
        prevSum.put(0, 1);
        
        for (int i=0; i<nums.length; i++) {
            currSum += nums[i];
        
            if (prevSum.containsKey(currSum-k)) {
                res += prevSum.get(currSum - k);  
            }
            
            Integer count = prevSum.get(currSum); 
            if (count == null) 
                prevSum.put(currSum, 1); 
            else
                prevSum.put(currSum, count+1);
        }
        return res;
     
    }
}

/*Idea

Create a Map of Prefix sum and number of times that sum is seen. <currSum,count>
If a map contains (curSum-k) as a key, add the corresponding value (or count) to result. 

k = 7
nums :     3    4    7     2     -3    1    4    2
currSum    3    7    14    16    13    14   18   20
curSum-k   -4   0    7     9     6     7    11   13      
Present :  0    1    1     0     0     1     0    1

Map Entries
<0,1>   (Base case, No elements visited)
<3,1>
<7,1>
<14,2>
<16,1>
<13,1>
<18,1>
<20,1>

*/