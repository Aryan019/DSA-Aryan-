// Single element in an sorted array
//all other elements are having a pair of two 
// And only one unique element has only occoured once 

class Solution {
    public int singleNonDuplicate(int[] nums) {

        // Single element in an sorted array 
        // The array is sorted so applying in the binary search 

        int low = 1;
        int high = nums.length-2;

        int n = nums.length;

        if(nums.length==1){
            return nums[0];
        }

        //Writing down the edge cases 
        if(nums[0]!=nums[1]){
            return nums[0];
        }

        if(nums[n-1]!=nums[n-2]){
            return nums[n-1];
        }

        while(low<=high){

            // Calculating mid 
            int mid = (low+high)/2;

            if(nums[mid]!=nums[mid-1]&& nums[mid]!=nums[mid+1]){
                return nums[mid];
            }

           // Covering the cases of that we are at the left half
           if((mid%2==0 && nums[mid]==nums[mid+1]) || (mid%2!=0 && nums[mid]==nums[mid-1])){

                low = mid +1;

           }

           else{
            high = mid - 1;
           }
           

        }

        return -1;
        
    }
}