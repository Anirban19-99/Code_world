class Solution {
    public int[] sortArrayByParity(int[] nums) {
        ArrayList<Integer> evenlist = new ArrayList<Integer>();
           ArrayList<Integer> oddlist = new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2 == 0){
                evenlist.add(nums[i]);
            }
            else{
                oddlist.add(nums[i]);
            }
        }
        evenlist.addAll(oddlist);
        int k=0;
        for(Integer i: evenlist){
            nums[k++]=i;
        }
       
       return nums;

        
    }
}