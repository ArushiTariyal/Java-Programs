class CheckingPowerOfTwo{
    public static Boolean checking(long n){
        int ans = 1;
        if(n==1) return true;
        for(int i = 1; i<=30; i++){
            ans *= 2;
            if(ans == n) return true;
        }
        return false;
    }
}
public class PowerOfTwo {
    public static void main(String[] args){
        System.out.println(CheckingPowerOfTwo.checking(1073741824));
        System.out.println(CheckingPowerOfTwo.checking(2147483648l));
    }
}
