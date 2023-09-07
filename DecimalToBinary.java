import java.util.Scanner;
public class DecimalToBinary {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int decimal = sc.nextInt();
        String binary="";
        do{
            binary = binary + decimal%2;
            decimal = decimal/2;
        }while(decimal >0);
        StringBuffer sb = new StringBuffer(binary);
        System.out.println(sb.reverse());
    }
}
