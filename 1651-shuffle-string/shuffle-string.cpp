#include <algorithm>
class Solution {
public:
    string restoreString(string s, vector<int>& a) {
    int n=a.size();
    char an[n];

    for(int i=0;i<n;i++)
    {
        an[a[i]]=s[i];
    }

    for(int i=0;i<n;i++)
    {
        s[i]=an[i];
    }
     return s;
        
    }

   
};