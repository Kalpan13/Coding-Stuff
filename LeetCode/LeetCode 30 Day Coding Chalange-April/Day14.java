/*
Problem :   Perform String Shifts
Link : https://leetcode.com/explore/featured/card/30-day-leetcoding-challenge/529/week-2/3299/
*/
/*

* Input: s = "abcdefg", shift = [[1,1],[1,1],[0,2],[1,3]]
* Output: "efgabcd"
* Explanation:  
*      [1,1] means shift to right by 1. "abcdefg" -> "gabcdef"
*      [1,1] means shift to right by 1. "gabcdef" -> "fgabcde"
*      [0,2] means shift to left by 2. "fgabcde" -> "abcdefg"
*      [1,3] means shift to right by 3. "abcdefg" -> "efgabcd"

*/
class Solution {
    public String stringShift(String s, int[][] shift) {
        int shift_count =0;
        for(int i=0;i<shift.length;i++)
        {
            if(shift[i][0]==1)
                shift_count+=shift[i][1];
            else
                shift_count-=shift[i][1];
        }
        shift_count = shift_count%s.length();
        
        if(shift_count==0)
            return s;
        char c[] = s.toCharArray();
        if(shift_count<0)
        {
            shift_count = c.length+shift_count;
        }
        reverseArray(c,0,c.length-1);
        reverseArray(c,0,shift_count-1);
        reverseArray(c,shift_count,c.length-1);
        
     return new String(c);   
    }
    
    public void reverseArray(char c[],int st, int end)
    {
        while(st<end)
        {
         char tp = c[st];
         c[st] = c[end];
         c[end] = tp;  
         st++;
         end--;
        }
    }
}
