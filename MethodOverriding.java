class Fruits{
    public void name(){
        System.out.println("Not Known Yet");
    }
    public void taste(){
        System.out.println("Sweet in taste");
    }
    public void seeds(){
        System.out.println("First we should know the fruit type");
    }
}
class Banana extends Fruits{
    @Override
    public void name() {
        System.out.println("Banana");
    }
    @Override
    public void seeds(){
        System.out.println("There are no seeds in a Banana");
    }
}
class Mango extends Fruits{
    @Override
    public void name(){
        System.out.println("Mango");
    }
    @Override
    public void seeds(){
        System.out.println("There is one big seed in a Mango");
    }
}
class RefVar1{
    public void useObj(Fruits fruits){
        fruits.name();
        fruits.taste();
        fruits.seeds();
        System.out.println();
    }
}
public class MethodOverriding {
    public static void main(String[] args){
        Fruits fruit1 = new Banana();
        Fruits fruit2 = new Mango();
        RefVar1 refVar = new RefVar1();
        refVar.useObj(fruit1);
        refVar.useObj(fruit2);
    }
}
