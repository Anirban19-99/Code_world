class Solution {
public:
    string reverseWords(string s) {
         int n=s.length();
    string ans;
    int pointer=n-1;
    while(pointer>=0)
    {
        while(s[pointer]!=32 && pointer>0)
        {
            pointer--;
        }
       int i=pointer;
       while(s[i]==32)
       {
          i++;
       }
       while(s[i]!=32 && i<n)
       {
            ans.push_back(s[i]);
            i++;
       }
       
       if(pointer>0 && ans.length()>0)
            ans.push_back(32);
            
        if(pointer==0)
            break;
            
        while(s[pointer]==32)
        {
              pointer--;
              if(pointer<0)
                break;
        }
        
    }
    while(ans.back()==32)
        ans.pop_back();

    return ans;
    
    }
};