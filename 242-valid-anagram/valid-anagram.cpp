class Solution {
public:
    bool isAnagram(string s, string t) {
        int a[26]={0};
        int n=s.length();
        int n1=t.length();
        if(n!=n1)
            return false;
        
        for(int i=0;i<n;i++)
        {
            a[s[i]-'a']=a[s[i]-'a']+1;
        }

        for(int i=0;i<n;i++)
        {
           a[t[i]-'a']=a[t[i]-'a']-1;
        }
        for(int i=0;i<26;i++)
        {
            if(a[i]>=1)
            {
                return false;
            }
        }

        return true;
        
        
    }
};