class Solution {
public:
    string longestPalindrome(string s) {
        int n=s.size();
        int left=0;
        int right;
        int start=0;
        int end=0;
        int max_len=0;
        int i;
        if (n<=1)
            return s;

        for(i=0;i<n-1;i++)
        {
            left=i;
            right=i;
            while(left>=0 && right<n)
            {
                if(s[left]==s[right])
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
                if(s[left]==s[right])
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

        string ans;

        for(i=start;i<=end;i++)
        {
            ans.push_back(s[i]);
        }

        return ans;
        
    }
};