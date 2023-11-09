class Solution {
    public int maxArea(int[] a) {
        int n=a.length;
        int start=0;
        int end=n-1;
        int max_size=0;

        while(start<=end)
        {
            int size=(Math.min(a[start],a[end]))*(end-start);
            if(size>max_size)
                max_size=size;
            if(a[start]<a[end])
            {
                start++;
            }
            else
            {
                end--;
            }
        }
        
        return max_size;
    }
}