/**
 * Author: Jerry Libago
 * Class: TCSS 360
 *
 */

import java.util.Scanner;

/**
 * Minesweeper class represents a game of Minesweeper.
 * @author Jerry Libago
 * @author Alex Bell
 * @author Bri Andres
 *
 * @version 1.0
 */
public final class Minesweeper {
    private Minesweeper() {
        super();
    }
    public static void main(final String[] theArgs) {
        final Scanner scanner = new Scanner(System.in);
        int fieldCount = 1;

        while (true) {
            final int n = scanner.nextInt();
            final int m = scanner.nextInt();
            scanner.nextLine();

            if (n == 0 && m == 0) {
                break;
            }

            final char[][] field = new char[n][m];
            for (int i = 0; i < n; i++) {
                final String line = scanner.nextLine();
                for (int j = 0; j < m; j++) {
                    field[i][j] = line.charAt(j);
                }
            }

            if (fieldCount > 1) {
                System.out.println();
            }
            System.out.println("Field #" + fieldCount + ":");
            calculateMineValues(field);

            fieldCount++;
        }
        scanner.close();
    }

    /**
     * This method calculates the number of adjacent mines for each safe square
     * in the given field and updates the field in-place. Then it prints the field.
     *
     * @param theField the 2D array representing the field
     */
    private static void calculateMineValues(final char[][] theField) {
        for (int row = 0; row < theField.length; row++) {
            for (int column = 0; column < theField[0].length; column++) {
                theField[row][column] = Character.forDigit(
                        adjacentMines(theField, row, column), 10);
                System.out.print(theField[row][column]);
            }
            System.out.println();
        }
        //System.out.println();


    }
    private static int adjacentMines(final char[][] theField,
                                     final int theRow, final int theColumn) {
        int result = 0;
        if (theField[theRow][theColumn] != '*') {
            for (int k = -1; k <= 1; k++) {
                for (int l = -1; l <= 1; l++) {
                    final int ni = theRow + k;
                    final int nj = theColumn + l;
                    if (ni >= 0 && nj >= 0 && ni < theField.length
                            && nj < theField[0].length && theField[ni][nj] == '*') {
                        result++;
                    }
                }
            }

        }
        return result;
    }


}
