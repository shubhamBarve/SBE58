package Strings;

public class RotateStrings {


    public static void main(String[] args) {
        String str = "abcde";
        String goal = "bcdea";
        System.out.println("Answers : "+findAsnwe(str,goal));
    }

    private static boolean findAsnwe(String str, String goal) {

        if(str.length()!=goal.length()){
            return false;
        }
        System.out.println(str.substring(0));

        for (int i = 0; i < str.length(); i++) {
            String temp = str.substring(i)+str.substring(0,i);
            if(temp.equals(goal))return true;
        }
        
        return false;

    }

}
