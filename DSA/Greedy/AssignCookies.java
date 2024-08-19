package Greedy;

import java.util.Arrays;

public class AssignCookies {
    public static void main(String[] args) {
        int greedy[]={1,2,3}; //r
        int size[] = {1,1}; //l
        System.out.println("Ans : "+ansUsingGreedy(greedy,size) );
    }

    private static int ansUsingGreedy(int[] greedy, int[] size) {
        Arrays.sort(size);
        Arrays.sort(greedy);
        int count=0;
        int l=0;
        int r=0;
        while (l<size.length && r<greedy.length){
            if(size[l]>=greedy[r]){
                l++;
                r++;
                count++;
            }else {
                l++;

            }
        }
        return count;


    }
}
