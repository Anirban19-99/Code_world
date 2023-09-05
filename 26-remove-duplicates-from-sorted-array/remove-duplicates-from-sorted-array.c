int removeDuplicates(int* nums, int numsSize){

    int n=numsSize;
    int a[n];
    int i,j=0;
    int k=numsSize;
    
    for(i=0;i<n;i++)
    {
        if((i+1)<n)
        {
             if(nums[i]!=nums[i+1])
                {
                   a[j]=nums[i];
                   j++;
                 }
              else
                k--;
        }
        else if(i+1==n)
        {
            a[j]=nums[i];
           
            

        }
    }

    for(i=0;i<k;i++)
    {
        nums[i]=a[i];
    }
    return k;
   
}