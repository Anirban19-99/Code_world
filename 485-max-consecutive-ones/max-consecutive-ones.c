int findMaxConsecutiveOnes(int* nums, int numsSize){

    int max=0;
    int count=0;
    int i;

    for(i=0;i<numsSize;i++)
    {
        if(nums[i]==1)
        {
            count++;
        }
        else 
        {
            if(count>=max)
            {
                max=count;
            }

            count=0;
            
        }

        

    }
    if(count>=max)
        max=count;

    
   return max;
   



   /*int cur_zero=0;
   int last_zero=-1;
   int max=0, i,diff=0;
   
   for(i=0;i<numsSize;i++)
   {
       if(nums[i]==0)
       {
           cur_zero=i;
           diff=cur_zero-last_zero-1;
           if(diff>=max)
           {
               max=diff;
           }
           last_zero=cur_zero;
       }
   }

   int new_diff=numsSize-last_zero-1;
   if(max<new_diff)
   {
       max=new_diff;
   }
   //int 

   if(last_zero!=-1)
        return max;
   else
        return numsSize;

 */
 /*int i=0,k=0,max=0;
for(i=0;i<numsSize;i++)
{
    if(nums[i]==1)
    {
        k++;
        if(k>max)
        {
            max=k;
        }
        else
        {
            max=max;
        }
    }
   else
    {
    
     k=0;
    }
}
return max;
*/
}