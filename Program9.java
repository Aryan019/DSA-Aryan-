

// Rotating the array by d given places 

public class Program9 {
        public static void main(String[] args) {

    // Setting up the main array             
     int[] arr = {1,2,3,4,5,6,7};

     // length of an array 
     int n = arr.length;
    
     //positions to move 
     int d = 3;




     // Retreiving in the actual number of rotations
     d = d%n;

     // Creating a temp array 
     int[] temp = new int[3];

     // Seeding in the temp array with the temp data 

    for(int i=0;i<d;i++){
        temp[i] = arr[i];
    }




    // placing the remaining values into the actual array
    for(int i=d; i<n;i++){
        arr[i-d] = arr[i];
    }




    // Again placing the temp back on the array 
    for(int i=n-d;i<n;i++){
        arr[i] = temp[i- (n-d)];
    }


    // placing the remaining values into the actual array
    for(int i=0; i<n;i++){
        System.out.println(arr[i]);
    }



            

        }    
}
