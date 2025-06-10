import java.util.Stack;
public class ImplementingQueueUsingStack_Approach1 {
    class MyQueue {
        Stack<Integer> st1;
        Stack<Integer> st2;
        public MyQueue() {
            st1 = new Stack<>();
            st2 = new Stack<>();
        }

        public void push(int x) {
            int i = 0;
            while(i<st1.size()){
                st2.push(st1.pop());
            }
            st1.add(x);
            i = 0;
            while(i<st2.size()){
                st1.push(st2.pop());
            }
        }

        public int pop() {
            return st1.pop();
        }

        public int peek() {
            return st1.peek();
        }

        public boolean empty() {
            return st1.size()==0;
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
