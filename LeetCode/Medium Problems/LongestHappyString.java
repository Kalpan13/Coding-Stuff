/*
Problem : 1405
Title : Longest Happy String
Link : https://leetcode.com/problems/longest-happy-string/
*/

class Solution {
    
    public String longestDiverseString(int a, int b, int c) {
        
        
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>(
                (count1, count2) -> count2.count>count1.count?1:-1);

        if(a>0)
            pq.add(new Pair('a',a));
        if(b>0)
            pq.add(new Pair('b',b));
        if(c>0)
            pq.add(new Pair('c',c));
        
        StringBuilder ans = new StringBuilder();
        
        while(pq.size()>1)
        {
           Pair Pair1 = pq.poll();
            if(Pair1.count>=2)
            {
                ans.append(Pair1.key);
                ans.append(Pair1.key);
                Pair1.count-=2;
            }
            else
            {
                ans.append(Pair1.key);
                Pair1.count-=1;
            }
           Pair Pair2 = pq.poll();
            if(Pair2.count>=2 && Pair1.count<Pair2.count)
            {
                ans.append(Pair2.key);
                ans.append(Pair2.key);
                Pair2.count-=2;
            }
            else
            {
                ans.append(Pair2.key);
                Pair2.count-=1;
            }
            if(Pair1.count>=1)
                pq.add(new Pair(Pair1.key,Pair1.count));
            if(Pair2.count>=1)
                pq.add(new Pair(Pair2.key,Pair2.count));
        }
        if(pq.size()==1)
        {
            if(ans.charAt(ans.length()-1)!=pq.peek().key)
            {
                if(pq.peek().count>=2)
                {
                    ans.append(pq.peek().key);
                    ans.append(pq.peek().key);
                }
                else
                    ans.append(pq.peek().key);
            }
        }
        
        return ans.toString();
    }
}
 class Pair{
    char key;
    int count;
    
    public Pair(char key,int count)
    {
        this.key = key;
        this.count = count;
    }
    
}