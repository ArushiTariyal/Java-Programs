import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AllSubstrings {
    public static void substring(String s, List<List<String> >ll){
        for(int i=0; i<s.length(); i++){
            List<String> l = new ArrayList<>();
            for(int k = s.length()-1; k>=i; k--){
                String w = "";
                for(int j = i; j<=k ;j++){
                    w += s.charAt(j);
                }
                l.add(w);
            }
            System.out.println(l);
            ll.add(l);
        }

    }
    public static void main(String[] args) {

        List<List<String>> ll = new ArrayList<>();
        String s = "aplezi";
        substring(s,ll);
        System.out.println(ll);


    }
}
