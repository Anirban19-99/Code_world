class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb= new StringBuilder();
        StringBuilder sb1= new StringBuilder();
        int n=Math.max(word1.length,word2.length);
        for(int i=0;i<n;i++)
        {
            if(i<word1.length){
            StringBuilder index= new StringBuilder(word1[i]);
            sb.append(index);
            }
            if(i<word2.length){
            StringBuilder index1= new StringBuilder(word2[i]);
            sb1.append(index1);
            }
        }
        System.out.print(sb+","+sb1);
        if((sb.toString()).equals(sb1.toString()))
            return true;
        else
            return false;
    }
}