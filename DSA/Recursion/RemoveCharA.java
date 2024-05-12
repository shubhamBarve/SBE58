package Recursion;

public class RemoveCharA {
    public static void main(String[] args) {
        String str = new String("bbacad");
        System.out.println(removeChars(str));
    }
    public static String removeChars(String str){
        String strjoin = "";
        for (int i =0;i<str.length();i++){
            if(str.charAt(i)!='a'){
                strjoin+=str.charAt(i);
            }
        }
        return strjoin;
    }
}
