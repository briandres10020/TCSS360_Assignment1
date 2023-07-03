import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.lang.reflect.Method;
import org.junit.jupiter.api.Test;


class MineSweeperTest {
    /**
     * Sweep method name, for use in reflections access to sweep method.
     */
    public static final String SWEEP_METHOD = "sweep";
    /**
     * Fail msg for when returned array was too big.
     */
    public static final String RESULT_SIZE_FAIL = "Returned 2D array was larger than expected";

// Tests for Mine Detection method
    @Test
    void testSweep8() {
        final int rows = 3;
        final int columns = 3;
        final MineSweeper test = new MineSweeper(rows, columns);
        final char[][] field = {
                {'*', '*', '*'},
                {'*', '.', '*'},
                {'*', '*', '*'}};
        test.mineFieldSet(field);
        final Method[] methods = test.getClass().getDeclaredMethods();
        for (Method m: methods) {
            if (m.getName().equals(SWEEP_METHOD)) {
                m.setAccessible(true);
                try {
                    final int expected = 8;
                    assertEquals(expected, m.invoke(test, 2, 2));
                } catch (final ReflectiveOperationException ignored) {

                }

            }
        }
    }
    @Test
    void testSweep7() {
        final int rows = 3;
        final int columns = 3;
        final MineSweeper test = new MineSweeper(rows, columns);
        final char[][] field = {
                {'.', '*', '*'},
                {'*', '.', '*'},
                {'*', '*', '*'}};
        test.mineFieldSet(field);
        final Method[] methods = test.getClass().getDeclaredMethods();
        for (Method m: methods) {
            if (m.getName().equals(SWEEP_METHOD)) {
                m.setAccessible(true);
                try {
                    final int expected = 7;
                    assertEquals(expected, m.invoke(test, 2, 2));
                } catch (final ReflectiveOperationException ignored) {

                }

            }
        }
    }
    @Test
    void testSweep6() {
        final int rows = 3;
        final int columns = 3;
        final MineSweeper test = new MineSweeper(rows, columns);
        final char[][] field = {
                {'.', '.', '*'},
                {'*', '.', '*'},
                {'*', '*', '*'}};
        test.mineFieldSet(field);
        final Method[] methods = test.getClass().getDeclaredMethods();
        for (Method m: methods) {
            if (m.getName().equals(SWEEP_METHOD)) {
                m.setAccessible(true);
                try {
                    final int expected = 6;
                    assertEquals(expected, m.invoke(test, 2, 2));
                } catch (final ReflectiveOperationException ignored) {

                }

            }
        }
    }
    @Test
    void testSweep5() {
        final int rows = 3;
        final int columns = 3;
        final MineSweeper test = new MineSweeper(rows, columns);
        final char[][] field = {
                {'.', '.', '.'},
                {'*', '.', '*'},
                {'*', '*', '*'}};
        test.mineFieldSet(field);
        final Method[] methods = test.getClass().getDeclaredMethods();
        for (Method m: methods) {
            if (m.getName().equals(SWEEP_METHOD)) {
                m.setAccessible(true);
                try {
                    final int expected = 5;
                    assertEquals(expected, m.invoke(test, 2, 2));
                } catch (final ReflectiveOperationException ignored) {

                }

            }
        }
    }
    @Test
    void testSweep4() {
        final int rows = 3;
        final int columns = 3;
        final MineSweeper test = new MineSweeper(rows, columns);
        final char[][] field = {
                {'.', '.', '.'},
                {'.', '.', '*'},
                {'*', '*', '*'}};
        test.mineFieldSet(field);
        final Method[] methods = test.getClass().getDeclaredMethods();
        for (Method m: methods) {
            if (m.getName().equals(SWEEP_METHOD)) {
                m.setAccessible(true);
                try {
                    final int expected = 4;
                    assertEquals(expected, m.invoke(test, 2, 2));
                } catch (final ReflectiveOperationException ignored) {

                }

            }
        }
    }
    @Test
    void testSweep3() {
        final int rows = 3;
        final int columns = 3;
        final MineSweeper test = new MineSweeper(rows, columns);
        final char[][] field = {
                {'.', '.', '.'},
                {'.', '.', '.'},
                {'*', '*', '*'}};
        test.mineFieldSet(field);
        final Method[] methods = test.getClass().getDeclaredMethods();
        for (Method m: methods) {
            if (m.getName().equals(SWEEP_METHOD)) {
                m.setAccessible(true);
                try {
                    final int expected = 3;
                    assertEquals(expected, m.invoke(test, 2, 2));
                } catch (final ReflectiveOperationException ignored) {

                }

            }
        }
    }
    @Test
    void testSweep2() {
        final int rows = 3;
        final int columns = 3;
        final MineSweeper test = new MineSweeper(rows, columns);
        final char[][] field = {
                {'.', '.', '.'},
                {'.', '.', '.'},
                {'.', '*', '*'}};
        test.mineFieldSet(field);
        final Method[] methods = test.getClass().getDeclaredMethods();
        for (Method m: methods) {
            if (m.getName().equals(SWEEP_METHOD)) {
                m.setAccessible(true);
                try {
                    assertEquals(2, m.invoke(test, 2, 2));
                } catch (final ReflectiveOperationException ignored) {

                }

            }
        }
    }
    @Test
    void testSweep1() {
        final int rows = 3;
        final int columns = 3;
        final MineSweeper test = new MineSweeper(rows, columns);
        final char[][] field = {
                {'.', '.', '.'},
                {'.', '.', '.'},
                {'.', '.', '*'}};
        test.mineFieldSet(field);
        final Method[] methods = test.getClass().getDeclaredMethods();
        for (Method m: methods) {
            if (m.getName().equals(SWEEP_METHOD)) {
                m.setAccessible(true);
                try {
                    assertEquals(1, m.invoke(test, 2, 2));
                } catch (final ReflectiveOperationException ignored) {

                }

            }
        }
    }
    @Test
    void testSweep0() {
        final int rows = 3;
        final int columns = 3;
        final MineSweeper test = new MineSweeper(rows, columns);
        final char[][] field = {
                {'.', '.', '.'},
                {'.', '*', '.'},
                {'.', '.', '.'}};
        test.mineFieldSet(field);
        final Method[] methods = test.getClass().getDeclaredMethods();
        for (Method m: methods) {
            if (m.getName().equals(SWEEP_METHOD)) {
                m.setAccessible(true);
                try {
                    final int expected = 0;
                    assertEquals(expected, m.invoke(test, 2, 2));
                } catch (final ReflectiveOperationException ignored) {

                }

            }
        }
    }
    @Test
    void testSweep1Edge() {
        final int rows = 3;
        final int columns = 3;
        final MineSweeper test = new MineSweeper(rows, columns);
        final char[][] field = {
                {'.', '.', '.'},
                {'.', '*', '.'},
                {'.', '.', '.'}};
        test.mineFieldSet(field);
        final Method[] methods = test.getClass().getDeclaredMethods();
        for (Method m: methods) {
            if (m.getName().equals(SWEEP_METHOD)) {
                m.setAccessible(true);
                try {
                    final int expected = 1;
                    assertEquals(expected, m.invoke(test, 2, 1));
                } catch (final ReflectiveOperationException ignored) {

                }

            }
        }
    }

