import java.util.Scanner;
public class BinaryToDecimalConversion_Optimal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String binary = sc.nextLine();
        int i = binary.length()-1;
        int ans =0;
        int power = 1;
        while(i>=0){
            if(binary.charAt(i)=='1'){
                ans += power;
            }
            power  = power*2;
            i--;
        }
        System.out.println(ans);
    }
}
