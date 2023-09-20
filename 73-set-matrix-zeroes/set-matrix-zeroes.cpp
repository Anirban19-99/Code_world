class Solution {
public:
    void setZeroes(vector<vector<int>>& matrix) {

        int n= matrix.size();
        int m= matrix[0].size();
        
        int row[n];
        int col[m];
        int i,j;
        for(i=0;i<n;i++)
        {
            row[i]=0;
        }

        for(i=0;i<m;i++)
        {
            col[i]=0;
        }
        
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                if(matrix[i][j]==0)
                {
                    row[i]=-1;
                    col[j]=-1;
                }
            }
        }

          for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                if(row[i]==-1 || col[j]==-1)
                {
                   matrix[i][j]=0;
                }
            }
        }
        
        
    }
};