class Solution {
    public int countCharacters(String[] a, String chars) {
        int char_freq[]=new int[26];
        String ans=new String();
        int final_count=0;
        int length=0;
        System.out.print(char_freq[1]);
        for(int i=0;i<chars.length();i++)
        {
            char_freq[chars.charAt(i)-'a']=char_freq[chars.charAt(i)-'a']+1;
        }
        for(int i=0;i<a.length;i++)
        {
            
            int[] check_freq = Arrays.copyOf(char_freq, char_freq.length);
            int red_flag=0;
            for(int j=0;j<a[i].length();j++)
            {
                check_freq[a[i].charAt(j)-'a']=check_freq[a[i].charAt(j)-'a']-1;
                if(check_freq[a[i].charAt(j)-'a']<0){
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