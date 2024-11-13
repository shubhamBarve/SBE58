package Daily;

import java.util.Arrays;

public class MostBeautifulItemForEachQuery {
    public static void main(String[] args) {
        int [][]items = {{1,2},{3,2},{2,4},{5,6},{3,5}};
        int[]queries = {1,2,3,4,5,6};

        int ans[] = maximumBeauty(items,queries);

    }

    public static int[] maximumBeauty(int[][] items, int[] queries) {
            int ans[]= new int[queries.length];
        Arrays.sort(items,(a,b)->Integer.compare(a[0],b[0]));
        int max [] = new int[items.length];
        max[0]= items[0][1];
        for (int i = 1; i < items.length; i++) {
            max[i]= Math.max(max[i-1],items[i][1]);
        }
        
        return null;

    }


}
