package HashmapAndSets;

import java.util.HashMap;

public class ValidAnagram {

    public static void main(String[] args) {
        String s = "rat", t = "car";
        System.out.println(isAnagram(s,t));
    }
    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> map = new HashMap<>();

        for (int i = 0; i < t.length(); i++) {
            if(map.containsKey(t.charAt(i))){
                map.put(t.charAt(i),map.get(t.charAt(i))+1);
            }else {
                map.put(t.charAt(i),1);
            }
        }
        for (int i = 0; i <s.length() ; i++) {
            if(map.containsKey(s.charAt(i)) && map.get(s.charAt(i))!=0){
                map.put(s.charAt(i),map.get(s.charAt(i))-1);
            }else {
                return false;
            }
        }
        return true;

    }
}
