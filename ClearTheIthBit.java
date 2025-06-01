public class ClearTheIthBit {
    public static void main(String[] args) {
        int n = 13;
        int bit = 1;
        int i = 2;
        System.out.println(n & ~(bit<<i));
    }
}
