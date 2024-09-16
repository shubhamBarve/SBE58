package StackQuestions;

import java.util.Stack;

public class InfixToPostfix {
    public static void main(String[] args) {
      String  str = "a+b*(c^d-e)^(f+g*h)-i";


        System.out.println(InfixToPostfix(str));

    }
    public static String InfixToPostfix(String str){
        StringBuilder ans = new StringBuilder();

        Stack<Character> stack = new Stack<>();

        for (int i = 0;i<str.length();i++){
            char ch = str.charAt(i);

            if(ch=='('){
                stack.push(ch);
            } else if (Character.isLetterOrDigit(ch)) {
                ans.append(ch);
            } else if (ch==')') {
                while (!stack.isEmpty() && stack.peek()!='('){

                    ans.append(stack.pop());
                }
                stack.pop();
            }else {
                while (!stack.isEmpty() && precedenc(ch)<=precedenc(stack.peek())){
                    ans.append(stack.pop());
                }
                stack.push(ch);
            }

        }
        while (!stack.isEmpty()){
            ans.append(stack.pop());
        }


        return ans.toString();



    }
    static int precedenc(char ch){
        switch (ch){
            case '+' :
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }
}
