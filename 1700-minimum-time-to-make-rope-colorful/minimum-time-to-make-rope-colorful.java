class Solution {
    public int minCost(String colors, int[] neededTime) {
        int time=0;
        int starting_index=-1;
        int ending_index=-1;
        int max=0;
        for(int i=1;i<colors.length();i++)
        {
           if(colors.charAt(i)==colors.charAt(i-1))
           {
               if(starting_index==-1)
               {
                   starting_index=i-1;
                   time=time+neededTime[i-1];
                   max=neededTime[i-1];
               }
               time=time+neededTime[i];
               if(max<neededTime[i])
               {
                   max=neededTime[i];
               }
           }
           if(colors.charAt(i)!=colors.charAt(i-1) || i==colors.length()-1)
           {
                System.out.println(time+","+max);
                time=time-max;
                max=0;
                starting_index=-1;
           }

           
        }

        return time;
    }
}