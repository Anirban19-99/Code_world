class Solution {
    public boolean halvesAreAlike(String s) {
        int count1=calculate_vowel(s,0,(s.length()/2)-1);
        int count2=calculate_vowel(s,(s.length()/2),s.length()-1);
        if(count1==count2)
            return true;
        else
            return false;
    }

    static int calculate_vowel(String s,int m,int n)
    {
        int count=0;
        for(int i=m;i<=n;i++)
        {
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' || s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U'  )
            count++;
        }
        return count;
    }
}