import java.util.HashMap;
class Solution4 {
    public static boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> hm = new HashMap<Character,String>();
        String[] sArr = s.split(" ");
        if(pattern.length() != sArr.length) return false;
        for(int i = 0; i<pattern.length(); i++){
            char c = pattern.charAt(i);
            String ss = sArr[i];
            if(hm.containsKey(c)){
                if(!hm.get(c).equals(ss)) return false;
            }
            else{
                if(hm.containsValue(ss)) return false;
                else{
                    hm.put(c,ss);
                }
            }
        }
        return true;
    }
}
public class WordPatternSequence {
    public static void main(String[] args){
        System.out.println(Solution4.wordPattern("abba","dog cat cat dog"));
        System.out.println(Solution4.wordPattern("abba","dog cat cat fish"));
        System.out.println(Solution4.wordPattern("aaa","aa aa aa aa"));
    }
}
