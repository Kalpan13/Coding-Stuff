/*
 Title : Contiguous Array
Link : https://leetcode.com/explore/featured/card/30-day-leetcoding-challenge/529/week-2/3298/

*/
/* Input
   [0,0,1,1,0,1,1,1]
   Output 
   6 
Explaination : The subarray is : [0,0,1,1,0,1]    

*/
public class Solution {
    public int findMaxLength(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) nums[i] = -1;
        }
        
        Map<Integer, Integer> sumToIndex = new HashMap<>();
        sumToIndex.put(0, -1);
        int sum = 0, max = 0;
        
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sumToIndex.containsKey(sum)) {
                max = Math.max(max, i - sumToIndex.get(sum));
            }
            else {
                sumToIndex.put(sum, i);
            }
        }
        
        return max;
    }
}

/*
Idea

Maintain a prefix sum and corresponding index in HashMap
whenever the same sum as already stored sum is encounterd, 
calculate the distance between current and the stored index(corresponding to sum)

Same prefix sum denotes same number of 1s and 0s in that subarray
*/


