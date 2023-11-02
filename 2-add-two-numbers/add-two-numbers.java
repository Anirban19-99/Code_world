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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1=l1;
        ListNode temp2=l2;
        ListNode last_node=null;
        int length1=0;
        int length2=0;
        if(l1==null)
        {
            return l2;
        }
        else if(l2==null)
        {
            return l1;
        }

        while(temp1!=null)
        {
            length1++;
            temp1=temp1.next;
        }

        while(temp2!=null)
        {
            length2++;
            temp2=temp2.next;
        }

        temp1=l1;
        temp2=l2;

        int carry=0;
        int sum=0;
        int prev_carry=0;
        if(length1>=length2)
        {
            last_node=l1;
            while(temp1!=null)
            {
                 if(temp2==null)
                    sum=temp1.val+carry;
                 else
                     sum=temp1.val+temp2.val+carry;
                carry=0;
                if(sum>9)
                 {
                    carry=sum/10;
                    sum=sum%10;
                    temp1.val=sum;
                 }
                 else
                 {
                    temp1.val=sum;
                 }
                temp1=temp1.next;
                if(temp2!=null)
                    temp2=temp2.next;
                if(temp1!=null)
                    last_node=temp1;
            }

            if(temp1==null && carry!=0)
            {
                ListNode node=new ListNode(carry,null);
                last_node.next=node;

            }
            return l1;

        }
        else
        {
            last_node=l2;
            while(temp2!=null)
            {
                 if(temp1==null)
                    sum=temp2.val+carry;
                 else
                     sum=temp1.val+temp2.val+carry;
                carry=0;
                if(sum>9)
                 {
                    carry=sum/10;
                    sum=sum%10;
                    temp2.val=sum;
                 }
                 else
                 {
                    temp2.val=sum;
                 }
                temp2=temp2.next;
                if(temp1!=null)
                    temp1=temp1.next;
                if(temp2!=null)
                    last_node=temp2;
            }

            if(temp2==null && carry!=0)
            {
                ListNode node=new ListNode(carry,null);
                last_node.next=node;

            }
            return l2;
        }


        
        

        

        
        
    }
}