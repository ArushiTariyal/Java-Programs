public class InsertionInMaxHeap {
    int[] arr = new int[100];
    int size = 0;

    public void insert(int val){
        size += 1;
        int ind = size;
        arr[ind] = val;

        while(ind>1){
            int parent = ind/2;
            if(arr[parent]<arr[ind]) {
                int temp = arr[parent];
                arr[parent] = arr[ind];
                arr[ind] = temp;
                ind = parent;
            }
            else return;
        }
    }
    public static void main(String[] args){

    }
}
