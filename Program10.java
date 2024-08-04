

// Rotating the array by d given places 

public class Program10 {
    public static void main(String[] args) {

// Setting up the main array             
 int[] nums = {-1,-100,3,99};

 // length of an array 
 int n = nums.length;

 //positions to move 
 int k = 2;




 // Retreiving in the actual number of rotations
 k = k%n;

   // Initializing the temp array
   int temp[] = new int[k];

   int j=0;
   for(int i=n-k; i<n;i++){
       temp[j] = nums[i];
       j++;
   }

 for(int i=k; i>=0;i--){
    nums[n-(i+k)] = nums[i];
 }


 // Putting in the elements back from the temp array 
 for(int i=0; i<k;i++){
    nums[i] = temp[i];
}


   for(int i=0;i<n;i++){
    System.out.println(nums[i]);

}



        

    }    
}
