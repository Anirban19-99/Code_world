class Solution {
    public List<Integer> findWordsContaining(String[] a, char x) {
        List<Integer> ans= new ArrayList<>();
        // String str= "" +x;
        for(int i=0;i<a.length;i++)
        {
            if(a[i].contains(""+x))
                ans.add(i);
        }
        return ans;
        
    }
}