public class CheckIfNumberIsPowerOfTwo {
    public static void main(String[] args){
        int num = 16;
        if((num & (num-1))==0) System.out.println("True");
        else System.out.println("False");
    }

}
