public class NumberofSubstringsContainingAllThreeCharacters_Optimal {
    class Solution {
        public int numberOfSubstrings(String s) {
            int[] count = new int[3];
            for(int i = 0; i<count.length; i++){
                count[i] = -1;
            }
            int total = 0;
            for(int i = 0; i<s.length(); i++){
                count[s.charAt(i)-'a'] = i ;
                if(count[0]!=-1 && count[1] !=-1 && count[2]!=-1){
                    total = total + Math.min(Math.min(count[0],count[1]),count[2])+1;
                }
            }
            return total;
        }
    }
}
