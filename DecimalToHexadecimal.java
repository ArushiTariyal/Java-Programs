import java.util.Scanner;

public class DecimalToHexadecimal {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        int decimal = sc.nextInt();
        String hexa = "";
        int rem;
        while(decimal>0){
            rem = decimal%16;
            if(rem<=9){
                hexa += rem;
            }
            else if(rem>=10){
                hexa += (char)(55+rem);
            }
            decimal /=16;
        }
        StringBuilder sb = new StringBuilder(hexa);
        System.out.println(sb.reverse());
    }
}
