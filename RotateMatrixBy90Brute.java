public class RotateMatrixBy90Brute {
    public static void rotate(int[][] matrix){
        int[][] mat = new int[matrix[0].length][matrix.length];
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                mat[j][(n-1)-i] = matrix[i][j];
            }
        }
        for(int[] e: mat){
            for(int ee: e){
                System.out.print(ee+" ");
            }
            System.out.println();
        };
    }
    public static void main(String[] args){
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(matrix);
    }
}
