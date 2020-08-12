/*
Title :   Maximal Square
Link: https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/531/week-4/3312/
*/


class Solution {
    public int maximalSquare(char[][] matrix) {
        if(matrix.length==0)
            return 0;
        int m=matrix.length,n=matrix[0].length;
        
        int dp[][] = new int[m][n];
        int maxsquare=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==0 || j == 0)
                {
                    dp[i][j] = matrix[i][j]-'0';
                   maxsquare = Math.max(dp[i][j],maxsquare);
                }
                else
                {
                    if(matrix[i][j]=='1')
                    {
                        dp[i][j] = Math.min(Math.min(dp[i-1][j-1],dp[i-1][j]),dp[i][j-1])+1;
                        maxsquare = Math.max(dp[i][j],maxsquare);
                    }                           
                }
            }
        }
        return maxsquare*maxsquare;
    }
}


