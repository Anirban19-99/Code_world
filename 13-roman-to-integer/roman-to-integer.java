class Solution {
    public int romanToInt(String s) {

        int total=0;
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            StringBuilder sb1= new StringBuilder();
            char c1=s.charAt(i);

            if(i<n-1)
            {
                char c2=s.charAt(i+1);
                sb1.append(c1);
                sb1.append(c2);
                //sb1= new StringBuilder();
            }
            else
            {
                sb1.append("");
            }
            String sb=sb1.toString();
            System.out.println(sb);

            if(sb.compareTo("IV")==0)
            {
                total=total+4;
                i++;
            }
            else if(sb.compareTo("IX")==0)
            {
                total=total+9;
                i++;
            }
            else if(sb.compareTo("XL")==0)
            {
                total=total+40;
                i++;
            }
            else if(sb.compareTo("XC")==0)
            {
                total=total+90;
                i++;
            }
            else if(sb.compareTo("CD")==0)
            {
                total=total+400;
                i++;
            }
            else if((sb.compareTo("CM"))==0)
            {
                System.out.println("vdssvsdbds");
                total=total+900;
                i++;
            }
            else if(c1=='I')
                total=total+1;
            else if(c1=='V')
                total=total+5;
            else if(c1=='X')
                total=total+10;
            else if(c1=='L')
                total=total+50;
            else if(c1=='C')
                total=total+100;
            else if(c1=='D')
                total=total+500;
            else if(c1=='M')
                total=total+1000;
        }

        return total;
        
    }
}