import java.util.HashSet;
public class HashSet1 {
    public static void main(String[] args){
        HashSet hs1 = new HashSet<>();
        hs1.add('a');
        hs1.add("Second");
        hs1.add(3);
        hs1.add(true);
        hs1.add(45.6);
        hs1.add(89.3f);

        System.out.println(hs1);

        HashSet hs2 = new HashSet<>(hs1);
        hs2.add("Java");
        hs2.add(9);
        hs2.add('b');

        System.out.println(hs2);

        //Union
        hs2.addAll(hs1);
        System.out.println("Union is: "+hs2);

        //Difference
        hs2.removeAll(hs1);
        System.out.println("Difference is: "+hs2);

        //Intersection
        hs2.addAll(hs1);
        hs2.retainAll(hs1);
        System.out.println("Intersection is: "+hs2);
    }
}
