int check_div(int * , int , int ,int );
int min(int * , int );
int max(int * , int );
int smallestDivisor(int* a, int n, int max_sum){

    long start=1;
    long end=max(a,n);
    int div;

    while(start<=end)
    {
        long long mid=(start+end)/2;
        int check=check_div(a,n,mid,max_sum);
        if(check==1)
        {
            div=mid;
            
            end=mid-1;
            
        }
        else
        {
            start=mid+1;
        }
    }


    return div;
}

int check_div(int *a, int n, int mid,int max_sum)
{
    long long sum=0;
    for(int i=0;i<n;i++)
    {
        sum=sum+ceil((double)(a[i])/(double)(mid));
    }

    if(sum<=max_sum)
        return 1;
    else
        return -1;
}


int min(int *a, int n)
{
    int min=a[0];
    for(int i=0;i<n;i++)
    {
        if(a[i]<min)
        {
            min=a[i];
        }
    }
    return min;
}

int max(int *a, int n)
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
