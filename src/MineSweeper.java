/**
 * @author Alex Bell
 * @author
 * @version 1.0
 */
public class MineSweeper {
    /**
     *
     */
    private static final int MAX_SIZE = 100;
    /**
     *
     */
    private static final int MIN_SIZE = 1;
    /**
     *
     */
    private final char[][] myMineField;
    /**
     *
     */
    private final int myRows;
    /**
     *
     */
    private final int myColumns;
    /**
     *
     */
    private boolean myMineFieldSet;
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


