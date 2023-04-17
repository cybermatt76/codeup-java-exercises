public class ArraysLecture {
    public static void main(String[] args) {
        int[] myArr = {6, 42, 3, 7};
        int sum = 0;
        for (int x = 0; x < myArr.length; x++) {
            sum += myArr[x];
        }
        System.out.println(sum);
        int[] numbers = {2, 5, 7, 9, 12};
        // for loop
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();

        // enhanced for loop
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        System.out.println();

        String[] names = {"Alice", "Bob", "Charlie", "David", "Emma"};

        // for loop
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + " ");
        }

        System.out.println();

        // enhanced for loop
        for (String name : names) {
            System.out.print(name + " ");
        }

        System.out.println();

        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // for loop
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        // enhanced for loop
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}