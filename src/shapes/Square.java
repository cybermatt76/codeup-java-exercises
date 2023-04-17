package shapes;

public class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }

    @Override
    public double getArea() {
        double side = getWidth();
        return Math.pow(side, 2);
    }

    @Override
    public double getPerimeter() {
        double side = getWidth();
        return 4 * side;
    }
}


