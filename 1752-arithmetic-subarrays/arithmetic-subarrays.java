class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] a, int[] l, int[] r) {

        List<Boolean> final_ans=new ArrayList<>();
        for(int i=0;i<l.length;i++)
        {
            int start_index=l[i];
            int end_index=r[i];

            int ar[]= new int[end_index-start_index+1];
            int k=0;
            for(int j=start_index;j<=end_index;j++)
            {
                ar[k]=a[j];
                k++;
            }
            Arrays.sort(ar);
            int diff=ar[1]-ar[0];
            int check=0;
            for(int m=0;m<ar.length-1;m++)
            {
                if(ar[m+1]-ar[m]==diff);
                else
                {
                    check=-1;
                    break;
                }
            }
            if(check==0)
                final_ans.add(true);
            else
                final_ans.add(false);

        }

        return final_ans;
        
    }
}