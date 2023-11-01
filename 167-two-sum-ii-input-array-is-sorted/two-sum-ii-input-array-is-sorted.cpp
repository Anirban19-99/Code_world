class Solution {
public:
    vector<int> twoSum(vector<int>& a, int target) {
        vector<int> ans;
        int length=a.size();
        int start=0;
        int end=length-1;
        int sum=0;
        while(start<end)
        {
            sum=a[start]+a[end];
            if(sum==target)
            {   
                ans.push_back((start+1));
                ans.push_back((end+1));

                return ans;
            }
            else if(sum>target)
            {
                end--;
            }
            else
            {
                start++;
            }
        }

        return ans;


        
    }
};