class Solution {
    public int[] shuffle(int[] nums, int n) {
        int size=nums.length;
	int[] a1= new int[n];
	int[] finalArray= new int[size];
	for(int i=0;i<n;i++){
	    a1[i]=nums[i];
	    
	}
int i = 0;
int j = n;
int k=0;
while (k < finalArray.length && i < n) {
    finalArray[k++] = a1[i++];
    if (k < finalArray.length && j < nums.length) {
        finalArray[k++] = nums[j++];
    }
}
	      
	       
	       
	       
	return finalArray;
    }
}