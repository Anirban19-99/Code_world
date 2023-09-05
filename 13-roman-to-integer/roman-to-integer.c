int romanToInt(char * s){

    int i=0;
    int len=strlen(s);
    int sum=0;
    int *ptr=&sum;
    for(i=0;i<len;i++)
    {
        
        if(s[i]=='I')
        {
            if(s[i+1]=='V')
            {
                sum=sum+4;
                i++;
            }
            else if(s[i+1]=='X')
            {
                sum=sum+9;
                i++;
            }
            else
                sum=sum+1;
        }
        else if(s[i]=='V')
        {
            sum=sum+5;
        }
        else if(s[i]=='X')
        {
            
            if(s[i+1]=='L')
            {
                sum=sum+40;
                i++;
            }
            else if(s[i+1]=='C')
            {
                sum=sum+90;
                i++;
            }
            else
                sum=sum+10;
        }
        else if(s[i]=='L')
        {
           sum=sum+50;
        }
        else if(s[i]=='C')
        {
            if(s[i+1]=='D')
            {
                sum=sum+400;
                i=i+1;
            }
            else if(s[i+1]=='M')
            {
                sum=sum+900;
                i=i+1;
            }
            else
                sum=sum+100;
        }
        else if(s[i]=='D')
        {
            sum=sum+500;
        }
        else if(s[i]=='M')
        {
            sum=sum+1000;
        }
    }
    
    return sum;
}

