public class SwapRows {
    public static void main(String[] args) {

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int row1 = 1; // First row (index 0)
        int row2 = 2; // Third row (index 2)

        // Swap the rows
        int[] temp = matrix[row1]; // 4 5 6
        matrix[row1] = matrix[row2];
        matrix[row2] = temp;

        // Print the updated matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

// another way to swap rowws : 
// int row1 = 0;
// int row2 = 2;

// for (int j = 0; j < matrix[0].length; j++) {
//     int temp = matrix[row1][j];
//     matrix[row1][j] = matrix[row2][j];
//     matrix[row2][j] = temp;
// }