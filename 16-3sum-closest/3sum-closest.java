class Solution {
    public int threeSumClosest(int[] a, int target) {
        int n=a.length;
        Arrays.sort(a);
        int final_sum=0;
        int diff=0;
        int min_diff=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            if(i>0 && a[i]==a[i-1])
                continue;
            int j=i+1;
            int k=n-1;
            while(j<k)
            {
                int sum=a[i]+a[j]+a[k];
                if(sum>target)
                {
                    diff=sum-target;
                    if(diff<min_diff)
                    {
                        min_diff=diff;
                        final_sum=sum;
                    }

                    k--;
                    while(a[k]==a[k+1] && j<k)
                    {
                        k--;
                    }
                }
                else if(sum<target)
                {
                    diff=target-sum;
                    if(diff<min_diff)
                    {
                        min_diff=diff;
                        final_sum=sum;
                    }
                    j++;
                    while(a[j]==a[j-1] && j<k)
                    {
                        j++;
                    }

                }
                else
                {
                    return sum;
                }
            }
        }

        return final_sum;
        
    }
}