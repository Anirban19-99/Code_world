class Solution {
    public int minOperations(int[] a) {
        Arrays.sort(a);
        List<Integer> list=new ArrayList<>();
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<a.length;i++)
        {
            if(map.containsKey(a[i]))
            {
                map.put(a[i],map.get(a[i])+1);
            }
            else{
                list.add(a[i]);
                map.put(a[i],1);
            }
                
        }
        System.out.println(map);
        int count=0;
        for(int i=0;i<list.size();i++)
        {
            int val=map.get(list.get(i));
            System.out.println("val"+val);
            if(val%3==0)
            {
                count=count+(val/3);
            }
            else
            {
                while(val>0)
                {
                    if(val==1)
                        return -1;
                    val=val-2;
                    count++;
                    if(val%3==0 && val>0)
                    {
                       count=count+(val/3);
                       break;
                    }
                    
                }
            }
            


        }

        return count;
        
    }
}