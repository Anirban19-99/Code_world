class Solution {
    public int singleNumber(int[] nums) {

        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]))
            {
                int val=map.get(nums[i]);
                val++;
                map.put(nums[i],val);
            }
            else
            {
                map.put(nums[i],1);
            }
        }
    for (Map.Entry<Integer, Integer> entry : map.entrySet()) 
    {
    Integer key = entry.getKey();
    Integer value = entry.getValue();
    if(value==1)
    {
        return key;
    }
    }
    return -1;
        
    }
}