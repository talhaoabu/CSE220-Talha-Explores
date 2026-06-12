public class MatrixMultiplication {
    public static void main(String[] args) {

        int[][] A = {
            {1, 2},
            {3, 4}
        };

        int[][] B = {
            {5, 6},
            {7, 8}
        };

        int rows = A.length;
        int cols = B[0].length;
        int common = A[0].length;

        int[][] C = new int[rows][cols];

        // Matrix Multiplication
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                C[i][j] = 0;
                for (int k = 0; k < common; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        // Print Result
        System.out.println("Result Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}