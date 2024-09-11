// Set matrix zero 

class Solution {
    public void setZeroes(int[][] matrix) {

        // Traversing through the matrix

        int[] row = new int[matrix.length];

        int[] column = new int[matrix[0].length];

        // Starting to iterate over the matrix 

        for(int i=0; i<matrix.length;i++){


                for(int j=0;j<matrix[i].length;j++){

                        if(matrix[i][j]==0){
                            row[i] = 1;
                            column[j] =1;

                        }

                }

        }

        for(int i=0;i<matrix.length;i++){

            for(int j=0;j<matrix[i].length;j++){

                if(row[i]==1 || column[j]==1){
                    matrix[i][j] = 0;
                }

            }

        }


        
    }
}