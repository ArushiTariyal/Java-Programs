class Solution5 {
    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        char[] count = new char[26];
        for(int i = 0; i<s.length(); i++){
            count[s.charAt(i)-'a']++;
            count[t.charAt(i)-'a']--;
        }
        for(int i: count){
            if(i!=0) return false;
        }
        return true;
    }
}
public class ValidAnagram {
    public static void main(String[] args){
        System.out.println(Solution5.isAnagram("anagram","nagaram"));
        System.out.println(Solution5.isAnagram("car","rat"));
    }
}
