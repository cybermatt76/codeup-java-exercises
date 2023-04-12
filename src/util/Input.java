package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        System.out.print("Enter a string: ");
        return scanner.nextLine();
    }

    public boolean yesNo() {
        System.out.print("Enter yes or no: ");
        String input = scanner.nextLine().toLowerCase();
        return input.equals("y") || input.equals("yes");
    }

    public int getInt(int min, int max) {
        int num;
        do {
            System.out.printf("Enter an integer between %d and %d: ", min, max);
            while (!scanner.hasNextInt()) {
                System.out.printf("Invalid input. Enter an integer between %d and %d: ", min, max);
                scanner.next();
            }
            num = scanner.nextInt();
            scanner.nextLine(); // consume remaining newline character
        } while (num < min || num > max);
        return num;
    }

    public int getInt() {
        System.out.print("Enter an integer: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input. Enter an integer: ");
            scanner.next();
        }
        int num = scanner.nextInt();
        scanner.nextLine(); // consume remaining newline character
        return num;
    }

    public double getDouble(double min, double max) {
        double num;
        do {
            System.out.printf("Enter a decimal number between %f and %f: ", min, max);
            while (!scanner.hasNextDouble()) {
                System.out.printf("Invalid input. Enter a decimal number between %f and %f: ", min, max);
                scanner.next();
            }
            num = scanner.nextDouble();
            scanner.nextLine(); // consume remaining newline character
        } while (num < min || num > max);
        return num;
    }

    public double getDouble() {
        System.out.print("Enter a decimal number: ");
        while (!scanner.hasNextDouble()) {
            System.out.print("Invalid input. Enter a decimal number: ");
            scanner.next();
        }
        double num = scanner.nextDouble();
        scanner.nextLine(); // consume remaining newline character
        return num;
    }
}

 class InputTest {
    public static void main(String[] args) {
        Input input = new Input();

        String str = input.getString();
        System.out.println("You entered: " + str);

        boolean yes = input.yesNo();
        System.out.println("You entered: " + (yes ? "yes" : "no"));

        int num1 = input.getInt(1, 10);
        System.out.println("You entered: " + num1);

        int num2 = input.getInt();
        System.out.println("You entered: " + num2);

        double d1 = input.getDouble(1.0, 10.0);
        System.out.println("You entered: " + d1);

        double d2 = input.getDouble();
        System.out.println("You entered: " + d2);
    }
}