public class StaticVariableExample {
    static int count = 0; // Static variable to count total no. of instances

    StaticVariableExample() {
        count++;
    }

    public static void main(String[] args) {
        StaticVariableExample obj1 = new StaticVariableExample();
        StaticVariableExample obj2 = new StaticVariableExample();
        StaticVariableExample obj3 = new StaticVariableExample();

        System.out.println("Number of instances created: " + count);
    }
}