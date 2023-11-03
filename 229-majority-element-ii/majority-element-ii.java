class Solution {
    public List<Integer> majorityElement(int[] a) {
        int count1=0;
        int count2=0;
        int el1=Integer.MIN_VALUE;
        int i;
        int el2=Integer.MIN_VALUE;
        int n=a.length;
        for(i=0;i<n;i++)
        {
            if(count1==0 && el2!=a[i])
            {
                el1=a[i];
                count1++;
            }
            else if(count2==0 && el1!=a[i])
            {
                el2=a[i];
                count2++;
            }
            else if(el1==a[i])
            {
                count1++;
            }
            else if(el2==a[i])
            {
                count2++;
            }
            else
            {
                count1--;
                count2--;
            }

        }
         List<Integer>ans = new ArrayList<>();
        if(count2==0)
        {
            int count=0;
            for(i=0;i<n;i++)
            {
                if(a[i]==el1)
                {
                    count++;
                }
            }

            if(count>(n/3))
            {
                ans.add(el1);
                return ans;
            }

        }
        else if(count1==0)
        {
            int count=0;
            for(i=0;i<n;i++)
            {
                if(a[i]==el2)
                {
                    count++;
                }
            }

            if(count>(n/3))
            {
                ans.add(el2);
                return ans;
            }
        }
        else
        {
            int cnt1=0;
            int cnt2=0;
            for(i=0;i<n;i++)
            {
                if(a[i]==el1)
                {
                    cnt1++;
                }
                else if(a[i]==el2)
                {
                    cnt2++;
                }
            }

            if(cnt1>(n/3))
            {
               ans.add(el1); 
            }
            if(cnt2>(n/3))
            {
                ans.add(el2);
            }

            return ans;

        }

        return ans;
        
    }
}