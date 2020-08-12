/*

Title : Valid Parenthesis String
Link : https://leetcode.com/problems/valid-parenthesis-string/
	   or
	   https://leetcode.com/explore/featured/card/30-day-leetcoding-challenge/530/week-3/3301/ 
*/

/* Using Balance Variable */

class Solution {
    public boolean checkValidString(String s) {
        
       int balance =0;
       char c[] = s.toCharArray();
       int n = c.length;
        for(int i=0;i<n;i++)
        {
            if(c[i]==')')
                balance--;
            else
                balance++;
            if(balance<0)
                return false;
        }
        balance = 0;
         for(int i=n-1;i>=0;i--)
        {
            if(c[i]=='(')
                balance--;
            else
                balance++;
            if(balance<0)
                return false;
        }
        return true;
    }
}

/* Using Stacks */
class Solution_stacks {
    public boolean checkValidString(String s) {
        
        Stack<Integer> leftp = new Stack<Integer>();
        Stack<Integer> star = new Stack<Integer>();
       
        int star_cnt =0;
        char ca[] = s.toCharArray();
        
        for(int i=0;i<ca.length;i++)
        {
            if(ca[i]=='*')
                star.push(i);
            else if(ca[i]=='(')
                leftp.push(i);
            else
            {
                if(!leftp.isEmpty())
                    leftp.pop();
                else if(!star.isEmpty())
                    star.pop();
                else
                    return false;
            }      
        }
        if(leftp.isEmpty())
            return true;
        while(!leftp.isEmpty())
        {
            if(star.isEmpty() || leftp.pop()>star.pop())
                return false;
        }
        return true;
      }
}


