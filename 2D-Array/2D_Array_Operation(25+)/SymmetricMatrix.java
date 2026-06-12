public class SymmetricMatrix {
    public static void main(String[] args) {

        int[][] matrix = {
            {1, 2, 3},
            {2, 5, 6},
            {3, 6, 9}
        };

        boolean isSymmetric = true;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {

                if (matrix[i][j] != matrix[j][i]) {
                    isSymmetric = false;
                    break;
                }
            }

            if (!isSymmetric) {
                break;
            }
        }

        if (isSymmetric) {
            System.out.println("The matrix is Symmetric.");
        } else {
            System.out.println("The matrix is NOT Symmetric.");
        }
    }
}

// একটি Square Matrix তখনই Symmetric হবে যদি:

// matrix[i][j] == matrix[j][i]