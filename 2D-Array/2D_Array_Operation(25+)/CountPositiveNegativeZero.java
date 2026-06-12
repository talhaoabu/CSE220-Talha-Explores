public class CountPositiveNegativeZero {
    public static void main(String[] args) {

        int[][] matrix = {
            { 1, -2, 0 },
            { 4, -5, 6 },
            { 0, 8, -9 }
        };

        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        // Count positive, negative, and zero elements
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                if (matrix[i][j] > 0) {
                    positiveCount++;
                } else if (matrix[i][j] < 0) {
                    negativeCount++;
                } else {
                    zeroCount++;
                }

            }
        }

        System.out.println("Positive Elements = " + positiveCount);
        System.out.println("Negative Elements = " + negativeCount);
        System.out.println("Zero Elements = " + zeroCount);
    }
}