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


    @Test
    void testSweep8() {
        final MineSweeper test = new MineSweeper(3, 3);
        final char[][] field = {{'*', '*', '*'}, {'*', '.', '*'}, {'*', '*', '*'}};
        test.mineFieldSet(field);
        final Method[] methods = test.getClass().getDeclaredMethods();
        for (Method m: methods) {
            if (m.getName().equals(SWEEP_METHOD)) {
                m.setAccessible(true);
                try {
                    assertEquals(8, m.invoke(test, 2, 2));
                } catch (final ReflectiveOperationException ignored) {

                }

            }
        }
    }
    @Test
    void testSweep7() {
        final MineSweeper test = new MineSweeper(3, 3);
        final char[][] field = {{'.', '*', '*'}, {'*', '.', '*'}, {'*', '*', '*'}};
        test.mineFieldSet(field);
        final Method[] methods = test.getClass().getDeclaredMethods();
        for (Method m: methods) {
            if (m.getName().equals(SWEEP_METHOD)) {
                m.setAccessible(true);
                try {
                    assertEquals(7, m.invoke(test, 2, 2));
                } catch (final ReflectiveOperationException ignored) {

                }

            }
        }
    }
    @Test
    void testSweep6() {
        final MineSweeper test = new MineSweeper(3, 3);
        final char[][] field = {{'.', '.', '*'}, {'*', '.', '*'}, {'*', '*', '*'}};
        test.mineFieldSet(field);
        final Method[] methods = test.getClass().getDeclaredMethods();
        for (Method m: methods) {
            if (m.getName().equals(SWEEP_METHOD)) {
                m.setAccessible(true);
                try {
                    assertEquals(6, m.invoke(test, 2, 2));
                } catch (final ReflectiveOperationException ignored) {

                }

            }
        }
    }
    @Test
    void testSweep5() {
        final MineSweeper test = new MineSweeper(3, 3);
        final char[][] field = {{'.', '.', '.'}, {'*', '.', '*'}, {'*', '*', '*'}};
        test.mineFieldSet(field);
        final Method[] methods = test.getClass().getDeclaredMethods();
        for (Method m: methods) {
            if (m.getName().equals(SWEEP_METHOD)) {
                m.setAccessible(true);
                try {
                    assertEquals(5, m.invoke(test, 2, 2));
                } catch (final ReflectiveOperationException ignored) {

                }

            }
        }
    }
    @Test
    void testSweep4() {
        final MineSweeper test = new MineSweeper(3, 3);
        final char[][] field = {{'.', '.', '.'}, {'.', '.', '*'}, {'*', '*', '*'}};
        test.mineFieldSet(field);
        final Method[] methods = test.getClass().getDeclaredMethods();
        for (Method m: methods) {
            if (m.getName().equals(SWEEP_METHOD)) {
                m.setAccessible(true);
                try {
                    assertEquals(4, m.invoke(test, 2, 2));
                } catch (final ReflectiveOperationException ignored) {

                }

            }
        }
    }
    @Test
    void testSweep3() {
        final MineSweeper test = new MineSweeper(3, 3);
        final char[][] field = {{'.', '.', '.'}, {'.', '.', '.'}, {'*', '*', '*'}};
        test.mineFieldSet(field);
        final Method[] methods = test.getClass().getDeclaredMethods();
        for (Method m: methods) {
            if (m.getName().equals(SWEEP_METHOD)) {
                m.setAccessible(true);
                try {
                    assertEquals(3, m.invoke(test, 2, 2));
                } catch (final ReflectiveOperationException ignored) {

                }

            }
        }
    }
    @Test
    void testSweep2() {
        final MineSweeper test = new MineSweeper(3, 3);
        final char[][] field = {{'.', '.', '.'}, {'.', '.', '.'}, {'.', '*', '*'}};
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
        final MineSweeper test = new MineSweeper(3, 3);
        final char[][] field = {{'.', '.', '.'}, {'.', '.', '.'}, {'.', '.', '*'}};
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
        final MineSweeper test = new MineSweeper(3, 3);
        final char[][] field = {{'.', '.', '.'}, {'.', '*', '.'}, {'.', '.', '.'}};
        test.mineFieldSet(field);
        final Method[] methods = test.getClass().getDeclaredMethods();
        for (Method m: methods) {
            if (m.getName().equals(SWEEP_METHOD)) {
                m.setAccessible(true);
                try {
                    assertEquals(0, m.invoke(test, 2, 2));
                } catch (final ReflectiveOperationException ignored) {

                }

            }
        }
    }
    @Test
    void testSolve4x4Given() {
        final MineSweeper test = new MineSweeper(4, 4);
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
        final MineSweeper test = new MineSweeper(3, 5);
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
                    fail("Return 2D array was larger than expected");
                } else {
                    assertEquals(expected[row][col], result[row][col]);
                }
            }
        }
    }
}