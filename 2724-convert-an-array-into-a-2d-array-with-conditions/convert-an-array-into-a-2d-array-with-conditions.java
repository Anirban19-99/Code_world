class Solution {
    public List<List<Integer>> findMatrix(int[] a) {
        List<List<Integer>> ans= new ArrayList<>();
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<a.length;i++)
        {
            if(map.containsKey(a[i]))
            {
                map.put(a[i],map.get(a[i])+1);
            }
            else
            {
                map.put(a[i],1);
            }
        }


        while(map.size()!=0)
        {
            List<Integer> temp= new ArrayList<>();
            for(int i=0;i<a.length;i++)
            {
                if(!temp.contains(a[i]) && map.containsKey(a[i]))
                {
                    temp.add(a[i]);
                    if(map.get(a[i])==1)
                    {
                        map.remove(a[i]);
                        
                    }
                    else
                    {
                        map.put(a[i],map.get(a[i])-1);
                    }
                }       
            }
            ans.add(temp);
            if(map.size()<=0)
                return ans;
        }

        return ans;
        
        
    }
}
