interface Animal{
    String species();
    String classOfSpecies();
    int totalLimbs();
}
class Humans implements Animal{
    @Override
    public String species(){
        return "Homo Sapiens";
    }

    @Override
    public String classOfSpecies() {
        return "Mammals";
    }

    @Override
    public int totalLimbs(){
        return 4;
    }
}

class Turtle implements Animal{

    @Override
    public String species(){
        return "Turtles";
    }

    @Override
    public String classOfSpecies(){
        return "Reptiles";
    }

    @Override
    public int totalLimbs(){
        return 4;
    }

}

class CallingMethods{
    public void usingRefVar(Animal animal){
        System.out.println(animal.species());
        System.out.println(animal.classOfSpecies());
        System.out.println(animal.totalLimbs());
        System.out.println();
    }
}
public class Interface {
    public static void main(String[] args){
        Animal animal1 = new Humans();
        Animal animal2 = new Turtle();

        CallingMethods cm = new CallingMethods();
        cm.usingRefVar(animal1);
        cm.usingRefVar(animal2);
    }
}
