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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans= new ArrayList<>();
        TreeNode temp=root;
        pre_order(root,ans);
        return ans;
        
    }
    public static void pre_order(TreeNode root,List<Integer> ans)
    {
        if(root!=null)
        {
            ans.add(root.val);
            pre_order(root.left,ans);
            pre_order(root.right,ans);

        }
    }

}