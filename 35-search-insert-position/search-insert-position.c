int find_index(int *,int, int,int,int);
int searchInsert(int* arr, int numsSize, int target){
  int start=0;
  int n=numsSize;
	int end=numsSize-1;
	int index=n;
	int k=find_index(arr,start,end,target,index);
	return k;
}


int find_index(int *a,int start, int end, int target,int index)
{
  if(start<=end)
  {
      int mid=(start+end)/2;
      if(a[mid]==target)
      {
            index=mid;
            return index;
      }
      if(a[mid]>target)
      {
          index=mid;
          return find_index(a,start,mid-1,target,index);
      }
      else if(a[mid]<target)
      {
          return find_index(a,mid+1,end,target,index);
      }
  }
  return index;
  
}