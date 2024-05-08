/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* plusOne(int* array, int size, int* returnSize) {
        int all_9=1; // to check all digits 9 or not
        int *ar=(int *)malloc(sizeof(int)*(size));
        *returnSize=(size);
        int i;
        for(i=size-1;i>=0;i--)
        {
            ar[i]=array[i];
            if(ar[i]<9)
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
        else
        {
            for(int i=size-1;i>=0;i--)
            {
                if(ar[i]<9)
                {
                    ar[i]=ar[i]+1;
                    return ar;
                }
                ar[i]=0;
            }
            return ar;
        }

}