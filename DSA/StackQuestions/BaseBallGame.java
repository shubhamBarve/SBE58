package StackQuestions;

import java.util.Stack;

public class BaseBallGame {
    public static void main(String[] args) {
                String ops[] = {"5","2","C","D","+"};
        System.out.println(calPoints(ops));
    }
    public static int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
       int ans=0;

       for (String str:operations){
            if(isNumeric(str)){
                stack.push(Integer.parseInt(str));
            }
            if(str.equals("C")){
                stack.pop();
            }
            if(str.equals("D")){
                int top= stack.peek();
                stack.push(top*2);
            }if (str.equals("+")){
                int pop= stack.pop();
                int prev= stack.peek();

                stack.push(pop);
                stack.push(pop+prev);
           }



       }for (int score : stack) {
            ans += score;
        }return ans;

    }

    private static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
