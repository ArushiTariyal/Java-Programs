import java.util.Scanner;
public class DecimalToOctal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int decimal = sc.nextInt();
        int octal = 0;
        int tens=1;
        while(decimal>0){
            octal += (decimal%8)*tens;
            decimal /= 10;
            tens *=10;
        }

        System.out.println("Octal equivalent is: "+octal);
    }
}
