/* 
   Number of Islands
   Link : https://leetcode.com/explore/featured/card/30-day-leetcoding-challenge/530/week-3/3302/
          or
          https://leetcode.com/problems/number-of-islands/
*/

class Solution {
    public int numIslands(char[][] grid) {
        int n = grid.length;
        if(n==0)
            return 0;
        int m = grid[0].length;
        if(m==0 && n==0)
            return 0;
        boolean visited [][] = new boolean[n][m];
        int cnt=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(!visited[i][j] && grid[i][j]=='1')
                {
                    cnt++;
                    dfs(i,j,visited,n,m,grid);
                }
                
            }
        }
        return cnt;
    }
    public void dfs(int i,int j,boolean visited[][],int n,int m,char[][] grid)
    {
        
        visited[i][j]=true;
        if (isSafe(i+1,j,n,m) && grid[i+1][j]=='1' && !visited[i+1][j])
            dfs(i+1,j,visited,n,m,grid);
        if (isSafe(i-1,j,n,m) && grid[i-1][j]=='1' && !visited[i-1][j])
            dfs(i-1,j,visited,n,m,grid);
        if (isSafe(i,j+1,n,m) && grid[i][j+1]=='1' && !visited[i][j+1])
            dfs(i,j+1,visited,n,m,grid);
        if (isSafe(i,j-1,n,m) && grid[i][j-1]=='1' && !visited[i][j-1])
            dfs(i,j-1,visited,n,m,grid);
        
        return;
        
    }
    public boolean isSafe(int i,int j,int len1,int len2)
    {
        return i<len1 && i>-1 && j<len2 && j>-1;
    }
}