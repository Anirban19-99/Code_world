void swap(int *a,int *b)
{
    int temp=*a;
    *a=*b;
    *b=temp;
}


void sortColors(int* a, int n){

  /*  int i,j,start,index,end;
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
    */
    int index=0,i,j,element;

    if(n>1)
    {
    for(i=0;i<n;i++)
    {
        if(a[i]==0 && index<n)
        {
            while(a[index]==0 && index<n-1)
            {
                index++;
            }
            if(index<i)
                swap(&a[index],&a[i]);
        }   
    }
    index=0;
    for(i=0;i<n;i++)
    {
        if(a[i]==1 && index<n)
        {
            while((a[index]==1 || a[index]==0) && index<n-1)
            {
                index++;
            }
            if(index<i)
                swap(&a[index],&a[i]);
        }
    }
    index=0;

   /* for(i=0;i<n;i++)
    {
        if(a[i]==2 && index<n)
        {
            while(a[index]==2 ||  && index<n-1)
            {
                index++;
            }
            if(index<i)
                 swap(&a[index],&a[i]);
        }
    }*/
    }
    



}