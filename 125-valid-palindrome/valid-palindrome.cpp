class Solution {
public:
    bool isPalindrome(string s) {
        int n=s.length();
         if(n<=1)
            return true;
        char ans[n];

        for(int i=0;i<n;i++)
        {
            ans[i]='\0';
        }

        int j=0;
        for(int i=0;i<=n;i++)
        {
            if(j>n-1)
                break;
            while(((s[j]>57 && s[j]<65) || s[j]<48 || s[j]>122 || (s[j]>90 && s[j]<97)) && (j<n) )
            {
                j++;
            }
            if(j>n-1)
                break;
            ans[i]=s[j];
            if(ans[i]>=65 && ans[i]<=90)
            {
                ans[i]=ans[i]+32;
            }
            j++;
        }
        int count=0;
        int i=0;
        int ans_length=0;
        for(int i=0;i<n;i++)
        {
            if(ans[i]!='\0')
            {
                ans_length++;
            }
            else
                break;
        }
        if(ans_length<=1)
            return true;
        j=ans_length-1;
        
        while(i<=j)
        {
            if(ans[i]==ans[j])
            {
                i++;
                j--;
            }
            else
            {
                return false;
            }
        }
        
    return true;
        
    }
};