package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(5, 4);
        double box1Perimeter = box1.getPerimeter();
        double box1Area = box1.getArea();
        System.out.println("Box 1 Perimeter: " + box1Perimeter);
        System.out.println("Box 1 Area: " + box1Area);

        Rectangle box2 = new Square(5);
        double box2Perimeter = box2.getPerimeter();
        double box2Area = box2.getArea();
        System.out.println("Box 2 Perimeter: " + box2Perimeter);
        System.out.println("Box 2 Area: " + box2Area);
    }
}
