class TrialClass{
    private static int a;
    private static int b;
    static int sum;
    static{
        sum = 5;
    }
    public void setA(int a){
        this.a = a;
    }
    public int getA(){
        return a;
    }

    public void setB(int b){
        this.b = b;
    }
    public int getB(){
        return b;
    }
    public static void addition(){
        sum = a+b;
        System.out.println("Sum of a+b is: "+ sum);
    }
}
public class ClassLoaderCheckedException {
    public static void main(String[] args) throws ClassNotFoundException {

        Class.forName("TrialClass");
        System.out.println("Static block's sum is "+TrialClass.sum);
        TrialClass tc = new TrialClass();
        tc.setA(34);
        tc.setB(23);
        TrialClass.addition();

    }
}
