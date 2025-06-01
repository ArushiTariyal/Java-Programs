public class CheckIfNumberIsOddOrNot {
    public static void main(String[] args){
        int num = 12;
        if((num & 1) == 1) System.out.println("Odd");
        else System.out.println("Even");
    }
}
