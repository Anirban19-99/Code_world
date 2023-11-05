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
    public ListNode mergeTwoLists(ListNode head1, ListNode head2) {
        if(head1==null && head2==null)
            return head1;
        else if(head1==null)
            return head2;
        else if(head2==null)
            return head1;
        ListNode temp1=head1;
        ListNode temp2=head2;
        ListNode ans=null;
        
        if(temp1.val<=temp2.val)
        {
            ans=temp1;
            temp1=temp1.next;
        }
        else
        {
            ans=temp2;
            temp2=temp2.next;
        }
        ListNode temp3=ans;
        ListNode temp4=temp3;
        
        while(temp1!=null && temp2!=null && temp3!=null)
        {
            if(temp1.val<=temp2.val)
            {
                temp4=temp3;
                temp3.next=temp1;
                temp3=temp3.next;
               // System.out.print(temp1.val);
                temp1=temp1.next;
                
            }
            else
            {
                temp4=temp3;
                temp3.next=temp2;
                System.out.print(temp2.val);
                temp3=temp3.next;
                temp2=temp2.next;
            }
            
        }
        if(temp2==null && temp1!=null)
        {
            temp3.next=temp1;
        }
        if(temp1==null && temp2!=null)
        {
            temp3.next=temp2;
        }

        return ans;
       
    }
}