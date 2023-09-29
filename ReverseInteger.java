class RevInt{
    public static int revInt(int n){
        int rev = 0;
        while(n !=0){
            rev *= 10;
            rev += n%10;
            n /= 10;
        }
        return rev;
    }
}
public class ReverseInteger {
    public static void main(String[] args){
        System.out.println(RevInt.revInt(4567));
    }
}
