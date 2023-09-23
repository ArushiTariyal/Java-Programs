class Solution2 {
    public static boolean isPalindrome(String s) {
        String ss = s.replaceAll("[^A-Za-z0-9]","").toLowerCase();
        int i = 0;
        int j = ss.length()-1;
        while(i<j){
            if(ss.charAt(i) != ss.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
public class PalindromeString {
    public static void main(String[] args){
        System.out.println(Solution2.isPalindrome("A man, a plan, a canal: Panama"));
    }
}
