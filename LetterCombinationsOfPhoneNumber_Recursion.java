import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsOfPhoneNumber_Recursion {
    class Solution {
        public static void getAllCombinations(String[] arr, String digits, String str, int ind, List<String> ans){
            if(ind==digits.length()){
                ans.add(str);
                return;
            }

            String alphabetString = arr[digits.charAt(ind)-'0'];
            for(int i = 0; i< alphabetString.length(); i++){
                getAllCombinations(arr, digits,str + alphabetString.charAt(i), ind+1, ans);
            }
        }
        public List<String> letterCombinations(String digits) {
            if(digits.equals("")) return new ArrayList<>();
            String[] array = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
            String str = "";
            List<String> ans = new ArrayList<>();
            getAllCombinations(array,digits,str,0,ans);
            return ans;
        }
    }
}
