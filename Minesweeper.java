/**
 * Author: Jerry Libago
 * Class: TCSS 360
 *
 */

import java.util.Scanner;

/**
 * Minesweeper class represents a game of Minesweeper.
 */
public class Minesweeper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fieldCount = 1;

        while (true) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            scanner.nextLine();

            if (n == 0 && m == 0) {
                break;
            }

            char[][] field = new char[n][m];
            for (int i = 0; i < n; i++) {
                String line = scanner.nextLine();
                for (int j = 0; j < m; j++) {
                    field[i][j] = line.charAt(j);
                }
            }

            if (fieldCount > 1) {
                System.out.println();
            }
            System.out.println("Field #" + fieldCount + ":");
            calculateAdjacentMines(field);

            fieldCount++;
        }
        scanner.close();
    }

    /**
     * This method calculates the number of adjacent mines for each safe square
     * in the given field and updates the field in-place. Then it prints the field.
     *
     * @param field the 2D array representing the field
     */
    private static void calculateAdjacentMines(char[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length; j++) {
                if (field[i][j] != '*') {
                    int count = 0;
                    for (int k = -1; k <= 1; k++) {
                        for (int l = -1; l <= 1; l++) {
                            int ni = i + k;
                            int nj = j + l;
                            if (ni >= 0 && nj >= 0 && ni < field.length && nj < field[0].length && field[ni][nj] == '*') {
                                count++;
                            }
                        }
                    }
                    field[i][j] = (char) (count + '0');
                }
                System.out.print(field[i][j]);
            }
            System.out.println();
        }
    }
}
