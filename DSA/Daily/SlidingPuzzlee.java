package Daily;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class SlidingPuzzlee {

    public static void main(String[] args) {
            int [][] board = {{4,1,2},{5,0,3}};
        System.out.println(slidingPuzzle(board));
    }
    public static int slidingPuzzle(int[][] board) {
        String targetState = "123450";

        StringBuilder stringBuilder =  new StringBuilder();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                stringBuilder.append(board[i][j]);
            }
        }
        Queue<String> queue = new LinkedList<>();

        Set<String> visited = new HashSet<>();
        queue.add(stringBuilder.toString());
        visited.add(stringBuilder.toString());
        int[][] dirs = {
                {1, 3}, {0, 2, 4}, {1, 5},
                {0, 4}, {1, 3, 5}, {2, 4}
        };

        int levels = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; ++i) {
                String state = queue.poll();
                if (state.equals(targetState)) {
                    return levels;
                }

                int zeroPos = state.indexOf('0');
                for (int dir : dirs[zeroPos]) {
                    StringBuilder newState = new StringBuilder(state);
                    newState.setCharAt(zeroPos, state.charAt(dir));
                    newState.setCharAt(dir, '0');
                    if (!visited.contains(newState.toString())) {
                        visited.add(newState.toString());
                        queue.add(newState.toString());
                    }
                }
            }
            levels++;
        }
        return -1;
    }
}
