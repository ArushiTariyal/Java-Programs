import java.util.Scanner;

public class PyramidOf1_0 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 1;
        for(int r = 1; r<=n; r++){
            for(int c = 1; c<=r; c++){
                System.out.print(a);
                a = 1-a;
            }
            System.out.println();
        }
    }
}
