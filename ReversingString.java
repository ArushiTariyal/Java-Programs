import java.util.Scanner;
public class ReversingString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String revStr = "";
        for(int i =str.length()-1;i>=0; i--){
            revStr += str.charAt(i);
        }
        System.out.println(revStr);
    }
}
