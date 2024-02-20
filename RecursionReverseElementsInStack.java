import java.util.Stack;

public class RecursionReverseElementsInStack {
    public static void reverse(Stack<Integer> stack){
        if(stack.size()<=1) return;
        int top = stack.pop();
        reverse(stack);
        stack.add(0,top);
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
