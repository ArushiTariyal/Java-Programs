
import java.util.HashMap;
import java.util.HashSet;

public class UniqueNumberOfOccurrences {
    public static void main(String[] args){
        HashMap<Integer,Integer> hm = new HashMap();
        int arr[] = {1,3,1,2,3,2,2,4,3,3};
        for(int i:arr){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        HashSet<Integer> hs = new HashSet<>(hm.values());
        if(hs.size()!= hm.values().size()) System.out.println("Not unique occurrences");
        else System.out.println("Unique Occurrences");
    }
}
