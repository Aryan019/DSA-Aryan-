// Inserting after a given position doubly linked list 
// Question link - 
// https://www.geeksforgeeks.org/problems/insert-a-node-in-doubly-linked-list/1

//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        next = prev = null;
    }
}

class DLinkedList {

    Node newNode(Node head, int data) {
        Node n = new Node(data);
        if (head == null) {
            head = n;
            return head;
        }
        head.next = n;
        n.prev = head;
        head = n;
        return head;
    }

    void printList(Node node) {
        Node temp = node;
        while (temp.next != null) {
            temp = temp.next;
        }

        while (temp.prev != null) {
            temp = temp.prev;
        }

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String args[]) throws IOException {

        DLinkedList DLL = new DLinkedList();
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t > 0) {
            Node temp;
            Node head = null;
            Node root = null;
            String str[] = read.readLine().trim().split(" ");
            int n = str.length;

            for (int i = 0; i < n; i++) {
                int x = Integer.parseInt(str[i]);
                head = DLL.newNode(head, x);
                if (root == null) root = head;
            }
            head = root;

            String str2[] = read.readLine().trim().split(" ");
            int pos = Integer.parseInt(str2[0]);
            int data = Integer.parseInt(str2[1]);

            Solution g = new Solution();
            head = g.addNode(head, pos, data);

            DLL.printList(head);
            while (head.next != null) {
                temp = head;
                head = head.next;
            }
            t--;
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


/* Structure of Doubly Linked List
class Node
{
    int data;
    Node next;
    Node prev;
    Node(int data)
    {
        this.data = data;
        next = prev = null;
    }
}*/

class Solution {
    // Function to insert a new node at given position in doubly linked list.
    Node addNode(Node head, int p, int x) {
        // Your code here
        // Insert before p+1
        
        // Lets iterate to the position after which we have to insert in 
        
    if (head == null) {
    return new Node(x); }
        
        
        Node temp = head;
        int count = 0;
        
        while(temp!=null){
            temp = temp.next;
            count++;
            
            if(count==p){
                break;
            }
            
            
        }
        
        // The position where i am sitting now 
        // iske baad insert krna h 
        
        // edge case if it is the tail 
        
        Node front = temp.next;
        
        
        // Tne below means i am on the last 
        // covering in the edge case
        if(front==null){
            
            Node newNode = new Node(x);
            newNode.prev = temp;
            temp.next = newNode;
            return head;
        }
        
        Node newNode = new Node(x);
        newNode.prev = temp;
        newNode.next = front;
        
        front.prev = newNode;
        
        temp.next = newNode;
        
        
        
        return head;
    }
}