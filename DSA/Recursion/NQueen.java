package Recursion;

public class NQueen {
    public static void main(String[] args) {
        boolean[][] board = new boolean[4][4];
        queens(board,0);
    }

    public static int queens(boolean[][] board, int rows) {
        if (rows == board.length) {
            displayboard(board);
            System.out.println();
            return 1;
        }

        int count=0;
        for(int col =0;col<board.length;col++){

            if(isSafe(board,rows,col)){
                board[rows][col]=true;
                count+=queens(board,rows+1);
                board[rows][col]=false;
            }

        }
        return  count;

    }

    private static boolean isSafe(boolean[][] board, int rows, int col) {

        for(int i =0;i<rows;i++){
            if(board[i][col]){
                return false;
            }

        }
        int maxLeft = Math.min(rows,col);
        for(int i =1;i<=maxLeft;i++){
            if(board[rows-i][col-i]){
                return false;
            }

        }
        int maxRight= Math.min(rows,board.length-col-1);
        for(int i =1;i<=maxRight;i++){
            if(board[rows-i][col+i]){
                return false;
            }

        }
    return  true;

    }

    private static void displayboard(boolean[][] board) {

       for(boolean []row : board){
           for(boolean  elem : row){
               if(elem==true){
                   System.out.print("Q ");
               }else {
                   System.out.print("X ");
               }
           }
           System.out.println();
       }
    }
}