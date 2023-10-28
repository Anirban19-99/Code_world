class Solution {
    public String longestPalindrome(String str) {
       
        int n=str.length();
        StringBuilder s=new StringBuilder(str);
        int left=0;
        int right;
        int start=0;
        int end=0;
        int max_len=0;
        int i;
        if (n<=1)
            return str;

        for(i=0;i<n-1;i++)
        {
            left=i;
            right=i;
            while(left>=0 && right<n)
            {

                if(s.charAt(left)==s.charAt(right))
                {
                    left--;
                    right++;
                }
                else
                    break;

            }
            int length=right-left-1;
            if(length>max_len)
            {
                max_len=length;
                start=left+1;
                end=right-1;
            }

        }

        for(i=0;i<n-1;i++)
        {
            left=i;
            right=i+1;
            while(left>=0 && right<n)
            {
                if(s.charAt(left)==s.charAt(right))
                {
                    left--;
                    right++;
                }
                else
                    break;

            }
            int length=right-left-1;
            if(length>max_len)
            {
                max_len=length;
                start=left+1;
                end=right-1;
            }

        }

        StringBuilder sb=new StringBuilder();

        for(i=start;i<=end;i++)
        {
            sb.append(s.charAt(i));
        }

        return sb.toString();



        
    }
}