class Solution {
public:
    bool rotateString(string s, string goal) {
        int n=s.length();
        int m=goal.length();
        if(n!=m)
            return false;

        for(int i=0;i<n;i++)
        {
            string ans;
            for(int j=i+1;j<n;j++)
            {
                ans.push_back(s[j]);
            }
            for(int k=0;k<=i;k++)
            {
                ans.push_back(s[k]);
            }
            if(ans==goal)
                return true;
        }

        return false;
        
    }
};