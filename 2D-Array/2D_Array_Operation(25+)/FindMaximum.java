public class FindMaximum {
    public static void main(String[] args) {

        int[][] matrix = {
            {10, 25, 3},
            {45, 15, 60},
            {7, 80, 9}
        };

        // Assume first element is maximum
        int max = matrix[0][0];

        // Find maximum element
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }

        System.out.println("Maximum Element = " + max);
    }
}


// public class FindMaximumPosition {
//     public static void main(String[] args) {

//         int[][] matrix = {
//             {10, 25, 3},
//             {45, 15, 60},
//             {7, 80, 9}
//         };

//         int max = matrix[0][0];
//         int row = 0, col = 0;

//         for (int i = 0; i < matrix.length; i++) {
//             for (int j = 0; j < matrix[i].length; j++) {
//                 if (matrix[i][j] > max) {
//                     max = matrix[i][j];
//                     row = i;
//                     col = j;
//                 }
//             }
//         }

//         System.out.println("Maximum Element = " + max);
//         System.out.println("Position = (" + row + ", " + col + ")");
//     }
// }