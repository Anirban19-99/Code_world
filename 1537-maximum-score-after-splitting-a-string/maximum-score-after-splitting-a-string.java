class Solution {
    public int maxScore(String s) {
        int total_sum=0;
        int final_sum=0;
        for(int i=0;i<s.length();i++)
        {
            int n=s.charAt(i)-'0';
            total_sum=n+total_sum;
        }
        int prev_zero=0;
        int prev_one=0;
        int temp_sum=0;
        if(s.charAt(0)=='1')
        {
            prev_one=1;
            temp_sum=total_sum-1;
            
        }
        else
            prev_zero++;
        for(int i=1;i<s.length();i++)
        {
            int n=s.charAt(i)-'0';
            int sum=prev_zero+total_sum-prev_one;
            if(sum>final_sum)
                final_sum=sum;
            if(n==1)
            {
                prev_one++;
            }
            else
            {
                prev_zero++;
            }
            

        }
        return Math.max(final_sum,temp_sum);
    }
}