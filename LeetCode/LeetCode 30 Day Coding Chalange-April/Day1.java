/* Single Number
Link : https://leetcode.com/explore/featured/card/30-day-leetcoding-challenge/528/week-1/3283/
*/
class Solution {
    public int singleNumber(int[] nums) {
            HashMap<Integer,Integer> sn = new HashMap<Integer,Integer>();
            for(int i=0;i<nums.length;i++)
            {
                if(sn.get(nums[i])==null)
                {
                    sn.put(nums[i],1);
                }
                else if(sn.get(nums[i])==1)
                {
                    sn.remove(nums[i]);
                }
            }
        
        for(Integer key : sn.keySet())
        {
            return key;
        }
        return 0;
    }
}

/*
More Efficient Solution (Found from Discussion Forum)

     int k =0;
        for(Integer no : nums)
        {
            k^=no;
        }
        return k;
    
*/

