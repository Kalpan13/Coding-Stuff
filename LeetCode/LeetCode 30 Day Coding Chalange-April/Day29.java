/*
Title :   Binary Tree Maximum Path Sum
Link : https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/532/week-5/3314/
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
    int max_val = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        sum(root);
        return max_val;
    }
    public int sum(TreeNode root)
    {
        if(root==null)
            return 0;
        int lsum = Math.max(0,sum(root.left));
        int rsum = Math.max(0,sum(root.right));
        
        max_val = Math.max(max_val, lsum + rsum + root.val);
        return Math.max(lsum, rsum) + root.val;
       
    }
}


