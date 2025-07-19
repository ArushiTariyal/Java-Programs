import java.util.ArrayList;
import java.util.List;

public class DeletionInMaxHeap {
    List<Integer> al = new ArrayList<>();

    public void deletionMax(){
        if(al.isEmpty()) return;

        al.set(0,al.get(al.size()-1));
        al.remove(al.size()-1);
        heapify_down(0);
    }
    public void heapify_down(int ind){
        while(ind<al.size()){
            int parent = ind;
            int lchild = 2*ind + 1;
            int rchild = 2*ind + 2;

            if(lchild<al.size() && al.get(parent)<al.get(lchild)) parent = lchild;
            if(rchild < al.size() && al.get(parent)<al.get(rchild)) parent = rchild;

            if(parent!=ind){
                int temp = al.get(parent);
                al.set(parent, al.get(ind));
                al.set(ind, temp);
                ind = parent;
            }
            else break;
        }
    }
    public static void main(String[] args){
        DeletionInMaxHeap dimh = new DeletionInMaxHeap();
        dimh.al.add(4);
        dimh.deletionMax();
    }
}
