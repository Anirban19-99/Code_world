class Solution {
    public int[] pivotArray(int[] a, int pivot) {

			int[] ans=new int[a.length];
			int index=0;
			for(int x : a)
			{
				if(x<pivot)
				{
					ans[index]=x;
					index++;
				}
			}

			for(int x : a)
			{
				if(x==pivot)
				{
					ans[index]=x;
					index++;
				}
			}
			for(int x:a)
			{
				if(x>pivot)
				{
					ans[index]=x;
					index++;
				}
			}

			return ans;
    }
}