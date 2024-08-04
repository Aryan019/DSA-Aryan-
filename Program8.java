// Rotating the array by 1st place

public class Program8 {


    public static void main(String[] args) {
        
        
    // Declaring in the array 
    int[] arr = {1,2,3,4,5};  


    // Rotating it by one place 
    // anti clock


    for(int i=0;i<arr.length-1;i++){
        arr[i] = arr[i+1];
    }

    for(int i=0;i<=arr.length-1;i++){
       System.out.println(arr[i]);
    }


   
    }
    



    
}
