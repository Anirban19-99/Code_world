class Solution {
    public int[] plusOne(int[] a) {
        int n=a.length;
        int carry=1;
        if(a[n-1]!=9)
        {
            a[n-1]=a[n-1]+1;
            return a;
        }
        for(int i=n-1;i>=0;i--)
        {
            if(a[i]==9 && carry==1)
            {
                a[i]=0;
                carry=1;
            }
            else if(carry==1)
            {
                a[i]=a[i]+1;
                carry=0;
            }    

            if(i==0 && a[i]==0 && carry==1)
            {
                int[] ans=new int[n+1];
                ans[0]=1;
                int k=1;
                for(int j=0;j<n;j++)
                {
                    ans[k]=a[j];
                    k++;
                }

                return ans;
            }
        }

        return a;
        
        
        
    }
}