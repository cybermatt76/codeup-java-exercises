
import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        int myFavoriteNumber = 7;
//        System.out.println(myFavoriteNumber);

        String myString = "3.14159";
//        System.out.println(myString);

//        myNumber = 123;
//        long myNumber;

        String cohort = "Bigfoot";
        String timeOfDay = "afternoon";
        int week = 9;
//        System.out.printf("Good %s, %s!%n", timeOfDay, cohort);
//        System.out.printf("This is the %dth week of %s cohort.%n", week, cohort);
        float myFloat = 123.456F;
//        System.out.printf("The number is %-11.2f);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word:");
        String userInput = scanner.next();
        System.out.println("The user entered: " + userInput);
    }

}

