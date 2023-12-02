class Solution {
    public int[] productExceptSelf(int[] a) {
        int[] pre_pro=new int[a.length];
        int[] post_pro= new int[a.length];
        int[] ans= new int[a.length];
        int product=1;
        int n=a.length;
        for(int i=0;i<a.length;i++)
        {
            product=product*a[i];
            pre_pro[i]=product;
        }
        product=1;
        for(int i=a.length-1;i>=0;i--)
        {
           product=product*a[i];
           post_pro[i]=product; 
        }
        for(int i=0;i<n;i++)
        {
            
            if(i==0)
                ans[i]=post_pro[(i+1)];
            else if(i==n-1)
                ans[i]=pre_pro[i-1];
            else
                ans[i]=pre_pro[(i-1)]*post_pro[(i+1)];


        }
        return ans;
    }
}