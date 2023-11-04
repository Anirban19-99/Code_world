class Solution {
    public int reverse(int x) {
        long ans=0;
        long n;
        if(x<0)
            n=(-1)*x;
        else
            n=x;
        while(n!=0)
        {
            long rem=n%10;
            n=n/10;
            ans=(ans*10)+rem;
        }
        if(ans<Integer.MIN_VALUE || ans>Integer.MAX_VALUE )
        {
            return 0;
        }
        if(x<0)
            return (int)(ans*(-1));
        else
            return (int)ans;
    }
}