import java.util.Scanner;
public class BinaryToOctal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter binary number: ");
        int binary = sc.nextInt();
        int decimal = 0;
        int i = 0;
        while(binary>0){
            decimal += binary%10 * (int)Math.pow(2,i++);
            binary /=10;
        }

        int octal=0;
        i=0;
        while(decimal>0){
            octal *= (int)Math.pow(10,i++);
            octal += decimal%8 ;
            decimal/=8;
        }
        StringBuffer sb = new StringBuffer(Integer.toString(octal));
        System.out.println("Octal equivalent is: "+sb.reverse());
    }
}