    // Full solve Tests
    @Test
    void testSolve4x4Given() {
        final int rows = 4;
        final int columns = 4;
        final MineSweeper test = new MineSweeper(rows, columns);
        final char[][] field = {
                {'*', '.', '.', '.'},
                {'.', '.', '.', '.'},
                {'.', '*', '.', '.'},
                {'.', '.', '.', '.'}};
        test.mineFieldSet(field);
        final char[][] expected = {
                {'*', '1', '0', '0'},
                {'2', '2', '1', '0'},
                {'1', '*', '1', '0'},
                {'1', '1', '1', '0'}};
        final char[][] result = test.solve();

        for (int row = 0; row < result.length; row++) {
            for (int col = 0; col < result[0].length; col++) {
                if (row >= expected.length || col >= expected[0].length) {
                    fail(RESULT_SIZE_FAIL);
                } else {
                    assertEquals(expected[row][col], result[row][col]);
                }
            }
        }
    }
    @Test
    void testSolve3x5Given() {
        final int rows = 3;
        final int columns = 5;
        final MineSweeper test = new MineSweeper(rows, columns);
        final char[][] field = {
                {'*', '*', '.', '.', '.'},
                {'.', '.', '.', '.', '.'},
                {'.', '*', '.', '.', '.'}};
        test.mineFieldSet(field);
        final char[][] expected = {
                {'*', '*', '1', '0', '0'},
                {'3', '3', '2', '0', '0'},
                {'1', '*', '1', '0', '0'}};
        final char[][] result = test.solve();

        for (int row = 0; row < result.length; row++) {
            for (int col = 0; col < result[0].length; col++) {
                if (row >= expected.length || col >= expected[0].length) {
                    fail(RESULT_SIZE_FAIL);
                } else {
                    assertEquals(expected[row][col], result[row][col]);
                }
            }
        }
    }

