/*
Problem No : 108
Title : Convert Sorted Array to Binary Tree
Link : https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
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
    TreeNode root;
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0)
            return null;
        if(nums.length==1)
            return new TreeNode(nums[0]);
        
       TreeNode root= insertNode(nums,0,nums.length-1);
        return root;
    }
    public TreeNode insertNode(int[] nums,int low,int high)
    {
        if(low>high)
            return null;
        
        int mid = (high-low)/2 + low;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = insertNode(nums,low,mid-1);
        root.right = insertNode(nums,mid+1,high);
        
        return root;
    }
 }


 /* Idea

    Every Time divide the array into 2 equal parts. 
    The mid elements of the 2 subarrays will be the root nodes
    of all the elements belonging to that subtree corresponding 
    to that subarray.

    Example : [-10,-3,0,5,9,11] 

    Output :
     0
     / \
   -3   9
   /   / \
 -10  5   11

   0 will be root node for [-10,-3] and [5,9]
   Similarly 9 will be root node for [5] and [11]

*/
 