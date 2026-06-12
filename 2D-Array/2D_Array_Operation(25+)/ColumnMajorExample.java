public class ColumnMajorExample {
    public static void main(String[] args) {

        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int col = arr[0].length;
        int row = arr.length;

        // Column-major iteration
        for (int j = 0; j < col; j++) {   // Columns
            for (int i = 0; i < row; i++) {  // Rows
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}