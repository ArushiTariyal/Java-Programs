import java.util.Stack;
public class ImplementQueueUsingStacks_Approach2 {
    class MyQueue {
        Stack<Integer> st1;
        Stack<Integer> st2;
        public MyQueue() {
            st1 = new Stack<>();
            st2 = new Stack<>();
        }

        public void push(int x) {
            st1.push(x);
        }

        public int pop() {
            if(st2.size()!=0) return st2.pop();
            while(st1.size()!=0){
                st2.push(st1.pop());
            }
            return st2.pop();
        }

        public int peek() {
            if(st2.size()!=0) return st2.peek();
            while(st1.size()!=0){
                st2.push(st1.pop());
            }
            return st2.peek();
        }

        public boolean empty() {
            return st2.size()==0 && st1.size()==0;
        }
    }

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
}
