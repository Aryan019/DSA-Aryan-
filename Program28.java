class Solution {
    public void nextPermutation(int[] nums) {

        // Finding in the breaking point 

        int index = -1;

        for(int i=nums.length-2;i>=0;i--){

            if(nums[i]<nums[i+1]){
                index = i;
                break;
            }
        }

        // Edge case in the case of no break index

        // Reversing the array and returning it 
        if(index==-1){
             reverse(nums,0);

        }

        else{

        // Finding the slight greatest from back 
        for(int i=nums.length-1;i>=index;i--){

            if(nums[i]>nums[index]){

                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
                break;
            }

        }

        // After doing this reversing from the index +1 to n 
         
            // step 3 reverse the rest right half
            reverse(nums,index+1);

       



        }
        
    }
    void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    void reverse(int[] nums,int start){
        int i=start;
        int j=nums.length-1;
        while(i<j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }

}