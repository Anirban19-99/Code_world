class Solution {
    public List<List<Integer>> fourSum(int[] a, int target) {

        int i,j,k,l;
        List<List<Integer>> ans=new ArrayList<>();
        int n=a.length;
        Arrays.sort(a);
        for(i=0;i<n;i++)
        {
            if(i>0 && a[i]==a[i-1])
                continue;
            for(j=i+1;j<n;j++)
            {
                if(j>i+1 && a[j]==a[j-1])
                    continue;
                k=j+1;
                l=n-1;
                while(k<l && k<n && l<n )
                {  
                   long sum=(long)a[i]+(long)a[j]+(long)a[k]+(long)a[l];
                   if(sum==target)
                   {
                       List<Integer> temp_ans=new ArrayList<>();
                       temp_ans.add(a[i]);
                       temp_ans.add(a[j]);
                       temp_ans.add(a[k]);
                       temp_ans.add(a[l]);
                       ans.add(temp_ans);
                       k++;
                       while(a[k]==a[k-1] && k<l)
                       {
                           k++;
                       }
                       l--;
                       while(a[l]==a[l+1] && k<l)
                       {
                           l--;
                       }
                   } 
                   else if(sum>target)
                   {
                       l--;
                   }
                   else if(sum<target)
                   {
                       k++;
                   }
                }
            }
        }

        return ans;
    }
}