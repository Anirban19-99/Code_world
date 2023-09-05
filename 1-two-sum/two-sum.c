int* twoSum(int* nums, int numsSize, int target, int* returnSize){


    int i,j,check;
    
    int *arr=(int*)malloc(2*sizeof(int));
   
    

    for(i=0;i<numsSize;i++)
    {
        for(j=i+1;j<numsSize;j++)
        {
            int total=nums[i]+nums[j];

            if(total==target)
            {
                *returnSize=2;
                
                arr[0]=i;
                arr[1]=j;
                return arr;
                
            }
        }
    }
    
   return 0;

}