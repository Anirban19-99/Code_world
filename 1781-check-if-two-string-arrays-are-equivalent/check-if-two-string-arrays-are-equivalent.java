class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        // if(word1.length!=word2.length)
        //     return false;
        StringBuilder sb= new StringBuilder();
        StringBuilder sb1= new StringBuilder();
        for(int i=0;i<word1.length;i++)
        {
            StringBuilder index= new StringBuilder(word1[i]);
            sb.append(index);
        }
        for(int i=0;i<word2.length;i++)
        {
            StringBuilder index1= new StringBuilder(word2[i]);
            sb1.append(index1);
        }
        System.out.print(sb+","+sb1);
        if((sb.toString()).equals(sb1.toString()))
            return true;
        else
            return false;
    }
}