public class ClearIthBit {
    public static void main(String[] args){
        int num = 13;
        int i = 2;
        int bit = 1;
        System.out.println(num ^ (bit<<i));
    }
}
