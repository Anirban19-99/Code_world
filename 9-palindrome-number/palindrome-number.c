bool isPalindrome(int x)
{
    int num=x;
    int k=x;
    long double final_num=0;
    int count=0;
    while(num>0)
    {
        int rem=num%10;
        final_num=(final_num*10) + rem;
        num=num/10;
    }
    if(final_num==k)
        return true;
    else
        return false;

}