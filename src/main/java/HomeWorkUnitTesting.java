public class HomeWorkUnitTesting {
    public static void main(String[] args) {
        double avg = 0.0;
        int[][] matrixSquare = new int[3][3];
        int[][] matrixZero = new int[0][0];
        int[][] matrixNoSquare = new int[][]{{1, 2, 3}, {1, 2}, {1, 2, 3}};

        int[] arr = {1, 5, 7, 9};
        int[] arrEmpty = {};

        Matrix matrixObject = new Matrix();

        System.out.println("matrixSquare - " + matrixObject.isSquareMatrix(matrixSquare));
        System.out.println("matrixNoSquare - " + matrixObject.isSquareMatrix(matrixNoSquare));
        System.out.println("matrixNull - " + matrixObject.isSquareMatrix(null));
        System.out.println("matrixZero - " + matrixObject.isSquareMatrix(matrixZero));

        avg = matrixObject.averageArrayElements(arr);
        System.out.println("avg arr - " + avg);

        avg = matrixObject.averageArrayElements(arrEmpty);
        System.out.println("avg arrEmpty - " + avg);

        avg = matrixObject.averageArrayElements(null);
        System.out.println("avg of null - " + avg);

    }
}
