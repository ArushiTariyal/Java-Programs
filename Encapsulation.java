import java.util.Scanner;
class EncapsulatedClass{
    private String name;
    private int age;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
}
public class Encapsulation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        EncapsulatedClass ec = new EncapsulatedClass();
        System.out.print("Enter the name: ");
        String name = sc.nextLine();
        System.out.print("Enter the age: ");
        int age = sc.nextInt();

        ec.setName(name);
        ec.setAge(age);

        System.out.println("Name is "+ ec.getName());
        System.out.println("Age is "+ ec.getAge());
    }
}
