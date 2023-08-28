import java.util.Scanner;
public class BinaryAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int carry = 0;
        int arr[];
        int sum;
        System.out.print("Enter first binary number: ");
        String bin1 = sc.next();
        System.out.print("Enter second binary number: ");
        String bin2 = sc.next();
        if (bin1.length() > bin2.length()) {
            arr = new int[bin1.length() + 1];
        } else arr = new int[bin2.length() + 1];
        int a = Integer.parseInt(bin1);
        int b = Integer.parseInt(bin2);

        while (a != 0 || b != 0) {
            sum = a % 10 + b % 10 + carry;
            arr[i] = sum % 2;
            carry = sum / 2;
            i++;
            a /= 10;
            b /= 10;
        }
        if (carry == 1) {
            arr[i] = 1;
            for (int j = arr.length - 1; j >= 0; j--) {
                System.out.print(arr[j]);

            }
        }
        else{
                for (int j = arr.length - 2; j >= 0; j--) {
                    System.out.print(arr[j]);
                }
        }
    }
}
