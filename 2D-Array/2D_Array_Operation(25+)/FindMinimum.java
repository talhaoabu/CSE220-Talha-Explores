// public class FindMinimum {
//     public static void main(String[] args) {

//         int[][] matrix = {
//             {10, 25, 3},
//             {45, 15, 60},
//             {7, 80, 9}
//         };

//         // Assume first element is minimum
//         int min = matrix[0][0];

//         // Find minimum element
//         for (int i = 0; i < matrix.length; i++) {
//             for (int j = 0; j < matrix[i].length; j++) {
//                 if (matrix[i][j] < min) {
//                     min = matrix[i][j];
//                 }
//             }
//         }

//         System.out.println("Minimum Element = " + min);
//     }
// }


public class FindMinimum {
    public static void main(String[] args) {

        int[][] matrix = {
            {10, 25, 3},
            {45, 15, 60},
            {7, 80, 9}
        };

        int min = matrix[0][0];
        int row = 0, col = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    row = i;
                    col = j;
                }
            }
        }

        System.out.println("Minimum Element = " + min);
        System.out.println("Position = (" + row + ", " + col + ")");
    }
}