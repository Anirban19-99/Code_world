class Solution {
    public List<String> generateParenthesis(int n) {

        List<String> ans= new ArrayList<String>();
        find_all_par(n,ans,"(",1,0);
        return ans;
        
    }

    void find_all_par(int n,List<String> ans, String cur,int open, int close)
    {
        if(cur.length()==(2*n))
        {
            ans.add(cur);
            return;
        }
        if(open<n)
            find_all_par(n,ans,cur+"(",open+1,close);
        if(close<open)
            find_all_par(n,ans,cur+")",open,close+1);

    }
}