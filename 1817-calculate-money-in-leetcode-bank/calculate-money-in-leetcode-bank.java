class Solution {
    public int totalMoney(int n) {

        int sum=0;
        int prev_monday=1;
        int days=1;
        int val=0;
        while(days!=n+1)
        {
            System.out.println(days);
            if(days%7==1)
            {
                sum=sum+prev_monday;
                prev_monday++;
                val=prev_monday;
            }
            else
            {
                sum=sum+val;
                val++;
            }
            days++;
        }

        return sum;
        
    }
}