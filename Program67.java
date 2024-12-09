// Given the head of a linked list, return the node where the cycle begins. If there is no cycle, return null.
// Solution 
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
public class Program67 {
    public ListNode detectCycle(ListNode head) {

        // Detecting there exist a loop or not 
        ListNode turtle = head;
        ListNode hare = head;

        // ListNode flag = null;
        // Starting in the iteration 
        while(hare!=null && hare.next!=null){
            turtle = turtle.next;
            hare = hare.next.next;

            if(hare==turtle){
                  // If the collision did happen 
        turtle = head;

        while(turtle!=hare){
            turtle = turtle.next;
            hare = hare.next;

        }

        return hare;
            }
        }
        return null;

      
      
        
    }
}