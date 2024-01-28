class Solution {
public:
    string addBinary(string str1, string str2) {
         int n = str1.size();
        
        int m = str2.size();
        
        int carry = 0;
        
        string res = "";
        
        // start traversing from right side
        
        int i = n - 1, j = m - 1;
        
        while(i >= 0 || j >= 0 || carry)
        {
            // calculate sum
            
            int sum = 0;
            
            if(i >= 0)
            {
                sum += str1[i] - '0';
            }
            
            if(j >= 0)
            {
                sum += str2[j] - '0';
            }
            
            sum += carry;
            
            // update carry
            
            carry = sum / 2;
            
            // find the digit
            
            int digit = (sum % 2) + 48;
           
            char char_digit = (char) digit;
            
            // update res
            
            res += char_digit;
            
            // update pointers
            
            i--;
            
            j--;
        }
        
        // reverse the res string
        
        reverse(res.begin(), res.end());
        
        return res;
        
    }
};