/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* plusOne(int* array, int size, int* returnSize) {
    if(array[size-1]==9)
    {
        int all_9=1;
        *returnSize=(size);
        int *a=(int *)malloc(sizeof(int)*(size));
        int i;
        for(i=size-1;i>=0;i--)
        {
            a[i]=array[i];
            if(a[i]<9)
                all_9=0;
        }
        if(all_9==1)
        {
            *returnSize=(size+1);
            int *ar=(int *)malloc(sizeof(int)*(size+1));
            ar[0]=1;
            for(int i=1;i<=size;i++)
            {
                ar[i]=0;
            }
            return ar;
        }
        for(i=size-1;i>=0;i--)
        {
            if(array[i]==9)
                a[i]=0;
            else
            {
                a[i]=array[i]+1;
                break;
            }
        }
        return a;
    }
    else
    {
        array[size-1]=array[size-1]+1;
        printf("%d",array[size-1]);
        *returnSize=size;
        return array;
        
    }
   
    
}