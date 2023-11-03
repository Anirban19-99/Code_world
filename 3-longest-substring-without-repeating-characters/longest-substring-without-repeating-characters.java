class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map = new HashMap<>();
        int n=s.length();
        if(n==0)
        {
            return 0;
        }
        if(n==1)
        {
            return 1;
        }
        int length=0;
        int max_len=0;
        int start=0,end;
        for(int i=0;i<n;i++)
        {
            if(map.containsKey(s.charAt(i)))
            {
               end=i-1;
               length=end-start+1;
               if(length>max_len)
                    max_len=length;
               int start1=map.get(s.charAt(i))+1;
               if(start1>start)
                    start=start1;

               map.put(s.charAt(i),i);
              // i--;

            }
            else
            {
                map.put(s.charAt(i),i);
                
            }

            if(i==(n-1))
            {
                end=i;
                length=end-start+1;
                System.out.println(start+","+end+","+length);
                if(length>max_len)
                    max_len=length; 

            }
        }

        return max_len;
    }
}