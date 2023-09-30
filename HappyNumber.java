import java.util.HashSet;
class Solution7 {
    public static boolean isHappy(int n) {
        HashSet<Integer> hs = new HashSet<Integer>();
        hs.add(n);
        while(n!=1){
            int temp = n;
            int sum = 0;
            while(temp != 0){
                sum += (int)Math.pow(temp%10,2);
                temp /= 10;
            }
            if(hs.contains(sum)) return false;
            hs.add(sum);
            n=sum;
        }
        return true;

    }
}
public class HappyNumber {
    public static void main(String[] args){
        System.out.println(Solution7.isHappy(19));
        System.out.println(Solution7.isHappy(22));
    }
}
