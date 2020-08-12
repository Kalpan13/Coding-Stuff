/*

Problem : 48
Title : Rotate Image
Link : https://leetcode.com/problems/rotate-image/
*/

/*
Input = 
[
  [1,2,3],
  [4,5,6],
  [7,8,9]
],

Output:
[
  [7,4,1],
  [8,5,2],
  [9,6,3]
]
*/

class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        
        int front = 0;
        int end = n-1;
        while(front<end)
        {
            for(int j=0;j<n;j++)
            {
                swap(front,j,end,j,matrix);
            }
            front++;
            end--;
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                swap(i,j,j,i,matrix);
            }
        }
        
    }
    public void printMat(int[][] matrix)
    {
        int n = matrix.length;
         for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(matrix[i][j]+ " ");
            }
        System.out.println();
        }
        
    }
    public void swap(int i1,int j1,int i2,int j2,int[][] a)
    {
        int tp = a[i1][j1];
        a[i1][j1] = a[i2][j2];
        a[i2][j2]=tp;
    }
}



/*
Idea : 

/*
 * clockwise rotate
 * first reverse up to down, then swap the symmetry 
 * 1 2 3     7 8 9     7 4 1
 * 4 5 6  => 4 5 6  => 8 5 2
 * 7 8 9     1 2 3     9 6 3
*/


/*
 * anticlockwise rotate
 * first reverse left to right, then swap the symmetry
 * 1 2 3     3 2 1     3 6 9
 * 4 5 6  => 6 5 4  => 2 5 8
 * 7 8 9     9 8 7     1 4 7
*/

