public class PrintNto1Recursion {
    public static void printNto1(int N){
        if(N==0) return;
        printNto1(N-1);
        System.out.println(N);
    }
    public static void main(String[] args){
        printNto1(5);
    }
}
