public class CheckIfIthBitIsSet {
    public static void main(String[] args){
        int num = 13;
        int i = 2;
        int bit = 1;
        if((num & (bit<<i))!=0) System.out.println(1);
        else System.out.println(0);
    }
}
