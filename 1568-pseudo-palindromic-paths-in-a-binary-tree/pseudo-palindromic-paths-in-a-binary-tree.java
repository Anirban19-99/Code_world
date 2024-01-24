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
    static int count=0;
    //static int flag=0;
    public int pseudoPalindromicPaths (TreeNode root) {
        count=0;
        int[] flag= new int[10];
        List<Integer> ans=new ArrayList<>();
        travers(root,ans,flag);
        return count;
        
    }
    static int travers(TreeNode root,List<Integer> ans,int[] flag)
    {
        if(root==null)
        {
            return 0;
        }
        int value=flag[root.val];
        flag[root.val]=value+1; 
        ans.add(root.val);
        int a=travers(root.left,ans,flag);
        int b=travers(root.right,ans,flag);
        if(root.left==null && root.right==null)
        {   
            int odd_count=0;
            for(int i=0;i<flag.length;i++)
            {        
                if(flag[i]%2!=0)
                {
                    odd_count++;
                }
            }
            if(odd_count<=1)
                count++;
        }
        if(a==0 && b==0){
            if(ans.size()>=1)
                ans.remove(ans.size()-1);
        }
        flag[root.val]=value;

        return 0;
    }
}