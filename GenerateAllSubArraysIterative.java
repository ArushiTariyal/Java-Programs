import java.util.ArrayList;
import java.util.List;

public class GenerateAllSubArraysIterative {
    public static void subArrays(int[] arr){
        for(int i = 0; i<arr.length; i++){
            List<Integer> l = new ArrayList<>();
            for(int j = i; j<arr.length; j++){
                if(l.size()==0) {
                    l.add(arr[j]);

                }
                else{
                    List<Integer> n = new ArrayList<>(l);
                    n.add(arr[j]);
                    l=n;
                }
                System.out.println(l);
            }
        }
    }
    public static void main(String[] args){
        subArrays(new int[]{1,2,3,-3,1,1,1,4,2,-3});
    }
}
