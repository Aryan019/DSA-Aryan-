// Programs on doubly Linked list here 
// Creating in a doubly linked list from an array 




class Node {
    int data;
    Node next;
    Node back;

    // Initializing in the upper vars 
    // through constructors 

    // Constructor 1 
    Node(int data, Node next1, Node back1){
        this.data = data;
        this.next = next1;
        this.back = back1;
    }

    // The below is the constructor overloading 
    // Constructor 2 
    Node(int data){
        this.data = data;
        this.next = null;
        this.back = null;

    }





}

public class Program60 {


    static Node converttoDoublyLinkedList(int[] arr){

        // Initializing in the new head
       Node head = new Node(arr[0]);
       Node prev = head;


       for(int i=1;i<arr.length;i++){

        Node temp = new Node(arr[i],null,prev);
        prev.next = temp;
        prev = temp;
        temp = temp.next;


       }

       return head;


    }

    static void printingDoublyLinkedList(Node head){

        Node temp = head;

        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;

        }
    }



    public static void main(String[] args) {
        
        // Defining in the array 
        int[] arr = {1,2,3,6,9,8,7,4,};
        Node head = converttoDoublyLinkedList(arr);
        printingDoublyLinkedList(head);



    }
    
}
