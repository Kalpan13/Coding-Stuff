/*
	Title :  Leftmost Column with at Least a One
	Link :   https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/530/week-3/3306/

*/

/**
 * // This is the BinaryMatrix's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface BinaryMatrix {
 *     public int get(int x, int y) {}
 *     public List<Integer> dimensions {}
 * };
 */

class Solution {
    public int leftMostColumnWithOne(BinaryMatrix binaryMatrix) {
        
        List<Integer> dims = binaryMatrix.dimensions();
        int rows = dims.get(0);
        int cols = dims.get(1);
        
        int x=0;
        int y=cols-1;
        while(x<rows && y>=0)
        {
            int num = binaryMatrix.get(x,y);
            if(num==1)
                y--;
            else 
                x++;
        }
        return y!=cols-1?y+1:-1;
    }
}

/*
Idea 

Start from Top-Right Corner

	if cur_point == 1
		check previour column
	else
		check next row

Repeat the previous steps untill x==rows or y<0

*/