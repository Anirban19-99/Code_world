binary_search(int *a, int start, int end, int target)
{
   
   int mid=(start+end)/2;

    
    if(a[mid]==target)
        return mid;
   
    if(start<end)
    {
    
    
     if(a[mid]>target)
    {
        return binary_search(a,start,mid,target);
    }
    else if(a[mid]<target)
    {
        return binary_search(a,mid+1,end,target);
    }
    else
        return -1;
    }
    else
         return -1;
}


int search(int* a, int numsSize, int target){

    int start=0;
    int end=numsSize-1;
    int index=binary_search(a,start,end,target);
    return index;
}

