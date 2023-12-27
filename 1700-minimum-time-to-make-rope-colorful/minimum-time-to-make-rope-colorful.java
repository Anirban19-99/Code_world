class Solution {
    public int minCost(String colors, int[] neededTime) {
        int time=0;
        for(int i=0;i<colors.length()-1;i++)
        {
            if(colors.charAt(i)==colors.charAt(i+1))
            {
                int starting_index=i;
                int j=i;
                int max=0;
                int second_max=0;
                while(colors.charAt(j)==colors.charAt(i))
                {
                    time=time+neededTime[j];
                    if(max<neededTime[j])
                    {
                        second_max=max;
                        max=neededTime[j];
                    }       
                    if(j==colors.length()-1)
                        break;
                    if(colors.charAt(j)==colors.charAt(j+1))
                    {
                        j++;
                    }
                    else
                        break;
                }
                time=time-max;
                i=j;
            }
        }

        return time;
    }
}