class Solution {
public:
    bool isIsomorphic(string s, string t) {
        int n=s.length();
        int n1=t.length();
        if(n!=n1)
            return false;

        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(s[i]==s[j])
                {
                    if(t[i]!=t[j])
                        return false;
                }
                else
                {
                    if(t[i]==t[j])
                        return false;
                }
            }
        }

        return true;
        
    }
};