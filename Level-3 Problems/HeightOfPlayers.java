public class HeightOfPlayers {
    public static int[] generate3DigitRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++)
            arr[i] = (int) (Math.random() * 100) + 150;
        return arr;
    }

    public static int findSum(int[] height) {
        int sum = 0;
        for (int i = 0; i < height.length; i++)
            sum += height[i];
        return sum;
    }

    public static double findMean(int[] height) {
        return (double) findSum(height) / height.length;
    }

    public static int findShortest(int[] height) {
        int shortest = height[0];
        for (int i = 1; i < height.length; i++)
            shortest = Math.min(shortest, height[i]);
        return shortest;
    }

    public static int findTallest(int[] height) {
        int tallest = height[0];
        for (int i = 1; i < height.length; i++)
            tallest = Math.max(tallest, height[i]);
        return tallest;
    }

    public static void main(String[] args) {
        int[] heights = generate3DigitRandomArray(11);
        int sum = findSum(heights);
        double mean = findMean(heights);
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);
        System.out.printf("The sum of all the heights is %d\n", sum);
        System.out.printf("The mean height of the players is %.2f\n", mean);
        System.out.printf("The shortest height of the players is %d\n", shortest);
        System.out.printf("The tallest height of the players is %d\n", tallest);
    }
}
