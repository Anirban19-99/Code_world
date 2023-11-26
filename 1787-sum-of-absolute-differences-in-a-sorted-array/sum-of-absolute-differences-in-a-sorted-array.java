class Solution {
    public int[] getSumAbsoluteDifferences(int[] a) {
        int n=a.length;
        int ans[]=new int[n];
        int sum=0;
        Map<Integer,Integer> sum_map= new HashMap<>();
        for(int i=0;i<n;i++)
        {
            sum=sum+a[i];
            sum_map.put(i,sum);
        }

        for(int i=0;i<n;i++)
        { 
            int first_half_sum;
            if(i>0)
                first_half_sum=(a[i]*i)-(sum_map.get(i-1));
            else
                first_half_sum=0;
            int second_half_sum=(sum_map.get(n-1)-sum_map.get(i))-((n-1-i)*a[i]);
            int res_ans=first_half_sum+second_half_sum;
            ans[i]=res_ans;
            

        }

        return ans;

        
    }
}