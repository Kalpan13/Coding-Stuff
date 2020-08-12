/*
Problem : 1404
Title : Number of Steps to Reduce a Number in Binary Representation to One
Link : https://leetcode.com/problems/number-of-steps-to-reduce-a-number-in-binary-representation-to-one/

*/

class Solution {
    public int numSteps(String s) {
        
        if(s.equals("1") || s.equals("0"))
            return 0;
        int cnt = 0;
        char c[] = s.toCharArray();
        for(int i=s.length()-1;i>0;)
        {
            if(c[i]=='0')
            { cnt++;
              i--;
            }
            else
            {
                cnt++;
                while(c[i]=='1' && i>0)
                {
                    i--;
                    cnt++;
                }
                if(i==0)
                    cnt++;
                c[i]='1';
            }
        }
        return cnt;
    }
}

/*Idea
 
 * When char is '0' just shift right --> 1 operation
 * When char is '1' add 1 to current number and carry will be added to first '0' after the current '1' (in reverse order)
 * Hence, all the '1's between current '1' and first '0' will be converted to '0' and will require 1 operation each (right shift)
*/