int search_count(vector<int>& , int , int, int,int *);
int count(vector<int>& a, int n, int x) {
	int start=0;
    int end=n-1;
    int target=x;
	int count=0;
    search_count(a,start,end,target,&count);
    return count;
}


int search_count(vector<int>& a, int start, int end, int target, int *count)
{
    
    if(start<=end)
    {
        int mid=(start+end)/2;
        
        if(a[mid]==target)
        {
            *count=*count+1;
        }
         search_count(a,start,mid-1,target,count);
         search_count(a,mid+1,end,target,count);
    }
    else
        return -1;
}
