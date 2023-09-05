bool check(int* a, int numsSize){
    int n=numsSize;
    int min=a[0];
    int index=0;
    int i,j;
    int count=0;
   
  for(i=0;i<n-1;i++)
   {
       j=i+1;
       if(a[j]<a[i])
       {
           index=j;
       }
   }
   //if(index==0 && a[n-1]==min)
   {
     //  index=index+1;
   }
  
  for(i=1;i<=index;i++)
  {
     int temp=a[0];
     for(j=0;j<n-1;j++)
     {
         a[j]=a[j+1];
     }
     a[n-1]=temp;
  }
  
    

    for(i=0;i<n-1;i++)
    {
        j=i+1;
        if(a[i]>a[j])
        {
            count++;
        }
    }


    if(count==0)
        return true;
    else 
        return false;
    

}