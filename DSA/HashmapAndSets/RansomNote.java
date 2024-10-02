package HashmapAndSets;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RansomNote {
    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine = "aab";
        System.out.println(canConstruct(ransomNote,magazine));
    }
    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map= new HashMap<>();

        for (int i = 0; i < magazine.length(); i++) {
            if(map.containsKey(magazine.charAt(i))){
                map.put(magazine.charAt(i),map.get(magazine.charAt(i))+1);
            }else {
                map.put(magazine.charAt(i),1);
            }
        }
        for (int i = 0; i <ransomNote.length() ; i++) {
            if(map.containsKey(ransomNote.charAt(i)) && map.get(ransomNote.charAt(i))!=0){
                map.put(ransomNote.charAt(i),map.get(ransomNote.charAt(i))-1);
            }else {
                return false;
            }
        }
        return true;
        
    }
}
