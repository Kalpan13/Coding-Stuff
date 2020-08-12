/*
    Problem :   Number Complement
    Link : https://leetcode.com/explore/featured/card/may-leetcoding-challenge/534/week-1-may-1st-may-7th/3319/
*/
class Solution {
    public int findComplement(int N) {
        if (N == 0) return 1;
        if (N == 1) return 0;
        int temp_N = N;
        int x = 1;
        while(temp_N>0)   /* Finding the power of 2 number >= N  */
        {
            temp_N>>=1;
            x<<=1;
        }
        return N ^ (x-1);  //Take XOR
    }    
}

/*
    Idea 

    Find the power of 2 number (x) which is >=  given number (N) when represented in Binary Form.
    For example 
    For N = 5 -> 101,  x = 8 -> 1000

      N : 5   0 1 0 1
    x-1 : 7   0 1 1 1
   -------------------
    XOR : 2   0 0 1 0
*/