import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms you want in Fibonacci series: ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.print(a+" ");
        System.out.print(b+" ");
        while(n-2 > 0){
            int c = a+b;
            a=b;
            b=c;
            System.out.print(c+" ");
            n--;
        }
    }
}
