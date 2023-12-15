class Solution {
    public String destCity(List<List<String>> paths) {
        Map<String, String> ans= new HashMap<>();
        for(int i=0;i<paths.size();i++)
        {
            if(!ans.containsKey(paths.get(i).get(0)))
            {
                if(paths.get(i).size()==1)
                {
                    return paths.get(i).get(0);
                }
                ans.put(paths.get(i).get(0),paths.get(i).get(1));
            }
        }

        for(int i=0;i<paths.size();i++)
        {
            if(!ans.containsKey(paths.get(i).get(1)))
                return paths.get(i).get(1);
        }

        int length1=paths.size();
        return paths.get(paths.size()-1).get(paths.get(length1-1).size()-1);
    }
}