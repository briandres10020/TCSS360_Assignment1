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

            scanner.nextLine();

            //if row is equal to zero
            if(MRows == 0 && NCol == 0){
                //if it equals to zero, then break
                break;
            }
            //If the field number is greater than one
            if (FieldNum > 1){
                //if it is, print out new line
                System.out.println("");
            }
            //creating a 2d array of Row and Columns
            char[][] Board = new char[MRows][NCol];

            //for loop to read Board
            for (int i = 0; i < MRows; i++) {
                final String line = scanner.nextLine();
                for (int j = 0; j < NCol; j++) {
                    Board[i][j] = line.charAt(j);
                }
            }

            //calling Board of solveMine
            solveMine(Board);

            System.out.println("Field #" + FieldNum + ":");

            FieldNum++;

            for(int row = 0; row < Board.length; row++) {
                for (int column = 0; column < Board[0].length; column++) {
                    System.out.print(Board[row][column]);
                }
                System.out.println();
            }
        }
    }

    //Method to solve Mine
    public static void solveMine(final char[][] Board){
        //for loop for MRows
    for (int a = 0; a < Board.length; a++){
        //for loop for NCol
            for(int b = 0; b < Board[0].length; b++){
                //If it is NOT IsItAMine
                if(!IsItAMine(a,b,Board)){
                    //Run Surroundings method
                    int Mines = Surroundings(a,b,Board);
                    //maybe vvv
                    //char v = (char) ('0'+ Mines);

                    //Setting 2d array format
                    Board[a][b] = Character.forDigit(Mines, 10);
                    }

                }
                }
            }


    //Method to check around board
    public static int Surroundings(int MRows, int NCol, char Board[][]){
        int result = 0;

        //if statements to check position

        //Prev Row, Prev Col
        if(MRows - 1 < Board.length && NCol - 1 < Board[0].length
                && MRows - 1 >=0 && NCol - 1>0 &&
                IsItAMine(MRows - 1,NCol - 1,Board)){
            //increment result
                result++;
        }
        //Prev Row, same Col
        if(MRows - 1 < Board.length && MRows - 1 >=0
                && IsItAMine(MRows - 1,NCol,Board)){
            //increment result
            result++;
        }
        //Prev Row,Next Col
        if(MRows - 1 < Board.length && NCol + 1 < Board[0].length
                && MRows - 1 >=0 && NCol + 1>0 &&
                IsItAMine(MRows - 1,NCol + 1,Board)){
            //increment result
            result++;
        }
        //Same Row, Prev Col
        if(NCol - 1 < Board[0].length
                && NCol -1 > 0 && IsItAMine(MRows,NCol - 1,Board)){
            //increment result
            result++;
        }
        //Same Row, Next Col
        if(NCol + 1 < Board[0].length && NCol + 1>0
                && IsItAMine(MRows,NCol + 1,Board)){
            //increment result
            result++;
        }
        //Next Row, Prev Col
        if(MRows + 1 < Board.length && NCol - 1 < Board[0].length
                && MRows + 1 >=0 && NCol - 1>0 &&
                IsItAMine(MRows + 1,NCol - 1,Board)){
            //increment result
            result++;
        }
        //Next Row, Same Col
        if(MRows + 1 < Board.length &&
                MRows + 1 >=0  && IsItAMine(MRows + 1,NCol,Board)){
            //increment result
            result++;
        }
        //Next Row,Next Col
        if(MRows + 1 < Board.length && NCol + 1 < Board[0].length
                && MRows + 1 >=0 && NCol + 1 >0 &&
                IsItAMine(MRows + 1,NCol + 1,Board)){
            //increment result
            result++;
        }
        return result;
    }

    //Checking to see if there is a mine in the board.
    public static boolean IsItAMine(int MRows, int NCol, char Board[][]){
        if(Board[MRows][NCol] == '*') {
            return true;
        }
        else{
            return false;
        }
    }
}


