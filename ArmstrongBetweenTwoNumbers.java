import java.util.Scanner;
public class ArmstrongBetweenTwoNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the start of range: ");
        int startingNum = sc.nextInt();
        System.out.print("Enter the ending of range: ");
        int count = 0;
        int endingNum = sc.nextInt();
        for(int n = startingNum; n<=endingNum; n++) {
            int armstrong = 0;
            int num = n;
            while (num != 0) {
                int digit = num % 10;
                armstrong += (int) Math.pow(digit, 3);
                num /= 10;

            }
            count++;
            if(count == 1){
                System.out.println("Armstrong Numbers: ");
                count++;
            }
            if(armstrong == n) System.out.println(n);
        }

    }
}
