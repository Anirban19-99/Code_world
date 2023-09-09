/******************************************************************************

                            Online C Compiler.
                Code, Compile, Run and Debug C program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <stdio.h>

int partitionArray(int *a, int start, int end) {
	
    printf("c");
	int pivot=a[end];
	int pi=start;
	for(int i=start;i<end;i++)
	{
		if(a[i]<pivot)
		{
			int temp=a[i];
			a[i]=a[pi];
			
			a[pi]=temp;

			pi++;
		}


	}                    
			int temp=a[end];
			a[end]=a[pi];
			a[pi]=temp;
			
			printf("pi is %d\n",pi);

	return pi;


}

void quickSort(int input[], int start, int end) {
    
    if(start<end)
    {
	    int pi=partitionArray( input,  start,  end);
	    quickSort( input,  start,  pi-1);
	    quickSort(input,  pi+1,  end);
    }
    else
        return;
}


int main()
{
    int a[6]={4,3,8,4,6,5};
    int start=0, end=5;
    quickSort(a,0,5);
    
    for(int i=0;i<5;i++)
    {
        printf("%d,",a[i]);
    }

    return 0;
}


