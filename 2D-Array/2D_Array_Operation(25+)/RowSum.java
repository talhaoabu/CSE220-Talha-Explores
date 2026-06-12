public class RowSum {
    public static void main(String[] args) {

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int row = matrix.length;
        int col = matrix[0].length;

         
        // Calculate sum of each row
        for (int j = 0; j < col; j++) {
        int colSum = 0;
            for (int i = 0; i < row; i++) {
                colSum += matrix[i][j];
            }

            System.out.println("Sum of Column " + (j ) + " = " + colSum);
        }
    }
}