import java.util.*;
public class PrintPascalTriangle {
    public static int[][] pascalTriangle(int N) {
        // Write your code here.
        int[][] finalans = new int[N][];
        int j = 0;
        for(int row = 1; row<=N; row++){
            int[] temp =  new int[row];
            int k = 0;
            int ans = 1;
            temp[k++] = ans;
            for(int col = 1; col <row; col++){
                ans = ans * (row-col);
                ans = ans/col;
                temp[k++] = ans;
            }
            finalans[j++] = temp;
        }
        return finalans;

    }
}
