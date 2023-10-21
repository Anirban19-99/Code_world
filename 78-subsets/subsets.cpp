void print_all(int,vector<int>& ,vector<vector<int>>&,vector<int>&,int );
class Solution {
public:
    vector<vector<int>> subsets(vector<int>& a) {
    vector<vector<int>> ans ;
    vector<int> temp_ans;
    int n=a.size();
    int index=0;
    print_all(index,a,ans,temp_ans,n);
    return ans;
        
    }
};

void print_all(int index,vector<int>& a,vector<vector<int>>&ans,vector<int>&temp_ans,int n)
{
    if(index==n)
    {
        ans.push_back(temp_ans);
        return ;
    }
    temp_ans.push_back(a[index]);
    print_all(index+1,a,ans,temp_ans,n);
    temp_ans.pop_back();
    print_all(index+1,a,ans,temp_ans,n);
}