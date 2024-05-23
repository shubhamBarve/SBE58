package Arrays.HardProblems;

import java.util.HashMap;

public class CountthenumberofsubarrayswithgivenxorK {

    public static void main(String[] args) {
        int arr[] = {4, 2, 2, 6, 4};
        int k = 6;
        int n = arr.length;
        //int count = findCountBruteForce(arr,k,n);
        int count = findCountOptimal(arr,k,n);
        System.out.println("Total count : "+count);
    }

    private static int findCountOptimal(int[] arr, int k, int n) {
        int count = 0;
        int xr=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(xr,1);
        for (int i = 0; i <n ; i++) {

            xr = xr^arr[i];

            int x = xr^k;

            if(map.containsKey(x)){
                count +=map.get(x);
            }
            if(map.containsKey(xr)){
                map.put(xr,map.get(xr)+1);
            }
            else {
                map.put(xr,1);
            }
        }

return count;
    }

    private static int findCountBruteForce(int[] arr, int k, int n) {
        int count=0;

        for (int i = 0; i < n; i++) {
            int xor=0;
            for (int j = i; j <n ; j++) {
                    xor = xor^arr[j];

                    if(xor==k){
                        count++;
                    }
                
            }
            
        }
        
        return count;
    }
}
