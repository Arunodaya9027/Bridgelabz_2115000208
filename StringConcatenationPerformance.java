public class StringConcatenationPerformance {
    public static void compare(int len) {
        String str = new String();
        StringBuffer sbf = new StringBuffer();
        StringBuilder sb = new StringBuilder();
        

        System.out.printf("For Dataset Size = %d:\n", len);
        performance(str, len);
        performance(sbf, len);
        performance(sb, len);
        System.out.println();
    }

    private static void performance(String str, int len) {
        double start = System.nanoTime();
        for (int i = 0; i < len; i++) 
            str += 'a';
        double end = System.nanoTime();
        System.out.printf("Time taken by String is %.4f ms\n", (end - start)/1000000);
    }

    private static void performance(StringBuffer sbf, int len) {
        double start = System.nanoTime();
        for (int i = 0; i < len; i++) 
            sbf.append('a');
        double end = System.nanoTime();
        System.out.printf("Time taken by StringBuffer is %.4f ms\n", (end - start)/1000000);
    }
    
    private static void performance(StringBuilder sb, int len) {
        double start = System.nanoTime();
        for (int i = 0; i < len; i++) 
            sb.append('a');
        double end = System.nanoTime();
        System.out.printf("Time taken by StringBuilder is %.4f ms\n", (end - start)/1000000);
    }

    public static void main(String[] args) {
        compare(1000);
        compare(10000);
        compare(1000000);
    }
}