class Solution {
    public List<List<Integer>> threeSum(int[] a) {
        List<List<Integer>> ans= new ArrayList<>();
        int i,j,k;
        Arrays.sort(a);
        int n=a.length;
        for(i=0;i<n;i++)
        {
            if(i>0 && a[i]==a[i-1])
                continue;
            j=i+1;
            k=n-1;
            while(j<k)
            {
                int sum=a[i]+a[j]+a[k];
                if(sum>0)
                {
                    k--;
                }
                else if(sum<0)
                {
                    j++;
                }
                else
                {
                    List<Integer> temp=new ArrayList<>();
                    Collections.addAll(temp,a[i],a[j],a[k]);
                    ans.add(temp);
                    j++;
                    k--;
                    //skip the duplicates:
                    while (j < k && a[j] == a[j - 1]) j++;
                    while (j < k && a[k] == a[k + 1]) k--;
                }
               
            }
            
        }

        return ans;
    }
}