class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map=new HashMap<>();
        int start=0;
        int end=0;
        int max_length=0;
        while(end<s.length())
        {
            char c=s.charAt(end);
            if(map.containsKey(c))
            {
                int index=map.get(c);
                int k=index+1;
                if (k>start )
                    start=k;
                int length=end-start+1;
                map.put(c,end);
                System.out.println(length+":"+start+":"+end);
                if(length>max_length)
                    max_length=length;

            }
            else
            {
                map.put(c,end);
                int length=end-start+1;
                if(length>max_length)
                    max_length=length;
            }
            end++;
        }

        return max_length;
        
    }
}