void swap(int *,int *);
void selectionSort(vector<int>&arr) {

    int n=arr.size();

    int i,j;

    for(i=0;i<n-1;i++)
    {
        for(j=i+1;j<n;j++)
        {
            if(arr[i]>arr[j])
                swap(&arr[i],&arr[j]);
        }
    }
   
}
void swap(int *a,int *b)
{
    int temp;
    temp=*a;
    *a=*b;
    *b=temp;
}
