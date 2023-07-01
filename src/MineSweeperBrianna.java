/*
Brianna Andres
TCSS 360 assignment 1
mineSweeper
Individual Solution
 */

import java.util.Scanner;

public class MineSweeperBrianna {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int FieldNum = 1;

        while (true){
            //N is columns
        int NCol = scanner.nextInt();
            //M is Rows
        int MRows = scanner.nextInt();

            //if row is equal to zero
            if(MRows == 0){
                //if it equals to zero, then break
                break;
            }
            //if column is equal to zero
            if(NCol == 0) {
                //if it equals to zero, then break
                break;
            }
            //If the field number is greater than one
            if (FieldNum > 1){
                //if it is, print out new line
                System.out.println(" \n ");
            }
            //creating a 2d array of Row and Columns
            char[][] f = new char[MRows][NCol];
            FieldNum++;
        }
 }
    //Checking to see if there is a mine.
    public static boolean IsItAMine(int MRows, int NCol, char Cell[]){
        if(Cell[MRows][NCol] == '*') {
            return true;
            if (Cell[MRows][NCol] != '*') {
                return false;
            }
        }
    }
}

