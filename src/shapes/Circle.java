package shapes;

import java.lang.Math;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
}

class Input {
    private java.util.Scanner scanner;

    public Input() {
        this.scanner = new java.util.Scanner(System.in);
    }

    public double getDouble(String prompt) {
        System.out.print(prompt);
        return scanner.nextDouble();
    }

    public boolean getBoolean(String prompt) {
        System.out.print(prompt);
        String input = scanner.next();
        return input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes");
    }
}

class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();

        do {
            double radius = input.getDouble("Enter the radius of the circle: ");

            Circle circle = new Circle(radius);

            System.out.printf("The circumference of the circle is: %.2f%n", circle.getCircumference());
            System.out.printf("The area of the circle is: %.2f%n", circle.getArea());

        } while (input.getBoolean("Do you want to find the circumference of another circle? (y/n) "));
    }
}




