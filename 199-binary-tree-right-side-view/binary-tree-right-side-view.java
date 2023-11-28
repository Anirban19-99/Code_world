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
    public List<Integer> rightSideView(TreeNode root) {
       List<Integer> ans=new ArrayList<>();
        if(root==null)
            return ans;
        int flag=0;
        Queue<TreeNode> q= new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            List<Integer> cur_ans=new ArrayList<>();
            int n=q.size();
            while(n>0)
            {
                TreeNode cur_node=q.remove();
                cur_ans.add(cur_node.val);
                if(cur_node.left!=null)
                    q.add(cur_node.left);
                if(cur_node.right!=null)
                    q.add(cur_node.right);     
                n--;
            }
            if(cur_ans.size()==1)
                ans.add(cur_ans.get(0));
            else
                ans.add(cur_ans.get((cur_ans.size())-1));
        }
        return ans;
    }
}