// Matrix 2 problem 

// Approach 

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> in = new ArrayList<Integer>();


        int sr = 0;
        int er = matrix.length-1;

        int sc = 0;
        int ec = matrix[0].length-1;

        while(sr<=er && sc<=ec){

            for(int j= sc;j<=ec;j++){
                in.add(matrix[sr][j]);

            }

            for(int i=sr+1;i<=er;i++){
               
                in.add(matrix[i][ec]);
            }

            for(int j=ec-1;j>=sc;j--){

                 if(sr==er){
                    return in;
                }
                
                in.add(matrix[er][j]);
            }

            for(int i=er-1;i>=sr+1;i--){
                if(sc==ec){
                    return in;
                }
                in.add(matrix[i][sc]);
            }

            sc++;
            sr++;
            ec--;
            er--;

        }

        return in;
        
    }
}



