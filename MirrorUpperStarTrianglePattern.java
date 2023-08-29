import java.util.Scanner;

public class MirrorUpperStarTrianglePattern {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = sc.nextInt();
        int row = 1;
        for(row=1; row<= 2*n-1; row++){
            int columnInRow = (row<=n)? row: 2*n-row;
            int blanks = n-columnInRow;
            for(int blank = 1; blank<=blanks; blank++) System.out.print(" ");
            for(int col=1; col<=columnInRow; col++) System.out.print("* ");
            System.out.println();

        }

    }
}
