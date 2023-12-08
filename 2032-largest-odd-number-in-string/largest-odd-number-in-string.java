class Solution {
    public String largestOddNumber(String a) {
        int index=-1;
        for(int i=a.length()-1;i>=0;i--)
        {
            int n=(int)(a.charAt(i));
            if(n%2==1)
            {
                    index=i;
                    break;
            }
        }
        
        if(index==-1)
            return "";
        String ans = a.substring(0, index+1);
        return ans;
        
    }
}