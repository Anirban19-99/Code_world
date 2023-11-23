class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> currentSubset = new ArrayList<>();

        findCombination(0, target, candidates, currentSubset, result);
        return result;
    }

    public static void findCombination(int index, int target, int[] candidates, List<Integer> currentSubset, List<List<Integer>> result) {
        // checks if we have explored all the elements of array
        if(index == candidates.length) {
            if(target == 0) {
                result.add(new ArrayList<>(currentSubset));
            }
            return;
        }

        if(candidates[index] <= target) {
            currentSubset.add(candidates[index]);
            
            // After adding the element of curr index, iterate the left path until the base condition is met
            findCombination(index, target - candidates[index], candidates, currentSubset, result);
        
            // this is required because when the above recursion call 
            // is executed then the Data structure still has curr index element so we need to remove it
            currentSubset.remove(currentSubset.size() - 1);
        }

        // check for the next element of array
        findCombination(index + 1, target, candidates, currentSubset, result);
    }
}