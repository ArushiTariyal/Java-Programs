import java.util.Scanner;
class Account{
    private double balance;
    public void setBalance(double amount){
        this.balance = this.balance+amount;
    }
    public double getBalance(){
        return balance;
    }
}
public class DataHiding {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Account acc = new Account();
        String conti = "y";
        while(conti.equals("y")){
            System.out.print("Choose from the following operations:\na: Enter some amount\nb: Check the balance\n-> ");
            String option = sc.next();

            switch (option) {
                case "a":
                    System.out.print("Enter the amount to deposit: ");
                    double amount = sc.nextDouble();
                    acc.setBalance(amount);
                case "b":
                    System.out.println("Balance is " + acc.getBalance());

            }
            System.out.print("Want to continue? y/n: ");
            conti = sc.next();
        }
    }
}
