int days_count(int*,int, int);
int max_capacity(int *,int );
int max(int *,int );


int shipWithinDays(int* a, int n, int max_days){

    int start=max(a,n);
    int end=max_capacity(a,n);
    int res;

    while(start<=end)
    {
        int mid=(start+end)/2;
        int day_count=days_count(a,n,mid);
        if(day_count<=max_days)
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

int days_count(int *a,int n, int mid)
{
    int days=0;
    int sum=0;
    for(int i=0;i<n;i++)
    {
       sum=sum+a[i];
       if(sum>mid)
       {
           days++;
           i--;
           sum=0;
       }
    }
    days=days+1;

    return days;
}





int max(int *a,int n)
{
    int max=a[0];
    for(int i=0;i<n;i++)
    {
        if(a[i]>max)
        {
            max=a[i];
        }
    }
    return max;
}

int max_capacity(int *a,int n)
{
    int sum=0;
    for(int i=0;i<n;i++)
    {
        sum=sum+a[i];
    }
    return sum;
}