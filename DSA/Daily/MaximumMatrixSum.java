package Daily;

public class MaximumMatrixSum {

    public static void main(String[] args) {
        int matrix [][] ={{1,2,3},{-1,-2,-3},{1,2,3}};

        System.out.println(maxMatrixSum(matrix));
    }
    public static long maxMatrixSum(int[][] matrix) {
            long sum =0;
            int min = Integer.MAX_VALUE;
            int count=0;
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j <matrix.length ; j++) {
                if(matrix[i][j]<0){
                    count++;
                }
                sum +=Math.abs(matrix[i][j]);
                min= Math.min(min,Math.abs(matrix[i][j]));
            }
        }
        if(count%2==0){
            return sum;
        }else {
            return sum-min-min;
        }


    }
}
