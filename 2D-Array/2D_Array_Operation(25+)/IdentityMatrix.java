public class IdentityMatrix {
    public static void main(String[] args) {

        int[][] matrix = {
            {1, 0, 0},
            {0, 1, 0},
            {0, 0, 1}
        };

        boolean isIdentity = true;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {

                if (i == j) {
                    // Diagonal elements must be 1
                    if (matrix[i][j] != 1) {
                        isIdentity = false;
                    }
                } else {
                    // Non-diagonal elements must be 0
                    if (matrix[i][j] != 0) {
                        isIdentity = false;
                    }
                }

            }
        }

        if (isIdentity) {
            System.out.println("The matrix is an Identity Matrix.");
        } else {
            System.out.println("The matrix is NOT an Identity Matrix.");
        }
    }
}