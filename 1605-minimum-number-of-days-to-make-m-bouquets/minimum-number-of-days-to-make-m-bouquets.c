int checking_bounquets(int *,int ,int ,int ,int );
int min(int * , int );
int max(int *, int );

int minDays(int* a, int n, int m, int k){

    int start=min(a,n);
    int end=max(a,n);
    int res;
    long long total_flower_needed=(long long)((long long)m*(long long)k);
    if((n<total_flower_needed))
        return -1;




    while(start<=end)
    {
        int mid=(start+end)/2;
        int check=checking_bounquets(a,mid,n,m,k);

        if(check==1)
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

int checking_bounquets(int *a,int mid,int n,int m,int k)
{
    int bloomed_flower_count=0;
    int boq_count=0;

    for(int i=0;i<n;i++)
    {
        if(a[i]<=mid)
        {
            bloomed_flower_count++;
        }
        if(a[i]>mid || i==n-1)
        {
            boq_count=(bloomed_flower_count/k)+boq_count;
            bloomed_flower_count=0;
        }
    }

    if(boq_count>=m)
        return 1;
    else
        return 0;

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

