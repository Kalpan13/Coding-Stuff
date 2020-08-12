/*
Problem :   Check If It Is a Straight Line
Link : https://leetcode.com/explore/featured/card/may-leetcoding-challenge/535/week-2-may-8th-may-14th/3323/
*/

class Solution {
    public boolean checkStraightLine(int[][] co) {
        int n = co.length;
        if(n<3)                     //Any 2 points will be colinear 
            return true;
        int dx = co[0][0] - co[1][0];
        int dy = co[0][1] - co[1][1];
        for(int i=2;i<n;i++)
        {
            if(dx*(co[i][1]-co[1][1]) != dy * (co[i][0]-co[1][0]))
                return false;
        }
        return true;
    }
}


/* Idea
	
	slop of a line :   (dy/dx) = (y1 - y0) / (x1 - x0)
	
	For any point (x,y) to be on the line :  (y - y1) = (dy / dx) (x - x1)

	To avoid division by 0  : (y-y1)*(dx) = (y-y1)*(x-x1)
*/

	