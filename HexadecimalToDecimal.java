import java.util.Scanner;

public class HexadecimalToDecimal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Hexadecimal: ");
        String hexa = sc.next();
        int decimal = 0;
        int len = hexa.length();
        int sixteens = 1;
        for(int i = len-1; i>=0; i--){
            if(hexa.charAt(i)>='0' && hexa.charAt(i)<='9'){
                decimal += (hexa.charAt(i)-48)*sixteens;
            }
            else if(hexa.charAt(i)>='A'&&hexa.charAt(i)<='F'){
                decimal += (hexa.charAt(i)-55)*sixteens;
            }
            sixteens *= 16;
        }
        System.out.println("Decimal equivalent is: "+decimal);
    }
}
