/*
Title :   Bitwise AND of Numbers Range
Link : https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/531/week-4/3308/
	   or
	   https://leetcode.com/problems/bitwise-and-of-numbers-range/
*/


class Solution {
    public int rangeBitwiseAnd(int m, int n) {
        int i = 0;
        while(m < n){ 
            m >>= 1;
            n >>= 1;
            i++;
        }
        return m << i;
    }
}

/* 
Idea

This problem requires us to find a regular pattern in the bits
for example let m=24 and n=30

11000
11001
11010
11011
11100
11101
11110

Here, we discard all the bits until m==n. 

Because we are trying to find bitwise AND, if for any bit there is at least one 0 in the range of all the numbers, 
that digit will be 0. 

Hence, in this case, the right shifting operation will be performed 3 times, 
after that m=3 and n=3 (11).
Hence, AND operation will result in remaining m << no. shifts done. 

*/
 

 