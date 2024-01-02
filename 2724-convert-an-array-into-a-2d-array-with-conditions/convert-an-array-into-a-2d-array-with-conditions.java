class Solution {
    public List<List<Integer>> findMatrix(int[] a) {
        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> array=new ArrayList<>();
        for(int i=0;i<a.length;i++)
        {
            array.add(a[i]);
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