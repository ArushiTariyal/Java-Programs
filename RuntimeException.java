import java.util.Scanner;
public class RuntimeException {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter dividend: ");
        int dividend = sc.nextInt();;
        System.out.print("Enter divisor: ");
        int divisor = sc.nextInt();
        int quotient;
        String s = null;

        try{
            quotient = dividend/divisor;
            System.out.println(quotient);
            System.out.println(s.length());
        }
        catch(ArithmeticException e){
            System.out.println("Division by zero not allowed "+ e);
        }
        catch(NullPointerException e){
            System.out.println("String not initialized, not declared" + e);
        }
        catch(Exception e){
            System.out.println("Something went wrong "+ e);
        }
    }
}
