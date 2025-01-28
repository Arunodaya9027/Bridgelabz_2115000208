public class RandomValues {
    public static int[] generate4DigitRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * 9000) + 1000;
        }
        return arr;
    }

    public static double[] findAverageMinMax(int[] numbers) {
        double[] result = new double[3];
        double sum = 0;
        int min = numbers[0];
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            min = Math.min(min, numbers[i]);
            max = Math.max(max, numbers[i]);
        }
        result[0] = sum / numbers.length;
        result[1] = min;
        result[2] = max;
        return result;
    }

    public static void main(String[] args) {
        int[] numbers = generate4DigitRandomArray(5);
        double[] result = findAverageMinMax(numbers);
        System.out.printf("The average value is %.2f\n", result[0]);
        System.out.printf("The minimum value is %d\n", (int) result[1]);
        System.out.printf("The maximum value is %d\n", (int) result[2]);
    }
}
