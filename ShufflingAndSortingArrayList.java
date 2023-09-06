import java.util.ArrayList;
import java.util.Collections;
public class ShufflingAndSortingArrayList {
    public static void main(String[] args){
        ArrayList al = new ArrayList<>();
        al.add("R");
        al.add("A");
        al.add("C");
        al.add("d");
        al.add("g");
        al.add("a");
        al.add("o");

        Collections.sort(al);
        System.out.println("Sorted ArrayList is: "+ al);

        Collections.shuffle(al);
        System.out.println("Shuffled ArrayList is: "+al);

        Collections.sort(al,Collections.reverseOrder());
        System.out.println("Sorted ArrayList in reverse is: "+ al);
    }
}
