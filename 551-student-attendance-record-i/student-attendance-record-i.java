class Solution {
    public boolean checkRecord(String s) {
        int countAbs = 0;
        int countLeave = 0;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'A'){
                countAbs++;
                if(countAbs >= 2){
                    return false;
                }
                countLeave = 0;
            }
            else if(s.charAt(i) == 'L'){
                countLeave++;
                if(countLeave >= 3){
                    return false;
                }
            }
            else{
                countLeave = 0;
            }
        }
        return true;
    }
}