import java.util.ArrayList;
import java.util.List;

public class Substrings2 {
    public static void substring(String s, List<List<String> >ll){
        for(int i=0; i<s.length(); i++){
            List<String> l = new ArrayList<>();
            for(int j=i+1; j<=s.length();j++){
               l.add(s.substring(i,j));
            }
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

