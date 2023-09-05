class Addition1{
    public static int sum(int a, int b){
        return a+b;
    }
}
public class StaticMethod {
    public static void main(String[] args){
        int sum = Addition1.sum(5,7);
        System.out.println("Sum is "+sum);
    }

}
