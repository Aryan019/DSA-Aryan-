// Finding  in the missing number 
// Between 1-n 


// Brute force


public class Program15 {

    public static void main(String[] args) {

        int arr[] = {1,2,3,5};
        int n = 5;

        // Here 4 is missing we have to find that only 

        // Taking in the elements one by one 
        for(int i=1;i<=n;i++){

            int flag = 0;

            for(int j=0;j<n;j++){
            if(arr[j]==i){

                flag = 1;
                break;

            }


            }

            if(flag==0){
                // return i;
                
            }

        }
        
    }
    
}
