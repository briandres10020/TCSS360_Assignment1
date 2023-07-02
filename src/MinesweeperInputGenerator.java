/**
 * Imports the Random class from java.util package
 */
import java.util.Random;

/**
 * This class is used to generate a Minesweeper field.
 */
public class MinesweeperInputGenerator {

    /**
     * Maximum number of rows in the field.
     */
    private static final int MAX_ROWS = 100;

    /**
     * Maximum number of columns in the field.
     */
    private static final int MAX_COLS = 100;

    /**
     * Percentage of mines in the field.
     */
    private static final double PERCENT_MINES = 0.2;

    /**
     * Main method of the program where it
     * generates a randomized Minesweeper field
     * and prints it to the standard output.
     *
     * @param theArgs command-line arguments (not used)
     */
    public static void main(String[] theArgs) {
        Random rand = new Random();

        // Randomly determines the number of rows and columns (at least 1)
        int rows = rand.nextInt(MAX_ROWS) + 1;
        int cols = rand.nextInt(MAX_COLS) + 1;

        // Creating field
        char[][] field = new char[rows][cols];

        // Initializing field with safe squares
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                field[i][j] = '.';
            }
        }

        // Randomly placing mines
        int mines = (int) (PERCENT_MINES * rows * cols);
        while (mines > 0) {
            int row = rand.nextInt(rows);
            int col = rand.nextInt(cols);
            if (field[row][col] != '*') {
                field[row][col] = '*';
                mines--;
            }
        }

        // Print number of rows and columns
        System.out.println(rows + " " + cols);

        // Print field
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(field[i][j]);
            }
            System.out.println();
        }
    }
}
