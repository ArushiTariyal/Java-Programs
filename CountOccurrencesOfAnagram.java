import java.util.HashMap;
import java.util.Map;

public class CountOccurrencesOfAnagram {
    public static int countAnagram(String ip,int k,Map<Character,Integer> hash,int count){
        int j = 0;
        int i = 0;
        int anagramCount = 0;
        while(j<=ip.length()-1){
            char ch = ip.charAt(j);
            if(hash.containsKey(ch)) {
                hash.put(ch,hash.get(ch)-1);
                if(hash.get(ch)==0) count--;
            }
            if(j-i+1<k) j++;
            else if(j-i+1==k){
                if(count==0) anagramCount++;
                ch = ip.charAt(i);
                if(hash.containsKey(ch)){
                    hash.put(ch,hash.get(ch)+1);
                    if(hash.get(ch)==1) count++;
                }
                i++;
                j++;
            }
        }
        return anagramCount;
    }
    public static void main(String[] args) {
        String ip = "kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk";
        String word = "kkkkk";
        Map<Character, Integer> hash = new HashMap<>();
        for(int i = 0; i<=word.length()-1; i++){
            char ch = word.charAt(i);
            hash.put(ch,hash.getOrDefault(ch,0)+1);
        }
        int count = hash.size();
        System.out.println(countAnagram(ip,word.length(),hash,count));
    }

}
