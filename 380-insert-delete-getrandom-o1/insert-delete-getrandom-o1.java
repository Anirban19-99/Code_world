import java.util.Random;
class RandomizedSet {
    static List<Integer> ans= new ArrayList<>();
    public RandomizedSet() {
        ans.clear();
    }
    
    public boolean insert(int val) {
        if(ans.contains(val))
            return false;
        else
            ans.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        if(ans.contains(val))
        {
            ans.remove(Integer.valueOf(val));
            return true;        
        }
        else
            return false;
        
    }
    
    public int getRandom() {
        Random ran = new Random();
        int nxt = ran.nextInt(ans.size());
        return ans.get(nxt);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */