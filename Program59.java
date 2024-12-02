// Not for the leetcode 
// just for the demonstration purpose 
// No leetcode or gfg link 
// Linked list deletion programs 
// Includes the conversion to LinkedList  
// traversing, and deletions in a linked list 
// Also defining the Struct of the Linked list


// Initialization of a class for the 
// application of the linked list 
class Node{
    int data;
    Node next;

    // Defining in the constructors to initialize the upper 
    // attributes 

    Node(int data,Node next1){
        this.data = data;
        this.next = next1;

    }

    // Constructor initialize if he enters only the data 
    Node(int data){
        this.data = data;
        this.next = null;

    }
}






public class Program59 {

// Converting into a Linked list 
    static Node convertToLL(int[] arr){

        Node head = new Node(arr[0]);
        Node mover = head;

        for(int i=1;i<arr.length;i++){

            Node temp = new Node(arr[i]);
            mover.next = temp;

            mover = temp;

        }

        return head;



    }

    static void traversingLL(Node head){
        // We are requiring in the head of the linked list 
        // to traverse it 

        // Not tamperring the head
        Node temp = head;
        System.out.println();
        System.out.println("The resultant linked list is ");
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;

        }
    }

    static Node deletingHeadFromLL(Node head){
        // Function to delete in the head from the linked list 

        if(head==null){
            return null;

        }

       head = head.next;


        return head;

    }

    static Node deletingTailFromLL(Node head){


        // We will do traverse the LL

        Node temp = head;

        while(temp.next.next!=null){

            temp = temp.next;

        }

        temp.next = null;

        return head;

    }

    static Node deletingFromTheElementPosition(Node head,int k){

        Node temp = head;

        int count = 0;

        Node prev = null;

        while(temp!=null){
            count++;

            if(count==k){

                prev


            }

            prev = temp;
            temp = temp.next;



        }

        return head;

    }
    
    public static void main(String[] args) {
       // Defining an array here 
       int[] arr = {2,3,8,9,4,5,1,11,33,66};
        Node headOfTheCreatedLinkedList = convertToLL(arr);
        System.out.println(headOfTheCreatedLinkedList);

        // Upto above the linked list is successfully created 
        // Traversing in the created Linked list 
        traversingLL(headOfTheCreatedLinkedList);

        // Deleting head in the linked list 
        Node newHead = deletingHeadFromLL(headOfTheCreatedLinkedList);
        traversingLL(newHead);

        // Deleting the tail from the linked list 
        Node newHead2 = deletingTailFromLL(headOfTheCreatedLinkedList);
        traversingLL(newHead2);

        // Both the operations of the head and tail are gone now 
        // Now based on the number of element 
        // Or the value 

        // Deleting  an element from the middle 




    }
}
