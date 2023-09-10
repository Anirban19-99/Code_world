void moveZeroes(int* a, int n){

  int i=0;
  

  int zero=-1;

  for(i=0;i<n;i++)
  {
      if(a[i]==0)
      {
         zero=i;
         break;
      }

  }
if(zero!=-1)
{
  for(i=zero+1;i<n;i++)
  {
      if(a[i]!=0)
      {
          swap(&a[i],&a[zero]);
          zero++;
      }
      

  }
}


}

void swap(int *a,int *b)
{
    int temp=*a;
    *a=*b;
    *b=temp;
}
