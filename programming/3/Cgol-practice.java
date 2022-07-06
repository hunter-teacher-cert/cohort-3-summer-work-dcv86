import java.io.*;
import java.util.*;

/**
 * Conway's Game of Life by Team AreWeSentientYet?
 * First Last
 * collaborators: Dave Ciolino-Volano
 */

/**
   The Rules of Life:
   Survivals:
   * A living cell with 2 or 3 living neighbours will survive for the next generation.
   Deaths:
   * Each cell with >3 neighbours will die from overpopulation.
   * Every cell with <2 neighbours will die from isolation.
   Births:
   * Each dead cell adjacent to exactly 3 living neighbours is a birth cell. It will come alive next generation.
   NOTA BENE:  All births and deaths occur simultaneously. Together, they constitute a single generation.
*/

public class Cgol {

  //create, initialize, and return  empty board (all cells dead)
  public static char[][] createNewBoard( int rows, int cols ){
		char[][] board = new char[rows][cols];
		for (int i = 0; i < rows; i++){
			for (int j = 0; j < cols; j++){
				board[i][j]=' ';
			}
		}
		return board;
  }


  //print the board to the terminal
  public static void printBoard( char[][] board ){
	for(int j = 0; j< board [0].length+2;j++){
		System.out.print('-');
	}
	System.out.println();
	
	for(int i=0; i < board.length; i++){
		System.out.print('|');
		for(int j=0; j < board[i].length; j++){
			System.out.print(board[i][j]);
		}
	System.out.println('|');
		}
		
	for(int j = 0; j< board [0].length+2;j++){
		System.out.print('-');
	}
		System.out.println();
}
  //set cell (r,c) to val
  public static void setCell(char[][] board, int r, int c, char val )
  {
		board[r][c] = val;
  }


  //return number of living neigbours of board[r][c]
  public static int countNeighbours( char[][] board, int r, int c )
  {
	for(int i = row-1; i<= row +1);{
		
		if (i + r >=0 && j + c >= 0 && i + r < board.length && j + col < board[0].length){
	return 3;
		
	}
	
  }


  /**
     precond: given a board and a cell
     postcond: return next generation cell state based on CGOL rules
     (alive 'X', dead ' ')
  */
  public static char getNextGenCell( char[][] board,int r, int c )
  {
		return 'a';
  }


  //generate and return a new board representing next generation
  public static char[][] generateNextBoard( char[][] board )
  {
return board;
  }


  public static void main( String[] args )
  {
		char[][] test;
		test = createNewBoard(5,7);
		printBoard(test);
    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    char[][] board;
    board = createNewBoard(25,25);
    //breathe life into some cells:
    setCell(board, 0, 0, 'X');
    setCell(board, 0, 1, 'X');
    setCell(board, 1, 0, 'X');
    // TASK:
    // Once your initial version is running,
    // try out different starting configurations of living cells...
    // (Feel free to comment out the above three lines.)
    System.out.println("Gen X:");
    printBoard(board);
    System.out.println("--------------------------\n\n");
    board = generateNextBoard(board);
    System.out.println("Gen X+1:");
    printBoard(board);
    System.out.println("--------------------------\n\n");
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  }//end main()

}//end class