int singleNumber(int* nums, int numsSize){

    int count=0;
    int res=0;
    int n=numsSize;
    for(int i=0;i<n;i++)
    {   
        res=res ^ nums[i]; 
    }

    return res;

}