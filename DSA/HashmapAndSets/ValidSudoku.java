package HashmapAndSets;

import java.util.HashSet;

public class ValidSudoku {

    public static void main(String[] args) {
      String board[][]=  {{".","4",".",".","9","3",".",".","."},
              {".",".",".",".",".",".",".","3","."},
              {".",".",".",".",".",".",".",".","."},
              {".",".","4",".",".",".",".",".","6"},
              {"2",".","3",".",".",".",".","6","."},
              {".",".",".",".",".",".",".",".","."},
              {".",".",".",".",".",".","4",".","."},
              {".",".",".","1",".",".",".",".","."},
              {".",".",".","4","7",".",".",".","."}};
        System.out.println(isValidSudoku(board));
    }

    public static boolean isValidSudoku(String[][] board) {

        for (int i = 0; i < board.length; i++) {
            HashSet<String> set = new HashSet<>();
            for (int j = 0; j < board[i].length ; j++) {
                  String str=   board[i][j];
                  if(set.contains(str)){
                      return false;
            }else {
                      if(str!=".")
                      set.add(str);
                  }
            if(i==0 && j==0 || i==0 && j==3 ||  i==0 && j==6 || i==3 && j==0 ||  i==3 && j==3 || i==3 && j==6  || i==6 && j==0 || i==6 && j==3 || i==6 && j==6 ){
                if(!checkIfPresent(board,i,j)){
                    return false;
                }
            }
        }
        }
        //check for columns
        for (int i = 0; i < board.length ; i++) {
            HashSet<String> set = new HashSet<>();
            for (int j = 0; j < board[i].length; j++) {
                String str=   board[j][i];
                if(set.contains(str)){
                    return false;
                }else {
                    if(str!=".")
                        set.add(str);
                }
            }
        }
        return true;
    }
    public static boolean checkIfPresent(String[][]board,int i, int j){
    HashSet<String> set  = new HashSet<>();
        for (int k = i; k <i+3 ; k++) {
            for (int l = j; l <j+3 ; l++) {

                String str = board[k][l];
                if(set.contains(str)){
                    return false;
                }else {
                    if(str!=".")
                        set.add(str);
                }
            }
        }
        return true;

    }
}
