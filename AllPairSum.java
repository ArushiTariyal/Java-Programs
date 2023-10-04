
import java.util.Map.Entry;
import java.util.TreeMap;

class PairSum{
    public static void Sum(int[] arr, int sum){
        TreeMap<Integer,Integer> tm = new TreeMap<>();
        for(int i = 0; i<arr.length-1; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i]+arr[j]==sum) tm.put(Math.min(arr[i],arr[j]),Math.max(arr[i],arr[j]));
            }
        }
        for(Entry<Integer,Integer> entry: tm.entrySet()){
            System.out.println(entry.getKey()+","+entry.getValue());
        }
    }
}
public class AllPairSum {
    public static void main(String[]args) {
        PairSum.Sum(new int[]{1,3,5,6,9,7,8},10);
    }
}
