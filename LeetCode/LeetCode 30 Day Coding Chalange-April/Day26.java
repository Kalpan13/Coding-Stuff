/*
 Title :  Longest Common Subsequence
 Link : https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/531/week-4/3311/
*/
class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int len1= text1.length();
        int len2 = text2.length();
        int dp[][]= new int[len1+1][len2+1];
        
        char s1[] = text1.toCharArray();
        char s2[] = text2.toCharArray();
        for(int i=1;i<=len1;i++)
        {
            for(int j=1;j<=len2;j++)
            {
                if(i==0 || j==0)
                {
                    dp[i][j]=0;
                }
                if(s1[i-1]==s2[j-1])
                {
                    dp[i][j] = dp[i-1][j-1]+1;
                }
                else
                {
                    dp[i][j] =Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[len1][len2];   
    }
}
