class OuterClass{
    static{
        System.out.println("Inside the static block of Outer Class");
    }
    static class InnerClass{
        static{
            System.out.println("This is the static block of Inner Class");
        }
        public void innerMethod(){
            System.out.println("Inside the non-static inner method");
        }
        public static void staticInnerMethod(){
            System.out.println("Inside the static inner method");
        }
    }
}
public class StaticClass {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("OuterClass");
        OuterClass.InnerClass ic = new OuterClass.InnerClass();
        OuterClass.InnerClass.staticInnerMethod();
        ic.innerMethod();
    }
}
