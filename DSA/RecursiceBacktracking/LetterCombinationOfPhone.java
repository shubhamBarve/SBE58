package RecursiveBacktracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationOfPhone {
    public static void main(String[] args) {
String digits = "23";
        System.out.println(letterCombinations(digits));
    }

    public static List<String> letterCombinations(String digits) {
            List<String> ans = new ArrayList<>();
        Map<Character,String> map = new HashMap<>();
        StringBuilder str = new StringBuilder();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
    if(digits.isEmpty()){
        return null;
    }

        letterCombinationBacktrack(digits,map,ans,str,0);




            return ans;
    }

    private static void letterCombinationBacktrack(String digits, Map<Character, String> map, List<String> ans, StringBuilder str,int index) {

      if(str.length()==digits.length()){
          ans.add(str.toString());
          return;
      }

        String temp = map.get(digits.charAt(index));

        for (int i = 0; i <temp.length() ; i++) {
            str.append(temp.charAt(i));
            letterCombinationBacktrack(digits,map,ans,str,index+1);
            str.deleteCharAt(str.length()-1);
        }
      

    }
}
