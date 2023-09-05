char * longestCommonPrefix(char ** str, int n){
   static char s[200000];
   int i,j,k=0;
    int count;
    int s_len=strlen(s);
    for(i=0;i<s_len;i++)
        s[i]='\0';


    int min_len=strlen(str[0]);
    
    for(i=0;i<n;i++)
    {
        int len=strlen(str[i]);
        if(len<min_len)
        {
            min_len=len;           
        }
    }
    
    for(i=0;i<min_len;i++)
    {
        count=0;
        char a=str[0][i];
        for(j=0;j<n;j++)
        {
            if(a==str[j][i])
            {
                count++;
            }
            else 
            {
                count--;
            }
        }
        
        if(count<n)
        {
            break;
        }
        if(count==n)
        {
            s[k]=a;
            k++;
        }
    }
    //printf("%s\n",s);
    return s;

}