    @Test
    void testSolve5x5() {
        final int rows = 5;
        final int columns = 5;
        final MineSweeper test = new MineSweeper(rows, columns);
        final char[][] field = {
                {'*', '.', '.', '.', '.'},
                {'.', '.', '*', '.', '.'},
                {'.', '*', '.', '*', '.'},
                {'.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.'}};
        test.mineFieldSet(field);
        final char[][] expected = {
                {'*', '2', '1', '1', '0'},
                {'2', '3', '*', '2', '1'},
                {'1', '*', '3', '*', '1'},
                {'1', '1', '2', '1', '1'},
                {'0', '0', '0', '0', '0'}};
        final char[][] result = test.solve();

        for (int row = 0; row < result.length; row++) {
            for (int col = 0; col < result[0].length; col++) {
                if (row >= expected.length || col >= expected[0].length) {
                    fail(RESULT_SIZE_FAIL);
                } else {
                    assertEquals(expected[row][col], result[row][col]);
                }
            }
        }
    }

    @Test
    void testSolve4x6() {
        final int rows = 4;
        final int columns = 6;
        final MineSweeper test = new MineSweeper(rows, columns);
        final char[][] field = {
                {'*', '.', '.', '*', '*', '*'},
                {'.', '.', '.', '*', '.', '*'},
                {'.', '*', '.', '*', '*', '*'},
                {'.', '.', '.', '.', '.', '.'}};
        test.mineFieldSet(field);
        final char[][] expected = {
                {'*', '1', '2', '*', '*', '*'},
                {'2', '2', '4', '*', '8', '*'},
                {'1', '*', '3', '*', '*', '*'},
                {'1', '1', '2', '2', '3', '2'}};
        final char[][] result = test.solve();

        for (int row = 0; row < result.length; row++) {
            for (int col = 0; col < result[0].length; col++) {
                if (row >= expected.length || col >= expected[0].length) {
                    fail(RESULT_SIZE_FAIL);
                } else {
                    assertEquals(expected[row][col], result[row][col]);
                }
            }
        }

    }

    @Test
    void testSolve3x16() {
        final int rows = 3;
        final int columns = 16;
        final MineSweeper test = new MineSweeper(rows, columns);
        final char[][] field = {
                {'*', '.', '.', '*', '.', '.', '.', '.',
                 '.', '*', '.', '.', '.', '.', '.', '*'},
                {'.', '.', '.', '.', '.', '.', '.', '*',
                 '.', '.', '.', '.', '*', '*', '.', '*'},
                {'.', '.', '.', '*', '.', '*', '.', '.',
                 '.', '.', '.', '.', '.', '.', '.', '.'}};
        test.mineFieldSet(field);
        final char[][] expected = {
                {'*', '1', '1', '*', '1', '0', '1', '1',
                 '2', '*', '1', '1', '2', '2', '3', '*'},
                {'1', '1', '2', '2', '3', '1', '2', '*',
                 '2', '1', '1', '1', '*', '*', '3', '*'},
                {'0', '0', '1', '*', '2', '*', '2', '1',
                 '1', '0', '0', '1', '2', '2', '2', '1'}};
        final char[][] result = test.solve();

        for (int row = 0; row < result.length; row++) {
            for (int col = 0; col < result[0].length; col++) {
                if (row >= expected.length || col >= expected[0].length) {
                    fail(RESULT_SIZE_FAIL);
                } else {
                    assertEquals(expected[row][col], result[row][col]);
                }
            }
        }
    }

