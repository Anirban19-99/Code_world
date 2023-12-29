class Solution {
    public int[] sortArray(int[] a) {
        if(a.length<=1)
            return a;
        Arrays.sort(a);
        
        //merge_sort(a,start,end);
        return a;
    }

    static void merge_sort(int[] a,int start,int end)
    {
        if(start<end){
            int mid=(end+start)/2;
            merge_sort(a,start,mid);
            merge_sort(a,mid+1,end);
            merge(a,start,mid,end);
        }
        
        
    }

    static void merge(int[] a,int start,int mid,int end)
    {
        List<Integer> a1=new ArrayList<>();
        List<Integer> a2=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
        for(int i=start;i<=mid;i++)
        {
            a1.add(a[i]);
        }

        for(int i=mid+1;i<=end;i++)
        {
            a2.add(a[i]);
        }

        int i=0; //for a1
        int j=0; // for a2
        
        while(i<a1.size() && j<a2.size())
        {
            if(a1.get(i)<a2.get(j))
            {
                ans.add(a1.get(i));
                i++;
            }
            else
            {
                ans.add(a2.get(j));
                j++;
            }
        }
        while(i<a1.size())
        {
            ans.add(a1.get(i));
            i++;
        }
        while(j<a2.size())
        {
            ans.add(a2.get(j));
            j++;
        }

        int n=ans.size();
        int[] ans_ar = new int[n];
        for(int k=0;k<n;k++)
        {
            a[start+k]=ans.get(k);
        }



        
    }
}