int* searchRange(int* a, int n, int target, int* returnSize){

  int start=0;
  int end=n-1;
  int first_index=-1;
  int last_index=-1;
  int *ans=(int *)malloc(2*sizeof(int));
  while(start<=end)
  {
    int mid=(start+end)/2;
    if(a[mid]==target)
    {
      first_index=mid;
      last_index=mid;
      while(first_index-1>=0 /*&& a[first_index-1]==target*/)
      {
        if(a[first_index-1]==target)
           first_index--;
        else
            break;
      }
      while((last_index+1)<n /*&& a[last_index+1]==target*/)
      {
        if(a[last_index+1]==target)
            last_index++;
        else
            break;
      }
      start=end+1;

    }
    else if(a[mid]>target)
    {
      end=mid-1;
    }
    else if(a[mid]<target)
    {
      start=mid+1;
    }
  }

  ans[0]=first_index;
  ans[1]=last_index;
  *returnSize=2;
  return ans;
  

}