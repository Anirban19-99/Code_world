class Solution {
    public String largestGoodInteger(String a) {
        
        int final_num=Integer.MIN_VALUE;
        int n=a.length();
        for(int i=0;i<n-2;i++)
        {
            if(a.charAt(i)==a.charAt(i+1) && a.charAt(i+1)==a.charAt(i+2))
            {
                StringBuilder sb= new StringBuilder();
                sb.append(a.charAt(i));
                sb.append(a.charAt(i+1));
                sb.append(a.charAt(i+2));
                int num=Integer.parseInt(sb.toString());
                if(num>final_num)
                {
                    final_num=num;
                }
            }
        }
        if(final_num==Integer.MIN_VALUE)
            return "";
        if(final_num==0)
            return "000";
        return Integer.toString(final_num);
    }
}