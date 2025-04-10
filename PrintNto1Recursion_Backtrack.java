public class PrintNto1Recursion_Backtrack {
    public static void printNto1(int N,int i){
        if(i>N) return;
        printNto1(N,i+1);
        System.out.println(i);
    }
    public static void main(String[] args){
        printNto1(5,1);
    }
}
