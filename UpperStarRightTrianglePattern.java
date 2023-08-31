import java.util.Scanner;
public class UpperStarRightTrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        int k;
        for(int i = 1; i<=n; i++){
            for(k = 1; k<= n-i; k++) System.out.print(" ");
            for(int j = k; j<=n; j++) System.out.print("*");
            System.out.println();
        }

    }
}
