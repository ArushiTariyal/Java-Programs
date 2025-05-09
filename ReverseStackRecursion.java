import java.util.Stack;
import java.util.Stack;
public class ReverseStackRecursion {
    public class Solution {
        public static void addReverse(Stack<Integer> stack, int num){
            if(stack.isEmpty()){
                stack.push(num);
                return;
            }
            int val = stack.pop();
            addReverse(stack,num);
            stack.push(val);
        }

        public static void reverseStack(Stack<Integer> stack) {
            if(stack.size()==0){
                return;
            }

            int num = stack.pop();
            reverseStack(stack);
            addReverse(stack,num);

        }

    }

}
