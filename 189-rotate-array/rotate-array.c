void rotate(int* nums, int numsSize, int k)
{
   int n=numsSize;
   int a[n],i,j; 

   if(k<numsSize)
   {
   int index=n-k;

    if(index<0)
        index=0-index;

   for( i=0;i<k;i++)
   {
       a[i]=nums[index];
       index++;
   }

    j=0;

   for( i=k;i<n;i++)
   {
       a[i]=nums[j];
       j++;
   }

   for( i=0;i<n;i++)
   {
       nums[i]=a[i];
       a[i]=NULL;
   }
   }
   else
   {
        int t,t2,temp;
        for(j=1;j<=k;j++)
        {
    
            temp=nums[n-1];
            t=nums[0];
            for(i=1;i<n;i++)
            {
                t2=nums[i];
                nums[i]=t;
                t=t2;
             }
            nums[0]=temp;
        }       

   }
   

   

   

}