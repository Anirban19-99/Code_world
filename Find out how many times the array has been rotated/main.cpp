#include<limits.h>
int findKRotation(vector<int> &a){
     int n=a.size();
    // cout<<"ok"<<n<<"ok"<<endl;
    int start=0;
    int end=n-1;
    int min=INT_MAX;
    int index=0;

    while (start <= end) 
    {
        int mid=(start+end)/2;
        if (a[start] <= a[mid]) {

            if(min>=a[start])
            {
                min=a[start];
                index=start;
            }
            start=mid+1;

        }
        else
        {
            if(min>a[mid])
            {
                min=a[mid];
                index=mid;
            }
            end=mid-1;

        }

    }


    return index;

}
