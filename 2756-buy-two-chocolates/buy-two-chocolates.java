class Solution {
    public int buyChoco(int[] a, int money) {
        int sum=0;
        int first_min=Integer.MAX_VALUE;
        int second_min=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]<first_min)
            {
                second_min=first_min;
                first_min=a[i];
            }
            else if(a[i]<second_min)
            {
                second_min=a[i];
            }
        }
        sum=first_min+second_min;
        if(sum<=money)
            return money-sum;
        else
            return money;
        
    }
}