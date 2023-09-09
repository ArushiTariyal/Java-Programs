import java.util.ArrayList;

public class ArrayListToArray {
    public static void main(String[] args){
        ArrayList<Character> al = new ArrayList<Character>();
        for(int i = 0; i<=10; i++){
            al.add((char) (i+65));
        }
        System.out.println(al);
        Character arr[] = al.toArray(new Character[al.size()]);
        System.out.print("Array is: ");
        for(Character c : arr){
            System.out.print(c+" ");
        }
    }
}
