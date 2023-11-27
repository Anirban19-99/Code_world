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
    static int max=Integer.MIN_VALUE;
    public int diameterOfBinaryTree(TreeNode root) {
        max=Integer.MIN_VALUE;
        height(root);
        return max;
    }
    int height(TreeNode root)
    {
        if(root==null)
            return 0;
        int left_height=height(root.left);
        int right_height=height(root.right);
        int total_distance=left_height+right_height;
        if(total_distance>max)
        {   
            max=total_distance; 
        }
        return 1+Math.max(left_height,right_height);

    }

}