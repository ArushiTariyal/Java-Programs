import java.util.ArrayList;
import java.util.List;

public class InsertionInMaxHeap_re {
    List<Integer> al = new ArrayList<>();
    int ind = 0;

    public void insert(int val){
        al.add(val);
        heapify_up(ind);
        ind += 1;
    }
    public void heapify_up(int ind){
        while(ind>0){
            int parent = (ind-1)/2;
            if(al.get(parent)<al.get(ind)){
                int temp = al.get(parent);
                al.set(parent, al.get(ind));
                al.set(ind, temp);
                ind = parent;
            }
            else break;
        }
    }
    public static void main(String[] args){

    }
}
