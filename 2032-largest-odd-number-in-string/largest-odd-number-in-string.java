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
        StringBuilder ans=new StringBuilder();
        if(index==-1)
            return ans.toString();
        for(int i=0;i<=index;i++)
        {
            ans.append(a.charAt(i));
        }
        return ans.toString();
        
    }
}