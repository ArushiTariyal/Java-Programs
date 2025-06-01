public class CheckIfBitIsSet_RightShift {
    public static void main(String[] args){
        int num = 13;
        int i = 2;
        if(((num>>i) & 1)==1) System.out.println(1);
        else System.out.println(0);
    }
}
