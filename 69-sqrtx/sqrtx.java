class Solution 
{
    public int mySqrt(int x) 
    {
        return (int)bin(x,0,x/2);
    }
    public long bin(long key, long first, long last)
    {
        long mid = first-(first-last)/2;
        if(key == first*first)
            return first;
        else if(key == last*last)
            return last;
        if(key>mid*mid)
        {
            if((mid+1)*(mid+1)>key)
                return mid;
            else
                first = mid+1;
        }
        else if(key<(mid*mid))
        {
            last = mid-1;
        }
        else if(key == mid*mid || last<first)
            return mid;
        return bin(key, first, last);
    }
}