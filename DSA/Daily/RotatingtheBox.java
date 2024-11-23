package Daily;

public class RotatingtheBox {
    public static void main(String[] args) {
        char [][] box ={{'#','.','#'}};
       char [][] ans = rotateTheBox(box);
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j <ans[0].length ; j++) {
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
}

    public static char[][] rotateTheBox(char[][] box) {

            int m =box.length;
            int n = box[0].length;
        char  grid[][]= new char[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                grid[i][j] = '.';
            }
        }

        for (int i = 0; i < m ; i++) {
            int count=0;
            for (int j = 0; j < n; j++) {
                if(box[i][j]=='#'){
                    count++;
                }else if(box[i][j]=='*'){
                    grid[j][m-i-1]='*';
                    addStones(grid,j-1,m-i-1,count);
                    count=0;

                }

            }
            if(count>0){
                addStones(grid,n-1,m-i-1,count);
            }
        }

        System.out.println();

            return grid;
    }

    private static void addStones(char[][] grid, int i, int j,int count) {
        while (count>0){
            grid[i][j]='#';
            i--;
            count--;

        }
    }

}
