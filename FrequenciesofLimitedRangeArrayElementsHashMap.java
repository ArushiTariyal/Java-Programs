import java.util.HashMap;
public class FrequenciesofLimitedRangeArrayElementsHashMap {
    public static void frequencyCount(int arr[], int N, int P)
    {
        HashMap<Integer,Integer> hash = new HashMap<>();
        for(int i : arr){
            hash.put(i,hash.getOrDefault(i,0)+1);
        }
        for(int i = 0; i<N; i++){
            arr[i] = hash.getOrDefault(i+1,0);
        }
    }
}
