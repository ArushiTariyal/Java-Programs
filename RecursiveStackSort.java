import java.util.Stack;

public class RecursiveStackSort {
    static Stack<Integer> stack2 = new Stack<>();
    public static void sortStack(Stack<Integer> stack){
        if(stack.size()==1) return;
        int val = stack.pop();
        sortStack(stack);
        insert(stack,val);
    }
    public static void insert(Stack<Integer> stack, int val){
        if(stack.size()==0 || stack.peek()<=val) {
            stack.push(val);
            return;
        }
        int last = stack.pop();
        insert(stack,val);
        stack.push(last);
    }
    public static void formStack(int[] arr, int l ){
        if(l==0) return;
        int ele = arr[l-1];
        formStack(arr,l-1);
        stack2.push(ele);
    }
    public static void main(String[] args) {
        int[] arr = {5,7,3,88,6,9,0,2,4,6};
        formStack(arr,arr.length);
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(0);
        stack.push(9);
        stack.push(72);
        stack.push(8);
        stack.push(2);
        stack.push(1);
        stack.push(56);
        sortStack(stack);
        System.out.println(stack);
        sortStack(stack2);
        System.out.println(stack2);
    }
}
