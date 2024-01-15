class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0;
        int j=0;
        if(s.length()==0)
            return true;
        // if(t.length()==0 || t.length()<s.length())
        //     return false;
        while(i<s.length() && j<t.length())
        {
            
            if(t.charAt(j)==s.charAt(i))
            {
                i++;
                j++;
            }
            else
            {
                j++;
            }

            if(i==s.length())
                return true;
            
        }

        return false;
        
    }
}