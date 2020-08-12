/*
 Probme :   Majority Element
 Link : https://leetcode.com/explore/featured/card/may-leetcoding-challenge/534/week-1-may-1st-may-7th/3321/
*/

class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> hm = new HashMap();
        
        for(int i=0;i<nums.length;i++)
        {
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        System.out.println(hm);
        for(Integer key : hm.keySet())
        {
            int cnt = hm.get(key);
            if(cnt>(nums.length/2))
                return key;
        }
        return -1;
    }
}

/*
    Better Solution : Boyer-Moore Voting Algorithm
    Link : https://www.geeksforgeeks.org/majority-element/
*/