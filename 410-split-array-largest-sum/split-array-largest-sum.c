int count_sum(int *, int , int ,int );
int sum(int *, int );
int max(int *, int );
int splitArray(int* a, int n, int k){
    int start=max(a,n);
    int end=sum(a,n);
    int res=0;

    while(start<=end)
    {
        int mid=(start+end)/2;
        int count=count_sum(a,mid,n,k);
    
        if(k>=count)
        {
            res=mid;
            end=mid-1;
        }
        else
        {
            start=mid+1;
        }
    }

    return res;
}

int count_sum(int *a, int mid, int n,int k)
{
    int count=0;
    int sum=0;

    for(int i=0;i<n;i++)
    {
        sum=sum+a[i];
        if(sum>mid)
        {
            sum=0;
            i--;
            count++;
        }
    }
    count++;
    

   return count;


}





int max(int *a, int n)
{
    int max=a[0];
    int i;
    for(i=0;i<n;i++)
    {
        if(a[i]>max)
            max=a[i];
    }

    return max;
}

int sum(int *a, int n)
{
    int sum=0;
    int i;
    for(i=0;i<n;i++)
    {
        sum=sum+a[i];
    }

    return sum;
}