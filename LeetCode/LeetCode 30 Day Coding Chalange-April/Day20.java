/*
Problem :  Construct Binary Search Tree from Preorder Traversal
 
Link : https://leetcode.com/explore/featured/card/30-day-leetcoding-challenge/530/week-3/3305/
       or 
       https://leetcode.com/problems/construct-binary-search-tree-from-preorder-traversal/
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
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root = new TreeNode(preorder[0]);
        TreeNode tp = root;
        for(int i=1;i<preorder.length;i++)
        {
            TreeNode tp1 = insert(preorder[i],tp);
        }
        return tp;
    }
    public TreeNode insert(int value,TreeNode root)
    {
        if(root == null)
            return new TreeNode(value);
        if(value<root.val)
            root.left = insert(value,root.left);
        else
            root.right=insert(value,root.right);
        return root;
    }
}
