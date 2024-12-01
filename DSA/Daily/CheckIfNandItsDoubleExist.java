package Daily;

import java.util.HashSet;

public class CheckIfNandItsDoubleExist {
    public static void main(String[] args) {
                int [] arr ={3,1,7,11};
        System.out.println(checkIfExist(arr));
    }

    public static boolean checkIfExist(int[] arr) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length ; i++) {
            if(set.contains(arr[i]*2) || set.contains(arr[i]/2) && arr[i]%2==0){
                return true;
            }else {
                set.add(arr[i]);
            }
        }

        return false;

    }
}
