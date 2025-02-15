import java.util.*;

public class SearchIn2dMatrix {
    public static void searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int column = matrix[0].length;
        int left = 0, right = row * column - 1;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            int midElement = matrix[mid / column][mid % column];
            if(midElement == target) {
                System.out.println("Element found at index " + mid / column + ", " + mid % column);
                return;
            }
            else if(midElement < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        System.out.println("Element not found");
        return;
    }

    public static void main(String[] args) {
        int row, column;
        Scanner input = new Scanner(System.in);
        row = input.nextInt();
        column = input.nextInt();
        int[][] matrix = new int[row][column];

        for(int i=0; i<row; i++)
            for(int j=0; j<column; j++)
                matrix[i][j] = input.nextInt();
        
        int target = input.nextInt();
        searchMatrix(matrix, target);
        input.close();
    }
}
