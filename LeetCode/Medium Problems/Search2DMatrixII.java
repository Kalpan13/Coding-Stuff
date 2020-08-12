/*
    Problem No : 240
    Title : Search a 2D Matrix II
    Link : https://leetcode.com/problems/search-a-2d-matrix-ii/
*/

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length < 1 || matrix[0].length <1) {
            return false;
        }
        
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        if(rows==0 || cols==0)
            return false;
        
        int r = rows-1;
        int c = 0;
        while(r>=0 && c<cols)
        {
            if(matrix[r][c]>target)              //Current element > target. Hence, move upwards
            {                                    //As, all the elments in same row after the current element will be greater than target
                r--;
            }
            else if(matrix[r][c]<target)       // Current element < target. Hence, move right.
            {                                  // As, all the elments in same column before the current element will be lesser than target
                c++;
            }
            else
            {
                return true;
            }
        }
        return false;
    }
}