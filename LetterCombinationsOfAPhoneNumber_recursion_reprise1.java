import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationsOfAPhoneNumber_recursion_reprise1 {
    class Solution {
        public void recurDigits(Map<Character,String> map, int i, String digits, List<String> list, String val){
            if(i==digits.length()){
                list.add(val);
                return;
            }

            char c = digits.charAt(i);
            String str = map.get(c);

            for(int j = 0; j<str.length(); j++){
                recurDigits(map,i+1,digits,list,val+str.charAt(j));
            }

        }
        public List<String> letterCombinations(String digits) {
            Map<Character, String> map = new HashMap<>();
            List<String> list = new ArrayList<>();

            map.put('2',"abc");
            map.put('3',"def");
            map.put('4',"ghi");
            map.put('5',"jkl");
            map.put('6',"mno");
            map.put('7',"pqrs");
            map.put('8',"tuv");
            map.put('9',"wxyz");

            recurDigits( map, 0, digits, list,"");

            return list;

        }
    }
}
