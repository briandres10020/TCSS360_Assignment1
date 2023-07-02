import static org.junit.jupiter.api.Assertions.assertEquals;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import org.junit.jupiter.api.Test;


class MineSweeperTest {
    /**
     * Sweep method name, for use in reflections access to sweep method.
     */
    public static final String SWEEP_METHOD = "sweep";
    public static final String MY_MINE_FIELD = "myMineField";


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
}