package Strings;

public class MergeStringsAlternatively {

    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "pqr";
        System.out.println(mergeAlternately(word1,word2));
    }
    public  static String mergeAlternately(String word1, String word2) {
        StringBuilder str = new StringBuilder();

        int i =0;
        int j = 0;
        int counter=0;

        while (i<word1.length() || j<word2.length()){

            if(i<word1.length()){
                str.append(word1.charAt(i));
                i++;
            }
            if(j<word2.length()){
                str.append(word2.charAt(j));
                j++;
            }


        }
        return str.toString();

    }
}
