class Solution {
public:
    bool backspaceCompare(string s, string t) {

        string ans;
        string ans1;
        int i;
        for(i=0;i<s.length();i++)
        {
           if(s[i]!='#')
           {
               ans.push_back(s[i]);
           }
           else
            {
                if(ans.length()>=1)
                    ans.pop_back();
            }
        }

        for(i=0;i<t.length();i++)
        {
           if(t[i]!='#')
           {
               ans1.push_back(t[i]);
           }
           else
            {
                if(ans1.length()>=1)
                    ans1.pop_back();
            }
        }
        if(ans==ans1)
            return true;
        else
            return false;
        
        
    }
};