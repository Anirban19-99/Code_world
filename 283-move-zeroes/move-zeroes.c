void moveZeroes(int* a, int n){

  int i=0;
  int next_non_zero=0;

  for(i=0;i<n;i++)
  {
      if(a[i]==0)
      {
          next_non_zero=i;
          while(a[next_non_zero]==0 && next_non_zero<n-1)
          {
              next_non_zero++;
          }
          if(next_non_zero<n)
            swap(&a[i],&a[next_non_zero]);
      }

  }

}

void swap(int *a,int *b)
{
    int temp=*a;
    *a=*b;
    *b=temp;
}
