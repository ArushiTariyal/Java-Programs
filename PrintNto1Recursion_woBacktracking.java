public class PrintNto1Recursion_woBacktracking {
    public static void printNto1(int N){
        if(N==0) return;
        System.out.println(N);
        printNto1(N-1);
    }
    public static void main(String[] args) {
        printNto1(5);
    }
}
