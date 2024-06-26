package Recursion;

public class Sudoku {

    public static void main(String[] args) {
        char[][] board= {
                {'9', '5', '7', '.', '1', '3', '.', '8', '4'},
                {'4', '8', '3', '.', '5', '7', '1', '.', '6'},
                {'.', '1', '2', '.', '4', '9', '5', '3', '7'},
                {'1', '7', '.', '3', '.', '4', '9', '.', '2'},
                {'5', '.', '4', '9', '7', '.', '3', '6', '.'},
                {'3', '.', '9', '5', '.', '8', '7', '.', '1'},
                {'8', '4', '5', '7', '9', '.', '6', '1', '3'},
                {'.', '9', '1', '.', '3', '6', '.', '7', '5'},
                {'7', '.', '6', '1', '8', '5', '4', '.', '9'}
        };

        solveSudoku(board);


        for(int i =0;i<board.length;i++){
            for (int j = 0; j <board.length ; j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }

    }

    private static boolean solveSudoku(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j <board.length ; j++) {
                if(board[i][j]=='.'){
                    for(char c='1';c<='9';c++){
                        if(isSafe(board,i,j,c)){
                            board[i][j]=c;

                            if(solveSudoku(board)){
                                return true;
                            }else {
                                board[i][j]='.';
                            }
                        }
                    }
                    return false;
                }




            }
        }
        return true;


    }

    private static boolean isSafe(char[][] board, int row, int col, char c) {

        for (int k = 0; k < board.length; k++) {
            if(board[row][k]==c)
                return false;
            if(board[k][col]==c)
                return false;
            if(board[3*(row/3)+k/3][3*(col/3)+k%3]==c)
                return false;

        }
        return true;

    }
}
