void moveZeroes(int* nums, int numsSize){

    int j, last;
    int last_index=numsSize-1;
    int n=numsSize;
    int temp;


   /* for(i=0;i<n;i++)
    {
        if(nums[i]==0)
        {
            for(j=i;j<n-1;j++)
            {
                nums[j]=nums[j+1];
            }
            nums[last_index]=0;
            last_index--;
            n--;
            i--;

           
        }
    }
    */
    int i=0;

    for(i=0;i<n-1;i++)
    {
        if(nums[i]==0)
        {
           
           int next_non_zero=i+1;
           while(nums[next_non_zero]==0 && next_non_zero<n-1)
                {
                    next_non_zero++;
                }
          
                
            temp=nums[i];
            nums[i]=nums[next_non_zero];
            nums[next_non_zero]=temp;  
                
        
           
        }
        
       

    }
    
}