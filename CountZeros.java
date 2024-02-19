public class CountZeros {
    public static int count(int n, int count){
        if(n==0) return count;
        if(n%10==0) count++;
        return count(n/10,count);
    }

    public static void main(String[] args) {
        int n = 1040240030;
        if(n==0) System.out.println(0);
        else System.out.println(count(n, 0));
    }
}
