package Strings;

import java.util.Stack;

public class BalanceParenthesis {

    public static void main(String[] args) {
        String s = "()[{}(])";
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i <s.length() ; i++) {
            char ch = s.charAt(i);
            if(ch =='(' || ch=='{' || ch == '['){
                stack.push(ch);
            }else{
                if(stack.isEmpty()){
                    System.out.println("Invalid");
                }
                else{
                    char rm = stack.peek();
                    if(ch=='}' && rm=='{' || ch == ']' && rm=='[' || ch==')' && rm=='('){
                        stack.pop();

                    }
                }
            }
        }
        if(stack.isEmpty()){
            System.out.println("balanced");
        }else{
            System.out.println("not balanced");
        }
    }
}
