// Lpngest consecutive sequence 

class Solution {
    public int longestConsecutive(int[] nums) {

        // Solving this problem from the better approach 
        // Longest consecutive sequence 
        if(nums.length==0){
            return 0;
        }
        Arrays.sort(nums);

        // Creating in the three variables 
        int currentCount = 0;
        int largest = 0;
        

        int minimumElement = Integer.MIN_VALUE;

        // Starting off with the iteration 

        for(int i=0;i<nums.length;i++){

            if(nums[i]-1==minimumElement){
                currentCount++;
                minimumElement = nums[i];

            }
            else if(nums[i]!=minimumElement){
                currentCount = 1;
                minimumElement = nums[i];
            }

            if(currentCount>largest){
                largest = currentCount;
            }

        }

        return largest;

        
    }
}
