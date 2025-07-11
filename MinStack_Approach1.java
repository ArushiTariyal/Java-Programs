import java.util.Stack;
public class MinStack_Approach1 {
    class Pair{
        int first;
        int second;

        Pair(int first, int second){
            this.first = first;
            this.second = second;
        }
    }
    class MinStack {
        Stack<Pair> st;

        public MinStack() {
            st = new Stack<>();

        }

        public void push(int val) {
            if(st.size()==0){
                st.push(new Pair(val,val));
            }
            else{
                st.push(new Pair(val, Math.min(val,st.peek().second)));
            }
        }

        public void pop() {
            st.pop();
        }

        public int top() {
            return st.peek().first;
        }

        public int getMin() {
            return st.peek().second;
        }
    }

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
}
