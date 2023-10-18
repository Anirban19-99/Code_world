class Solution {
public:
    vector<int> findDuplicates(vector<int>& a) {
        vector<int> ans;
        map<int,int> map;
        int n=a.size();
        for(int i=0;i<n;i++)
        {
            if(map.find(a[i])!=map.end())
            {
                map[a[i]]++;
            }
            else
                map[a[i]]=1;
        }
        for(int i=0;i<n;i++)
        {
            if(map.find(a[i])!=map.end() && map[a[i]]>=2)
            {
               map.erase(a[i]);
               ans.push_back(a[i]);
            }
        }



        return ans;


    }
};