import java.util.Scanner;

public class ControlStatementsLoopsLecture {
    public static void main(String[] args) {

        double discountPercentage = 2.3;
//        System.out.println(discountPercentage == 2.0);

//        System.out.println(discountPercentage > 2 && discountPercentage == 2.3);

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Conitnue? [y/N]");
//        String userInput = sc.next();
//
//        boolean confirmation = userInput.equalsIgnoreCase("y");
//        System.out.println(confirmation);

        if (discountPercentage > 2) {
            System.out.println("Discount percentage is greater than 2.");
        }
            int caseSwitch = 1;
            switch (caseSwitch) {
                case 1:
                    System.out.println("Case 1");
                    break;
                case 2:
                    System.out.println("Case 2");
                    break;
                default:
                    System.out.println("Default case");
                    break;
            }

//        int i = 0;
//        while (i < 10) {
//            System.out.println("i is " + i);
//            i++;
//        }

        do {
            System.out.println("You will see this despite the condition!");
        } while (false);

//        for(int i = 0; i < 10; i += 1) {
//            System.out.println("i is " + i);
//        }

        // print the numbers 1 through 5

//        for(int i = 1; i < 100; i++) {
//            System.out.println(i);
//            if (i == 5) {
//                break; // --------------+
//            } //                        |
//        } //                            |
//// <----------------------------+
        for(int i = 1; i <= 10; i++) { // <--+
            if(i % 2 == 1) { //              |
                continue; // ----------------+
            }
            System.out.println(i);
        }

    }
    }
