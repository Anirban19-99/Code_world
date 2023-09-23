int search(int* a, int n, int target){

    int start=0;
    int end=n-1;
    

     while(start<=end)
    {
        int mid=(start+end)/2;
        if(a[mid]==target)
            return mid;
        
        
        if(a[start]<=a[mid])
        {
            if(target>=a[start] && a[mid]>target)
            {
                end=mid-1;
            }
            else
                start=mid+1;
            
        }
        else
        {
            if(target<=a[end] && a[mid]<target)
            {
                start=mid+1;
            }
            else
                end=mid-1;
            
        }
    }
    
    return -1;

}