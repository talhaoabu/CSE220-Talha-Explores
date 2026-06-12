public class SecondaryDiagonalPrint {
    public static void main(String[] args) {

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (i + j == n - 1) {
                    System.out.print(matrix[i][j] + " ");
                } else {
                    System.out.print("0 ");
                }

            }
            System.out.println();
        }
    }
}