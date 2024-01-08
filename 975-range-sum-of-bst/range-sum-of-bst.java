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
    static int sum=0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        sum=0;
        travers(root,low,high);
        return sum;
    }
    
    void travers(TreeNode root, int low, int high)
    {
        if(root!=null)
        {
            if(root.val>=low && root.val<=high)
            {
                sum=sum+root.val;
                System.out.println(root.val);           
            }
             travers(root.left,low,high);
             travers(root.right,low,high);
        }

       
    }
}