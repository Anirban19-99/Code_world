class Solution {
    public int maxProductDifference(int[] a) {
        //Arrays.sort(a);
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        int max_index=0;
        int min_index=0;
        int n=a.length;
        for(int i=0;i<n;i++)
        {
            if(a[i]>max1)
            {
                max2=max1;
                max1=a[i];
            }
            else if(a[i]>max2)
            {
                max2=a[i];
            }

            if(a[i]<min1)
            {
                min2=min1;
                min1=a[i];
            }
            else if(a[i]<min2)
            {
                min2=a[i];
            }
            
        }
        System.out.println(max1+","+max2);
        System.out.println(min1+","+min2);

        return max1*max2-min1*min2;
        
    }
}