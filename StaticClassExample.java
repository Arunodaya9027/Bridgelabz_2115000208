public class StaticClassExample {
    static class StaticNestedClass {
        void displayMessage() {
            System.out.println("Hello from the static nested class!");
        }
    }

    public static void main(String[] args) {
        StaticClassExample.StaticNestedClass nestedObject = new StaticClassExample.StaticNestedClass();
        nestedObject.displayMessage();
    }
}
