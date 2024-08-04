package Strings;

import java.util.*;

public class SortCharactersbyFrequency {

    public static void main(String[] args) {
        String str = "bbAa";
        System.out.println("Answer : "+sortbyfrequeyncy(str));
    }

    private static String sortbyfrequeyncy(String str) {


        Map<Character,Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            Character ch =str.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);

            }else {
                map.put(ch,1);
            }
        }
        Map<Character,Integer> sortedMap = sortvalue(map);

        String ans = "";

        for (Map.Entry<Character,Integer> entry : sortedMap.entrySet()){
            Character ch = entry.getKey();
            int val= entry.getValue();
            for (int i = 1;i<=val;i++) {
                ans =ans + ch.toString();
            }
        }

        return ans;


    }

    private static Map<Character, Integer> sortvalue(Map<Character, Integer> map) {

        List<Map.Entry<Character,Integer>> list= new ArrayList<>(map.entrySet());

        list.sort((entry1,entry2)->entry2.getValue().compareTo(entry1.getValue()));
        Map<Character,Integer> returnMap = new LinkedHashMap<>();

        for (Map.Entry<Character,Integer>entry : list){
            returnMap.put(entry.getKey(),entry.getValue());
        }
return returnMap;
    }
}
