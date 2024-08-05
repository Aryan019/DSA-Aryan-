// Moving in the zeroes to the end 

class Solution {
    public void moveZeroes(int[] nums) {

        // Using in the 2 pointer approach 


        // Finding in the zero index first

        int j = -1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                j = i;
                break;

            }
        }

        // By the upper loop we have finded out the 
        // index of the zero index

        // Finding in the non zero now 


        if(j!=-1){
        for(int i=j+1;i<nums.length;i++){
            if(nums[i]!=0){

                // Performing in the swapping process

                int temp = nums[i];
                nums[i] = nums[j];

                nums[j] = temp;

                j++;
            }

        }
        }

       

}
}

