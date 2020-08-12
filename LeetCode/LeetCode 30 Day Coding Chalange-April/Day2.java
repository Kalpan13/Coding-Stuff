/* Happy Number
Link : https://leetcode.com/explore/featured/card/30-day-leetcoding-challenge/528/week-1/3284/
*/
class Solution {
    public boolean isHappy(int n) {
        int fast=n;
        int slow=n;
        do
        {
            slow = add_num(slow);
            fast = add_num(fast);
            fast = add_num(fast);
            if(fast==1)
            {
                return true;
            }
            
        }while(fast!=slow);
        return false;
    }
    public int add_num(int n)
    {
        int sum1=0;
        while(n>0)
        {
            int digit = n%10;
            sum1+=digit*digit;
            n/=10;
        }
        return sum1;
    }
}