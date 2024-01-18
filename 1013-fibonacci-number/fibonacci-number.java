class Solution {
    public int fib(int n) {
        if(n==0)
            return 0;
        int ans=Fibonacci(n);
        return ans;
    }
    static int Fibonacci(int n)
    {
        if(n<=2)
            return 1;
        int a=Fibonacci(n-1);
        int b=Fibonacci(n-2);
        return a+b;
    }
}