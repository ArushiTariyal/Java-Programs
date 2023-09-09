import java.util.ArrayList;

public class AddingMiddleElementToArrayList {
    public static void main(String[] args){
        ArrayList al = new ArrayList<>(20);
        al.add("First");
        al.add(2);
        al.add(45.8);
        al.add(true);
        al.add('z');
        al.add("Last");

        System.out.println("Original ArrayList: "+al);
        al.set(3,false);
        al.add(4,"added an object here");
        System.out.println("Updated ArrayList: " +al);
    }
}
