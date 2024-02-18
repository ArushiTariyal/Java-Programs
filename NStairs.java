public class NStairs {
    public static int nStairs(int n){
        if(n==0) return 1;
        if(n<0) return 0;
        return nStairs(n-1)+nStairs(n-2);
    }
    public static void main(String[] args) {
        System.out.println(nStairs(4));
    }
}
