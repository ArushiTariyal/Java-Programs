import java.util.HashMap;
public class IsomorphicString_Optimal {
    class Solution {
        public boolean isIsomorphic(String s, String t) {
            int n = s.length();
            int m = t.length();
            if(n != m) return false;
            HashMap<Character, Character> hm = new HashMap<>();
            for(int i = 0; i<n; i++){
                if(hm.containsKey(s.charAt(i))){
                    if(hm.get(s.charAt(i))!=t.charAt(i)) return false;
                }
                else{
                    if(hm.containsValue(t.charAt(i))) return false;
                    hm.put(s.charAt(i),t.charAt(i));
                }
            }
            return true;
        }
    }
}
