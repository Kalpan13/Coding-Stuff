/*
    Problem No : 5
    TItle :   Longest Palindromic Substring
    Link : https://leetcode.com/problems/longest-palindromic-substring/
*/
class Solution {
    public String longestPalindrome(String s1) {
        int n = s1.length();
        if(n==0)
            return "";
        if(n==1)
            return s1;
        char s[] = s1.toCharArray();
        boolean dp [][] =new boolean[n][n];
        
        int maxLen = 1;
        int start = 0;
        for(int i=0;i<n;i++)
            dp[i][i]=true;
    
    
        for(int i=0;i<n-1;i++)
        {
            if(s[i]==s[i+1])
            {
                dp[i][i+1] = true;
                start = i;
                maxLen=2;
            }
        }
        for(int k=3;k<=n;k++)
        {
            for(int i=0;i<n-k+1;i++)
            {
                int j = i+k-1;
                
                if(dp[i+1][j-1] && s[i]==s[j])
                {
                    dp[i][j] = true;
                    if(k>maxLen)
                    {
                 start= i;
                    maxLen = k;
                    }
                }
            }
        }
        return s1.substring(start,start+maxLen);
    }
}