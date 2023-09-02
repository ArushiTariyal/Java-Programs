class Addition{
    public int add(int a,int b){
        return a+b;
    }
    public double add(int a, int b, double c){
        return a+b+c;
    }
    public double add(int a, double b, int c){
        return a+b+c;
    }
}
public class MethodOverloading {
    public static void main(String[] args){
        Addition addition = new Addition();
        System.out.println("Sum is "+ addition.add(2,3));
        System.out.println("Sum is "+ addition.add(2,6.0,4));
        System.out.println("Sum is "+ addition.add(5,34,9.3));
    }
}
