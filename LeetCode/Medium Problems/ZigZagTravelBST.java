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
    List<List<Integer>> ans;
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        ans = new ArrayList<List<Integer>>();
        ZigZag(root,0);
        return ans;
    }
    public void ZigZag(TreeNode root,int depth)
    {
        if(root==null)
            return;
        if(ans.size()<depth+1)
        {
            List<Integer> newLevel = new ArrayList<Integer>();
            ans.add(newLevel);
        }
        List<Integer> level = ans.get(depth);
        if(depth%2==0)
            level.add(root.val);
        else
            level.add(0,root.val);
        
        ZigZag(root.left,depth+1);
        ZigZag(root.right,depth+1);
        
    }
}