import java.util.Scanner;
public class DecimalToBinaryConversion {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String res = "";
        while(n!=0){
            res += n%2;
            n = n/2;
        }
        StringBuilder sb = new StringBuilder(res).reverse();
        System.out.println(sb);
    }
}
