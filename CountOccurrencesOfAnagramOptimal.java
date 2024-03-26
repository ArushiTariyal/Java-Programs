import java.util.HashMap;
import java.util.Map;

public class CountOccurrencesOfAnagramOptimal {
    public static void count(String given, int k, String substr){
        int j = 0, i=0;
        Map<Character,Integer> hash = new HashMap<>();
        for(int h = 0; h<=substr.length()-1;h++){
            char c = substr.charAt(h);
            hash.put(c,hash.getOrDefault(c,0)+1);
        }
        int count = hash.size();
        int anagramCount = 0;
        while(j<given.length()){
            char c = given.charAt(j);
            if(hash.containsKey(c)){
                hash.put(c,hash.get(c)-1);
                if(hash.get(c)==0) count--;
            }

            if(j-i+1<k) j++;
            else if(j-i+1==k){
                if(count==0) anagramCount++;
                if(hash.containsKey(given.charAt(i))) {
                    hash.put(given.charAt(i), hash.get(given.charAt(i)) +1);
                    if (hash.get(given.charAt(i)) == 1 ) count++;
                }
                i++;
                j++;
            }
        }
        System.out.println(anagramCount);
    }
    public static void main(String[] args){
        String given = "forxxorfxdofr";
        String substr = "for";
        count(given,substr.length(),substr);
    }
}
