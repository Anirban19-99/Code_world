class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> map=new HashMap<>();
        Map<Integer,Integer> map2=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        for(int key : map.keySet())
        {
            int val=map.get(key);
            if(map2.containsKey(val))
                return false;
            else
                map2.put(val,1);
        }

        return true;

        
    }
}