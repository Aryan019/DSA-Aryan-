//{ Driver Code Starts
// Initial Template for Java

// Searching for an element in linked list 
import java.io.*;
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }

} class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node tail = head;
            for (int i = 0; i < n - 1; i++) {
                tail.next = new Node(sc.nextInt());
                tail = tail.next;
            }
            int key = sc.nextInt();
            Solution g = new Solution();
            boolean ans = g.searchKey(n, head, key);
            System.out.println(ans ? "1" : "0");
            // printList(head);
            t--;
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


// User function Template for Java

/* Node of a linked list
  class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/
class Solution {
    static boolean searchKey(int n, Node head, int key) {
        // Code here
        
        // n is the number of nodes 
        
        Node temp = head;
        
        // Traversing in the linked list 
        
        while(temp!=null){
            
            if(temp.data==key) return true;
            
            // Keeping in the traversal on 
            
            temp = temp.next;
            
        }
        
        return false;
    }
}