package Strings;

import java.util.Stack;

public class ReverseWordsInAString {
    public static void main(String[] args) {
        String s = "Shubham is working in a great company";
        s=s+" ";
        Stack<String> st = new Stack<>();
        String str ="";
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' '){
                st.push(str);
                str="";
            }else{
                str=str+s.charAt(i);
            }
        }
    String ans ="";
        while(st.size()!=0){
            ans += st.peek()+" ";
            st.pop();
        }

        System.out.println(ans);
    }
}
