import java.util.Stack;

public class Recursion2ReverseElementsInStack {
    public static void reverse(Stack<Integer> stack){
        if(stack.size()==0 || stack.size()==1) return;
        int top = stack.pop();
        reverse(stack);
        insert(stack,top);
    }
    public static void insert(Stack<Integer> stack, int top){
        if(stack.size()==0){
            stack.push(top);
            return;
        }
        int e = stack.pop();
        insert(stack,top);
        stack.push(e);
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack);
        reverse(stack);
        System.out.println(stack);
    }
}
