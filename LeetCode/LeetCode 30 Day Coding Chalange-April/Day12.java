/*

Last Stone Weight
Link : https://leetcode.com/explore/featured/card/30-day-leetcoding-challenge/529/week-2/3297/
*/

class Solution {
    
    PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
    public int lastStoneWeight(int[] stones) {
        
        for(int i=0;i<stones.length;i++)
        {
            pq.add(stones[i]);
        }
        
        while(pq.size()>1)
        {
            int max1=pq.poll();
            int max2=pq.poll();
            
            if(max1-max2!=0)
                pq.add(max1-max2);
        }
        
        if(pq.size()==0)
            return 0;

        return pq.poll();
    }
}
