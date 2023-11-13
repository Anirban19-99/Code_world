class Solution {
    public int[] pivotArray(int[] a, int pivot) {

			int[] ans=new int[a.length];
			int index=0;
			for(int i=0;i<a.length;i++)
			{
				if(a[i]<pivot)
				{
					ans[index]=a[i];
					index++;
				}
			}

			for(int i=0;i<a.length;i++)
			{
				if(a[i]==pivot)
				{
					ans[index]=a[i];
					index++;
				}
			}
			for(int i=0;i<a.length;i++)
			{
				if(a[i]>pivot)
				{
					ans[index]=a[i];
					index++;
				}
			}

			return ans;
    }
}