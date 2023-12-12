class Solution {
    public int maxProduct(int[] a) {
       int max1=Integer.MIN_VALUE;
       int max2=Integer.MIN_VALUE;
       int index1=0;
      for(int i=0;i<a.length;i++)
      {
          if(a[i]>max1)
          {
              max1=a[i];
              index1=i;
          }
      }

       for(int i=0;i<a.length;i++)
      {
          if(i==index1)
            continue;
          if(a[i]>max2 && a[i]<=max1)
          {
              max2=a[i];
          }
      }

      return (max1-1)*(max2-1); 
    }
}