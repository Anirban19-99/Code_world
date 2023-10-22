class Solution {
public:
    string largestOddNumber(string s) {
        string ans;
        int n=s.length();
        int check_point=0;
        for(int i=0;i<n;i++)
        {
            int num=s[i]-'0';
            if(num%2==1)
            {
                for(int j=check_point;j<=i;j++)
                    ans.push_back(s[j]);
                check_point=i+1;
            }
            

        }

        return ans;
        
    }
};