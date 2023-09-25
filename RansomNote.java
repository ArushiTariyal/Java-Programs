import java.util.HashMap;
public class RansomNote {
    public static void main(String[] args){
        System.out.println(canConstruct("a car","a carriage"));
    }
    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap <Character, Integer> hm = new HashMap<Character, Integer>();
        for(Character e: magazine.toCharArray()){
            hm.put(e, hm.getOrDefault(e,0)+1);
        }
        for(Character e: ransomNote.toCharArray()){
            if(!hm.containsKey(e) || hm.get(e) ==0) return false;
            hm.put(e, hm.get(e)-1);
        }
        return true;
    }
}
