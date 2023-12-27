class Solution {
    public int minCost(String colors, int[] neededTime) {
        int time=0;
        for(int i=0;i<colors.length()-1;i++)
        {
            if(colors.charAt(i)==colors.charAt(i+1))
            {
               int j=i;
               while(colors.charAt(i)==colors.charAt(j))
                {
                    if(j==colors.length()-1)
                        break;
                    j++;
                }
                if(colors.charAt(i)!=colors.charAt(j))
                    j--;
                int max=0;
                for(int k=i;k<=j;k++)
                {
                    time=time+neededTime[k];
                    if(max<neededTime[k])
                        max=neededTime[k];
                }
                time-=max;
                i=j;
                
            }
        }

        return time;
    }
}