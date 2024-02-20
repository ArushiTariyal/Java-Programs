import java.util.Stack;

public class RecursionRemoveMidElementFromStack {
    public static void deleteMid(Stack<Integer> stack, int mid){
        if(stack.size()==0) return;
        if(stack.size()==mid) {
            stack.pop();
            return;
        }
        int e = stack.pop();
        deleteMid(stack,mid);
        stack.push(e);
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);
        stack.push(10);
        deleteMid(stack, (stack.size()/2) + 1);
        System.out.println(stack);
    }
}
