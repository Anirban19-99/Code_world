class Solution {
    public int maximumProduct(int[] a) {
        Arrays.sort(a);
        int n=a.length;
        int prod=a[n-1]*a[n-2]*a[n-3];
        int prod1=a[0]*a[1]*a[n-1];
    
        return Math.max(prod,prod1);
    }
}