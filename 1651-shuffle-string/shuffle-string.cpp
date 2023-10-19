class Solution {
public:
    string restoreString(string s, vector<int>& a) {

    int n=s.length();
    char ans[n];

    for(int i=0;i<n;i++)
    {
       int j=0;
       while(a[j]!=i && j<n)
       {
           j++;
       }
       if(j<n)
        ans[i]=s[j];
    }

    for(int i=0;i<n;i++)
    {
        s[i]=ans[i];
    }


    return s;
        
    }
};