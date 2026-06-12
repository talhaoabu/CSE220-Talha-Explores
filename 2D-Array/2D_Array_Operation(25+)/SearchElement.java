public class SearchElement {
    public static void main(String[] args) {

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int target = 7;
        boolean found = false;

        // Search the element
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                if (matrix[i][j] == target) {
                    System.out.println(target + " found at Row = " + i +
                                       ", Column = " + j);
                    found = true;
                    break;
                }

            }

            if (found) {
                break;
            }
        }

        if (!found) {
            System.out.println(target + " not found in the matrix.");
        }
    }
}