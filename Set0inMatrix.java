public class Set0inMatrix {

        public void setZeroes(int[][] matrix) {
            //brute
            int m= matrix.length;
            int n = matrix[0].length;
            for(int i = 0; i<m; i++){
                for(int j = 0; j<n; j++){
                    if(matrix[i][j]==0){
                        setR(i,matrix);
                        setC(j,matrix);
                    }
                }
            }
            for(int i = 0; i<m; i++){
                for(int j = 0; j<n; j++){
                    if(matrix[i][j]== Integer.MIN_VALUE) matrix[i][j] = 0;
                }
            }
        }
        public void setR(int i, int[][] matrix){
            int n = matrix[i].length;
            for(int j = 0; j<n; j++){
                if(matrix[i][j] != 0) matrix[i][j] = Integer.MIN_VALUE;
            }

        }
        public void setC(int j, int[][] matrix){
            int m = matrix.length;
            for(int i = 0; i<m; i++){
                if(matrix[i][j] != 0) matrix[i][j] = Integer.MIN_VALUE;
            }

        }
    
}
