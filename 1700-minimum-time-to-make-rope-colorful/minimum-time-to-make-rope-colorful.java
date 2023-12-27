class Solution {
    public int minCost(String colors, int[] neededTime) {
        int time=0;
        for(int i=0;i<colors.length()-1;i++)
        {
            if(colors.charAt(i)==colors.charAt(i+1))
            {
                int starting_index=i;
                int j=i;
                while(colors.charAt(j)==colors.charAt(i))
                {
                    if(j==colors.length()-1)
                        break;
                    j++;
                }
                if(colors.charAt(i)!=colors.charAt(j))
                {
                    j--;
                }
                int max=0;
                for(int k=starting_index;k<=j;k++)
                {
                    if(neededTime[k]>max)
                    {
                        max=neededTime[k];
                    }
                    time=time+neededTime[k];
                }
                time=time-max;

                i=j;
            }
        }

        return time;
    }
}