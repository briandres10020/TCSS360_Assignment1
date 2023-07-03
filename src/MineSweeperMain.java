/**
 * @author Alex Bell
 * @version 1.0
 */

import java.util.Scanner;

public final class MineSweeperMain {
    /**
     * Reads in the input and generates a MineSweeper to solve the MineField,
     * then prints the output to the console.
     */
    private MineSweeperMain() {
        super();
    }
    public static void main(final String[] theArgs) {
        final Scanner input = new Scanner(System.in);
        int currentField = 1;
        while (true) {
            final int  rows = input.nextInt();
            final int columns = input.nextInt();
            input.nextLine();
            if (rows == 0 && columns == 0) {
                break;
            }

            final char[][] fieldInput = new char[rows][columns];
            for (int i = 0; i < rows; i++) {
                final String line = input.nextLine();
                for (int j = 0; j < columns; j++) {
                    fieldInput[i][j] = line.charAt(j);
                }
            }
            final MineSweeper sweeper = new MineSweeper(rows, columns);
            sweeper.mineFieldSet(fieldInput);

            if (currentField > 1) {
                System.out.println();
            }
            System.out.println("Field #" + currentField + ":");
            currentField++;

            final char[][] fieldOutput = sweeper.solve();
            for (int row = 0; row < fieldOutput.length; row++) {
                for (int column = 0; column < fieldOutput[0].length; column++) {
                    System.out.print(fieldOutput[row][column]);
                }
                System.out.println();
            }
        }
    }

}
