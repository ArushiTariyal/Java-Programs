public class TOH {
    static int count = 0;
    public static void toh(int n, int a, int b, int c){
        if(n==0) return;
        count++;
        if(n==1){
            System.out.println(n+" disk moved from "+a+" to "+c);
            return;
        }
        toh(n-1,a,c,b);
        System.out.println(n+" disk moved from "+a+" to "+c);
        toh(n-1,b,a,c);
    }
    public static void main(String[] args){
        toh(3,1,2,3);
        System.out.println(count);
    }
}
