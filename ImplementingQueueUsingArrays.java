public class ImplementingQueueUsingArrays {
    class ArrayQueue {
        int size;
        int[] q;
        int start;
        int end;
        int currSize;
        public ArrayQueue(int capacity) {
            size = capacity;
            q = new int[capacity];
            start = end = -1;
            currSize = 0;
        }

        public void push(int x) {
            if(currSize==size) System.out.println("Out Of Bounds");
            if(currSize==0){
                start++;
            }
            end = (end+1)%size;
            q[end] = x;
            currSize++;
        }

        public int pop() {
            if(currSize==0) return -1;
            int val = q[start];
            if(currSize==1){
                start = -1;
                end = -1;
            }
            else{
                start = (start+1)%size;
            }
            currSize--;
            return val;
        }

        public int peek() {
            if(currSize==0) return -1;
            else{
                return q[start];
            }
        }

        public boolean isEmpty() {
            return currSize==0;
        }
    }

}
