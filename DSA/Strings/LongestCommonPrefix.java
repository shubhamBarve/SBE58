package Strings;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String str []={"flower","flow","flowght"} ;
        System.out.println("Answer : "+answer(str));
    }

    private static String answer(String[] str) {
        String temp = str[0];
        for (int i = 1; i < str.length; i++) {
            while (str[i].indexOf(temp)!=0){
                temp= temp.substring(0,temp.length()-1);
                if(temp.isEmpty()){
                    return temp;
                }
            }
        }


        return temp;
    }
}
