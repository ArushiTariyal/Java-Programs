public class RecursiveFibonacci {
    public static int findFibo(int n){
        if(n<=1) return n;
        return findFibo(n-1) + findFibo(n-2);
    }
    public static void main(String[] args){
        System.out.println(findFibo(6));
    }
}
