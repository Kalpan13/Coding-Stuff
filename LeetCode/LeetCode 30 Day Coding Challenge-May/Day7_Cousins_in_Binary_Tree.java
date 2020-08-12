/*

 Problem :   Cousins in Binary Tree
 Link : https://leetcode.com/explore/featured/card/may-leetcoding-challenge/534/week-1-may-1st-may-7th/3322/
*/
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    int x_depth=-1;
    int x_parent;
    int y_depth=-1;
    int y_parent;
    public boolean isCousins(TreeNode root, int x, int y) {
       
        TreeNode tp1 = root;
        checkCousins(root,x,y,0,tp1.val);
      
        if(x_depth!=-1 && y_depth!=-1 && x_depth==y_depth && x_parent!=y_parent)
            return true;
        return false;
    }
    public void checkCousins(TreeNode root,int x,int y,int depth,int parent)
    {
        if(root==null)
            return;
        if(root.val==x)          // Root value equal to x => set depth and parent
        {
            x_depth = depth;
            x_parent = parent;
            return;
        }   
        else if(root.val==y)    // Root value equal to y => set depth and parent
        {
            y_depth = depth;
            y_parent = parent;
            return;
        }
        
        checkCousins(root.right,x,y,depth+1,root.val);   //Check for right child
        checkCousins(root.left,x,y,depth+1,root.val);   //Check for right child
    }
}