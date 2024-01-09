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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> a=new ArrayList<>();
        List<Integer> b=new ArrayList<>();

        travers_a(root1,a);
        travers_a(root2,b);
        if(a.size()!=b.size())
            return false;
        boolean areEqual = a.equals(b);

        return areEqual;
        
    }
    static void travers_a(TreeNode root,List<Integer> a)
    {
        if(root!=null)
        {
            if(root.left==null && root.right==null)
                a.add(root.val);
            travers_a(root.right,a);
            travers_a(root.left,a);
        }
    }
}