package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Measurable myShape;


        myShape = new Square(5);
        System.out.println("Square area: " + myShape.getArea());
        System.out.println("Square perimeter: " + myShape.getPerimeter());


        myShape = new Rectangle(4, 6);
        System.out.println("Rectangle area: " + myShape.getArea());
        System.out.println("Rectangle perimeter: " + myShape.getPerimeter());
    }
}

