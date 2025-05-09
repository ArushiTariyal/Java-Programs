import java.util.* ;
import java.io.*;
public class RecursiveSortStack {
    public class Solution {
        public static void addToStack(Stack<Integer> stack, int num){
            if(stack.size()==0 || stack.peek()<num){
                stack.push(num);
                return;
            }
            int val = stack.pop();
            addToStack(stack,num);
            stack.add(val);
        }
        public static void sortStack(Stack<Integer> stack) {
            // Write your code here.
            if(stack.size()==0) return;
            int num = stack.pop();
            sortStack(stack);
            addToStack(stack, num);
        }

    }
}
