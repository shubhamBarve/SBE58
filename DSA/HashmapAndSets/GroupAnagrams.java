package HashmapAndSets;
import java.util.*;
public class GroupAnagrams {

    public static void main(String[] args) {

        String strs[] = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
            List<String> ans = new ArrayList<>();
        HashMap<String,List<String>> map = new HashMap<String, List<String>>();

        for(String str : strs){

            int count[]=new int[26];
            for (int i = 0; i < str.length(); i++) {

                count[str.charAt(i) - 'a']++;
            }

                StringBuilder stringBuilder = new StringBuilder();
                for (int j = 0; j <count.length ; j++) {
                    stringBuilder.append(count[j]).append("#");
                }
                String key = stringBuilder.toString();
                map.putIfAbsent(key,new ArrayList<>());
                map.get(key).add(str);
            }


        return new ArrayList<>(map.values());
    }
}
