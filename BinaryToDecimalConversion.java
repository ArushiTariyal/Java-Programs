import java.util.Scanner;
public class BinaryToDecimalConversion {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String binary = sc.nextLine();
        int i = 0;
        int decimal = 0;
        while(i!=binary.length()){
            decimal += (int) ((binary.charAt(binary.length()-1-i)-'0')*Math.pow(2,i));
            i++;
        }
        System.out.println(decimal);
    }
}
