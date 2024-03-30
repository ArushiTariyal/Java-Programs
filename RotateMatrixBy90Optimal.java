public class RotateMatrixBy90Optimal {
    public static void rotate(int[][] matrix){
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i = 0; i<n-1; i++){
            for(int j = i+1; j<m; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i = 0; i<n; i++){
            int s = 0, e = matrix[i].length;
            while(s<e){
                int temp = matrix[i][s];
                matrix[i][s] = matrix[i][e];
                matrix[i][e] = temp;
                s++;
                e--;
            }
        }
    }
    public static void main(String[] args){

    }
}
