class Solution {
public:
    bool search(vector<int>& a, int target) {
    int n=a.size();
    int start=0;
    int end=n-1;


    while(start<=end)
    {

        int mid=(start+end)/2;

        if(a[mid]==target)
        {
            return true;
        }

        
        
        while(a[start] == a[mid] && a[mid] == a[end]) {
            if((start>=0 && start<n-1) && (end>0 && end<=n-1))
            {
                start=start+1;
                end=end-1;
            }
            else
                break;
        }


        if(a[mid]>=a[start])
        {
            if(target>=a[start] && target<=a[mid])
            {
                end=mid-1;
            }
            else
                start=mid+1;

        }
        else
        {
        if(target<=a[end] && target>=a[mid])
            {
                start=mid+1;
            }
            else
                end=mid-1;
        }
    }

    return false;
        
    }
};