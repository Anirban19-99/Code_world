/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {

         if(head==null)
            return null;
        if(head.next==null)
            return null;
        ListNode temp=head;
        Map<ListNode,Integer> map= new HashMap<>();
        while(temp!=null)
        {
            if(map.containsKey(temp))
            {
                // ListNode temp1=head;
                // int count=0;
                // while(true)
                // {
                //     if(temp1!=temp)
                //     {
                //         count++;
                //         temp1=temp1.next;
                //     }
                //     else
                //     {
                //         return count;
                //     }
                // }

                return temp;
            }
            else
            {
               map.put(temp,0); 
            }

            temp=temp.next;

        }

        return null;
        
        
    }
}