import java.util.Scanner;
public class ConsoleExercises {
        public static void main(String[] args) {
//            double pi = 3.14159;
//            System.out.printf("The value of pi is approximately %.2f.", pi);

//            Scanner scanner = new Scanner(System.in);
//            scanner.useDelimiter("\n");

//
//            System.out.print("Enter an integer: ");
//            int num = scanner.nextInt();
//
//            System.out.println("You entered: " + num);
//            System.out.print("Enter three words separated by spaces: ");
//            String input = scanner.nextLine();
//
//            String[] words = input.split(" ");
//            String word1 = words[0];
//            String word2 = words[1];
//            String word3 = words[2];
//
//            System.out.println("You entered:");
//            System.out.println(word1);
//            System.out.println(word2);
//            System.out.println(word3);
//            System.out.print("Enter a sentence: ");
//            String sentence = scanner.next();
//
//            System.out.println("You entered: " + sentence);
//            System.out.print("Enter a sentence: ");
//            String sentence = scanner.nextLine();
//
//            System.out.println("You entered: " + sentence);
//            System.out.print("Enter the length of the room: ");
//            double length = scanner.nextDouble();
//
//            System.out.print("Enter the width of the room: ");
//            double width = scanner.nextDouble();
//
//            System.out.print("Enter the height of the room: ");
//            double height = scanner.nextDouble();
//
//            double area = length * width;
//            double perimeter = 2 * (length + width);
//            double volume = length * width * height;
//
//            System.out.println("The area of the room is: " + area);
//            System.out.println("The perimeter of the room is: " + perimeter);
//            System.out.println("The volume of the room is: " + volume);

            // Prompt the user to enter a favorite quote
//            System.out.print("Enter your favorite quote: ");
//            String quote = scanner.nextLine();
//
//            // Output the quote
//            System.out.println("Your favorite quote is: " + quote);
//
//            // Ask them to enter how many words are in the quote
//            System.out.print("How many words are in the quote? ");
//            int numWords = scanner.nextInt();
//
//            // Output the number they entered
//            System.out.println("You entered " + numWords + " words.");
//
//            // Count the number of words in the quote
//            String[] words = quote.split("\\s+");
//            int actualNumWords = words.length;
//
//            // Output if the number they entered indeed matched the number of words
//            if (numWords == actualNumWords) {
//                System.out.println("The number you entered matches the actual number of words in the quote.");
//            } else {
//                System.out.println("The number you entered does not match the actual number of words in the quote.");
//                System.out.println("The actual number of words in the quote is " + actualNumWords + ".");
//            }
//            System.out.print("Enter your top three favorite foods (separated by spaces): ");
//            String input = scanner.nextLine();
//
//            // Split the input into individual foods
//            String[] foods = input.split(" ");
//
//            // Output the three top foods in the specified format using printf()
//            System.out.printf("1. %s\n", foods[0]);
//            System.out.printf("2. %s\n", foods[1]);
//            System.out.printf("3. %s\n", foods[2]);
            Scanner scanner = new Scanner(System.in).useDelimiter("\\s*,\\s*");

            // Prompt the user to enter a grocery list of three items
            System.out.print("Enter a grocery list of three items (separated by commas, no spaces): ");
            String input = scanner.nextLine().replaceAll("\\s+", "");
            String item1 = input.substring(0, input.indexOf(','));
            input = input.substring(input.indexOf(',') + 1);
            String item2 = input.substring(0, input.indexOf(','));
            String item3 = input.substring(input.indexOf(',') + 1);

            // Output the result as a comma-separated list using printf()
            System.out.printf("%s, %s, %s\n", item1, item2, item3);
        }
    }
