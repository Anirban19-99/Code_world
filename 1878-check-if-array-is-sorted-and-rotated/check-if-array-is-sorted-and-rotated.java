class Solution {
    public boolean check(int[] a) {
        int flag=0;
        int check_all=1;
        for(int i=0;i<a.length-1;i++)
        {
            if(a[i]>a[i+1])
            {
                if(check_all==0)
                    return false;
                check_all=0;
                flag=i+1;

            }
        }
        if(check_all==1)
            return true;
        else
        {
            if(a[0]<a[a.length-1])
                return false;
            for(int i=flag;i<a.length-1;i++)
            {
                if(a[i]>a[i+1])
                    return false;
            }
        }

        return true;
    
    }
}