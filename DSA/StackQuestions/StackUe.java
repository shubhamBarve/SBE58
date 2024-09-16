package StackQuestions;

import java.util.Stack;

public class StackUe {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        stack.add('c');
        System.out.println(stack.pop());
        System.out.println(stack);
    }
}
