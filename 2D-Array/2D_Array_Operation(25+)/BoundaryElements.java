public class BoundaryElements {
    public static void main(String[] args) {

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                // Check if the element is on the boundary
                if (i == 0 || i == rows - 1 || j == 0 || j == cols - 1) {
                    System.out.print(matrix[i][j] + " ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
    }
}