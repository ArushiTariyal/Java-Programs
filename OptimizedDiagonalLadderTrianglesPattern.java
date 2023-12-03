import java.util.Scanner;

public class OptimizedDiagonalLadderTrianglesPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of triangles in ladder: ");
        int n = sc.nextInt();
        int sp = 0;
        int count = 1;
        for(int r = 1; r<=n*n; r++){
            if(r%n==1 && r!=1) {
                sp += (n-1);
                count = 1;
            }
            for(int s = 1; s<=sp; s++) System.out.print(" ");
            for(int c = 1; c<=count; c++){
                System.out.print("*");
            }
            count++;
            System.out.println();
        }
    }
}
