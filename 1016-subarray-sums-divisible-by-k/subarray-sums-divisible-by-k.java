import java.util.HashMap;
import java.util.Map;

class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        // Initialize a HashMap to store the count of remainders
        Map<Integer, Integer> remainderCount = new HashMap<>();
        remainderCount.put(0, 1); // Initialize with 0 to cover subarrays starting from index 0
        
        int sum = 0;
        int count = 0;

        // Iterate through the array to calculate the running sum and count subarrays
        for (int num : nums) {
            sum = (sum + num) % k;
            if (sum < 0) {
                // Handle negative remainders
                sum += k;
            }

            // Check if there is a previous prefix sum with the same remainder
            if (remainderCount.containsKey(sum)) {
                count += remainderCount.get(sum);
            }

            // Update the count of the current remainder
            remainderCount.put(sum, remainderCount.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}
