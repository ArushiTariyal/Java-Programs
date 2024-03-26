import java.util.ArrayList;
import java.util.List;

public class CountOccurrencesOfAnagramBrute {

    public static void anagrams(String ip, int i, String op, List<String> ans,boolean[] mark){

        if(i>=ip.length()){
            ans.add(op);
            return;
        }
        for(int j = 0; j<=ip.length()-1; j++){
            if(!mark[j]) {
                mark[j] = true;
                anagrams(ip, i + 1, op + ip.charAt(j), ans,mark);
                mark[j] = false;
            }
        }
    }
    public static void countAnagram(List<String> ans, String given){
        int count = 0;
        for(int i = 0; i<=ans.size()-1; i++) {
            if (given.contains(ans.get(i))) count++;

        }
        System.out.println(count);
    }
    public static void main(String[] args){
        String given = "abcabcaaabcaaaabcc";
        List<String> ans = new ArrayList<>();
        String ip = "abc";
        boolean[] mark = new boolean[ip.length()];
        anagrams(ip,0,"",ans,mark);
        System.out.println(ans);
        countAnagram(ans,given);
    }
}
