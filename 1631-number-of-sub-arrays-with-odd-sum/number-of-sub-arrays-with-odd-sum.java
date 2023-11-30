class Solution {
    public int numOfSubarrays(int[] a) {
        long even=0;
        long odd=0;
        long count=0;
        long sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum=sum+a[i];
            if(sum%2==0)
            {
                count=count+odd;
                even++;
            }
            else
            {
                count++;
                count=count+even;
                odd++;
            }
        }
        return (int)(count%1000000007);
        
    }
}