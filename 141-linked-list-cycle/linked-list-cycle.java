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
    public boolean hasCycle(ListNode head) {

        ListNode temp=head;
        Map<ListNode,Integer> map= new HashMap<>();
        while(temp!=null)
        {
            if(map.containsKey(temp))
            {
                return true;
            }
            else
            {
               map.put(temp,0); 
            }

            temp=temp.next;

        }

        return false;
        
    }
}