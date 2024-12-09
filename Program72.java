// Deleting the middle of the linked list 
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

        if(head==null || head.next==null){
            return null;
        }

        ListNode hare = head;
        ListNode turtle = head;

        ListNode prev = null;

        while(hare!=null && hare.next!=null){
            prev = turtle;
            turtle = turtle.next;
            hare = hare.next.next;
        }

        // prev is the previous node which is to 
        // be deleted 

        ListNode nodeToDelete = prev.next;
        prev.next = prev.next.next;
        nodeToDelete = null;



        return head;

        
    }
}

// converting to linked list from arraylist 
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);

        // Convert ArrayList to LinkedList
        LinkedList<Integer> linkedList = new LinkedList<>(arrayList);

        // Get the head of the LinkedList
        Integer head = linkedList.getFirst(); // Option 1: Using getFirst()
        // Integer head = linkedList.get(0); // Option 2: Using get(0)

        // Print the head
        System.out.println("Head of the LinkedList: " + head);
    }
}
