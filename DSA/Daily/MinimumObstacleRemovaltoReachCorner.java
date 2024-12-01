package Daily;

import java.util.PriorityQueue;

public class MinimumObstacleRemovaltoReachCorner {
    public static void main(String[] args) {
        int [][]grid ={{0,1,1},{1,1,0},{1,1,0}};
        System.out.println(minimumObstacles(grid));
    }
    public static int minimumObstacles(int[][] grid) {
        int m= grid.length;
        int n = grid[0].length;
        int dir[] = {-1,0,1,0,-1};
        boolean [][]visited = new boolean[m][n];

        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a,b)->Integer.compare(a[0],b[0]));

        minHeap.add(new int[]{0,0,0});

        visited[0][0]=true;

        while (!minHeap.isEmpty()){
            int []curr = minHeap.poll();
            int cost = curr[0];

            int x= curr[1];
            int y= curr[2];

            if(x==m-1 && y == n-1){
                return cost;
            }
            for (int i = 0; i <4 ; i++) {
                int newx= x+dir[i];
                int newy = y+dir[i+1];

                if(newx>=0 && newx<m && newy>=0 && newy<n && !visited[newx][newy]){
                    visited[newx][newy]=true;
                    if(grid[newx][newy]==1){
                        minHeap.add(new int[]{cost+1,newx,newy});
                    }else {
                        minHeap.add(new int[]{cost,newx,newy});
                    }
                }


            }




        }return 0;


    }
}
