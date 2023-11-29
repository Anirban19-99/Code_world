class Solution {
    public int[] runningSum(int[] nums) {
        int sum=0;
        int [] a=new int[nums.length];
        int k=0;
        for(int i : nums)
        {
            sum=sum+i;
            a[k]=sum;
            k++;
        }
        return a;
        
    }
}