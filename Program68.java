// length of the loop in a linked list 
// The brute force 
// gfg problem link - https://www.geeksforgeeks.org/problems/find-length-of-loop/1
import java.util.HashMap;
import java.util.Map;

// Node class represents a node
// in a linked list
class Node {
    // Data stored in the node
    int data;        
    // Pointer to the next node in the list
    Node next;      

    // Constructor with both data
    // and next node as parameters
    Node(int data1, Node next1) {
        data = data1;
        next = next1;
    }

    // Constructor with only data as
    // a parameter, sets next to null
    Node(int data1) {
        data = data1;
        next = null;
    }
}

public class Main {
    // Function to return the length
    // of loop using hashing
    public static int lengthOfLoop(Node head) {
        // Hashmap to store visited nodes
        // and their timer values
        Map<Node, Integer> visitedNodes = new HashMap<>();
        
        // Initialize pointer to 
        // raverse the linked list
        Node temp = head;
        
        // Initialize timer to
        // track visited nodes
        int timer = 0;

        // Traverse the linked list
        // till temp reaches null
        while (temp != null) {
            // If revisiting a node, return
            // the difference of timer values
            if (visitedNodes.containsKey(temp)) {
                // Calculate the length of the loop
                int loopLength = timer - visitedNodes.get(temp);
                
                // Return the length of the loop
                return loopLength;
            }
            // Store the current node and
            // its timer value in the hashmap
            visitedNodes.put(temp, timer);
            
            // Move to the next node
            temp = temp.next;
            
            // Increment the timer
            timer++;
        }

        // If traversal is completed and we
        // reach the end of the list (null),
        // means there is no loop
        return 0;
    }

    public static void main(String[] args) {
        // Create a linked list with a loop
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

        // Create a loop from fifth to second
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        
        // This creates a loop
        fifth.next = second; 

        int loopLength = lengthOfLoop(head);

        if (loopLength > 0) {
            System.out.println("Length of the loop: " + loopLength);
        } else {
            System.out.println("No loop found in the linked list.");
        }
    }
}


// Optimal solution 

class Solution {
    // Function to find the length of a loop in the linked list.
    public int countNodesinLoop(Node head) {
        // Add your code here.
        // Checking if the loop exists or not 
        
        Node hare = head;
        Node turtle = head;
        
        while(hare!=null && hare.next!=null){
            hare = hare.next.next;
            turtle = turtle.next;
            
            
            if(hare==turtle){
                hare = hare.next;
                int count = 1;
                
                while(hare!=turtle){
                    count++;
                    hare = hare.next;
                }
                
                return count;
            }
        }
        
        return 0;
    }
}