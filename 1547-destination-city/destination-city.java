class Solution {
    public String destCity(List<List<String>> paths) {
        Map<String, String> ans= new HashMap<>();
        for(int i=0;i<paths.size();i++)
        {
            if(ans.containsKey(paths.get(i).get(0)))
            {

            }
            else
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
            if(ans.containsKey(paths.get(i).get(1)))
            {

            }
            else
            {
                return paths.get(i).get(1);
            }
        }

        int length1=paths.size();
        int length2=paths.get(length1-1).size();
        return paths.get(length1-1).get(length2-1);
    }
}