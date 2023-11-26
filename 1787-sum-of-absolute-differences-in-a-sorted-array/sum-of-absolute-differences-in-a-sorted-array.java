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
            first_half_sum=sum_map.get(i-1);
        else
            first_half_sum=0;   
        int second_half_sum=sum_map.get(n-1)-sum_map.get(i);

        int diff_of_second_half=second_half_sum-((n-1-i)*(a[i]));
        int diff_of_first_half=first_half_sum-(i*a[i]);
        if(diff_of_first_half<0)
            diff_of_first_half=0-diff_of_first_half;
        if(diff_of_second_half<0)
            diff_of_second_half=0-diff_of_second_half;
        int final_ans=diff_of_second_half+diff_of_first_half;
        if(final_ans<0)
            final_ans=0-final_ans;
        ans[i]=final_ans;
        System.out.println("for"+a[i]+"diff are"+diff_of_first_half+diff_of_second_half);
        }

        return ans;

        
    }
}