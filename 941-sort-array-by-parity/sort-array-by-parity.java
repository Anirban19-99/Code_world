class Solution {
    public int[] sortArrayByParity(int[] nums) {
        
        if(nums.length==0)
            return nums;
        int[] ans= new int[nums.length];
        int k=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0)
                ans[k++]=nums[i];
        }
         
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2!=0)
                ans[k++]=nums[i];
        }

        return ans;
        
    }
}