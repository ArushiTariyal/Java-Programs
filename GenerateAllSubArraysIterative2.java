import java.util.ArrayList;
import java.util.List;

public class GenerateAllSubArraysIterative2 {
    public static void subArrays(int[] arr){
        for(int i = 0; i<arr.length; i++){
            for(int j = i; j<arr.length; j++){
                List<Integer> l = new ArrayList<>();
                for(int k = i; k<=j; k++){
                    l.add(arr[k]);
                }
                System.out.println(l);
            }
        }
    }
    public static void main(String[] args){
        subArrays(new int[]{1,2,3,-3,1,1,1,4,2,-3});
    }
}

