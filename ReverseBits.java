class Solution14 {
    public static int reverseBits(int n){
        int revBits = 0;
        int i = 1;
        while(i<=String.valueOf(n).length()){
            revBits <<= 1;
            if((n&1)==1){
                revBits +=1;
            }
            n >>>=1;
            i++;
        }
        return revBits;
    }
}
public class ReverseBits {
    public static void main(String[] args) {
        System.out.println(Solution14.reverseBits(0011101010101));
    }
}
