import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i = 5;
//        while (i <= 15) {
//            System.out.print(i + " ");
//            i++;
//        }

//        int i = 0;
//        do {
//            System.out.println(i);
//            i += 2;
//        } while (i <= 100);
//        int i = 100;
//        do {
//            System.out.println(i);
//            i -= 5;
//        } while (i >= -10);

//        long i = 2;
//        do {
//            System.out.println(i * i);
//            i *= i;
//        } while (i < 1000000);
//        for (int i = 0; i <= 100; i += 2) {
//            System.out.println(i);
//        }

//        for (int i = 100; i >= -10; i -= 5) {
//            System.out.println(i);
//        }
//        for (int i = 1; i <= 100; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }

//        Scanner input = new Scanner(System.in);
//        String choice;
//
//        do {
//            System.out.print("What number would you like to go up to? ");
//            int n = input.nextInt();
//            System.out.println("Here is your table!");
//            System.out.printf("%-10s %-10s %-10s\n", "Number", "Square", "Cube");
//            for (int i = 1; i <= n; i++) {
//                int square = i * i;
//                int cube = i * i * i;
//                System.out.printf("%-10d %-10d %-10d\n", i, square, cube);
//            }
//            System.out.print("Do you want to continue? (Y/N) ");
//            choice = input.next();
//        } while (choice.equalsIgnoreCase("Y"));
        Scanner input = new Scanner(System.in);
        String choice;

        do {
            System.out.print("Enter a numerical grade (0-100): ");
            int grade = input.nextInt();
            String letterGrade;
            if (grade >= 97) {
                letterGrade = "A+";
            } else if (grade >= 93) {
                letterGrade = "A";
            } else if (grade >= 88) {
                letterGrade = "A-";
            } else if (grade >= 85) {
                letterGrade = "B+";
            } else if (grade >= 82) {
                letterGrade = "B";
            } else if (grade >= 80) {
                letterGrade = "B-";
            } else if (grade >= 76) {
                letterGrade = "C+";
            } else if (grade >= 70) {
                letterGrade = "C";
            } else if (grade >= 67) {
                letterGrade = "C-";
            } else if (grade >= 64) {
                letterGrade = "D+";
            } else if (grade >= 62) {
                letterGrade = "D";
            } else if (grade >= 60) {
                letterGrade = "D-";
            } else {
                letterGrade = "F";
            }
            System.out.println("Letter grade: " + letterGrade);
            System.out.print("Do you want to continue? (Y/N) ");
            choice = input.next();
        } while (choice.equalsIgnoreCase("Y"));
    }
}
