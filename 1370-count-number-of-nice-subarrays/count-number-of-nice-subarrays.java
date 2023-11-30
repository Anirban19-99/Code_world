class Solution {
    public int numberOfSubarrays(int[] a, int k) {
        int n=a.length;
        int count=0;
        int odd_count=0;
        Map<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(a[i]%2==1)
                odd_count++;
            if(odd_count==k)
                count++;
            int rem=odd_count-k;
            if(map.containsKey(rem))
            {
                int val=map.get(rem);
                count=count+val;
            }
            if(map.containsKey(odd_count))
            {
                map.put(odd_count,map.get(odd_count)+1);
            }
            else
            {
                map.put(odd_count,1);   
            }

        }
        return count;
        
    }
}