class Solution {
    public List<List<Integer>> findMatrix(int[] a) {
        List<List<Integer>> ans= new ArrayList<>();
        Map<Integer,Integer> map=new HashMap<>();
        List<Integer> array=new ArrayList<>();
        for(int i=0;i<a.length;i++)
        {
            array.add(a[i]);
            if(map.containsKey(a[i]))
            {
                map.put(a[i],map.get(a[i])+1);
            }
            else
            {
                map.put(a[i],1);
            }
        }

        while(array.size()!=0)
        {
            List<Integer> temp=new ArrayList<>();
            for(int i=0;i<array.size();i++)
            {
                if(!temp.contains(array.get(i)))
                {
                    temp.add(array.get(i));
                    array.remove(i);
                    i--;
                }
            }
            ans.add(temp);
        }

        return ans;
        
        
    }
}