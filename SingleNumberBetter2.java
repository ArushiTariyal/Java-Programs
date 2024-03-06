import java.util.HashMap;
import java.util.Map;

public class SingleNumberBetter2 {
    public static void find(int[] a){
        Map<Integer, Integer> m  =new HashMap<>();
        for(int i = 0; i<=a.length-1; i++){
            if(m.containsKey(a[i])) m.put(a[i],m.get(a[i])+1);
            else m.put(a[i],1);
        }
        for(Map.Entry<Integer,Integer> e: m.entrySet()){
            if(e.getValue()==1) System.out.println(e.getKey());
        }
    }

    public static void main(String[] args) {
       find(new int[]{1,3,2,1,2,3,4,5,4});
    }
}
