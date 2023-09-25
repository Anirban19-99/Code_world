int findPeakElement(int* a, int numsSize){

    int n=numsSize;
    int start=1;
    int end=n-2;
    int mid;
    int val=0;
    if(n==1)
        return 0;
    if(a[0]>a[1])
        return 0;
    if(a[n-1]>a[n-2])
        return n-1;
    
    int k=find_peak(a,start,end);

    return k;
}
int find_peak(int *a, int start, int end)
{
    int val=0;
     while(start<=end)
    {
        int mid=(start+end)/2;
        if(a[mid]>a[mid-1] && a[mid]>a[mid+1])
        {
            val=a[mid];
            return mid;
        }
        else if(a[mid]<a[mid-1])
        {
            end=mid-1;
        }
        else
            start=mid+1;

        
    }

    return 0;
}