class Solution {
    public int lengthOfLastWord(String s) {
        System.out.print(s.length());
        //s=s.trim();
        int count=0;
        int n=s.length();
        for(int i=n-1;i>=0;i--)
        {
            if(s.charAt(i)==' ' && count==0);
            else if(s.charAt(i)==' ')
                return count;
            else
                count++;
        }
        return count;

       
        
        
    }
}