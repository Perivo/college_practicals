import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the dimensions of the matrices
        System.out.print("Enter the number of rows (n): ");
        int n = scanner.nextInt();
        System.out.print("Enter the number of columns (m): ");
        int m = scanner.nextInt();

        // Declare the matrices
        int[][] matrix1 = new int[n][m];
        int[][] matrix2 = new int[n][m];
        int[][] sumMatrix = new int[n][m];

        // Input for the first matrix
        System.out.println("Enter elements of the first matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix1[i][j] = scanner.nextInt();
            }
        }

        // Input for the second matrix
        System.out.println("Enter elements of the second matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix2[i][j] = scanner.nextInt();
            }
        }

        // Perform addition of the matrices
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // Display the result
        System.out.println("Sum of the two matrices:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(sumMatrix[i][j] + " ");
            }
            System.out.println();
        }

        // Close the scanner
        scanner.close();
    }
}
