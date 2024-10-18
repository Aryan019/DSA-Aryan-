//minimum number of days to make m bouqets

class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        

        // bloom array describes how many days it takes to bloom a flower 
        // m is the number of bouquets we need 
        // k is the number of adjacent flowers we require to make 
        // bouquet 

        // Major point length not determined 

        // finding the min and max 
        // and then applying the binary search 

        long me = m;
        long ke = k;

          if(me*ke>bloomDay.length){
            return -1;
        }


        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]>max){
                max = bloomDay[i];
            }

            else if(bloomDay[i]<min){
                min = bloomDay[i];
            }
        }
        


        

        int low = min;
        int high = max;

        // int answer = -1;
        // Defined low and higgh 

      

        while(low<=high){
        //  int mid = (low+high)/2;
        int mid = low + (high - low) / 2;
         // Calculating mid now we have to check for mid days 
         // that the bouquet can be formed or not 
         int boquePossible = bouquetMakes(bloomDay,m,k,mid);

         if(boquePossible==-1){
            low = mid + 1;
         }

         else{
            high = mid - 1;
         }







        }

        return low;

    

       

    }
        public int bouquetMakes(int[] bloomDay,int m,int k,int day){
            // day is mid here 

            int count = 0;
            int noOfBouquets = 0;
            for(int i=0;i<bloomDay.length;i++){

                if(day>=bloomDay[i]){
                    // the flower is bloomed 
                    count++;
                }
                else{
                    // Calculate how many bouquets can be made 
                    noOfBouquets += (int)count/k;
                    count = 0;

                }
            }
            // At last if the count is not 0 then that should be also counted in bouque
            noOfBouquets += (int)count/k;

            if(noOfBouquets>=m){
                return noOfBouquets;
            }
            else{
                return -1;
            }
         }
   
}
