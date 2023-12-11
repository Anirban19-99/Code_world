class Solution {
    public int findSpecialInteger(int[] a) {
        int val=a[0];
        int count=1;
        for(int i=1;i<a.length;i++)
        {
        if(val==a[i])
        {
            count++;
        }
        if(count>(a.length/4))
            return val;
        if(a[i]!=val)
        {
            val=a[i];
            count=1;
        }   
            
        }

        return val;
       
    }
}