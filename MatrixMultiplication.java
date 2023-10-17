import java.util.Scanner;

public class MatrixMultiplication {
    public static int[][] matrix(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int row = sc.nextInt();
        System.out.print("Enter cols: ");
        int col = sc.nextInt();
        int[][] z = new int[row][col];
        for(int i = 0; i<row; i++){
            for(int j = 0; j< col; j++){
                z[i][j] = sc.nextInt();
            }
        }
        return z;
    }
    public static int[][] multiplication(){
        int[][] a = matrix();
        int[][] b = matrix();
        int ar = a.length;
        int ac = a[0].length;
        int br = b.length;
        int bc = b[0].length;
        if(ac!=br) return new int[0][0];;
            int[][] c = new int[ar][bc];
            for (int i = 0; i < ar; i++) {
                for (int j = 0; j < bc; j++) {
                    c[i][j] = 0;
                    for (int k = 0; k < br; k++) {
                        c[i][j] += a[i][k] * b[k][j];
                    }
                }
            }
            return c;

    }
    public static void main(String[] args){
        int[][] c = multiplication();
        for(int[] e: c){
            for(int ee: e)System.out.print(ee+" ");
            System.out.println();
        }
    }
}
