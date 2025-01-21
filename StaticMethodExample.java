public class StaticMethodExample {
    static int square(int number) {
        return number * number;
    }

    public static void main(String[] args) {
        int num = 7;
        System.out.println("The square of " + num + " is: " + StaticMethodExample.square(num));
    }
}
