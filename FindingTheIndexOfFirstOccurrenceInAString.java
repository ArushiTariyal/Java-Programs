class Solution1 {
    public static int strStr(String haystack, String needle) {
        //return haystack.indexOf(needle);
        for(int i = 0; i<= haystack.length()-needle.length();i++){
            if(haystack.charAt(i)==needle.charAt(0)){
                if(haystack.substring(i, i+needle.length()).equals(needle)) return i;
            }
        }
        return -1;
    }
}public class FindingTheIndexOfFirstOccurrenceInAString {
    public static void main(String[] args){
        System.out.println(Solution1.strStr("happybuthappy","happy"));
    }
}
