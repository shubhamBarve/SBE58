package Arrays;

import java.util.Collections;
import java.util.List;
import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        //Optimal Approach

        List<Integer> A = Arrays.asList(new Integer[] {2, 1, 5, 4, 3, 0, 0});
        List<Integer> ans = nextGreaterPermutation(A);

        System.out.print("The next permutation is: [");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println("]");
    }
    

    private static List<Integer> nextGreaterPermutation(List<Integer> a) {

        int index = -1;
        int n =a.size();
        // Step 1: Find the break point:
        for (int i = n-2; i >=0 ; i--) {
            if(a.get(i)< a.get(i+1)){
                index = i;
                break;
            }

        }
        // If break point does not exist:
        if(index == -1){
            Collections.reverse(a);
            return a;
        }

        // Step 2: Find the next greater element
        // {2, 1, 5, 4, 3, 0, 0})
        for (int i = n-1; i >index ; i--) {
            if(a.get(i)> a.get(index)){
                int temp = a.get(i);
                a.set(i,a.get(index));
                a.set(index,temp);
                break;

            }
        }
        // Step 3: reverse the right half:
        List<Integer> subList = a.subList(index+1,n);
        Collections.reverse(subList);
        
        return a;
    }

}
