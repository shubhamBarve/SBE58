package Daily;

import java.util.PriorityQueue;

public class MinimumTimetoVisitaCellInaGrid {
    public static void main(String[] args) {
        int [][] grid = {{0,1,3,2},{5,1,2,5},{4,3,8,6}};
        System.out.println(minimumTime(grid));
    }
    public static int minimumTime(int[][] grid) {
        if(grid[0][1]>grid[0][0]+1 && grid[1][0]>grid[0][0]+1){
            return -1;
        }


        int m = grid.length;
        int n = grid[0].length;
        int dir[]={-1,0,1,0,-1};
        boolean [][] visited = new boolean[m][n];

        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a,b)->Integer.compare(a[0],b[0]));

        minHeap.add(new int[]{0,0,0});

            visited[0][0]=true;

                while (!minHeap.isEmpty()){
                    int []curr = minHeap.poll();
                    int time = curr[0];
                    int x= curr[1];
                    int y = curr[2];



                    if(x==m-1 && y==n-1){
                        return time;
                    }
                    for (int i = 0; i < 4; i++) {
                        int newx=x+dir[i];
                        int newy = y+dir[i+1];
                        if(newx>=0 && newx<m && newy>=0 && newy<n && !visited[newx][newy]){
                            visited[newx][newy]=true;
                            int newtime =time+1;
                            if(grid[newx][newy]>newtime){
                                newtime = (grid[newx][newy] - time) % 2 == 1 ? grid[newx][newy] : grid[newx][newy] + 1;
                            }
                            minHeap.add(new int[]{newtime,newx,newy});
                        }


                    }

                }
                return -1;

    }
}
