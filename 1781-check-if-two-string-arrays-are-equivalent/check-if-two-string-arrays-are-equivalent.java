class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int n=Math.max(word1.length,word2.length);
        
        String ans1= new String();
        String ans2= new String();
        for(int i=0;i<n;i++)
        {
            if(i<word1.length)
                ans1=ans1+word1[i];
            if(i<word2.length)
                ans2=ans2+word2[i];
        }

        
        if((ans1.equals(ans2)))
            return true;
        else
            return false;



        // if((sb.toString()).equals(sb1.toString()))
        //     return true;
        // else
        //     return false;
    }
}