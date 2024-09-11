// Problem 38 approach 2 best approach 
class Solution {
    public void rotate(int[][] matrix) {
        

        // Traversing in the matrix 
        // And transposing the matrix 

        // for transposing 

        int n = matrix.length;

        for(int i=0;i<n-1;i++){

            for(int j=i+1;j<n;j++){

                    //Swapping 


                int element1 = matrix[i][j];
                matrix[i][j] = matrix[j][i];

                matrix[j][i] = element1;


            }
        

        }
        //Transposing done 
        // reversing the rows   
        // Loop for reversing the rows 

        for(int i=0;i<n;i++){

            for(int j=0;j<n/2;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-1-j];
                matrix[i][n-1-j] = temp;

            }

        }

        
    }
}