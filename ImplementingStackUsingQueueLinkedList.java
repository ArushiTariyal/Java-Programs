import java.util.LinkedList;
import java.util.Queue;
public class ImplementingStackUsingQueueLinkedList {
    class MyStack {
        Queue<Integer> queue;

        public MyStack() {
            queue = new LinkedList<>();
        }

        public void push(int x) {
            int s = queue.size();
            queue.add(x);
            for(int i = 1; i<=s; i++){
                queue.add(queue.peek());
                queue.remove();
            }
        }

        public int pop() {
            if(queue.size()==0) return -1;
            return queue.remove();
        }

        public int top() {
            if(queue.size()==0) return -1;
            return queue.peek();
        }

        public boolean empty() {
            return queue.size()==0;
        }
    }

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
}
