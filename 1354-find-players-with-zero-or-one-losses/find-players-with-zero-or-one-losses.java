class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<Integer> ans1=new ArrayList<>();
        List<Integer> ans2=new ArrayList<>();
        List<List<Integer>> final_ans=new ArrayList<>();
        Map<Integer,Integer> map1=new HashMap<>();
        Map<Integer,Integer> map2=new HashMap<>();
        for(int i=0;i<matches.length;i++)
        {  
            map1.put(matches[i][0],1);
            if(map2.containsKey(matches[i][1]))
            {
                map2.put(matches[i][1],map2.get(matches[i][1])+1);
            }
            else
            {
                map2.put(matches[i][1],1);
            }
        }
        
         for (Map.Entry<Integer, Integer> entry : map1.entrySet()) {
            int value=entry.getKey();
            if(!map2.containsKey(value))
                ans1.add(value);
            
        }

        for (Map.Entry<Integer, Integer> entry : map2.entrySet()) {
            int value=entry.getValue();

            if(value==1)
                ans2.add(entry.getKey());
            
        }
       


        Collections.sort(ans1);
        Collections.sort(ans2);
        final_ans.add(ans1);
        final_ans.add(ans2);
        return final_ans;
    }
}