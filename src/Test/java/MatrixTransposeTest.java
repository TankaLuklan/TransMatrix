import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MatrixTransposeTest {

    @Test
    public void testTransposeSquareMatrix() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] expected = {
                {1, 4, 7},
                {2, 5, 8},
                {3, 6, 9}
        };

        int[][] transposed = Main.transpose(matrix);

        assertArrayEquals(expected, transposed);
    }

    @Test
    public void testTransposeRectangularMatrix() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] expected = {
                {1, 4},
                {2, 5},
                {3, 6}
        };

        int[][] transposed = Main.transpose(matrix);

        assertArrayEquals(expected, transposed);
    }
    @Test
    public void testTransposeQuadroMatrix() {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9,10,11,12},
                {13,14,15,16}
        };

        int[][] expected = {
                {1, 5, 9,13 },
                {2, 6,10,14 },
                {3, 7,11, 15},
                {4, 8,12, 16}
        };

        int[][] transposed = Main.transpose(matrix);

        assertArrayEquals(expected, transposed);
    }



}
