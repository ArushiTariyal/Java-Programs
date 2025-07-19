import java.util.ArrayList;
import java.util.List;

public class InsertionInMinHeap {
    List<Integer> al = new ArrayList<>();
    int count = 0;

    public void insert(int val){
       al.add(val);
       heapify_up(count);
       count += 1;
    }
    public void heapify_up(int count)  {

        while(count>0){
            int parent = (count-1)/2;
            if(al.get(parent)>al.get(count)){
                int temp = al.get(parent);
                al.set(parent, al.get(count));
                al.set(count, temp);
                count = parent;
            }
            else break;
        }
    }
    public static void main(String[] args){

    }
}
