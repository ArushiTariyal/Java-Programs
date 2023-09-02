class Banking{
    public Banking(){
        int balance = 234567;
        int withdrawableAmount = 15000;
        int minAmountToMaintain = 10000;
        System.out.println("Balance Available: "+balance);
        System.out.println("Withdrawable Amount: "+withdrawableAmount);
        System.out.println("Minimum Amount to Maintain: "+ minAmountToMaintain);
    }
}
class Atm extends Banking{
    public Atm(){
        super();
        System.out.println("The ATM is currently operational so kingly continue.");
    }
}
class Receipt extends Atm{
    public Receipt(){
        super();
        System.out.println("Soon the receipt of the data will be generated.");
    }
}
public class SuperKeywordWithConstructors {
    public static void main(String[] args){
        new Receipt();
    }
}
