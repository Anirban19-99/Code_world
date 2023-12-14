class Solution {
    public int[][] onesMinusZeros(int[][] a) {
        // List<Integer> one_col=new ArrayList<>();
        // List<Integer> zero_row=new ArrayList<>();
        // List<Integer> one_col=new ArrayList<>();
        // List<Integer> zero_row=new ArrayList<>();
        int[][] twoDArray = new int[3][4];
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
        // for(int i : one_col)
        // {
        //     System.out.print(i+",");
        // }
        // System.out.println();
        // for(int i : one_row)
        // {
        //     System.out.print(i+",");
        // }
        // System.out.println();
        // for(int i : zero_col)
        // {
        //     System.out.print(i+",");
        // }
        // System.out.println();
        // for(int i : zero_row)
        // {
        //     System.out.print(i+",");
        // }
        // System.out.println();
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