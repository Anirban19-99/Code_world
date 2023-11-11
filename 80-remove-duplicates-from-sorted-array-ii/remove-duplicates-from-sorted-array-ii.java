class Solution {
    public int removeDuplicates(int[] a) {
        ArrayList<Integer> ans= new ArrayList<>();
        int i=0;
        int count=1;
        int n=a.length;
        if(n<=2)
            return n;
        ans.add(a[0]);
        for(i=1;i<n;i++)
        {
                if(count<2)
                {
                    ans.add(a[i]);
                    if(a[i]==a[i-1])
                        count++;
                    else
                        count=1;
                }
                else
                {
                    while(i<n && a[i]==a[i-1])
                    {
                        i++;
                    }
                    count=0;
                    i--;
                    // else
                    // {
                    //     count=1;
                    //     ans.add(a[i]);
                    // }
                }
          
        }
        for(i=0;i<ans.size();i++)
        {
            a[i]=ans.get(i);     
        }

        return ans.size();
        
    }
}