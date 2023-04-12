public class MethodsLecture {
    public static void main(String[] args) {
//        System.out.println(sayHello("Matthew"));
        System.out.println(returnThree());
    }

    public static String sayHello(String test1) {
        return String.format("Hello, %s!", test1);
    }
    public static int returnThree() {
        return 3;
    }
}
