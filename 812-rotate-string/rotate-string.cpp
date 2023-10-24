#include <string>
class Solution {
public:
    bool rotateString(string s, string goal) {
        string ans=s+s;
        if (s.length()!=goal.length())
            return false;
        int k=ans.find(goal);
        cout<<k;
    if(k>=0)
        return true;
    else
        return false;
        
    }
};