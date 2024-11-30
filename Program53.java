// Ship and the number of days 
class Solution {

    boolean possibleCapacityOrNot(int[] weights, int days, int midLoad){
        int day = 1;
        int load = 0;

        for(int i=0;i<weights.length; i++){

            if(weights[i]+load>midLoad){
                day++;
                load = weights[i];
            }

            else{
                load = load+weights[i];
            }

        }

        if(day<=days){
            return true;
        }
        else{
            return false;
        }

    }




    public int shipWithinDays(int[] weights, int days) {
    
    // weights of array that it can carry 
    // days the maximum number of days it can take 

    int low = Integer.MIN_VALUE;
    int high = -1;

    for(int i=0;i<weights.length;i++){
        
        if(weights[i]>low){
            low = weights[i];
        }

        high += weights[i];


    }

    

    
    // We have now determined the range 
    
    // Applying in the binary search concept on answers

    while(low<=high){

        int mid = (low+high)/2;

        // lets see it is possible here or not 
        boolean itisPossibleOnMid = possibleCapacityOrNot(weights,days,mid);

        if(itisPossibleOnMid){
            high = mid-1;
        }
        else{
            low = mid +1;
        }


    }

    return low;



    }
}