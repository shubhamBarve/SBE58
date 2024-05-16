package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class SetMatrixZeroes {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        list.add(new ArrayList<>(Arrays.asList(1,1,1)));
        list.add(new ArrayList<>(Arrays.asList(1, 0, 1)));
        list.add(new ArrayList<>(Arrays.asList(1, 1, 1)));

        int row = list.size();
        int column = list.get(0).size();

       // ArrayList<ArrayList<Integer>> ans = zeroMatrixBruteForce(list, row, column);

        ArrayList<ArrayList<Integer>> ans = zeroMatrixBetterApproach(list, row, column);

        System.out.println("The Final matrix is: ");
        for (ArrayList<Integer> rowelem : ans) {
            for (Integer ele : rowelem) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }

    private static ArrayList<ArrayList<Integer>> zeroMatrixBetterApproach(ArrayList<ArrayList<Integer>> list, int row, int column) {
        int []r = new int[row];
        int []c = new int[column];
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <column ; j++) {
                if(list.get(i).get(j)==0){
                    r[i]=1;
                    c[j]=1;
                }
            }
        }
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <column ; j++) {
                if(r[i]==1 || c[j]==1){
                    list.get(i).set(j,0);
                }
            }
        }


        return list;
    }

    private static ArrayList<ArrayList<Integer>> zeroMatrixBruteForce(ArrayList<ArrayList<Integer>> list, int row, int column) {
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <column ; j++) {
                if(list.get(i).get(j)==0){
                    makeRow(list,row,column,i);
                    makeColumn(list,row,column,j);
                }
            }
        }

        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <column ; j++) {
                if(list.get(i).get(j)==-1){
                    list.get(i).set(j,0);
                }
            }
        }

return list;

    }

    private static void makeColumn(ArrayList<ArrayList<Integer>> list, int row, int column, int j) {

        for (int i = 0; i < column; i++) {
            if(list.get(i).get(j)!=0)
                list.get(i).set(j,-1);
        }
    }

    private static void makeRow(ArrayList<ArrayList<Integer>> list, int row, int column, int particularRow) {
        for (int i = 0; i < row; i++) {
            if(list.get(particularRow).get(i)!=0){
            list.get(particularRow).set(i,-1);
            }
        }
    }
}
