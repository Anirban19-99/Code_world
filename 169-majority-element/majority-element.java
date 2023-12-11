class Solution {
    public int majorityElement(int[] a) {
        int count=1;
        int val=a[0];
        for(int i=1;i<a.length;i++)
        {
            if(val==a[i])
            {
                count++;
            }
            else
            {
                count--;
            }
            if(count==0)
            {
                count=1;
                val=a[i];
            }
        }
        
       return val;
        
    }
}