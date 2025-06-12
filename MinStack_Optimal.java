import java.util.Stack;
public class MinStack_Optimal {
    class MinStack {
        Stack<Long> st;
        long min;
        public MinStack() {
            st = new Stack<>();
            min = Long.MIN_VALUE;
        }

        public void push(int val) {
            long value = (long) val;
            if(st.isEmpty()){
                st.push(value);
                min = value;
            }
            else{
                if(value>=min){
                    st.push(value);
                }
                else{
                    st.push(2*value - min);
                    min = value;
                }
            }
        }

        public void pop() {
            if(st.isEmpty()){
                return;
            }
            if(min>st.peek()){
                long newval = 2*min - st.peek();
                min = newval;
                st.pop();
            }
            else{
                st.pop();
            }
        }

        public int top() {
            long ans = st.peek();
            if(min>=st.peek()) return (int) min;
            return (int)ans;
        }

        public int getMin() {
            return (int)min;
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
