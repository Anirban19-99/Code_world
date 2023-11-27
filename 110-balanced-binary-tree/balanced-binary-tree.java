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
    public boolean isBalanced(TreeNode root) {
        int a=height(root);
        if(a<0)
            return false;
        else
            return true;
        
    }
    static int height(TreeNode root)
    {
        if(root==null)
            return 0;
    
        int left_height=height(root.left)+1;
        int right_height=height(root.right)+1;
        if(left_height>right_height+1 || left_height<right_height-1)
            {left_height=-999999;
            right_height=-999999; }
        return Math.max(left_height,right_height);
    }
}