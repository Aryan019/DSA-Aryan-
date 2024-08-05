// Rotating array by d places 
// Ncode sol 

class Solution {
    public void rotate(int[] nums, int k) {


        int length = nums.length;

        
        // Finding out the actual rotations to be made
        k = k % length;


        // Initializing in the new array 
        int[] temp = new int[length];

        for(int i=0;i<length;i++){
            
            if((i+k)>=length){

                int newIndex = (i+k) % length;

                temp[newIndex] = nums[i];
            }

            else{
                temp[i+k] = nums[i];
            }
        }

        for(int i=0; i<length;i++){
            nums[i] = temp[i];
        }







        
    }
}