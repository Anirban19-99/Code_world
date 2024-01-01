class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        if(g.length==0 || s.length==0)
            return 0;
        int count=0;
        if(g.length>s.length)
        {
            System.out.println("ok1");
            int i=0;//for g
            int j=0;//for s

            while(g[0]>s[j])
            {
                j++;
            }
            while(j<s.length && i<g.length)
            {
               if(s[j]>=g[i])
               {
                   j++;
                   i++;
                   count++;
               }
               else
               {
                   j++;
               }
                
            }
        }
        else
        {
            System.out.println("ok2");
            int i=0;//for g
            int j=0;//for s

            while(g[0]>s[j])
            {
                j++;
            }
            while(j<s.length && i<g.length)
            {
               if(s[j]>=g[i])
               {
                   j++;
                   i++;
                   count++;
               }
               else
               {
                   j++;
               }
                
            }
        }

        return count;
        
    }
}