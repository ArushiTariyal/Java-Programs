import java.util.Scanner;
public class DownwardTriangleStarPattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++){
            for(int j = 1; j <= n-i+1; j++) System.out.print("*");
            System.out.println();
        }
    }
}
