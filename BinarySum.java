public class BinarySum {
    public static void main(String[] args){
        System.out.println(Solution13.addBinary("1010","111101"));
    }
}
class Solution13 {
    public static String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length()-1;
        int j = b.length()-1;
        int carry = 0;
        while(i>=0 || j>=0 || carry==1){
            if(i>=0) carry += a.charAt(i--)-'0';
            if(j>=0) carry += b.charAt(j--)-'0';
            sb.append(carry%2);
            carry /=2;
        }
        return sb.reverse().toString();
    }
}