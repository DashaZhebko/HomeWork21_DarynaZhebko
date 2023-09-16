public class Matrix {

    public boolean isSquareMatrix(int[][] matrix) {
        if (matrix == null)
            return false;
        if (matrix.length == 0)
            return false;

        for (int[] ints : matrix) {
            if (matrix.length != ints.length)
                return false;
        }
        return true;
    }

    public double averageArrayElements(int[] array) {
        int sum = 0;
        if (array == null) {
            return 0.0;
        }
        for (int el : array) {
            sum += el;
        }
        if (sum == 0) {
            return 0.0;
        }
        return sum / array.length;
    }
}
