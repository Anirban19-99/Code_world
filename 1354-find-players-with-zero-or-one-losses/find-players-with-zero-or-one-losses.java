class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<Integer> ans1=new ArrayList<>();
        List<Integer> ans2=new ArrayList<>();
        List<List<Integer>> final_ans=new ArrayList<>();
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<matches.length;i++)
        {  
            map.put(matches[i][0],0);
            map.put(matches[i][1],0);
        }

        for(int i=0;i<matches.length;i++)
        {  
           if(map.containsKey(matches[i][1]))
           {
               map.put(matches[i][1],map.get(matches[i][1])+1);
           }
        }

        
         for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue()==1)
            {
                ans2.add(entry.getKey());
            }
            if(entry.getValue()==0)
            {
                ans1.add(entry.getKey());
            }
        }
       Collections.sort(ans1);
        Collections.sort(ans2);
        final_ans.add(ans1);
        final_ans.add(ans2);
        return final_ans;
    }
}