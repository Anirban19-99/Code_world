import java.util.*;

class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> subsets = new ArrayList<>();
        backtrack(nums, 0, new ArrayList<>(), subsets);
        return subsets;
    }

    private void backtrack(int[] nums, int start, List<Integer> path, List<List<Integer>> subsets) {
        subsets.add(new ArrayList<>(path));
        for (int i = start; i < nums.length; i++) {
            if (i > start && nums[i] == nums[i-1]) {
                continue;
            }
            path.add(nums[i]);
            backtrack(nums, i + 1, path, subsets);
            path.remove(path.size() - 1);
        }
    }
}