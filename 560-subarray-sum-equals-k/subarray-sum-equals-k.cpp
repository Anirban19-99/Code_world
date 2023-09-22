class Solution {
public:
    int subarraySum(vector<int>& a, int k) {


        int count=0;
        int i, cur_sum=0;
        int n=a.size();
        map<int, int> map;

        for(i=0;i<n;i++)
        {
            cur_sum=cur_sum+a[i];
            if(cur_sum==k)
                count++;
            
            int rem=cur_sum-k;
            if(map.find(rem)!=map.end())
            {
                count=count+map[rem];
            }
            map[cur_sum]+=1;

        }

        return count;

        
    }
};