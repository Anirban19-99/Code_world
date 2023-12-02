class Solution {
    public int subarraysDivByK(int[] a, int k) {

        int count=0;
        Map<Integer,Integer> map= new HashMap<>();
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum=sum+a[i];
            int rem=sum%k;
            if(rem<0)
                rem=rem+k;
            if(rem==0)
            {
                count++;
                if(map.containsKey(0))
                    count=count+map.get(0);
            }
            else
            {
                if(map.containsKey(rem)){
                    count=count+map.get(rem);
                } 
            }
            if(map.containsKey(rem))
            {
                map.put(rem,map.get(rem)+1);
            }
            else
            {
                map.put(rem,1);
            }
        }

        return count;
        
    }
}