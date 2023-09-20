class Solution {
public:
    void rotate(vector<vector<int>>& a) {
        int n= a.size();
        int i,j;
        for(i=0;i<n;i++)
        {
            for(j=i;j<n;j++)
            {
                // int temp=a[i][j];
                // a[i][j]=a[j][i];
                // a[j][i]=temp;

                swap(a[i][j],a[j][i]);
            }
        }

        for(i=0;i<n;i++)
        {
            reverse(a[i].begin(),a[i].end());

            // int u=0,v=n-1;
            // while(u<v)
            // {
            //     int temp=a[i][v];
            //     a[i][v]=a[i][u];
            //     a[i][u]=temp; 
            //      u++;
            //     v--;
            // }
           


        }
        
    }
};