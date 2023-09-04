import java.util.Scanner;
class Multiplication{
    long a;
    long b;
    long c;
    long mult;
    public Multiplication(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        a = sc.nextLong();
        System.out.print("Enter second integer: ");
        b = sc.nextLong();
        mult = a*b;
        this.Mathematics();
        System.out.println("Multiplication of "+a+" and "+b+" is: "+ mult);
    }
    public Multiplication(long c){
        this();
        this.c = c;
        System.out.println("Multiplying "+c+" with "+mult+" gives: "+ mult*c);
    }
    public void Mathematics(){
        System.out.println("This is a mathematical operation.");
    }
}
public class ThisKeyword {
    public static void main(String[] args){
        new Multiplication(7);
    }
}
