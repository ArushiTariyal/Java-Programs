class Solution15 {
    public static int hammingWeight(int n) {
        int count = 0;
        while(n!=0){
            if((n&1)==1) count++;
            n>>>=1;
        }
        return count;
    }
}
public class NumberOf1Bits {
    public static void main(String[] args){
        System.out.println(Solution15.hammingWeight(00010101110101));
    }
}
