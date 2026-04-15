import java.util.ArrayList;
import java.util.List;

public class ImplementMinHeap {
    class Solution {
        List<Integer> list;
        int count = 0;
        public void initializeHeap() {
            list = new ArrayList<>();
            count = 0;
        }
        public void heapifyUp(List<Integer> list, int c){
            int ind = c;
            int parentind = (ind-1)/2;

            if(ind> 0 && list.get(parentind) > list.get(ind)){
                int val = list.get(ind);
                list.set(ind, list.get(parentind));
                list.set(parentind, val);
                heapifyUp(list,parentind);
            }
            return;

        }

        public void insert(int key) {
            list.add(key);
            heapifyUp(list,count);
            count++;
            return;
        }

        public void changeKey(int index, int newVal) {
            if(list.get(index)> newVal){
                list.set(index, newVal);
                heapifyUp(list, index);
            }
            else{
                list.set(index,newVal);
                heapifyDown(list,index);
            }
            return;
        }
        public void heapifyDown(List<Integer> list, int ind){
            int n = list.size();
            int smallest= ind;
            int left = 2*ind + 1;
            int right = 2*ind + 2;

            if(left<n && list.get(left)<list.get(smallest)){
                smallest = left;
            }
            if(right<n && list.get(right)<list.get(smallest)){
                smallest = right;
            }

            if(smallest != ind){
                int temp = list.get(smallest);
                list.set(smallest, list.get(ind));
                list.set(ind, temp);

                heapifyDown(list, smallest);
            }

            return;
        }

        public void extractMin() {
            int el = list.get(0);
            int last = count-1;
            list.set(0, list.get(last));
            list.set(last, el);
            list.remove(count-1);
            count = count-1;
            if(count>0) heapifyDown(list,0);
        }

        public boolean isEmpty() {
            return count==0;
        }

        public int getMin() {
            return list.get(0);
        }

        public int heapSize() {
            return count;
        }
    }
}
