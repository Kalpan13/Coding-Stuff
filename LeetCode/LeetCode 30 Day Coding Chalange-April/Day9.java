/*

Backspace String Compare

Link : https://leetcode.com/explore/featured/card/30-day-leetcoding-challenge/529/week-2/3291/
*/
class Solution {
    public boolean backspaceCompare(String S, String T) {
        String r1 = actStr(S);
        String r2 = actStr(T);
        if(r1.length()!=r2.length())
            return false;
        return r1.equals(r2);
    }
    
    public String actStr(String s)
    {
        Stack<Character> st = new Stack<Character>();
        char a[] =s.toCharArray();
        
        for(int i=0;i<s.length();i++)
        {
            if(a[i]!='#')
            {   
                st.push(a[i]);
            }
            else
            {
                if(!st.empty())
                    st.pop();
            }
        
        }
        return String.valueOf(st);
    }
}