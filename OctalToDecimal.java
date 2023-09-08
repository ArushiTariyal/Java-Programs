import java.util.Scanner;

public class OctalToDecimal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter octal number: ");
        int octal = sc.nextInt();
        int decimal = 0;
        int i = 0;
        while(octal>0){
            decimal += (octal%10)*(int)Math.pow(8,i++);
            octal /=10;
        }
        System.out.println(decimal);

    }
}
