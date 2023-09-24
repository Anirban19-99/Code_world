class Solution {
public:
    int findPeakElement(vector<int>& nums) {
        int s=0;
        int e=nums.size()-1;
        while(s<=e){
            int mid= s + (e-s)/2;
            if(s==e){
                return s;
            }
            if(e-s==1){
                if(nums[s]>nums[e]){
                    return s;
                }
                else{
                    return e;
                }
            }
            if(mid-1>=0 && nums[mid-1]<nums[mid]){
                if(mid+1<nums.size() && nums[mid]>nums[mid+1]){
                    return mid;
                }
                else{
                    s=mid+1;
                }
            }
            else{
                e=mid-1;
            }
        }
        return -1;
    }

};