    @Test
    void testSolve16x3() {
        final int rows = 16;
        final int columns = 3;
        final MineSweeper test = new MineSweeper(rows, columns);
        final char[][] field = {
                {'.', '.', '.'},
                {'.', '*', '.'},
                {'.', '.', '.'},
                {'.', '.', '.'},
                {'.', '*', '.'},
                {'.', '.', '.'},
                {'.', '.', '.'},
                {'.', '*', '.'},
                {'.', '.', '.'},
                {'.', '.', '.'},
                {'.', '*', '.'},
                {'.', '.', '.'},
                {'.', '.', '.'},
                {'.', '*', '.'},
                {'.', '.', '.'},
                {'.', '.', '.'}};
        test.mineFieldSet(field);
        final char[][] expected = {
                {'1', '1', '1'},
                {'1', '*', '1'},
                {'1', '1', '1'},
                {'1', '1', '1'},
                {'1', '*', '1'},
                {'1', '1', '1'},
                {'1', '1', '1'},
                {'1', '*', '1'},
                {'1', '1', '1'},
                {'1', '1', '1'},
                {'1', '*', '1'},
                {'1', '1', '1'},
                {'1', '1', '1'},
                {'1', '*', '1'},
                {'1', '1', '1'},
                {'0', '0', '0'}};
        final char[][] result = test.solve();

        for (int row = 0; row < result.length; row++) {
            for (int col = 0; col < result[0].length; col++) {
                if (row >= expected.length || col >= expected[0].length) {
                    fail(RESULT_SIZE_FAIL);
                } else {
                    assertEquals(expected[row][col], result[row][col]);
                }
            }
        }
    }
    @Test
    void testSolve1x32() {
        final int rows = 1;
        final int columns = 32;
        final MineSweeper test = new MineSweeper(rows, columns);
        final char[][] field = {
                {'*', '.', '.', '*', '*', '*', '.', '.', '*', '*', '.',
                 '*', '.', '.', '*', '.', '*', '.', '.', '*', '*', '*',
                 '.', '.', '*', '*', '.', '*', '.', '.', '*', '.' }};
        test.mineFieldSet(field);
        final char[][] expected = {
                {'*', '1', '1', '*', '*', '*', '1', '1', '*', '*', '2',
                 '*', '1', '1', '*', '2', '*', '1', '1', '*', '*', '*',
                 '1', '1', '*', '*', '2', '*', '1', '1', '*', '1' }};
        final char[][] result = test.solve();

        for (int row = 0; row < result.length; row++) {
            for (int col = 0; col < result[0].length; col++) {
                if (row >= expected.length || col >= expected[0].length) {
                    fail(RESULT_SIZE_FAIL);
                } else {
                    assertEquals(expected[row][col], result[row][col]);
                }
            }
        }
    }
    @Test
    void testSolve32x1() {
        final int rows = 32;
        final int columns = 1;
        final MineSweeper test = new MineSweeper(rows, columns);
        final char[][] field = {
                {'*'}, {'.'}, {'.'}, {'*'}, {'*'}, {'.'}, {'.'}, {'*'}, {'.'}, {'*'}, {'.'},
                {'.'}, {'*'}, {'*'}, {'*'}, {'.'}, {'*'}, {'*'}, {'.'}, {'.'}, {'*'}, {'*'},
                {'.'}, {'.'}, {'.'}, {'.'}, {'*'}, {'*'}, {'.'}, {'.'}, {'.'}, {'.'}};
        test.mineFieldSet(field);
        final char[][] expected = {
                {'*'}, {'1'}, {'1'}, {'*'}, {'*'}, {'1'}, {'1'}, {'*'}, {'2'}, {'*'}, {'1'},
                {'1'}, {'*'}, {'*'}, {'*'}, {'2'}, {'*'}, {'*'}, {'1'}, {'1'}, {'*'}, {'*'},
                {'1'}, {'0'}, {'0'}, {'1'}, {'*'}, {'*'}, {'1'}, {'0'}, {'0'}, {'0'}};
        final char[][] result = test.solve();

        for (int row = 0; row < result.length; row++) {
            for (int col = 0; col < result[0].length; col++) {
                if (row >= expected.length || col >= expected[0].length) {
                    fail(RESULT_SIZE_FAIL);
                } else {
                    assertEquals(expected[row][col], result[row][col]);
                }
            }
        }
    }
    @Test
    void testSolve9x9() {
        final int rows = 9;
        final int columns = 9;
        final MineSweeper test = new MineSweeper(rows, columns);
        final char[][] field = {
                {'*', '.', '.', '.', '.', '.', '.', '.', '*'},
                {'.', '*', '.', '.', '.', '.', '.', '*', '.'},
                {'.', '.', '*', '.', '.', '.', '*', '.', '.'},
                {'.', '.', '.', '*', '.', '*', '.', '.', '.'},
                {'.', '.', '.', '.', '*', '.', '.', '.', '.'},
                {'.', '.', '.', '*', '.', '*', '.', '.', '.'},
                {'.', '.', '*', '.', '.', '.', '*', '.', '.'},
                {'.', '*', '.', '.', '.', '.', '.', '*', '.'},
                {'*', '.', '.', '.', '.', '.', '.', '.', '*'}};
        test.mineFieldSet(field);
        final char[][] expected = {
                {'*', '2', '1', '0', '0', '0', '1', '2', '*'},
                {'2', '*', '2', '1', '0', '1', '2', '*', '2'},
                {'1', '2', '*', '2', '2', '2', '*', '2', '1'},
                {'0', '1', '2', '*', '3', '*', '2', '1', '0'},
                {'0', '0', '2', '3', '*', '3', '2', '0', '0'},
                {'0', '1', '2', '*', '3', '*', '2', '1', '0'},
                {'1', '2', '*', '2', '2', '2', '*', '2', '1'},
                {'2', '*', '2', '1', '0', '1', '2', '*', '2'},
                {'*', '2', '1', '0', '0', '0', '1', '2', '*'}};
        final char[][] result = test.solve();

        for (int row = 0; row < result.length; row++) {
            for (int col = 0; col < result[0].length; col++) {
                if (row >= expected.length || col >= expected[0].length) {
                    fail(RESULT_SIZE_FAIL);
                } else {
                    assertEquals(expected[row][col], result[row][col]);
                }
            }
        }
    }


