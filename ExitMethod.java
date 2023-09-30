import java.util.Scanner;
public class ExitMethod {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("Enter an integer: ");
            int n = sc.nextInt();
            switch(n){
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                default:
                    System.out.println("Number greater than two");
                    System.exit(0);
            }
        }
    }
}
