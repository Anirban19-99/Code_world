#include <stdio.h>
#include <stdlib.h>

int main()
{
    int a[10]={1,2,3,4,5,6,7,8,9,10};
    int n=10;
    int target=6;
    int start=0;
    int end=n-1;
    int res=binary_search(a,start,end,target);

    if(res==-1)
        printf("Not present");
    else
        printf("Present at index : %d",res);
    return 0;
}
int binary_search(int *a,int start, int end, int target)
{
    if(start>end)
        return -1;
    int index;

    int mid=(end+start)/2;
    if(a[mid]==target)
        return mid;
    else if(a[mid]>target)
    {
        end=mid;
        index=binary_search(a,start,end,target);
    }
    else
    {
        start=mid+1;
        index=binary_search(a,start,end,target);
    }
    return index;

}
