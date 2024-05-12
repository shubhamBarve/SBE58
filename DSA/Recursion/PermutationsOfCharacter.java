package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class PermutationsOfCharacter {
    public static void main(String[] args) {
        System.out.println(permutaionOfCharacter("","abc"));
        //System.out.println(permutaionCount("","asv"));
    }

    public static ArrayList<String> permutaionOfCharacter(String proc, String up){

        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(proc);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();

        for(int i = 0;i<=proc.length();i++){
            String f = proc.substring(0,i);
            String s = proc.substring(i,proc.length());
             ans.addAll(permutaionOfCharacter(f+ch+s,up.substring(1)));
        }
        return ans;
    }

    public static int permutaionCount(String proc, String up){

        if (up.isEmpty()){

            return 1;
        }

        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();
    int count=0;
        for(int i = 0;i<=proc.length();i++){
            String f = proc.substring(0,i);
            String s = proc.substring(i,proc.length());
            count = count+permutaionCount(f+ch+s,up.substring(1));
            ans.addAll(permutaionOfCharacter(f+ch+s,up.substring(1)));
        }
        return count;
    }
}
