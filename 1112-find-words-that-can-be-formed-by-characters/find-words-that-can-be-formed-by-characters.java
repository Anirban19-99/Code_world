class Solution {
    public int countCharacters(String[] a, String chars) {
        int char_freq[]=new int[26];
        int length=0;
        for(int i=0;i<chars.length();i++)
        {
            int index=chars.charAt(i)-'a';
            char_freq[index]=char_freq[index]+1;
        }
        for(int i=0;i<a.length;i++)
        {
            
            int[] check_freq = Arrays.copyOf(char_freq, char_freq.length);
            int red_flag=0;
            for(int j=0;j<a[i].length();j++)
            {
                int index=a[i].charAt(j)-'a';
                check_freq[index]=check_freq[index]-1;
                if(check_freq[index]<0){
                    red_flag=-1;
                    break;
                }
            }
            if(red_flag==0)
            {
                length=length+a[i].length();
            }
            
        }
        return length;
    }
}