public class ImplementingStackUsingArrays {
    class ArrayStack {
        int top;
        int[] st;
        public ArrayStack(int capacity) {
            top = -1;
            st = new int[capacity];
        }
        
        public void push(int x) {
            if(top>=st.length-1) System.out.println("Out of Bounds");
            else{
                top++;
                st[top] = x;
            }
        }

        public int pop() {
            if(top!=-1) top--;
            return top;
        }

        public int top() {
            return st[top];
        }

        public boolean isEmpty() {
            return top==-1;
        }
    }

}
