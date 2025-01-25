import java.util.*;

public class MultiToSingleDimensionalArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rows = input.nextInt();
        int columns = input.nextInt();
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) 
            for (int j = 0; j < columns; j++) 
                matrix[i][j] = input.nextInt();
        
        int index = 0;
        int[] array = new int[rows * columns];
        for (int i = 0; i < rows; i++) 
            for (int j = 0; j < columns; j++) 
                array[index++] = matrix[i][j];
        
        for (int i = 0; i < rows * columns; i++) 
            System.out.print(array[i] + " ");
        
        input.close();
    }
}
