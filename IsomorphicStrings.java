import java.util.HashMap;
class Solution3 {
    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> hm = new HashMap<Character,Character>();

        for(int i = 0; i<s.length(); i++){
            if(!hm.containsKey(s.charAt(i))){
                if(!hm.containsValue(t.charAt(i))) hm.put(s.charAt(i),t.charAt(i));
                else return false;
            }
            else if(hm.get(s.charAt(i))!= t.charAt(i)) return false;
        }
        return true;

    }
}
public class IsomorphicStrings {
    public static void main(String[] args){
        System.out.println(Solution3.isIsomorphic("paper","title"));
    }
}
