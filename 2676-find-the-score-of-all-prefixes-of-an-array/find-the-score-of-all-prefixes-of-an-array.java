class Solution {
    public long[] findPrefixScore(int[] a) {
        long[] final_ans= new long[a.length];
        int max=Integer.MIN_VALUE;
        long sum=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
            sum=sum+a[i]+max;
            final_ans[i]=sum;
        }

        return final_ans;

    }
}