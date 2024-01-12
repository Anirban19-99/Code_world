class Solution {
    public int[] shuffle(int[] a, int n) {
        int[] ans= new int[a.length];
        int i=0;
        int j=n;
        int k=0;
        while(j<a.length)
        {
            ans[k]=a[i];
            ans[k+1]=a[j];
            k=k+2;
            i++;
            j++;
        }


        return ans;

    }
}