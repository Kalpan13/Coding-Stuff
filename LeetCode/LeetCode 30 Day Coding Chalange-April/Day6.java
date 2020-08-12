/*  Group Anagrams 
    Link : https://leetcode.com/explore/featured/card/30-day-leetcoding-challenge/528/week-1/3288/  */

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;
        HashMap<String,List> hm = new HashMap<String,List>();
        int tpar[] = new int[n];
        for(int i=0;i<n;i++)
        {
           char ar[] = strs[i].toCharArray();
           Arrays.sort(ar);
           String key = String.valueOf(ar);
            
           if(!hm.containsKey(key))
               hm.put(key,new ArrayList());
           hm.get(key).add(strs[i]); 
        }
        return new ArrayList(hm.values());    
    }
}
