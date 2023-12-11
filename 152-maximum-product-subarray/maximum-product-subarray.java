class Solution {
    public int maxProduct(int[] arr) {
        
        int n = arr.length;
        
        int pro=1;
        int ans = arr[0];
        
        for(int i=0;i<n;i++)
        {
            pro = pro*arr[i];
            ans = Math.max(ans,pro);
            if(pro==0)
                pro=1;
        }
        pro=1;
        for(int i=n-1;i>=0;i--)
        {
            pro = pro*arr[i];
            ans = Math.max(ans,pro);
            if(pro==0)
                pro=1;
        }
        return ans;
           }
}