import java.util.Scanner;

public class NumberOfMoneyNotes {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        int n = sc.nextInt();
        int start = 1;
        switch(start){
            case 1:
                System.out.println("You need "+n/100+" notes of Rs 100");
                n -= 100*(n/100);
            case 2:
                System.out.println("You need "+n/50+" notes of Rs 50");
                n -= 50*(n/50);
            case 3:
                System.out.println("You need "+n/20+" notes of Rs 20");
                n -= 20*(n/20);
            default:
                System.out.println("You need "+n+" notes of Rs 1");
        }
    }
}
