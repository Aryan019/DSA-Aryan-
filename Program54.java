class Solution {
    public int findKthPositive(int[] arr, int k) {

        // Brute force approach here 
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=k){
                k++;
            }
            else {
                return k;
            }
        }

    return k;
        
    }
}