class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        if(s.length()<=2)
        {
            return 0;
        }
        Map<Character, List<Integer>> map=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            if(map.containsKey(s.charAt(i)))
            {
                map.get(s.charAt(i)).add(i);
            }
            else
            {
                map.put(s.charAt(i),new ArrayList<>());
                map.get(s.charAt(i)).add(i);
            }
        }
        int max_len=Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++)
        {
            int len=map.get(s.charAt(i)).size();
            if(len>=2)
            {
                int first_index=map.get(s.charAt(i)).get(0);
                int last_index=map.get(s.charAt(i)).get(len-1);
                if(last_index-first_index-1>max_len)
                {
                    max_len=last_index-first_index-1;
                }
            }
        }
        if(max_len<0)
            max_len=-1;
        return max_len;

        
    }
}