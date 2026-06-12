public class CountTotalElements {
    public static void main(String[] args) {

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int total = matrix.length * matrix[0].length;

        System.out.println("Total Elements = " + total);
    }
}