public class MatrixTranspose {
    public static void main(String[] args) {

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int rows = matrix.length;
        int cols = matrix[0].length;

        // Create transpose matrix
        int[][] transpose = new int[cols][rows];

        // Compute transpose
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        // Print transpose matrix
        System.out.println("Transpose Matrix:");
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[i].length; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}

// Transpose-এর সবচেয়ে গুরুত্বপূর্ণ সূত্র:

// transpose[j][i] = matrix[i][j];

// এবং শুধু square matrix-এর ক্ষেত্রে matrix[i][j] ও matrix[j][i] swap করে in-place transpose করা সম্ভব।


// In-place Transpose (শুধু Square Matrix-এর জন্য)

// যদি 3×3, 4×4 ইত্যাদি square matrix হয়, তাহলে নতুন array না বানিয়েও transpose করা যায়:

// for (int i = 0; i < matrix.length; i++) {
//     for (int j = i + 1; j < matrix.length; j++) {
//         int temp = matrix[i][j];
//         matrix[i][j] = matrix[j][i];
//         matrix[j][i] = temp;
//     }
// }