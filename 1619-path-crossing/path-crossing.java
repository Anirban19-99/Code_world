class Solution {
    public boolean isPathCrossing(String path) {
        int index1=0;
        int index2=0;
        List<List<Integer>> points= new ArrayList<>();
        List<Integer> temp_list= new ArrayList<>();
        temp_list.add(index1);
        temp_list.add(index2);
        points.add(temp_list);
        for(int i=0;i<path.length();i++)
        {
            if(path.charAt(i)=='N')
            {
                index2++;
            }
            else if(path.charAt(i)=='S')
            {
                index2--;
            }
            else if(path.charAt(i)=='E')
            {
                index1++;
            }
            else if(path.charAt(i)=='W')
            {
                index1--;
            }
            List<Integer> temp= new ArrayList<>();
            temp.add(index1);
            temp.add(index2);
            if(points.contains(temp))   
                return true;
            else
                points.add(temp);
        }
        System.out.println(points);
        return false;
        
    }
}