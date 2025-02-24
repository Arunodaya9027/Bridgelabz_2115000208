import java.util.Scanner;
import java.lang.reflect.Method;

class MathOperation {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b; 
    }

    public int multiply(int a, int b) {
        return a * b;
    }
}

public class DynamicallyInvokeMethod {
    public static void main(String[] args) throws Exception {
        MathOperation mathOperation = new MathOperation();
        Class<?> cls = mathOperation.getClass();

        Scanner input = new Scanner(System.in);
        String methodName = input.next();
        Method method = cls.getDeclaredMethod(methodName, int.class, int.class);
        int result = (int) method.invoke(mathOperation, 10, 20);
        System.out.println("Result: " + result);
        input.close();
    }
}
