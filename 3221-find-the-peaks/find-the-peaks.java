class Solution {
    public List<Integer> findPeaks(int[] mountain) {
        int n=mountain.length;
        List<Integer> ans=new ArrayList<>();
        // if(mountain[0]>mountain[1])
        // {
        //     ans.add(0);
        // }
        for(int i=1;i<n-1;i++)
        {
            if(mountain[i]>mountain[i-1] && mountain[i]>mountain[i+1])
            {
                ans.add(i);
                i=i+1;
            }
        }
        // if(mountain[n-1]>mountain[n-2])
        //     ans.add(n-1);
        
        return ans;
        
    }
}