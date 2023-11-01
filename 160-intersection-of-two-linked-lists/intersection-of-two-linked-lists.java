/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode tempa=headA;
        ListNode tempb=headB;
        if(tempa==tempb)
            return tempa;
        Map<ListNode,Integer> map=new HashMap<>();

        while(tempa!=null )
        {
            map.put(tempa,1);
            tempa=tempa.next;
        }
        while(tempb!=null )
        {
           if(map.containsKey(tempb))
                return tempb;
            tempb=tempb.next;
        }

        


        return null;
        
    }
}