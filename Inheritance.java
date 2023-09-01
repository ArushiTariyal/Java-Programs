class Father{
    public void surname(){
        System.out.println("Smith");
    }
    public void name(){
        System.out.println("Andy");
    }
    public void age(){
        System.out.println(50);
    }
}
class Son extends Father{
    @Override
    public void name(){
        System.out.println("Anthony");
    }
    @Override
    public void age(){
        System.out.println(20);
    }
}
public class Inheritance {
    public static void main(String args[]){
        Son son = new Son();
        son.name();
        son.surname();
        son.age();
    }
}