    @Test
    void testSolve1x1Empty() {
        final int rows = 1;
        final int columns = 1;
        final MineSweeper test = new MineSweeper(rows, columns);
        final char[][] field = {{'.'}};
        test.mineFieldSet(field);
        final char[][] expected = {{'0'}};
        final char[][] result = test.solve();
        for (int row = 0; row < result.length; row++) {
            for (int col = 0; col < result[0].length; col++) {
                if (row >= expected.length || col >= expected[0].length) {
                    fail(RESULT_SIZE_FAIL);
                } else {
                    assertEquals(expected[row][col], result[row][col]);
                }
            }
        }

    }

    @Test
    void testSolve100x100Empty() {
        final int rows = 100;
        final int columns = 100;
        final MineSweeper test = new MineSweeper(rows, columns);
        final char[][] field = new char[rows][columns];
        test.mineFieldSet(field);
        final char[][] expected = new char[rows][columns];
        for (int row = 0; row < expected.length; row++) {
            for (int col = 0; col < expected[0].length; col++) {
                expected[row][col] = '0';
            }
        }

        final char[][] result = test.solve();
        for (int row = 0; row < result.length; row++) {
            for (int col = 0; col < result[0].length; col++) {
                if (row >= expected.length || col >= expected[0].length) {
                    fail(RESULT_SIZE_FAIL);
                } else {
                    assertEquals(expected[row][col], result[row][col]);
                }
            }
        }
    }
    @Test
    void testSolve1x100Empty() {
        final int rows = 1;
        final int columns = 100;
        final MineSweeper test = new MineSweeper(rows, columns);
        final char[][] field = new char[rows][columns];
        test.mineFieldSet(field);
        final char[][] expected = new char[rows][columns];
        for (int row = 0; row < expected.length; row++) {
            for (int col = 0; col < expected[0].length; col++) {
                expected[row][col] = '0';
            }
        }

        final char[][] result = test.solve();
        for (int row = 0; row < result.length; row++) {
            for (int col = 0; col < result[0].length; col++) {
                if (row >= expected.length || col >= expected[0].length) {
                    fail(RESULT_SIZE_FAIL);
                } else {
                    assertEquals(expected[row][col], result[row][col]);
                }
            }
        }
    }

