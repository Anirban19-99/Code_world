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
    class Pair {
    TreeNode node;
    long index;
    
    Pair(TreeNode _node, long _index) {
        this.node = _node;
        this.index = _index;
    }
}
    public int widthOfBinaryTree(TreeNode root) {
        Deque<Pair> q = new ArrayDeque<>();
        
        q.offer(new Pair(root, 0));
        
        long maxi = 0;
        
        while(!q.isEmpty()) {
            
            
            long leftChildIndex = q.getFirst().index;
            long rightChildIndex = q.getLast().index;
            maxi = Math.max(maxi, rightChildIndex - leftChildIndex + 1);
            
            int N  = q.size();
            
            while(N-- > 0) {
                
                Pair temp =  q.poll();
                TreeNode curr = temp.node;
                long idx = temp.index;
                
                if(curr.left != null){
                    q.offer(new Pair(curr.left, 2*idx+1));
                }
                
                if(curr.right != null){
                    q.offer(new Pair(curr.right, 2*idx+2));
                }
            }
        }
        return (int) maxi;
    }




}
    