/*
Problem : Minimum Path Sum
Link : https://leetcode.com/explore/featured/card/30-day-leetcoding-challenge/530/week-3/3303/
       or 
       https://leetcode.com/problems/minimum-path-sum/
*/
class Solution {
    public int helper(int[][] dp,int i,int j,int[][] grid)
    {
        if(i==0 && j==0)
            return grid[i][j];
        if(i<0 || j<0)
            return Integer.MAX_VALUE;
        if(dp[i][j]>0)
            return dp[i][j];
        else
        {
            dp[i][j] = Math.min(helper(dp,i-1,j,grid),helper(dp,i,j-1,grid)) +grid[i][j];
            return dp[i][j];
        }
        
    }
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int dp[][] = new int[m][n];
        return helper(dp,m-1,n-1,grid);
    }
    
}