class Solution {
    public int[] sortArrayByParity(int[] nums) {

        if(nums.length==0)
            return nums;
        int[] ans= new int[nums.length];
        int k=0;
        for(int i: nums)
        {
            if(i%2==0)
                ans[k++]=i;
        }
         
        for(int i : nums)
        {
            if(i%2!=0)
                ans[k++]=i;
        }

        return ans;
        
    }
}