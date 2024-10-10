//Koko Eating Bananas

class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        // Koko eating bananas 
        // Applying binary search here 
        

        // So finding out the range here '

        int max = Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++){

            if(piles[i]>max){
                max = piles[i];
            }
        }

        // Getting in the range which is required for binary search 

        int low = 1;
        int high = max;
        // int answer = Integer.MAX_VALUE;

        while(low<=high){
            // Calculating mid 
            int mid = (low+high)/2;

            // If the mid is the amount of bananas 
            // koko eats in the hour // calcualting the time 
            int totalTime = 0;
            for(int i=0;i<piles.length;i++){

                // int pileTime = (int)Math.ceil((double) piles[i]/ (double) mid);
                // int pileTime = (piles[i] + mid - 1) / mid;  // Ceiling division
                // totalTime += (piles[i] + mid - 1) / mid;
                 totalTime += Math.ceil((double)(piles[i]) / (double)(mid));


                // totalTime = totalTime + pileTime;

            }

            if(totalTime<=h){
                 high = mid - 1;
              


            }

            else{
                  low = mid + 1;
               
            }

        }
        return low;
        
    }
}