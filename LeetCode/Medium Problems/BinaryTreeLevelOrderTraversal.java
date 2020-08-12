/*
Problem : 102 
Title : Binary Tree Level Order Traversal
Link : https://leetcode.com/problems/binary-tree-level-order-traversal/
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
    List<List<Integer>> result = new ArrayList<List<Integer>>();
    public List<List<Integer>> levelOrder(TreeNode root) {
    
        createList(root,0);
        return result;
    }
    
    public void createList(TreeNode root,int rank)
    {
        if(root==null)
            return;
       
       if(result.size()<=rank)
       {
           List<Integer> tp_list = new ArrayList<Integer>();
           tp_list.add(root.val);
           result.add(tp_list);
       }
        else
        {
            result.get(rank).add(root.val);
        }
        createList(root.left,rank+1);
        createList(root.right,rank+1);
    }
    
}