    @Test
    void testSolve100x1Empty() {
        final int rows = 100;
        final int columns = 1;
        final MineSweeper test = new MineSweeper(rows, columns);
        final char[][] field = new char[rows][columns];
        test.mineFieldSet(field);
        final char[][] expected = new char[rows][columns];
        for (int row = 0; row < expected.length; row++) {
            for (int col = 0; col < expected[0].length; col++) {
                expected[row][col] = '0';
            }
        }

        final char[][] result = test.solve();
        for (int row = 0; row < result.length; row++) {
            for (int col = 0; col < result[0].length; col++) {
                if (row >= expected.length || col >= expected[0].length) {
                    fail(RESULT_SIZE_FAIL);
                } else {
                    assertEquals(expected[row][col], result[row][col]);
                }
            }
        }
    }
    @Test
    void testSolve1x1Mine() {
        final int rows = 1;
        final int columns = 1;
        final MineSweeper test = new MineSweeper(rows, columns);
        final char[][] field = {{'*'}};
        test.mineFieldSet(field);
        final char[][] expected = {{'*'}};
        final char[][] result = test.solve();
        for (int row = 0; row < result.length; row++) {
            for (int col = 0; col < result[0].length; col++) {
                if (row >= expected.length || col >= expected[0].length) {
                    fail(RESULT_SIZE_FAIL);
                } else {
                    assertEquals(expected[row][col], result[row][col]);
                }
            }
        }
    }
    @Test
    void testSolve1x100AllMines() {
        final int rows = 1;
        final int columns = 100;
        final MineSweeper test = new MineSweeper(rows, columns);
        final char[][] field = new char[rows][columns];
        for (int row = 0; row < field.length; row++) {
            for (int col = 0; col < field[0].length; col++) {
                field[row][col] = '*';
            }
        }
        test.mineFieldSet(field);
        final char[][] expected = new char[rows][columns];
        for (int row = 0; row < expected.length; row++) {
            for (int col = 0; col < expected[0].length; col++) {
                expected[row][col] = '*';
            }
        }

        final char[][] result = test.solve();
        for (int row = 0; row < result.length; row++) {
            for (int col = 0; col < result[0].length; col++) {
                if (row >= expected.length || col >= expected[0].length) {
                    fail(RESULT_SIZE_FAIL);
                } else {
                    assertEquals(expected[row][col], result[row][col]);
                }
            }
        }
    }
    @Test
    void testSolve100x1AllMines() {
        final int rows = 100;
        final int columns = 1;
        final MineSweeper test = new MineSweeper(rows, columns);
        final char[][] field = new char[rows][columns];
        for (int row = 0; row < field.length; row++) {
            for (int col = 0; col < field[0].length; col++) {
                field[row][col] = '*';
            }
        }
        test.mineFieldSet(field);
        final char[][] expected = new char[rows][columns];
        for (int row = 0; row < expected.length; row++) {
            for (int col = 0; col < expected[0].length; col++) {
                expected[row][col] = '*';
            }
        }

        final char[][] result = test.solve();
        for (int row = 0; row < result.length; row++) {
            for (int col = 0; col < result[0].length; col++) {
                if (row >= expected.length || col >= expected[0].length) {
                    fail(RESULT_SIZE_FAIL);
                } else {
                    assertEquals(expected[row][col], result[row][col]);
                }
            }
        }
    }
    @Test
    void testSolve100x100AllMines() {
        final int rows = 100;
        final int columns = 100;
        final MineSweeper test = new MineSweeper(rows, columns);
        final char[][] field = new char[rows][columns];
        for (int row = 0; row < field.length; row++) {
            for (int col = 0; col < field[0].length; col++) {
                field[row][col] = '*';
            }
        }
        test.mineFieldSet(field);
        final char[][] expected = new char[rows][columns];
        for (int row = 0; row < expected.length; row++) {
            for (int col = 0; col < expected[0].length; col++) {
                expected[row][col] = '*';
            }
        }

        final char[][] result = test.solve();
        for (int row = 0; row < result.length; row++) {
            for (int col = 0; col < result[0].length; col++) {
                if (row >= expected.length || col >= expected[0].length) {
                    fail(RESULT_SIZE_FAIL);
                } else {
                    assertEquals(expected[row][col], result[row][col]);
                }
            }
        }
    }
}