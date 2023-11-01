/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {

        if(head==null || head.next==null)
            return head;

        ListNode odd_head=head;
        ListNode odd_tail=head;
        ListNode even_head=null;
        ListNode even_tail=null;
        ListNode temp=head;
        int length=0;
        while(temp!=null)
        {
            length++;
            temp=temp.next;
        }
        temp=head;
        for(int i=1;i<=length;i++)
        {
            if(i%2==1)
            {
                if(i==1)
                {
                    odd_tail=head;
                    odd_head=odd_tail;
                }
                else
                {
                    odd_tail.next=temp;
                    odd_tail=temp;
                }
            }
            else
            {
                if(i==2)
                {
                    even_head=temp;
                    even_tail=even_head;
                }
                else
                {
                    even_tail.next=temp;
                    even_tail=temp; 
                }

            }
            if(i<length)
                temp=temp.next;
        }
        odd_tail.next=even_head;
        even_tail.next=null;

        return odd_head;

        
    }
}