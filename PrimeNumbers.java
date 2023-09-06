import java.util.Scanner;
public class PrimeNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number till where you want to check for prime numbers: ");
        int n = sc.nextInt();
        int count;
        if(n>=2){
            System.out.println("Prime numbers are: ");
            System.out.print(2+" ");
            for(int i = 3; i<=n; i++){
                count = 0;
                for(int j = 2; j < i; j++){
                    if(i%j==0) break;
                    count++;
                }
                if(count == i-2) System.out.print(i+" ");
            }
        }
        else{
            System.out.println("No prime numbers");
        }

    }
}

