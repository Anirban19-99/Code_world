int findMin(int* a, int numsSize){


   int n=numsSize;
   int start=0;
   int end=n-1;
   int min=INT_MAX;
   
   while(start<=end)
   {
       int mid=(start+end)/2;
       if(a[start]<=a[mid])
       {
            if(a[start]<min)
                min=a[start];
            
            start=mid+1;
       }
       else
       {
           if(min>a[mid])
                min=a[mid];
            
            end=mid-1;
           
       }
       
       
       
   }

   return min;
   
}