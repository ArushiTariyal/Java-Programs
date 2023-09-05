class Month{
    static String startingMonth;
    static int monthNumber;
    static{
        startingMonth = "January";
        monthNumber = 1;
        System.out.println("The first month of the year: "+startingMonth);
        System.out.println("The month number is: "+monthNumber);
    }
}
public class StaticBlock {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("Month");
        Month.startingMonth = "February";
        Month.monthNumber = 2;
        System.out.println("Second month is: "+Month.startingMonth);
        System.out.println("The month number is: "+Month.monthNumber);
    }
}
