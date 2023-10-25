class Solution {
public:
    string frequencySort(string s) {
        int n=s.length();
        string ans;
        std::map<char,int> map;
        for(int i=0;i<n;i++)
        {
            if(map.find(s[i])!=map.end())
            {
                map[s[i]]++;
            }
            else
                map[s[i]]=1;
        }
    

        std::vector<int> a;
        std::map<char,int>:: iterator it;
        for(it=map.begin();it!=map.end();it++)
        {
            a.push_back(it->second);
        }
        std::sort(a.begin(),a.end(),std::greater<int>());

        for(int i=0;i<a.size();i++)
        {
            char key;
            int count=0;
            std::map<char,int>:: iterator it;
            for(it=map.begin();it!=map.end();it++)
             {
                if((it->second)==a[i])
                {
                    key=it->first;
                    count=it->second;
                }
             }
             for(int j=0;j<count;j++)
             {
                 ans.push_back(key);
             }
             
             map.erase(key);
            
        }


        return ans;

    }
};