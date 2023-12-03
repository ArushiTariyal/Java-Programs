import java.util.Scanner;

public class AlphabetsRectangleWithSpacePyramid {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        int c;
        for(int r = n; r>=1; r--){
            for(c = 1; c<=r; c++)System.out.print((char)(c+64));
            for(int s = 1; s<= 2*(n-r)-1; s++) System.out.print(" ");
            if(r==n) c -= 2;
            else c--;
            for(int m = c; m>=1; m--) System.out.print((char)(m+64));
            System.out.println();
        }
    }
}
