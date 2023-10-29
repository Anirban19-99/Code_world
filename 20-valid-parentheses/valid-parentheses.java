class Solution {
    public boolean isValid(String s) {
        
        StringBuilder ans = new StringBuilder();
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[')
            {
                ans.append(s.charAt(i));
            }
            if(s.charAt(i)==')')
            {
                if(ans.length()>0 && ans.charAt(ans.length()-1)=='(')
                    ans.deleteCharAt(ans.length()-1);
                else
                    return false;
            }
            else if(s.charAt(i)=='}')
            {
                if(ans.length()>0 && ans.charAt(ans.length()-1)=='{')
                    ans.deleteCharAt(ans.length()-1);
                else
                    return false;
            }
            else if(s.charAt(i)==']')
            {
                if(ans.length()>0 && ans.charAt(ans.length()-1)=='[')
                    ans.deleteCharAt(ans.length()-1);
                else
                    return false;
            }
        }
        if(ans.length()==0)
            return true;
        else
            return false;
    }
}