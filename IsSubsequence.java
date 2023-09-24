class Solution {
    public static boolean isSubsequence(String s, String t) {
        int j = 0, i = 0;
        while(i<t.length()&& j<s.length()){
            if(t.charAt(i)==s.charAt(j)){
                j++;
            }
            i++;
        }
        return j == s.length();

        // int j = 0;
        // if(s.length()==0) return true;
        // for(int i = 0; i<t.length(); i++){
        //     if(t.charAt(i)==s.charAt(j) ){
        //         j++;
        //         if(j==s.length()) return true;
        //     }
        // }
        // return false;
    }
}
public class IsSubsequence {
    public static void main(String[] args){
        System.out.println(Solution.isSubsequence("abc","adbbghc"));
    }
}
