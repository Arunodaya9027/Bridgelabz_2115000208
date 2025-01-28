import java.util.*;

public class MatrixManipulation {
    public static int[][] createMatrix(int rows, int columns) {
        int[][] matrix = new int[rows][columns];
        Random random = new Random();
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < columns; j++)
                matrix[i][j] = random.nextInt(10);
        return matrix;
    }

    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int columns = matrix1[0].length;
        int[][] sum = new int[rows][columns];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < columns; j++)
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
        return sum;
    }

    public static int[][] subtractMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int columns = matrix1[0].length;
        int[][] difference = new int[rows][columns];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < columns; j++)
                difference[i][j] = matrix1[i][j] - matrix2[i][j];
        return difference;
    }

    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int columns1 = matrix1[0].length;
        int columns2 = matrix2[0].length;
        int[][] product = new int[rows1][columns2];
        for (int i = 0; i < rows1; i++)
            for (int j = 0; j < columns2; j++)
                for (int k = 0; k < columns1; k++)
                    product[i][j] += matrix1[i][k] * matrix2[k][j];
        return product;
    }

    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int[][] transpose = new int[columns][rows];
        for (int i = 0; i < columns; i++)
            for (int j = 0; j < rows; j++)
                transpose[i][j] = matrix[j][i];
        return transpose;
    }

    public static int findDeterminant2x2(int[][] matrix) {
        return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
    }

    public static int findDeterminant3x3(int[][] matrix) {
        int determinant = 0;
        for (int i = 0; i < 3; i++)
            determinant += matrix[0][i] * (matrix[1][(i + 1) % 3] * matrix[2][(i + 2) % 3] - matrix[1][(i + 2) % 3] * matrix[2][(i + 1) % 3]);
        return determinant;
    }

    public static int[][] findInverse2x2(int[][] matrix) {
        int determinant = findDeterminant2x2(matrix);
        int[][] inverse = new int[2][2];
        inverse[0][0] = matrix[1][1] / determinant;
        inverse[0][1] = -matrix[0][1] / determinant;
        inverse[1][0] = -matrix[1][0] / determinant;
        inverse[1][1] = matrix[0][0] / determinant;
        return inverse;
    }

    public static int[][] findInverse3x3(int[][] matrix) {
        int determinant = findDeterminant3x3(matrix);
        int[][] inverse = new int[3][3];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                inverse[i][j] = ((matrix[(j + 1) % 3][(i + 1) % 3] * matrix[(j + 2) % 3][(i + 2) % 3]) - (matrix[(j + 1) % 3][(i + 2) % 3] * matrix[(j + 2) % 3][(i + 1) % 3])) / determinant;
        return inverse;
    }

    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix)
            System.out.println(Arrays.toString(row));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = input.nextInt();
        int[][] matrix1 = createMatrix(rows, columns);
        int[][] matrix2 = createMatrix(rows, columns);
        System.out.println("Matrix 1:");
        displayMatrix(matrix1);
        System.out.println("Matrix 2:");
        displayMatrix(matrix2);
        int[][] sum = addMatrices(matrix1, matrix2);
        System.out.println("Sum:");
        displayMatrix(sum);
        int[][] difference = subtractMatrices(matrix1, matrix2);
        System.out.println("Difference:");
        displayMatrix(difference);
        int[][] product = multiplyMatrices(matrix1, matrix2);
        System.out.println("Product:");
        displayMatrix(product);
        int[][] transpose = transposeMatrix(matrix1);
        System.out.println("Transpose of Matrix 1:");
        displayMatrix(transpose);
        int determinant2x2 = findDeterminant2x2(matrix1);
        System.out.println("Determinant of Matrix 1 (2x2): " + determinant2x2);
        int determinant3x3 = findDeterminant3x3(matrix1);
        System.out.println("Determinant of Matrix 1 (3x3): " + determinant3x3);
        int[][] inverse2x2 = findInverse2x2(matrix1);
        System.out.println("Inverse of Matrix 1 (2x2):");
        displayMatrix(inverse2x2);
        int[][] inverse3x3 = findInverse3x3(matrix1);
        System.out.println("Inverse of Matrix 1 (3x3):");
        displayMatrix(inverse3x3);
        input.close();
    }
}
