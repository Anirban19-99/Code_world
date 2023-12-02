class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int[] remainderCount = new int[k];
        remainderCount[0] = 1; // Initialize with 0 to cover subarrays starting from index 0

        int sum = 0;
        int count = 0;

        for (int num : nums) {
            sum = (sum + num) % k;
            if (sum < 0) {
                sum += k;
            }

            count += remainderCount[sum];
            remainderCount[sum]++;
        }

        return count;
    }
}
