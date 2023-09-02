class Transport{
    public String modeOfTransport(String automobile){
        return automobile;
    }
    public String mediumOfTravel(String medium){
        return medium;
    }
    public void duration(){
        System.out.println("Journey is of 2 days");
    }
}
class Car1 extends Transport{
    public void automobile(){
        System.out.println(super.modeOfTransport("Car"));
    }
    public void road(){
        System.out.println("The medium of travel is "+ super.mediumOfTravel("road"));
    }

    @Override
    public void duration() {
        super.duration();
    }
}
public class SuperKeywordWithMethods {
    public static void main(String[] args){
        Car1 car = new Car1();
        car.automobile();
        car.road();
        car.duration();
    }
}
