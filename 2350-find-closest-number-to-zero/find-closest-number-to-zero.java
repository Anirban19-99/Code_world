class Solution {
    public int findClosestNumber(int[] nums) {

        int final_num=0;
        int min_diff=Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i++)
        {
            int diff=0-nums[i];
            if(diff==0) 
                return nums[i];
            if(diff<0)
            {
                diff=0-diff;
            }
            if(diff==min_diff)
            {
                if(nums[i]>final_num)
                    final_num=nums[i];
            }
            if(diff<min_diff)
            {
                min_diff=diff;
                final_num=nums[i];
            }
        }

        return final_num;
        
    }
}