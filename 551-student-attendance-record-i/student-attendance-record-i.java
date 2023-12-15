class Solution {
    public boolean checkRecord(String s) {
        int a_count=0;
        String check="LLL";
        if(s.contains(check))
            return false;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='A')
                a_count++;
        }
        if(a_count<2)
            return true;

        return false;
    }
}