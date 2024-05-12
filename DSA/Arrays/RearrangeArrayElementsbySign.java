package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RearrangeArrayElementsbySign {
    public static void main(String[] args) {
     /*   int n = 4;
        int A[]= {1,2,-4,-5};


        int[]ans= RearrangebySignBruteForce(A,n);

        for (int i = 0; i < n; i++) {
            System.out.print(ans[i]+" ");
        }*/

        //Optimal Apraoach

        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 2, -4, -5));
        ArrayList<Integer> ans = RearrangebySign(A);

        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
    }

    private static ArrayList<Integer> RearrangebySign(ArrayList<Integer> a) {
        int n = a.size();
        ArrayList<Integer> ans = new ArrayList<>(Collections.nCopies(n, 0));
        int pos = 0;
        int neg = 1;

        for (int i = 0; i <a.size() ; i++) {
            if (a.get(i) < 0) {
                ans.set(neg, a.get(i));
                neg += 2;
            }

            // Fill positive elements in even indices and inc by 2.
            else {
                ans.set(pos, a.get(i));
                pos += 2;
            }
        }return ans;

    }

    private static int[] RearrangebySignBruteForce(int[] a, int n) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        for (int i = 0; i <n ; i++) {
            if(a[i]>0) pos.add(a[i]);
            else neg.add(a[i]);
        }
        for (int i = 0; i < n/2; i++) {
            a[2*i]= pos.get(i);
            a[2*i+1] = neg.get(i);
        }
        return a;
    }

}
