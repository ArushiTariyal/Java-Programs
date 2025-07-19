import java.util.ArrayList;
import java.util.List;

public class DeletionInMinHeap {
    List<Integer> al = new ArrayList<>();

    public void deleteMin(){
        if(al.isEmpty()) return;

        al.set(0,al.get(al.size()-1));

        al.remove(al.size()-1);

        heapify_down(0);
    }
    public void heapify_down(int ind){
        int size = al.size();
        while(ind<size){
            int parent = ind;
            int rchild = 2*ind + 2;
            int lchild = 2*ind + 1;

            if(lchild<size && al.get(parent)>al.get(lchild)) parent = lchild;
            if(rchild<size && al.get(parent)>al.get(rchild)) parent = rchild;

            if(parent != ind){
                int temp = al.get(parent);
                al.set(parent, al.get(ind));
                al.set(ind, temp);
                ind = parent;
            }
            else break;
        }
    }
    public static void main(String[] args){
        DeletionInMinHeap dimh = new DeletionInMinHeap();
        dimh.al.add(4);
        dimh.deleteMin();
    }
}
