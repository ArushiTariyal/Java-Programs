import java.util.Scanner;
public class DiagonalLadderTrianglesPattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of triangles in ladder: ");
        int n = sc.nextInt();
        for(int t = 0; t<n; t++){

            for(int r = 1; r<=n; r++){
                for (int s = 1; s <= (n-1) * t; s++) {
                    System.out.print(" ");
                }

                for(int c = 1; c<=r; c++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }

    }
}
