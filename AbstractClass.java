abstract class Car {
    public abstract void model();

    public abstract void year();

    public String durability() {
        return "10 years";
    }
}
class MorrisGarages extends Car{
    public void model(){
        System.out.println("Morris Garages Hybrid");
    }
    public void year(){
        System.out.println(2004);
    }

}
public class AbstractClass {
    public static void main(String[] args){
        Car car = new MorrisGarages();
        car.model();
        car.year();
        System.out.println(car.durability());
    }
}
