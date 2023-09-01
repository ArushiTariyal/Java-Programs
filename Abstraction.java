import java.util.Scanner;
abstract class Shape{
    abstract public void shape();
    abstract public void sides();
    abstract public void area();
    abstract public void perimeter();
    public void plane(){
        System.out.println("2 Dimensional Plane");
        System.out.println();
    }
}
class Circle extends Shape{
    double rad;
    public void shape(){
        System.out.println("Circle");
    }
    public void sides(){
        System.out.println(0);
    }
    public void area(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double rad = sc.nextDouble();
        this.rad = rad;
        System.out.println("Area is "+3.14*Math.pow(rad,2));
    }
    public void perimeter(){
        System.out.println("Perimeter is "+ 2*3.14*rad);
    }
}
class Square extends Shape{
    double side;
    public void shape(){
        System.out.println("Square");
    }
    public void sides(){
        System.out.println(4);
    }
    public void area(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side: ");
        double side = sc.nextDouble();
        this.side = side;
        System.out.println("Area is "+Math.pow(side,2));
    }
    public void perimeter(){
        System.out.println("Perimeter is "+ 4*side);
    }
}
class refVar{
    public void useObj(Shape shape){
        shape.shape();
        shape.sides();
        shape.area();
        shape.perimeter();
        shape.plane();
    }
}
public class Abstraction {
    public static void main(String[] args){
        Shape shape1 = new Circle();
        Shape shape2 = new Square();
        refVar rv = new refVar();
        rv.useObj(shape1);
        rv.useObj(shape2);
    }
}
