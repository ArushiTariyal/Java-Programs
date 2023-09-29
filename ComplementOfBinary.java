public class ComplementOfBinary {
    public static void main(String[] args){
        int n = 11010110;
        int m = n;
        int ans = 0;
        int i = 0;
        if(m==0) System.out.println(1);
        while(m!=0){
            ans += Math.abs(m%10-1) * (int)Math.pow(10,i++);
            m/=10;
        }
        System.out.println(ans);

    }
}
