/*
Problem No : 1424
Title : Diagonal Traverse II
Link : https://leetcode.com/problems/diagonal-traverse-ii/
*/

/*
Input: nums = [[1,2,3],[4,5,6],[7,8,9]]
Output: [1,4,2,7,5,3,8,6,9]
*/

/*
    Idea
    The elements can be conbined based on the sum of indices. 
    2--> (0,1) => sum = 1
    4--> (1,0) => sum = 1
    
    7--> (2,0) => sum = 2
    5--> (1,1) => sum = 2
    3--> (0,2) => sum = 2

    etc.
*/ 
class Solution {
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
     
        Map<Integer,List<Integer>> map = new HashMap();     // Create a Map for storing elements in a List
        int rowc = 0;
        int elec=0;
        int max_sum=0;
        for(List<Integer> list:nums)
        {
            
            for(int i=0;i<list.size();i++)
            {
                max_sum = Math.max(max_sum,i+rowc);
                if(map.containsKey(i+rowc))
                {
                    
                    List<Integer> tp = map.get(i+rowc);
                    tp.add(0,list.get(i));
                    map.put(i+rowc,tp);
                }
                else
                {
                    List<Integer> tp = new ArrayList<Integer>();
                    tp.add(list.get(i));
                    map.put(i+rowc,tp);
                }
                elec++;
            }
            rowc++;
        }
        int ans[] = new int[elec];
        int cnt=0;
        for(int i=0;i<=max_sum;i++)
        {
            List<Integer> tp = map.get(i);
            for(Integer j:tp)
            {
                ans[cnt++]= j;
            }
        }
    return ans;
    }
    public void printList(List<Integer> list)
    {
        for(int i=0;i<list.size();i++)
        {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }
}