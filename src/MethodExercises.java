import java.util.Scanner;
public class MethodExercises {
//    public static void main(String[] args) {
//            int num1 = 9;
//            int num2 = 2;
//            int userInput = InputValidator.getInteger(1, 10);
//            System.out.println("User input: " + userInput);

//            System.out.println("Addition: " + add(num1, num2));
//            System.out.println("Subtraction: " + subtract(num1, num2));
//            System.out.println("Multiplication: " + multiply(num1, num2));
//            System.out.println("Division: " + divide(num1, num2));
//            System.out.println("Modulus: " + modulus(num1, num2));
//        }

        public static int add(int a, int b) {
            return a + b;
        }

        public static int subtract(int a, int b) {
            return a - b;
        }

        public static int multiply(int a, int b) {
            return a * b;
        }

        public static double divide(double a, double b) {
            return a / b;
        }

        public static int modulus(int a, int b) {
            return a % b;
        }

    }
    class InputValidator {
        public static int getInteger(int min, int max) {

            Scanner scanner = new Scanner(System.in);
            int userInput;

            do {
                System.out.printf("Enter a number between %d and %d: ", min, max);
                while (!scanner.hasNextInt()) {
                    System.out.printf("Please enter a valid integer between %d and %d: ", min, max);
                    scanner.next();
                }
                userInput = scanner.nextInt();
            } while (userInput < min || userInput > max);

            return userInput;

        }
    }


//class FactorialCalculator {
//
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        boolean continueFlag = true;
//        int highestAccurateFactorial = 10;
//
//        while (continueFlag) {
//            System.out.print("Enter an integer from 1 to " + highestAccurateFactorial + ": ");
//            int num = input.nextInt();
//            if (num < 1 || num > highestAccurateFactorial) {
//                System.out.println("Invalid input! Please enter an integer between 1 and " + highestAccurateFactorial + ".");
//                continue;
//            }
//
//            String equation = generateFactorialEquation(num);
//            long factorial = calculateFactorial(num);
//
//            System.out.println(equation + " = " + factorial);
//
//            System.out.print("Do you want to continue? (Y/N): ");
//            String choice = input.next();
//            if (!choice.equalsIgnoreCase("Y")) {
//                continueFlag = false;
//            }
//        }
//
//        input.close();
//    }
//
//    public static long calculateFactorial(int num) {
//        long factorial = 1;
//        for (int i = 2; i <= num; i++) {
//            factorial *= i;
//        }
//        return factorial;
//    }
//
//    public static String generateFactorialEquation(int num) {
//        StringBuilder equationBuilder = new StringBuilder();
//        equationBuilder.append(num).append("!");
//
//        if (num == 0 || num == 1) {
//            return equationBuilder.toString();
//        }
//
//        equationBuilder.append(" = ");
//
//        for (int i = num; i >= 1; i--) {
//            if (i > 1) {
//                equationBuilder.append(i).append(" x ");
//            } else {
//                equationBuilder.append(i);
//            }
//        }
//
//        return equationBuilder.toString();
//    }
//
//}
class DiceRoller {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numSides = 0;
        boolean continueRolling = true;

        System.out.print("Enter the number of sides for a pair of dice: ");
        numSides = scanner.nextInt();

        while(continueRolling) {
            int roll1 = rollDice(numSides);
            int roll2 = rollDice(numSides);
            System.out.println("You rolled a " + roll1 + " and a " + roll2);
            System.out.print("Roll again? (Y/N): ");
            String choice = scanner.next();
            if(choice.equalsIgnoreCase("N")) {
                continueRolling = false;
            }
        }

        scanner.close();
    }

    public static int rollDice(int numSides) {
        return (int) (Math.random() * numSides) + 1;
    }
}



