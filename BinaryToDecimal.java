import java.util.Scanner;
public class BinaryToDecimal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter binary number: ");
        int binary = sc.nextInt();
        int decimal =0;
        int i = 0;
        do {
            decimal += (binary % 10) * (int) Math.pow(2, i);
            binary = binary/10;
            i++;
        }while(binary>0);
        System.out.println(decimal);
    }
}
