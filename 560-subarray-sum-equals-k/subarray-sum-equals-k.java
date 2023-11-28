class Solution {
    public int subarraySum(int[] a, int k) {
        int n=a.length;
        int target=k;
        int sum=0;
        int count=0;
        Map<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<n;i++)
        {
            sum=sum+a[i];
            if(sum==target)
                count++;
            int rem=sum-target;
            if(map.containsKey(rem))
            {
                count=count+map.get(rem);
            }
            if(map.containsKey(sum))
                map.put(sum,map.get(sum)+1);
            else
                map.put(sum,1);
            
        }

        return count;
        
    }
}