class Solution {
    public long[] findPrefixScore(int[] a) {
        
        //long[] ans= new long[a.length];
        long[] final_ans= new long[a.length];
        int max=Integer.MIN_VALUE;
        Map<Integer,Integer> map=new HashMap<>();
        long sum=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
            map.put(i,max);
            // ans[i]=a[i]+(map.get(i));
            // sum=sum+ans[i];
            sum=sum+a[i]+(map.get(i));
            final_ans[i]=sum;
        }

        return final_ans;

    }
}