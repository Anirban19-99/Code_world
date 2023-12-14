class Solution {
    public int[][] onesMinusZeros(int[][] a) {
        int row=a.length;
        int col=a[0].length;
        int[] one_col = new int[col];
        int[] one_row = new int[row];
        int[] zero_col = new int[col];
        int[] zero_row = new int[row];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(a[i][j]==1)
                {
                    one_col[j]++;
                    one_row[i]++;
                    
                }
                else if(a[i][j]==0)
                {
                    zero_col[j]++;
                    zero_row[i]++;
                }
            }
        }
       
        int[][] ans = new int[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                ans[i][j]=one_row[i]+one_col[j]-zero_row[i]-zero_col[j];
            }
        }

        return ans;

    }
}