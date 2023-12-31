class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        if(s.length()<=2)
        {
            return 0;
        }
        Map<Character, Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            map.put(s.charAt(i),i);
           
        }
        int max_len=Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++)
        {
            int len=map.get(s.charAt(i))-i-1;
            if(len>max_len)
                max_len=len;
        }
        if(max_len<0)
            max_len=-1;
        return max_len;

        
    }
}