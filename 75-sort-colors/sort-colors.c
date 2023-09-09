void swap(int *a,int *b)
{
    int temp=*a;
    *a=*b;
    *b=temp;
}


void sortColors(int* a, int n){

    int i,j,start,index,end;
    start=0;
    end=n-1;
    int mid=0;
    while(mid<=end)
    {
        if(a[mid]==0)
        {
            swap(&a[mid],&a[start]);
            start++;
            mid++;
        }
        else if(a[mid]==1)
        {
            mid++;
        }
        else
        {
            swap(&a[mid],&a[end]);
            end--;
            

        }
    }

}