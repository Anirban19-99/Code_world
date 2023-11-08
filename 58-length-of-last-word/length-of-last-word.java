class Solution {
    public int lengthOfLastWord(String s) {
        System.out.print(s.length());
        String str=s.trim();
        int count=0;
        int n=str.length();
        for(int i=n-1;i>=0;i--)
        {
            if(str.charAt(i)==' ')
                return count;
            count++;
        }
        return count;

       
        
        
    }
}