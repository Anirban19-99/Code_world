class Solution {
    public int reverse(int x) {
        int neg=0;
        if(x<0)
        {
            neg=1;
            x=0-x;
        }
        long ans=0;
        long n=x;
        System.out.print(x);
        while(n>0)
        {
            long rem=n%10;
            n=n/10;
            ans=(ans*10)+rem;
        }
        if(neg==1)
        {
            ans=0-ans;
        }
        
        if(ans<Integer.MIN_VALUE)
        {
            return 0;
        }
        else if (ans>Integer.MAX_VALUE)
        {
            return 0;
        }

        return (int)ans;
    }
}