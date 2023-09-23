int singleNonDuplicate(int* a, int n){

    if(n==1)
        return a[0];
    else if(a[0]!=a[1])
        return a[0];
    else if(a[n-2]!=a[n-1])
        return a[n-1];
    
    int start=1;
    int end=n-2;
    while(start<=end)
    {
        int mid=(start+end)/2;
        if(a[mid-1]!=a[mid]  && a[mid+1]!=a[mid])
        {
            return a[mid];
        }
        else if((mid%2==1 && a[mid]==a[mid-1]) || (mid%2==0 && a[mid]==a[mid+1]))
        {
            start=mid+1;
        }
        else
            end=mid-1;
    }
    
    return 0;

}