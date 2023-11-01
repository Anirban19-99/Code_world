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
        Map<ListNode,Integer> map=new HashMap<>();

        while(tempa!=null || tempb!=null)
        {
            if(tempa==tempb)
                return tempa;
            if(map.containsKey(tempa))
                return tempa;
            else if(map.containsKey(tempb))
                return tempb;
            else
                {
                    if(tempa!=null)
                        map.put(tempa,1);
                    if(tempb!=null)
                        map.put(tempb,1);
                }
            if(tempa!=null)
                tempa=tempa.next;
            if(tempb!=null)
                tempb=tempb.next;
        }

        return null;
        
    }
}