/**
 * @author Alex Bell
 * @version 1.0
 */
public class MineSweeper {
    /**
     * Maximum legal Size of the minefield along either axis.
     * Rows and columns are both bounded by this number
     */
    private static final int MAX_SIZE = 100;
    /**
     * Minimum legal Size of the minefield along either axis.
     * Rows and columns are both bounded by this number
     */
    private static final int MIN_SIZE = 1;
    /**
     *This is a buffered copy of the minefield,
     * that was read in through the setter method.
     */
    private final char[][] myMineField;
    /**
     *This is the number of rows in the non buffered minefield.
     */
    private final int myRows;
    /**
     *This is the number of columns in the non buffered minefield.
     */
    private final int myColumns;
    /**
     * A flag to indicate if the minefield has been set.
     */
    private boolean myMineFieldSet;

    /**
     * Takes in an amount of rows and columns, then uses that to create a buffered,
     * 2D array that the minefield can be copied into. Also checks the range of the parameters,
     *  and saves them for later use.
     * @param theRow
     * @param theCol
     */
    public MineSweeper(final int theRow, final int theCol) {
        if (theRow < MIN_SIZE || MAX_SIZE < theRow) {
            throw new IllegalArgumentException(
                    "given number of Rows is out of acceptable range");
        }
        if (theCol < MIN_SIZE || MAX_SIZE < theCol) {
            throw new IllegalArgumentException(
                    "given number of Columns is out of acceptable range");
        }
        myMineField = new char[theRow + 2][theCol + 2];
        myRows = theRow;
        myColumns = theCol;
        myMineFieldSet = false;
    }

    /**
     * Takes in a 2D character array representing the minefield
     * and copies that array into the buffered array created upon object instantiation.
     * @param theMineField
     */
    public void mineFieldSet(final char[][] theMineField) {
        if (theMineField.length != myRows || theMineField[0].length != myColumns) {
            throw new IllegalArgumentException(
                    "The MineField provided does not not match the specified size");
        }
        for (int row = 0; row < myRows; row++) {
            for (int col = 0; col < myColumns; col++) {
                myMineField[row + 1][col + 1] = theMineField[row][col];
            }
        }
        myMineFieldSet = true;
    }

    /**
     * Returns a 2D char array that it a correctly solved minefield.
     * Requires that the minefield has been set prior to use
     * @return Solution
     */
    public char[][] solve() {
        if (!myMineFieldSet) {
            throw new IllegalStateException("Cannot solve a minefield which has not been set");
        }
        final char[][] solution = new char[myRows][myColumns];
        for (int row = 0; row < myRows; row++) {
            for (int col = 0; col < myColumns; col++) {
                if (myMineField[row + 1][col + 1] == '*') {
                    solution[row][col] = '*';
                } else {
                    final int radix = 10;
                    solution[row][col] = Character.forDigit(sweep(row + 1, col + 1), radix);
                }
            }
        }
        return solution;
    }

    /**
     * Takes in a row and column position, and
     * checks the adjacent positions for mines.
     * It counts the number of mines found then returns that as an int.
     * @param theRow row position
     * @param theColumn column position
     * @return The number of mines
     */
    private int sweep(final int theRow, final int theColumn) {
        int result = 0;

        //Check row above
        if (myMineField[theRow + 1][theColumn - 1] == '*') {
            result++;
        }
        if (myMineField[theRow + 1][theColumn] == '*') {
            result++;
        }

        if (myMineField[theRow + 1][theColumn + 1] == '*') {
            result++;
        }

        //Check row below
        if (myMineField[theRow - 1][theColumn - 1] == '*') {
            result++;
        }
        if (myMineField[theRow - 1][theColumn] == '*') {
            result++;
        }

        if (myMineField[theRow - 1][theColumn + 1] == '*') {
            result++;
        }


        //Check current row
        if (myMineField[theRow][theColumn - 1] == '*') {
            result++;
        }


        if (myMineField[theRow][theColumn + 1] == '*') {
            result++;
        }
        return result;
    }
}


