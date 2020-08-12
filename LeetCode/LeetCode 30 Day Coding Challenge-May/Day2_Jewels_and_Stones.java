/*
Problem:  Jewels and Stones
Link : https://leetcode.com/explore/featured/card/may-leetcoding-challenge/534/week-1-may-1st-may-7th/3317/
*/

class Solution {
    public int numJewelsInStones(String J, String S) {
        boolean letter[]=new boolean[52];                // Create an array of size 52 (26-Lower Case, 26-Upper Case)
        	                                         	// to store the presence/absent of a character in J
        for(int i=0;i<J.length();i++)
        {
            if(J.charAt(i)>='a')
            {
                letter[J.charAt(i)-'a'+26] = true;		//Marking true for a Lower Case letter
            }
            else
            {
                letter[J.charAt(i)-'A'] = true;        //Marking true for an Upper Case letter
            }
        }
        int cnt = 0;
        for(int i=0;i<S.length();i++)
        {
            if(S.charAt(i)>='a')						
            {
                if(letter[S.charAt(i)-'a'+26])			//Checking if the letter exist in Array
                    cnt++;
            }
            else
            {
                if(letter[S.charAt(i)-'A'])			   //Checking if the letter exist in Array
                 cnt++;
            }
        }
        return cnt;
    }
}

