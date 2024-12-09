// Odd and even linked list 
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


        if(head==null || head.next==null){
            return head;
        }

        // Odd and even list
        ListNode odd = head;
        ListNode even = head.next;

        ListNode evenNode = head.next;

        while(even!=null && even.next!=null){

            odd.next = odd.next.next;
            even.next = even.next.next;
            
            odd = odd.next;
            even = even.next;


        }

        odd.next = evenNode;


        return head;
        
        
    }
}