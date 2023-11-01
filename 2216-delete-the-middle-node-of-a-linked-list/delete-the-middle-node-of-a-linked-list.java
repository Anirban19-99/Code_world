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
    public ListNode deleteMiddle(ListNode head) {
        if(head==null || head.next==null)
        {
            return null;
        }
        
        ListNode temp=head;
        int length=0;
        int mid;
        while(temp!=null)
        {
            length++;
            temp=temp.next;
        }
        if(length==2)
        {
            head.next=null;
            return head;
        }
        System.out.println(length);
        if(length%2==0)
        {
            temp=head;
            mid=(length/2)+1;
            for(int i=1;i<mid-1;i++)
            {
                 temp=temp.next;
            }
            ListNode temp1=temp.next;
            temp.next=temp1.next;
        }
        else
        {
             temp=head;
             mid=(length/2);
             for(int i=1;i<mid;i++)
             {
                 temp=temp.next;
             }
             ListNode temp1=temp.next;
             temp.next=temp1.next;
        }
        
        
        

        return head;
    }
}