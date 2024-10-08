package StackQuestions;

import java.util.Stack;

public class DailyTemperature {
    public static void main(String[] args) {
        int []temperatures = {73,74,75,71,69,72,76,73};
        System.out.println(dailyTemperatures(temperatures));
    }
    public  static int[] dailyTemperatures(int[] temperatures) {
        int ans[] = new int[temperatures.length-2];

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i <temperatures.length ; i++) {
            while (!stack.isEmpty() && temperatures[stack.peek()]<temperatures[i]){
               int pop =  stack.pop();
            ans[pop]= i-pop;
            }stack.push(i);
        }

        return ans;
    }
}
