package Daily;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ShortestDistanceAfterRoadAdditionQueriesI {
    public static void main(String[] args) {
        int n=5;
        int [][] queries= {{2,4},{0,2},{0,4}};
        int ans[]=shortestDistanceAfterQueries(n,queries);

        for (int a :ans){
            System.out.print(a+" ");
        }
    }

    public static int[] shortestDistanceAfterQueries(int n, int[][] queries) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < n - 1; ++i) {
            adj.get(i).add(i + 1);
        }
        int ans [] = new int[queries.length];
        List<Integer> result = new ArrayList<>();
        int i=0;
        for (int[] query : queries) {
            adj.get(query[0]).add(query[1]);
            result.add(shortestPath(adj, n));
            ans[i]=result.get(i);
            i++;
        }
        return ans;
    }




    private static int shortestPath(List<List<Integer>> adj, int n) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        boolean[] visited = new boolean[n];
        visited[0] = true;
        int distance = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; ++i) {
                int curr = queue.poll();
                if (curr == n - 1) {
                    return distance;
                }
                for (int neighbor : adj.get(curr)) {
                    if (!visited[neighbor]) {
                        visited[neighbor] = true;
                        queue.add(neighbor);
                    }
                }
            }
            distance++;
        }
        return -1; // If there is no path to the last node
    }
    }



