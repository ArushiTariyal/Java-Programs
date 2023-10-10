class Solution17 {
    public static boolean isPalindrome(int x) {
        int rev = 0;
        if(x!=0 && x%10==0) return false;
        while(x>rev){
            rev = rev*10 + x%10;
            x /=10;
        }
        return rev==x || rev/10 ==x;

    }
}
public class PalindromeNumber {
    public static void main(String[] args){
        System.out.println(Solution17.isPalindrome(-121));
        System.out.println(Solution17.isPalindrome(-10));
        System.out.println(Solution17.isPalindrome(13431));
        System.out.println(Solution17.isPalindrome(0));
        System.out.println(Solution17.isPalindrome(-789987));
        System.out.println(Solution17.isPalindrome(789687));
    }
}
