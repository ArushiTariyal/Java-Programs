import java.util.*;
public class FruitIntoBasket_Optimal {
    class Solution {
        public int totalFruits(int[] fruits) {
            //your code goes here
            int maxlen = 0;
            int l = 0, r = 0;
            Map<Integer,Integer> hm = new HashMap<>();
            while(r<fruits.length){
                hm.put(fruits[r],hm.getOrDefault(fruits[r],0)+1);
                if(hm.size()>2){
                    hm.put(fruits[l],hm.get(fruits[l])-1);
                    if(hm.get(fruits[l])==0) hm.remove(fruits[l]);
                    l++;

                }
                if(hm.size()<=2){
                    maxlen = Math.max(maxlen,r-l+1);
                }
                r++;
            }
            return maxlen;
        }
    }
}
