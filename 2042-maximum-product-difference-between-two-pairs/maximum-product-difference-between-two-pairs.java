class Solution {
    public int maxProductDifference(int[] a) {
        Arrays.sort(a);
        int n=a.length;
        if(a[0]>=0)
        {
            return (a[n-1]*a[n-2]-a[0]*a[1]);
        }
        return (a[n-1]*a[n-2]-a[0]*a[1]);
        
    }
}