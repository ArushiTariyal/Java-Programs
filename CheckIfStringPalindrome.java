public class CheckIfStringPalindrome {
    public static boolean checkPalindrome(String str){
        String newStr = str.replaceAll("[^A-Za-z0-9]","").toLowerCase();
        int s = 0, e = newStr.length()-1;
        while(s<e){
            if(newStr.charAt(s++)!=newStr.charAt(e--)) return false;
        }
        return true;
    }
    public static void main(String[] args){
        System.out.println(checkPalindrome("java099 0: avaj"));
        System.out.println(checkPalindrome("programming in java"));
    }
}
