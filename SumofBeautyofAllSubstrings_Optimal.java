public class SumofBeautyofAllSubstrings_Optimal {
    class Solution {
        public int beautySum(String s) {
            int beauty = 0;
            for(int i = 0; i<s.length(); i++){
                int[] count = new int[26];

                for(int j = i; j<s.length(); j++){
                    count[s.charAt(j)-'a'] += 1;
                    int max = Integer.MIN_VALUE;
                    int min = Integer.MAX_VALUE;
                    for(int k = 0; k<26; k++){
                        if(count[k]>0){
                            max = Math.max(max,count[k]);
                            min = Math.min(min,count[k]);
                        }
                    }
                    beauty += max-min;
                }
            }
            return beauty;
        }
    }
}
