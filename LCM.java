import java.util.Scanner;
public class LCM {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter fist number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int lcm = (Math.max(a,b)%Math.min(a,b)==0)? Math.max(a,b) : a*b;
        System.out.println("LCM is "+lcm);
    }
}
