#include <stdio.h>
#include <stdlib.h>

int main()
{
    int n;
    n=10;
    int a[10]={2,3,4,1,2,10,13,8,9,16};
    int target=100;
    int res=linear_search(a,target,n);

    if(res!=-1)
        printf(" %d Present at index %d:",target,res);
    else
        printf("Not present");
}
int linear_search(int *a, int target,int n)
{
    int i;
    for(i=0;i<n;i++)
    {
        if(a[i]==target)
        {
            return i;
        }
    }
    return -1;
}
