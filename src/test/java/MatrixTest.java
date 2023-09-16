import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatrixTest {
    Matrix matrix;

    @BeforeEach
    void setUp() {
        matrix = new Matrix();
    }

    @AfterEach
    void tearDown() {
        matrix = null;
    }

    @Test
    void isSquareMatrixNull() {
        assertFalse(matrix.isSquareMatrix(null));
    }

    @Test
    void isSquareMatrixZero() {
        assertFalse(matrix.isSquareMatrix(new int[0][0]));
    }

    @Test
    void isSquareMatrixNoSquare() {
        assertFalse(matrix.isSquareMatrix(new int[3][2]));
    }

    @Test
    void isSquareMatrixNoSquareTriangular() {
        assertFalse(matrix.isSquareMatrix(new int[][]{{1, 2, 3}, {1, 2}, {1}}));
    }

    @Test
    void isSquareMatrixIsSquare() {
        assertTrue(matrix.isSquareMatrix(new int[2][2]));
    }

    @Test
    void averageArrayElements() {
        int[] arr = {1, 2, 3, 4, 5};
        double expectAvg = 3.0;

        assertEquals(expectAvg, matrix.averageArrayElements(arr), 0.001);

    }

    @Test
    void averageArrayElementsZero() {
        int[] arr = {};
        double expectAvg = 0.0;
        assertEquals(expectAvg, matrix.averageArrayElements(arr), 0.001);
    }

    @Test
    void averageArrayElementsNull() {
        double expectAvg = 0.0;
        assertEquals(expectAvg, matrix.averageArrayElements(null), 0.001);
    }
}