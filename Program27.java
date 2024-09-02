// Rearrange array from positives and  negatives 

class Solution {
    public int[] rearrangeArray(int[] nums) {
        
        int arr[] = new int[nums.length];


        // Iterating over the given array 
        // and utilizing the extra space that is available 

        int positivePointer = 0;
        int negativePointer = 1;

        for(int i=0;i<nums.length;i++){

            if(nums[i]>0){
                arr[positivePointer] = nums[i];
                positivePointer+=2;
            }

            else{
                arr[negativePointer] = nums[i];
                negativePointer+=2;

            }



        }

        return arr;
    }
}