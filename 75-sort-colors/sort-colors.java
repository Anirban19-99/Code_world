class Solution {
    public void sortColors(int[] a) {
        int start=0;
        int end=0;
        if(a.length<=1)
            return;
        if(a.length<=3){
            Arrays.sort(a);
            return;
        }
            

        while(a[start]==0)
        {
            start++;
        } 
        end=start+1;
        while(end<a.length && start<a.length)
        {
            if(a[end]==0 && a[start]!=0)
            {
                int temp=a[end];
                a[end]=a[start];
                a[start]=temp;
            }
            if(start==a.length)
                    break;
            while(a[start]==0 && start<a.length && start<end)
            {
                start++;
                if(start==a.length)
                    break;
            }
           
            end++;
        }


        start=0;
        while(a[start]==1 || a[start]==0)
        {
            start++;
            if(start==a.length)
                break;
        } 
        end=start+1;
        while(end<a.length && start<a.length)
        {
            if(a[end]==1 && a[start]!=1)
            {
                int temp=a[end];
                a[end]=a[start];
                a[start]=temp;
            }
            if(start==a.length)
                    break;
            while(a[start]==1 && start<a.length && start<end)
            {
                start++;
                if(start==a.length)
                    break;
            }
           
            end++;
        }


        
        

        
    }
}