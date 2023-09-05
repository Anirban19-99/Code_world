int missingNumber(int* nums, int numsSize){

    int n=numsSize;
    int total=(n*(n+1))/2;
    int sum=0;
    for(int i=0;i<n;i++)
    {
        sum=sum+nums[i];
    }
    int miss=total-sum;

    return miss;

}