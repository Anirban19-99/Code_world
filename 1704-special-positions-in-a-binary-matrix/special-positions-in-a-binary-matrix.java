class Solution {
    public int numSpecial(int[][] a) {

        int row=a.length;
        int col=a[0].length;
        int final_count=0;

        for(int j=0;j<col;j++)
        {
            int sum=0;
            int index=0;
            for(int i=0;i<row;i++)
            {
                sum=sum+a[i][j];
                if(a[i][j]==1)
                    index=i;
                if(sum>1)
                    break;
            }
            if(sum==1)
            {
                int count=0;
                for(int k=0;k<col;k++)
                {
                    if(a[index][k]==1)
                        count++;
                }
                if(count==1)
                {
                    final_count++;
                }
            }
        }
        return final_count;

        
    }
}