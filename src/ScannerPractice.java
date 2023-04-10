import java.util.Scanner;

public class ScannerPractice {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi, what's your name?");
        String userName = scanner.next();
        System.out.println("Hello, " + userName);
    }
}
