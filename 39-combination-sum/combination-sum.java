class Solution {
    public List<List<Integer>> combinationSum(int[] a, int target) {

   // List<List<Integer>> final_ans= new ArrayList<>();
   List < List < Integer >> final_ans = new ArrayList < > ();
    List<Integer> ans= new ArrayList<>();
    int index=0;
    find_combination(a,ans,final_ans,target,index);
    return final_ans;

    
        
    }
    int find_combination(int[] a,List<Integer> ans,List<List<Integer>> final_ans,int target, int index)
    {
        if(index==a.length)
        {
            if(target==0)
            {
                List<Integer> temp_ans= new ArrayList<>(ans);
                final_ans.add(temp_ans);
                
            }
            return 0;
        }

        if(a[index]<=target)
        {
            ans.add(a[index]);
            find_combination(a,ans,final_ans,target-a[index],index);
            ans.remove(ans.size()-1);
        }
        find_combination(a,ans,final_ans,target,index+1);
        return 0;
    }
}