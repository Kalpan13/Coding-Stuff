/**
 * Problem : 101
 * Title : Symetric Tree
 * Link : https://leetcode.com/problems/symmetric-tree/
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
    public boolean isSymmetric(TreeNode root) {
        
        return isMirror(root,root);
    }
    public boolean isMirror(TreeNode node1,TreeNode node2)
    {
        if(node1==null && node2==null)
            return true;
        
        if(node1!=null && node2!=null && node1.val == node2.val)
        {
            return isMirror(node1.left,node2.right) && isMirror(node1.right,node2.left);
        }
        return false;
    }
}

/*
   *  Symetric 

        1
       / \
      2   2
     / \ / \
    3  4 4  3


   *  Not Symetric 

        1
       / \
      2   2
       \   \
       3    3

*/

/* Idea 

 * For 2 trees to be symetric of eachother, 3 conditions must hold.
   1. Root node's keys must be same (node1.val == nod2.val)
   2. left subtree of left tree and right subtree of right tree must be mirror images
   3. right subtree of left tree and left subtree of left tree must be mirror images

*/