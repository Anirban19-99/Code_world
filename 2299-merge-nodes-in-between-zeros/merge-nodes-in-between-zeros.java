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
    public ListNode mergeNodes(ListNode head) {

        ListNode temp=head;
        int sum=0;
        //ListNode new_node=null;
        ListNode new_temp=null;
        ListNode new_head=null;
        while(temp!=null)
        {
            sum=sum+temp.val;
            if(temp.val==0)
            {
                if(temp==head);
                else if(new_head==null)
                {

                    ListNode new_node=new ListNode();
                    new_node.next=null;
                    new_node.val=sum;
                    sum=0;
                    new_head=new_node;
                    new_temp=new_head;
                }
                else
                {
                    ListNode new_node=new ListNode();
                    new_node.val=sum;
                    sum=0;
                    new_node.next=null;
                    new_temp.next=new_node;
                    new_temp=new_temp.next;
                }
            }

            temp=temp.next;
        }

        return new_head;
        
    }
}