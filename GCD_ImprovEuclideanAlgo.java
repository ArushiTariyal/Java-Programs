public class GCD_ImprovEuclideanAlgo {
    static {
        int a = 6;
        int b = 7;
    }
    public static void gcd(int a, int b){
            while(a>0 && b>0){
                if(a>b) a = a%b;
                else b = b%a;
            }
        }

}
