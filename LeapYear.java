import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = sc.nextInt();
        String result = (year%4==0)?((year%100==0)?((year%400==0)?"Century Leap Year":"Not a Century Leap Year") :"Non-Century Leap Year"):"Not a Leap Year";
        System.out.println(result);
    }
}
