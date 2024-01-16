//subsetsWithDup
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int n=nums.length;
        List<Integer> cur= new ArrayList<>();
        int cur_index=0;
        generate_all(nums,cur_index,n,cur,ans);
        return ans;
        
    }
    static int generate_all(int[] a, int cur_index, int n,List<Integer> cur,List<List<Integer>> ans )
    {
        if(cur_index==n)
        {
            List<Integer> temp_ans= new ArrayList<>(cur);
            Collections.sort(temp_ans);
            if(!ans.contains(temp_ans))
            {
               ans.add(temp_ans);
            }
                
            return 0;
        }
        cur.add(a[cur_index]);
        generate_all(a,cur_index+1,n,cur,ans);
        cur.remove(cur.size()-1);
        generate_all(a,cur_index+1,n,cur,ans);
        return 1;

    }
}