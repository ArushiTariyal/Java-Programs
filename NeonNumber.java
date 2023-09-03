import java.util.Scanner;
public class NeonNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        int square = (int) Math.pow(num,2);
        int sum = 0;
        while(square!=0){
            int digit = square%10;
            sum += digit;
            square /= 10;
        }
        if(sum==num) System.out.println(num+" is a Neon number");
        else System.out.println(num+ " is not a Neon number");
    }
}
