class Solution {
public:
    string longestCommonPrefix(vector<string>& strs) {
        int i;
        int min_length=999;
        string ans;
        int total_number=strs.size();
        for( i=0;i<total_number;i++)
        {
            int length=strs[i].length();
            if(length<min_length)
                min_length=length;
        }
         i=0;
        while(i<min_length)
        {
            char ch=strs[0][i];
            int count=0;
            for(int j=0;j<total_number;j++)
            {
                if(strs[j][i]==ch)
                {
                    count=0;
                }
                else
                {
                    count=-1;
                    return ans;
                }
            }
            ans.push_back(ch);
            i++;
        }

        return ans;

        
    }
};