import java.util.*;
public class FruitIntoBaskets_Brute {
    class Solution {
        public int totalFruits(int[] fruits) {
            //your code goes here
            int total = 0;
            for(int i = 0; i<fruits.length; i++){
                Set<Integer> set = new HashSet<>();
                for(int j =i; j<fruits.length; j++){
                    set.add(fruits[j]);
                    if(set.size()<=2) total = Math.max(total,j-i+1);
                    else break;
                }
            }
            return total;
        }
    }
}
