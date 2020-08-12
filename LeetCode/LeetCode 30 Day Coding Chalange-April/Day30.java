/*
Title :   Check If a String Is a Valid Sequence from Root to Leaves Path in a Binary Tree
Link: https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/532/week-5/3315/
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
    public boolean isValidSequence(TreeNode root, int[] arr) {
       boolean result= checkval(root,0,arr);
    return result;
    }
    public boolean checkval(TreeNode root,int i,int arr[])
    {
        if(root==null)
            return false;
        if(i==arr.length)
            return true;
        if(root.val==arr[i])
        {
            boolean r=false,l=false;
            if(root.right==null && root.left==null && i==arr.length-1)
                return true;
            if(i==arr.length-1)
                return false;
            if(root.right!=null)
                r =  checkval(root.right,i+1,arr);
            if(root.left!=null)
                l = checkval(root.left,i+1,arr);
            return r||l;
        }
        else
        {
            return false;
        }
    }
    
}