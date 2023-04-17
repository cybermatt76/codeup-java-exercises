import java.util.Scanner;
public class EnhancedForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] sides =  new int[length];
        for (int i = 0; i < length; i++) {
            sides[i] = scanner.nextInt();
        }

        for (int i = 0; i < length; i++) {
            int area = sides[i] * sides[i];
            System.out.println(area);
        }
    }

}
