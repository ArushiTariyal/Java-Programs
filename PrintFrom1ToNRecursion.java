public class PrintFrom1ToNRecursion {
    public static void printNums(int N,int i){
        if(i>N) return;
        System.out.println(i);
        printNums(N,++i);
    }
    public static void main(String[] args){
        printNums(5,1);
    }
}
