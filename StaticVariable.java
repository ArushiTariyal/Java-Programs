import java.nio.channels.ClosedSelectorException;

class SquareShape{
    static int sides;
    static String dimension;
    public void setSides(){
        sides = 4;
    }
    public void setDimension(){
        dimension = "2-Dimension";
    }
}
public class StaticVariable {
    public static void main(String[] args) {
        SquareShape ss = new SquareShape();
        ss.setSides();
        ss.setDimension();
        System.out.println("Sides in a square: "+SquareShape.sides);
        System.out.println("Dimension: "+SquareShape.dimension);
    }

}
