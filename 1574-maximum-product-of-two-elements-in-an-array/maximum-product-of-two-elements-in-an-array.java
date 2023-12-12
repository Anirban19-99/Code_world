class Solution {
    public int maxProduct(int[] a) {
       int max1=Integer.MIN_VALUE;
       int max2=Integer.MIN_VALUE;
       int index1=0;
      for(int i=0;i<a.length;i++)
      {
          if(a[i]>max1)
          {
              max2=max1;
              max1=a[i];
          }
          else if(a[i]>max2)
          {
              max2=a[i];
          }
      }

       

      return (max1-1)*(max2-1); 
    }
}