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
 import java.util.Collections;
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
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
            if(flag==1){
                    flag=0;
                    Collections.reverse(cur_ans);
                }
            else if(flag==0)
            {
                flag=1;
            }
                
            ans.add(cur_ans);
        }
        return ans;
    }
}