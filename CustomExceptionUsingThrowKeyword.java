import java.util.Scanner;
class UnderAgeException extends Throwable {
    public UnderAgeException(String string){
        super(string);
    }
}
public class CustomExceptionUsingThrowKeyword {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your age: ");
        int age = sc.nextInt();
        try{
            if(age<18) throw new UnderAgeException("Not eligible to vote");
            else{
                System.out.println("Thank you for your valuable vote");
            }
        }
        catch(UnderAgeException uae){
            System.out.println(uae);

        }
    }
}
