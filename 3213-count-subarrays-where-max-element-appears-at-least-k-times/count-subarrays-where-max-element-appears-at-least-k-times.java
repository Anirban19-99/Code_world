class Solution {
    public long countSubarrays(int[] a, int k) {
         int max=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>max)
                max=a[i];
        }
        int n=a.length;
        int max_count=0;
        long array_count=0;
        int j=0;
        int i=0;
        while(j<n)
        {
            if(a[j]==max)
                max_count++;
            if(max_count>=k)
            {
                
                while(max_count>=k)
                {
                    array_count=array_count+(long)(n-j);
                    if(a[i]==max)
                        max_count--;
                    i++;
                }

            }
            j++;
        }

        return array_count;
        
    }
}