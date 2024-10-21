package RecursiveBacktracking;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {

    public static void main(String[] args) {
            int n = 3;
        System.out.println(generateParenthesis(n));
    }

    public static List<String> generateParenthesis(int n) {
            List<String> ans = new ArrayList<>();

            StringBuilder str = new StringBuilder();


            generateParenthesisrecursive(ans,str,n,0,0);

            return ans;
    }

    private static void generateParenthesisrecursive(List<String> ans, StringBuilder str, int n, int open,int close) {

        if(str.length()==2*n){
            ans.add(str.toString());
            return;
        }
        if(open<n){
            str.append("(");
            generateParenthesisrecursive(ans,str,n,open+1,close);
            str.deleteCharAt(str.length()-1);


        }
        if(open>close){
            str.append(")");
            generateParenthesisrecursive(ans,str,n,open,close+1);
            str.deleteCharAt(str.length()-1);
        }



    }
}
