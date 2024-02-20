import java.util.ArrayList;
import java.util.List;

public class RecursiveSortingArrayList {
    public static void sort(List<Integer> arr){
        if(arr.size()==1) return;
        int temp = arr.get(arr.size()-1);
        arr.remove(arr.size()-1);
        sort(arr);
        insert(arr,temp);
    }
    public static void insert(List<Integer> arr,int temp){
        if(arr.size()==0||arr.get(arr.size()-1)<=temp) {
            arr.add(temp);
            return;
        }
        int last = arr.get(arr.size()-1);
        arr.remove(arr.size()-1);
        insert(arr,temp);
        arr.add(last);
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(9);
        arr.add(0);
        arr.add(3);
        arr.add(6);
        arr.add(2);
        arr.add(8);
        arr.add(4);
        arr.add(5);
        arr.add(2);
        sort(arr);
        System.out.println(arr);
    }
}
