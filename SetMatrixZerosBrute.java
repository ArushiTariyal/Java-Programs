public class SetMatrixZerosBrute {
        public void setZeroes(int[][] matrix) {
            for(int i = 0; i<matrix.length; i++){
                for(int j = 0; j<matrix[i].length; j++){
                    if(matrix[i][j]==0){
                        setRow(i,matrix);
                        setCol(j,matrix);
                    }
                }
            }
            for(int i = 0; i<matrix.length; i++){
                for(int j = 0; j<matrix[i].length; j++){
                    if(matrix[i][j]==-1){
                        matrix[i][j] = 0;
                    }
                }
            }

        }
        public static void setRow(int row, int[][] matrix){
            for(int col=0; col<matrix[row].length; col++ ){
                if(matrix[row][col] != 0) matrix[row][col] = -1;
            }
        }
        public static void setCol(int col, int[][] matrix){
            for(int row=0; row<matrix.length; row++ ){
                if(matrix[row][col] != 0)  matrix[row][col] = -1;
            }
        }

}
