public class Recursion_basic {
    public static void recurFunc(int start){
        if(start==3) return;
        System.out.println(start);
        recurFunc(++start);
    }
    public static void main(String[] args){
        recurFunc(0);
    }
}
