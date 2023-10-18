class Solution {
public:
    string smallestSubsequence(string s) {
        string ans;
        int n=s.length();
        vector<bool> taken(26,false);
        vector<int> last_index(26);

        for(int i=0;i<n;i++)
        {
            char ch=s[i];
            last_index[ch-97]=i;
        }

        for(int i=0;i<n;i++)
        {
            char ch=s[i];
            int index=ch-97;
            if(taken[index]==true)
                continue;
            
            while(ans.length()>0 && ans.back()>ch && last_index[ans.back()-97]>i)
            {
                taken[ans.back()-97]=false;
                ans.pop_back();
            }

            ans.push_back(ch);
            taken[index]=true;



        }

        return ans;

        
    }
};


