class Solution {
    public int totalMoney(int n) {

        int days=n;
        int val=0;
        int k=0;
        int sum=0;
        while(n>0)
        {
            if(n<=7)
                sum=sum+(n*(n+1)/2)+(n*val);
            else
            {
                k=7;
                sum=sum+(k*(k+1)/2)+(k*val);
            }
            n=n-7;
            val++;
        }
        return sum;
        
    }
}