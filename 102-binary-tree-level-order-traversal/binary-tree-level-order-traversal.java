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
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> ans= new ArrayList<>();
        if(root==null)
        {
            return ans; 
        }
        Queue<TreeNode> q= new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty())
        {
            List<Integer> cur=new ArrayList<>();
            int size=q.size();
            while(size>0)
            {
                TreeNode cur_node=q.poll();
                int val=cur_node.val;
                cur.add(val);
                if(cur_node.left!=null)
                    q.add(cur_node.left);
                if(cur_node.right!=null)
                    q.add(cur_node.right);
                size--;
            }
            ans.add(cur);
        }

        return ans;

        
    }
}