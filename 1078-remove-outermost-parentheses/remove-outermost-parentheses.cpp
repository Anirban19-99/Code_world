class Solution {
public:
    string removeOuterParentheses(string s) {
        string ans;
        int check_point=0;
        int count=0;
        int n=s.length();
        if(n<=1)
            return s;
        for(int i=0;i<n;i++)
        {
            if(s[i]=='(')
            {
                count++;
            }
            else
            {
                count--;
            }
            if(count==0)
            {
                for(int j=check_point+1;j<i;j++)
                {
                    ans.push_back(s[j]);
                }
                check_point=i+1;
            }
            
        }

        return ans;
        
        
    }
};