/*
Diameter of Binary Tree
Link : https://leetcode.com/explore/featured/card/30-day-leetcoding-challenge/529/week-2/3293/
*/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    int max = 0;
    public int findDiameter(TreeNode node)
    {
        if(node==null)
            return 0;
        int lheight = findDiameter(node.left);
        int rheight = findDiameter(node.right);
        
        max = Math.max(max,lheight+rheight);
        return 1+Math.max(lheight,rheight);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        findDiameter(root);
        return max;
        
    }
}