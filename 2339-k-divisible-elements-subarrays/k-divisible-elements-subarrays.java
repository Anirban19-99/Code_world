class Solution {
    public int countDistinct(int[] a, int k, int p) {
        int n=a.length;
        int count=0;
        Set<String> set = new HashSet<>();
        for(int i=0;i<n;i++)
        {
            StringBuilder sb= new StringBuilder();
              count=0; 
              for(int j=i;j<n;j++)
              {    
                if(a[j]%p==0)
                    count++;
                if(count>k)
                    break;
                sb.append(a[j]+"_");
                set.add(sb.toString());
              }
        }
        
        return set.size();
    }
}