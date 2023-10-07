int max_ele(int *,int);
long long find_total_hour(int *,int,int);
int minEatingSpeed(int* a, int n, int h){

    int start=1;
    int end=max_ele(a,n);
    int k;
    while(start<=end)
    {
        int mid=(start+end)/2;
        long long total_hour=find_total_hour(a,n,mid);

        if(total_hour<=h)
        {
            k=mid;
            end=mid-1;
        }
        else
        {
            start=mid+1;
        }

    }

    return k;

}

long long find_total_hour(int *a, int n, int mid)
{
    long long total_hour=0;
    for(int i=0;i<n;i++)
    {
        total_hour=total_hour+ceil( (double)(a[i])/(double)(mid));
    }
    return total_hour;
}




int max_ele(int *a, int n)
{
    int i;
    int max=a[0];
    for(i=0;i<n;i++)
    {
        if(a[i]>max)
            max=a[i];
    }
    return max;
}